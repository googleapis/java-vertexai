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
 * <p>mvn exec:java -Dexec.mainClass="com.google.cloud.vertexai.genai.examples.AgentEngine"
 */
package com.google.cloud.vertexai.genai.examples;

import com.google.cloud.vertexai.genai.Client;
import com.google.cloud.vertexai.genai.types.AgentEngineOperation;
import com.google.cloud.vertexai.genai.types.CreateAgentEngineConfig;
import com.google.cloud.vertexai.genai.types.DeleteAgentEngineOperation;
import com.google.cloud.vertexai.genai.types.ListAgentEngineConfig;
import com.google.cloud.vertexai.genai.types.ListReasoningEnginesResponse;
import com.google.cloud.vertexai.genai.types.ReasoningEngine;
import com.google.cloud.vertexai.genai.types.UpdateAgentEngineConfig;
import com.google.common.collect.ImmutableMap;

/** An example of using the Java SDK to perform operations on agent engine. */
public final class AgentEngine {
  public static void main(String[] args) {

    // Instantiate the client. It reads from the environment variables `GOOGLE_CLOUD_LOCATION` and
    // `GOOGLE_CLOUD_PROJECT`.
    Client client = new Client();

    CreateAgentEngineConfig config =
        CreateAgentEngineConfig.builder()
            .labels(ImmutableMap.of("test-label", "test-value"))
            .build();
    AgentEngineOperation createOperation = client.agentEngines.privateCreate(config);

    System.out.println("Create operation name: " + createOperation.name());

    while (!createOperation.done().filter(Boolean::booleanValue).isPresent()) {
      try {
        Thread.sleep(10000); // Sleep for 10 seconds.
        createOperation =
            client.agentEngines.privateGetAgentOperation(createOperation.name().get(), null);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
    System.out.println("Create operation response: " + createOperation.response());

    String agentEngineName = createOperation.response().get().name().get();

    // 1. Get Agent Engine
    System.out.println("\n--- Getting Agent Engine ---");
    ReasoningEngine getResponse = client.agentEngines.privateGet(agentEngineName, null);
    System.out.println("Get response: " + getResponse);

    // 2. Update Agent Engine
    System.out.println("\n--- Updating Agent Engine ---");
    UpdateAgentEngineConfig updateConfig =
        UpdateAgentEngineConfig.builder()
            .labels(ImmutableMap.of("test-label", "updated-value"))
            .build();
    AgentEngineOperation updateOperation =
        client.agentEngines.privateUpdate(agentEngineName, updateConfig);
    System.out.println("Update operation name: " + updateOperation.name());

    while (!updateOperation.done().filter(Boolean::booleanValue).isPresent()) {
      try {
        Thread.sleep(10000); // Sleep for 10 seconds.
        updateOperation =
            client.agentEngines.privateGetAgentOperation(updateOperation.name().get(), null);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
    System.out.println("Update operation response: " + updateOperation.response());

    // 3. List Agent Engines
    System.out.println("\n--- Listing Agent Engines ---");
    ListAgentEngineConfig listConfig = ListAgentEngineConfig.builder().build();
    ListReasoningEnginesResponse listResponse = client.agentEngines.privateList(listConfig);
    System.out.println("List response: " + listResponse);

    // 4. Delete Agent Engine
    System.out.println("\n--- Deleting Agent Engine ---");
    DeleteAgentEngineOperation deleteOperation =
        client.agentEngines.privateDelete(agentEngineName, true, null);
    System.out.println("Delete operation name: " + deleteOperation.name());

    AgentEngineOperation pollOp = null;
    while (true) {
      pollOp = client.agentEngines.privateGetAgentOperation(deleteOperation.name().get(), null);
      if (pollOp.done().filter(Boolean::booleanValue).isPresent()) {
        break;
      }
      try {
        Thread.sleep(10000); // Sleep for 10 seconds.
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
    System.out.println("Delete operation completed.");
  }

  private AgentEngine() {}
}
