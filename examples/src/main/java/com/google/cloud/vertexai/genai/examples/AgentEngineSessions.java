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
 * <p>mvn exec:java -Dexec.mainClass="com.google.cloud.vertexai.genai.examples.AgentEngineSessions"
 */
package com.google.cloud.vertexai.genai.examples;

import com.google.cloud.vertexai.genai.Client;
import com.google.cloud.vertexai.genai.types.AgentEngineOperation;
import com.google.cloud.vertexai.genai.types.AgentEngineSessionOperation;
import com.google.cloud.vertexai.genai.types.CreateAgentEngineConfig;
import com.google.cloud.vertexai.genai.types.DeleteAgentEngineOperation;
import com.google.cloud.vertexai.genai.types.DeleteAgentEngineSessionOperation;
import com.google.cloud.vertexai.genai.types.ListReasoningEnginesSessionsResponse;
import com.google.cloud.vertexai.genai.types.UpdateAgentEngineSessionConfig;
import com.google.common.collect.ImmutableMap;

/** An example of using the Java SDK to perform operations on Agent Engine sessions. */
public final class AgentEngineSessions {
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
      // 1. Create a session
      System.out.println("\n--- Creating a session ---");
      AgentEngineSessionOperation sessionOp =
          client.agentEngines.sessions.privateCreate(agentEngineName, "user_123", null);

      System.out.println("Create session operation: " + sessionOp.name());

      // Wait for session creation
      while (!sessionOp.done().filter(Boolean::booleanValue).isPresent()) {
        try {
          Thread.sleep(5000);
          sessionOp =
              client.agentEngines.sessions.privateGetSessionOperation(sessionOp.name().get(), null);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      }

      String sessionName = sessionOp.response().get().name().get();
      System.out.println("Created Session: " + sessionName);

      // 2. List sessions
      System.out.println("\n--- Listing sessions ---");
      ListReasoningEnginesSessionsResponse listResponse =
          client.agentEngines.sessions.privateList(agentEngineName, null);
      System.out.println(
          "Sessions found: " + listResponse.sessions().map(java.util.List::size).orElse(0));

      // 3. Update session
      System.out.println("\n--- Updating session ---");
      AgentEngineSessionOperation updateOp =
          client.agentEngines.sessions.privateUpdate(
              sessionName,
              UpdateAgentEngineSessionConfig.builder()
                  .displayName("updated-session-display-name")
                  .userId("user_123")
                  .build());

      while (!updateOp.done().filter(Boolean::booleanValue).isPresent()) {
        try {
          Thread.sleep(5000);
          updateOp =
              client.agentEngines.sessions.privateGetSessionOperation(updateOp.name().get(), null);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      }
      System.out.println("Updated session display name.");

      // 4. Delete session
      System.out.println("\n--- Deleting session ---");
      DeleteAgentEngineSessionOperation deleteOp =
          client.agentEngines.sessions.delete(sessionName, null);
      System.out.println("Delete session operation: " + deleteOp.name());

    } finally {
      // Clean up Agent Engine
      System.out.println("\nCleaning up Agent Engine...");
      DeleteAgentEngineOperation deleteOperation =
          client.agentEngines.privateDelete(agentEngineName, true, null);
      System.out.println("Delete operation started.");
    }
  }

  private AgentEngineSessions() {}
}
