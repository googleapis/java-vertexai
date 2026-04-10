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
 * -Dexec.mainClass="com.google.cloud.vertexai.genai.examples.AgentEngineMemoryRevisions"
 */
package com.google.cloud.vertexai.genai.examples;

import com.google.cloud.vertexai.genai.Client;
import com.google.cloud.vertexai.genai.types.AgentEngineMemoryOperation;
import com.google.cloud.vertexai.genai.types.AgentEngineOperation;
import com.google.cloud.vertexai.genai.types.CreateAgentEngineConfig;
import com.google.cloud.vertexai.genai.types.DeleteAgentEngineMemoryOperation;
import com.google.cloud.vertexai.genai.types.DeleteAgentEngineOperation;
import com.google.cloud.vertexai.genai.types.ListAgentEngineMemoryRevisionsResponse;
import com.google.cloud.vertexai.genai.types.MemoryRevision;
import com.google.common.collect.ImmutableMap;

/** An example of using the Java SDK to perform operations on Agent Engine memory revisions. */
public final class AgentEngineMemoryRevisions {
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
      // 1. Create a memory
      System.out.println("\n--- Creating a memory ---");
      AgentEngineMemoryOperation memoryOp =
          client.agentEngines.memories.privateCreate(
              agentEngineName, "User likes coffee", ImmutableMap.of("user_id", "user_123"), null);

      while (!memoryOp.done().filter(Boolean::booleanValue).isPresent()) {
        try {
          Thread.sleep(5000);
          memoryOp =
              client.agentEngines.memories.privateGetMemoryOperation(memoryOp.name().get(), null);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      }

      String memoryName = memoryOp.response().get().name().get();
      System.out.println("Created Memory: " + memoryName);

      // 2. Update memory to create a revision
      System.out.println("\n--- Updating memory to create a revision ---");
      AgentEngineMemoryOperation updateOp =
          client.agentEngines.memories.privateUpdate(
              memoryName,
              "User likes coffee and tea",
              ImmutableMap.of("user_id", "user_123"),
              null);

      while (!updateOp.done().filter(Boolean::booleanValue).isPresent()) {
        try {
          Thread.sleep(5000);
          updateOp =
              client.agentEngines.memories.privateGetMemoryOperation(updateOp.name().get(), null);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      }
      System.out.println("Updated memory content.");

      // 3. List memory revisions
      System.out.println("\n--- Listing memory revisions ---");
      ListAgentEngineMemoryRevisionsResponse listResponse =
          client.agentEngines.memories.revisions.privateList(memoryName, null);
      System.out.println(
          "Revisions found: " + listResponse.memoryRevisions().map(java.util.List::size).orElse(0));

      if (listResponse.memoryRevisions().isPresent()
          && !listResponse.memoryRevisions().get().isEmpty()) {
        String revisionName = listResponse.memoryRevisions().get().get(0).name().get();
        System.out.println("First revision name: " + revisionName);

        // 4. Get memory revision
        System.out.println("\n--- Getting memory revision ---");
        MemoryRevision revision = client.agentEngines.memories.revisions.get(revisionName, null);
        System.out.println("Retrieved Revision Name: " + revision.name().orElse(""));
      }

      // 5. Delete memory
      System.out.println("\n--- Deleting memory ---");
      DeleteAgentEngineMemoryOperation deleteOp =
          client.agentEngines.memories.delete(memoryName, null);
      System.out.println("Delete memory operation started.");

    } finally {
      // Clean up Agent Engine
      System.out.println("\nCleaning up Agent Engine...");
      DeleteAgentEngineOperation deleteOperation =
          client.agentEngines.privateDelete(agentEngineName, true, null);
      System.out.println("Delete operation started.");
    }
  }

  private AgentEngineMemoryRevisions() {}
}
