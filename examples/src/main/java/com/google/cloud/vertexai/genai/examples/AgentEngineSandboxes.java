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
 * <p>mvn exec:java -Dexec.mainClass="com.google.cloud.vertexai.genai.examples.AgentEngineSandboxes"
 */
package com.google.cloud.vertexai.genai.examples;

import com.google.cloud.vertexai.genai.Client;
import com.google.cloud.vertexai.genai.types.AgentEngineOperation;
import com.google.cloud.vertexai.genai.types.AgentEngineSandboxOperation;
import com.google.cloud.vertexai.genai.types.Chunk;
import com.google.cloud.vertexai.genai.types.CreateAgentEngineConfig;
import com.google.cloud.vertexai.genai.types.DeleteAgentEngineOperation;
import com.google.cloud.vertexai.genai.types.DeleteAgentEngineSandboxOperation;
import com.google.cloud.vertexai.genai.types.ExecuteSandboxEnvironmentResponse;
import com.google.cloud.vertexai.genai.types.ListAgentEngineSandboxesResponse;
import com.google.cloud.vertexai.genai.types.SandboxEnvironment;
import com.google.cloud.vertexai.genai.types.SandboxEnvironmentSpec;
import com.google.cloud.vertexai.genai.types.SandboxEnvironmentSpecCodeExecutionEnvironment;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.genai.JsonSerializable;
import java.nio.charset.StandardCharsets;
import java.util.List;

/** An example of using the Java SDK to perform operations on Agent Engine sandboxes. */
public final class AgentEngineSandboxes {
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
      try {
        Thread.sleep(10000); // Sleep for 10 seconds.
        createOperation =
            client.agentEngines.privateGetAgentOperation(createOperation.name().get(), null);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
    String agentEngineName = createOperation.response().get().name().get();
    System.out.println("Created Agent Engine: " + agentEngineName);

    try {
      // 1. Create a sandbox
      System.out.println("\n--- Creating a sandbox ---");
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

      System.out.println("Create sandbox operation: " + sandboxOp.name());

      // Wait for sandbox creation
      while (!sandboxOp.done().filter(Boolean::booleanValue).isPresent()) {
        try {
          Thread.sleep(10000);
          sandboxOp =
              client.agentEngines.sandboxes.privateGetSandboxOperation(
                  sandboxOp.name().get(), null);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      }

      String sandboxName = sandboxOp.response().get().name().get();
      System.out.println("Created Sandbox: " + sandboxName);

      // 2. List sandboxes
      System.out.println("\n--- Listing sandboxes ---");
      ListAgentEngineSandboxesResponse listResponse =
          client.agentEngines.sandboxes.privateList(agentEngineName, null);
      System.out.println(
          "Sandboxes found: " + listResponse.sandboxEnvironments().map(List::size).orElse(0));

      // 3. Get sandbox
      System.out.println("\n--- Getting sandbox ---");
      SandboxEnvironment sandbox = client.agentEngines.sandboxes.privateGet(sandboxName, null);
      System.out.println("Sandbox Name: " + sandbox.name().orElse(""));

      // 4. Execute code in sandbox
      System.out.println("\n--- Executing code in sandbox ---");
      String code = "print('Hello from Agent Engine Sandbox')";
      String jsonWithSpace = String.format("{\"code\": %s}", JsonSerializable.toJsonString(code));

      Chunk codeChunk =
          Chunk.builder()
              .data(jsonWithSpace.getBytes(StandardCharsets.UTF_8))
              .mimeType("application/json")
              .build();

      List<Chunk> inputs = ImmutableList.of(codeChunk);

      ExecuteSandboxEnvironmentResponse execResponse =
          client.agentEngines.sandboxes.privateExecuteCode(sandboxName, inputs, null);
      System.out.println("Code execution complete.");
      System.out.println("Outputs present: " + execResponse.outputs().isPresent());

      // 5. Delete sandbox
      System.out.println("\n--- Deleting sandbox ---");
      DeleteAgentEngineSandboxOperation deleteOp =
          client.agentEngines.sandboxes.privateDelete(sandboxName, null);
      System.out.println("Delete sandbox operation: " + deleteOp.name());

    } finally {
      // Clean up Agent Engine
      System.out.println("\nCleaning up Agent Engine...");
      DeleteAgentEngineOperation deleteOperation =
          client.agentEngines.privateDelete(agentEngineName, true, null);
      System.out.println("Delete operation started.");
    }
  }

  private AgentEngineSandboxes() {}
}
