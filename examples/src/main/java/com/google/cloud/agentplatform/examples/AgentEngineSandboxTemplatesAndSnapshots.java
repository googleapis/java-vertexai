/*
 * Copyright 2026 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Usage:
 *
 * <p>1a. If you are using Vertex AI, setup ADC to get credentials:
 * https://cloud.google.com/docs/authentication/provide-credentials-adc#google-idp
 *
 * <p>Then set Project, Location, and USE_VERTEXAI flag as environment variables:
 *
 * <p>export GOOGLE_CLOUD_PROJECT=YOUR_PROJECT
 *
 * <p>export GOOGLE_CLOUD_LOCATION=YOUR_LOCATION
 *
 * <p>2. Compile the java package and run the sample code.
 *
 * <p>mvn clean compile
 *
 * <p>mvn exec:java
 * -Dexec.mainClass="com.google.cloud.agentplatform.examples.AgentEngineSandboxTemplatesAndSnapshots"
 */
package com.google.cloud.agentplatform.examples;

import com.google.cloud.agentplatform.Client;
import com.google.cloud.agentplatform.types.AgentEngineSandboxOperation;
import com.google.cloud.agentplatform.types.AgentEngineSandboxSnapshotOperation;
import com.google.cloud.agentplatform.types.CreateAgentEngineSandboxConfig;
import com.google.cloud.agentplatform.types.CreateAgentEngineSandboxSnapshotConfig;
import com.google.cloud.agentplatform.types.CreateSandboxEnvironmentTemplateConfig;
import com.google.cloud.agentplatform.types.DeleteAgentEngineSandboxOperation;
import com.google.cloud.agentplatform.types.DeleteSandboxEnvironmentSnapshotOperation;
import com.google.cloud.agentplatform.types.DeleteSandboxEnvironmentTemplateOperation;
import com.google.cloud.agentplatform.types.ListSandboxEnvironmentSnapshotsResponse;
import com.google.cloud.agentplatform.types.ListSandboxEnvironmentTemplatesResponse;
import com.google.cloud.agentplatform.types.SandboxEnvironmentSnapshot;
import com.google.cloud.agentplatform.types.SandboxEnvironmentTemplate;
import com.google.cloud.agentplatform.types.SandboxEnvironmentTemplateDefaultContainerEnvironment;
import com.google.cloud.agentplatform.types.SandboxEnvironmentTemplateEgressControlConfig;
import com.google.cloud.agentplatform.types.SandboxEnvironmentTemplateOperation;
import java.time.Duration;
import java.util.List;

/**
 * An example of using the Java SDK to perform operations on Agent Platform sandbox environments,
 * templates, and snapshots, using only the public API surface.
 *
 * <p>The sandbox API is reached from the top-level {@code client.sandboxes} accessor, with its
 * {@code environments}, {@code templates}, and {@code snapshots} submodules. The parent agent
 * engine name is omitted, so the SDK lazily reuses a shared default agent engine for this project +
 * location.
 *
 * <p>The flow mirrors the canonical usage: create a computer-use sandbox template, create a sandbox
 * environment from that template, snapshot the running sandbox, then restore a new sandbox from the
 * snapshot. Snapshots can only be taken of template-based (e.g. computer-use) sandboxes.
 */
public final class AgentEngineSandboxTemplatesAndSnapshots {
  public static void main(String[] args) {
    // Instantiate the client. It reads from the environment variables `GOOGLE_CLOUD_LOCATION` and
    // `GOOGLE_CLOUD_PROJECT`.
    Client client = new Client();

    runSandboxTemplatesExample(client);
    runSandboxSnapshotsExample(client);
  }

  /** Demonstrates the sandbox templates submodule: create, get, list, and delete. */
  private static void runSandboxTemplatesExample(Client client) {
    System.out.println("\n=== Sandbox Templates ===");

    // 1. Create a computer-use sandbox environment template (no agent engine name needed).
    System.out.println("\n--- Creating a sandbox template ---");
    SandboxEnvironmentTemplateOperation templateOp =
        client.sandboxes.templates.create("Example Sandbox Template", computerUseTemplateConfig());
    System.out.println("Create template operation: " + templateOp.name().orElse(""));

    // Wait for the template creation to complete.
    while (!templateOp.done().filter(Boolean::booleanValue).isPresent()) {
      sleep(10000);
      templateOp =
          client.sandboxes.templates.getSandboxEnvironmentTemplateOperation(
              templateOp.name().get(), null);
    }
    String templateName = templateOp.response().get().name().get();
    System.out.println("Created Sandbox Template: " + templateName);

    // 2. Get the template.
    System.out.println("\n--- Getting the sandbox template ---");
    SandboxEnvironmentTemplate template = client.sandboxes.templates.get(templateName, null);
    System.out.println("Template display name: " + template.displayName().orElse(""));

    // 3. List templates (no agent engine name needed).
    System.out.println("\n--- Listing sandbox templates ---");
    ListSandboxEnvironmentTemplatesResponse listResponse = client.sandboxes.templates.list(null);
    System.out.println(
        "Templates found: " + listResponse.sandboxEnvironmentTemplates().map(List::size).orElse(0));

    // 4. Delete the template.
    System.out.println("\n--- Deleting the sandbox template ---");
    DeleteSandboxEnvironmentTemplateOperation deleteOp =
        client.sandboxes.templates.delete(templateName, null);
    System.out.println("Delete template operation: " + deleteOp.name().orElse(""));
  }

  /**
   * Demonstrates the sandbox environments and snapshots submodules: create a template-based
   * sandbox, snapshot it, get, list, restore a new sandbox from the snapshot, then clean up.
   */
  private static void runSandboxSnapshotsExample(Client client) {
    System.out.println("\n=== Sandbox Snapshots ===");

    // Snapshots can only be taken of template-based sandboxes, so create a computer-use template
    // and then a sandbox environment from it.
    System.out.println("\n--- Creating a computer-use template ---");
    SandboxEnvironmentTemplateOperation templateOp =
        client.sandboxes.templates.create("Snapshot Source Template", computerUseTemplateConfig());
    while (!templateOp.done().filter(Boolean::booleanValue).isPresent()) {
      sleep(10000);
      templateOp =
          client.sandboxes.templates.getSandboxEnvironmentTemplateOperation(
              templateOp.name().get(), null);
    }
    String templateName = templateOp.response().get().name().get();
    System.out.println("Created Sandbox Template: " + templateName);

    String sandboxName = null;
    String restoredSandboxName = null;
    try {
      // Create a sandbox environment from the template (no agent engine name needed).
      System.out.println("\n--- Creating a sandbox environment from the template ---");
      AgentEngineSandboxOperation sandboxOp =
          client.sandboxes.environments.create(
              /* spec= */ null,
              CreateAgentEngineSandboxConfig.builder()
                  .displayName("Snapshot Source Sandbox")
                  .sandboxEnvironmentTemplate(templateName)
                  .build());
      while (!sandboxOp.done().filter(Boolean::booleanValue).isPresent()) {
        sleep(10000);
        sandboxOp = client.sandboxes.environments.getSandboxOperation(sandboxOp.name().get(), null);
      }
      sandboxName = sandboxOp.response().get().name().get();
      System.out.println("Created source Sandbox: " + sandboxName);

      // 1. Create a snapshot of the running sandbox.
      System.out.println("\n--- Creating a sandbox snapshot ---");
      AgentEngineSandboxSnapshotOperation snapshotOp =
          client.sandboxes.snapshots.create(
              sandboxName,
              CreateAgentEngineSandboxSnapshotConfig.builder()
                  .displayName("Example Sandbox Snapshot")
                  .ttl(Duration.ofSeconds(3600))
                  .build());
      while (!snapshotOp.done().filter(Boolean::booleanValue).isPresent()) {
        sleep(10000);
        snapshotOp =
            client.sandboxes.snapshots.getSandboxSnapshotOperation(snapshotOp.name().get(), null);
      }
      String snapshotName = snapshotOp.response().get().name().get();
      System.out.println("Created Sandbox Snapshot: " + snapshotName);

      // 2. Get the snapshot.
      System.out.println("\n--- Getting the sandbox snapshot ---");
      SandboxEnvironmentSnapshot snapshot = client.sandboxes.snapshots.get(snapshotName, null);
      System.out.println("Snapshot Name: " + snapshot.name().orElse(""));

      // 3. List snapshots (no agent engine name needed).
      System.out.println("\n--- Listing sandbox snapshots ---");
      ListSandboxEnvironmentSnapshotsResponse listResponse = client.sandboxes.snapshots.list(null);
      System.out.println(
          "Snapshots found: "
              + listResponse.sandboxEnvironmentSnapshots().map(List::size).orElse(0));

      // 4. Restore a new sandbox environment from the snapshot.
      System.out.println("\n--- Restoring a sandbox from the snapshot ---");
      AgentEngineSandboxOperation restoreOp =
          client.sandboxes.environments.create(
              /* spec= */ null,
              CreateAgentEngineSandboxConfig.builder()
                  .displayName("Restored Sandbox")
                  .sandboxEnvironmentSnapshot(snapshotName)
                  .build());
      while (!restoreOp.done().filter(Boolean::booleanValue).isPresent()) {
        sleep(10000);
        restoreOp = client.sandboxes.environments.getSandboxOperation(restoreOp.name().get(), null);
      }
      restoredSandboxName = restoreOp.response().get().name().get();
      System.out.println("Restored Sandbox: " + restoredSandboxName);

      // 5. Delete the snapshot.
      System.out.println("\n--- Deleting the sandbox snapshot ---");
      DeleteSandboxEnvironmentSnapshotOperation deleteOp =
          client.sandboxes.snapshots.delete(snapshotName, null);
      System.out.println("Delete snapshot operation: " + deleteOp.name().orElse(""));
    } finally {
      // Clean up the restored sandbox, source sandbox, and template.
      if (restoredSandboxName != null) {
        System.out.println("\n--- Deleting the restored sandbox ---");
        client.sandboxes.environments.delete(restoredSandboxName, null);
      }
      if (sandboxName != null) {
        System.out.println("\n--- Deleting the source sandbox ---");
        DeleteAgentEngineSandboxOperation deleteSandboxOp =
            client.sandboxes.environments.delete(sandboxName, null);
        System.out.println("Delete sandbox operation: " + deleteSandboxOp.name().orElse(""));
      }
      System.out.println("\n--- Deleting the source template ---");
      client.sandboxes.templates.delete(templateName, null);
    }
  }

  /** Returns the config for a computer-use sandbox template with internet access. */
  private static CreateSandboxEnvironmentTemplateConfig computerUseTemplateConfig() {
    return CreateSandboxEnvironmentTemplateConfig.builder()
        .defaultContainerEnvironment(
            SandboxEnvironmentTemplateDefaultContainerEnvironment.builder()
                .defaultContainerCategory("DEFAULT_CONTAINER_CATEGORY_COMPUTER_USE")
                .build())
        .egressControlConfig(
            SandboxEnvironmentTemplateEgressControlConfig.builder().internetAccess(true).build())
        .build();
  }

  private static void sleep(long millis) {
    try {
      Thread.sleep(millis);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }

  private AgentEngineSandboxTemplatesAndSnapshots() {}
}
