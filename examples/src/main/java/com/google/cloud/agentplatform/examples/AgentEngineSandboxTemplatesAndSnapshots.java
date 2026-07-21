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
import com.google.cloud.agentplatform.types.AgentEngineOperation;
import com.google.cloud.agentplatform.types.AgentEngineSandboxOperation;
import com.google.cloud.agentplatform.types.AgentEngineSandboxSnapshotOperation;
import com.google.cloud.agentplatform.types.CreateAgentEngineConfig;
import com.google.cloud.agentplatform.types.CreateAgentEngineSandboxSnapshotConfig;
import com.google.cloud.agentplatform.types.CreateSandboxEnvironmentTemplateConfig;
import com.google.cloud.agentplatform.types.DeleteAgentEngineOperation;
import com.google.cloud.agentplatform.types.DeleteAgentEngineSandboxOperation;
import com.google.cloud.agentplatform.types.DeleteSandboxEnvironmentSnapshotOperation;
import com.google.cloud.agentplatform.types.DeleteSandboxEnvironmentTemplateOperation;
import com.google.cloud.agentplatform.types.ListSandboxEnvironmentSnapshotsResponse;
import com.google.cloud.agentplatform.types.ListSandboxEnvironmentTemplatesResponse;
import com.google.cloud.agentplatform.types.SandboxEnvironmentSnapshot;
import com.google.cloud.agentplatform.types.SandboxEnvironmentSpec;
import com.google.cloud.agentplatform.types.SandboxEnvironmentSpecCodeExecutionEnvironment;
import com.google.cloud.agentplatform.types.SandboxEnvironmentTemplate;
import com.google.cloud.agentplatform.types.SandboxEnvironmentTemplateDefaultContainerEnvironment;
import com.google.cloud.agentplatform.types.SandboxEnvironmentTemplateEgressControlConfig;
import com.google.cloud.agentplatform.types.SandboxEnvironmentTemplateOperation;
import com.google.common.collect.ImmutableMap;
import java.time.Duration;
import java.util.List;

/**
 * An example of using the Java SDK to perform operations on Agent Engine sandbox environment
 * templates and snapshots.
 */
public final class AgentEngineSandboxTemplatesAndSnapshots {
  public static void main(String[] args) {
    // Instantiate the client. It reads from the environment variables `GOOGLE_CLOUD_LOCATION` and
    // `GOOGLE_CLOUD_PROJECT`.
    Client client = new Client();

    System.out.println("Creating a temporary Agent Engine...");
    CreateAgentEngineConfig config =
        CreateAgentEngineConfig.builder()
            .labels(ImmutableMap.of("test-label", "test-value"))
            .build();
    AgentEngineOperation createOperation = client.agentEngines.privateCreate(config);
    while (!createOperation.done().filter(Boolean::booleanValue).isPresent()) {
      sleep(10000);
      createOperation =
          client.agentEngines.privateGetAgentOperation(createOperation.name().get(), null);
    }
    String agentEngineName = createOperation.response().get().name().get();
    System.out.println("Created Agent Engine: " + agentEngineName);

    try {
      runSandboxTemplatesExample(client, agentEngineName);
      runSandboxSnapshotsExample(client, agentEngineName);
    } finally {
      System.out.println("\nCleaning up Agent Engine...");
      DeleteAgentEngineOperation deleteOperation =
          client.agentEngines.privateDelete(agentEngineName, true, null);
      System.out.println("Delete operation started: " + deleteOperation.name());
    }
  }

  /** Demonstrates the sandbox templates submodule: create, get, list, and delete. */
  private static void runSandboxTemplatesExample(Client client, String agentEngineName) {
    System.out.println("\n=== Sandbox Templates ===");

    // 1. Create a sandbox environment template.
    System.out.println("\n--- Creating a sandbox template ---");
    SandboxEnvironmentTemplateOperation templateOp =
        client.agentEngines.sandboxes.templates.privateCreate(
            agentEngineName,
            "Example Sandbox Template",
            CreateSandboxEnvironmentTemplateConfig.builder()
                .defaultContainerEnvironment(
                    SandboxEnvironmentTemplateDefaultContainerEnvironment.builder()
                        .defaultContainerCategory("DEFAULT_CONTAINER_CATEGORY_COMPUTER_USE")
                        .build())
                .egressControlConfig(
                    SandboxEnvironmentTemplateEgressControlConfig.builder()
                        .internetAccess(true)
                        .build())
                .build());
    System.out.println("Create template operation: " + templateOp.name().orElse(""));

    // Wait for the template creation to complete.
    while (!templateOp.done().filter(Boolean::booleanValue).isPresent()) {
      sleep(10000);
      templateOp =
          client.agentEngines.sandboxes.templates.getSandboxEnvironmentTemplateOperation(
              templateOp.name().get(), null);
    }
    String templateName = templateOp.response().get().name().get();
    System.out.println("Created Sandbox Template: " + templateName);

    // 2. Get the template.
    System.out.println("\n--- Getting the sandbox template ---");
    SandboxEnvironmentTemplate template =
        client.agentEngines.sandboxes.templates.privateGet(templateName, null);
    System.out.println("Template display name: " + template.displayName().orElse(""));

    // 3. List templates.
    System.out.println("\n--- Listing sandbox templates ---");
    ListSandboxEnvironmentTemplatesResponse listResponse =
        client.agentEngines.sandboxes.templates.privateList(agentEngineName, null);
    System.out.println(
        "Templates found: " + listResponse.sandboxEnvironmentTemplates().map(List::size).orElse(0));

    // 4. Delete the template.
    System.out.println("\n--- Deleting the sandbox template ---");
    DeleteSandboxEnvironmentTemplateOperation deleteOp =
        client.agentEngines.sandboxes.templates.privateDelete(templateName, null);
    System.out.println("Delete template operation: " + deleteOp.name().orElse(""));
  }

  /**
   * Demonstrates the sandbox snapshots submodule: create a sandbox, snapshot it, get, list, and
   * delete.
   */
  private static void runSandboxSnapshotsExample(Client client, String agentEngineName) {
    System.out.println("\n=== Sandbox Snapshots ===");

    // A snapshot captures the state of an existing sandbox environment, so first create one.
    System.out.println("\n--- Creating a source sandbox ---");
    AgentEngineSandboxOperation sandboxOp =
        client.agentEngines.sandboxes.privateCreate(
            agentEngineName,
            SandboxEnvironmentSpec.builder()
                .codeExecutionEnvironment(
                    SandboxEnvironmentSpecCodeExecutionEnvironment.builder()
                        .machineConfig("MACHINE_CONFIG_VCPU4_RAM4GIB")
                        .build())
                .build(),
            null);
    while (!sandboxOp.done().filter(Boolean::booleanValue).isPresent()) {
      sleep(10000);
      sandboxOp =
          client.agentEngines.sandboxes.privateGetSandboxOperation(sandboxOp.name().get(), null);
    }
    String sandboxName = sandboxOp.response().get().name().get();
    System.out.println("Created source Sandbox: " + sandboxName);

    try {
      // 1. Create a snapshot of the sandbox.
      System.out.println("\n--- Creating a sandbox snapshot ---");
      AgentEngineSandboxSnapshotOperation snapshotOp =
          client.agentEngines.sandboxes.snapshots.privateCreate(
              sandboxName,
              CreateAgentEngineSandboxSnapshotConfig.builder()
                  .displayName("Example Sandbox Snapshot")
                  .ttl(Duration.ofSeconds(3600))
                  .build());
      System.out.println("Create snapshot operation: " + snapshotOp.name().orElse(""));

      // Wait for the snapshot creation to complete.
      while (!snapshotOp.done().filter(Boolean::booleanValue).isPresent()) {
        sleep(10000);
        snapshotOp =
            client.agentEngines.sandboxes.snapshots.getSandboxSnapshotOperation(
                snapshotOp.name().get(), null);
      }
      String snapshotName = snapshotOp.response().get().name().get();
      System.out.println("Created Sandbox Snapshot: " + snapshotName);

      // 2. Get the snapshot.
      System.out.println("\n--- Getting the sandbox snapshot ---");
      SandboxEnvironmentSnapshot snapshot =
          client.agentEngines.sandboxes.snapshots.privateGet(snapshotName, null);
      System.out.println("Snapshot Name: " + snapshot.name().orElse(""));

      // 3. List snapshots.
      System.out.println("\n--- Listing sandbox snapshots ---");
      ListSandboxEnvironmentSnapshotsResponse listResponse =
          client.agentEngines.sandboxes.snapshots.privateList(agentEngineName, null);
      System.out.println(
          "Snapshots found: "
              + listResponse.sandboxEnvironmentSnapshots().map(List::size).orElse(0));

      // 4. Delete the snapshot.
      System.out.println("\n--- Deleting the sandbox snapshot ---");
      DeleteSandboxEnvironmentSnapshotOperation deleteOp =
          client.agentEngines.sandboxes.snapshots.privateDelete(snapshotName, null);
      System.out.println("Delete snapshot operation: " + deleteOp.name().orElse(""));
    } finally {
      // Clean up the source sandbox.
      System.out.println("\n--- Deleting the source sandbox ---");
      DeleteAgentEngineSandboxOperation deleteSandboxOp =
          client.agentEngines.sandboxes.privateDelete(sandboxName, null);
      System.out.println("Delete sandbox operation: " + deleteSandboxOp.name().orElse(""));
    }
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
