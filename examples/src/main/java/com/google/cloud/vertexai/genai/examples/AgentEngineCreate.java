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
 * <p>mvn clean compile exec:java
 * -Dexec.mainClass="com.google.cloud.vertexai.genai.examples.AgentEngineCreate"
 */
package com.google.cloud.vertexai.genai.examples;

import com.google.cloud.vertexai.genai.Client;
import com.google.cloud.vertexai.genai.types.AgentEngineOperation;
import com.google.cloud.vertexai.genai.types.CreateAgentEngineConfig;
import com.google.cloud.vertexai.genai.types.DeleteAgentEngineOperation;
import com.google.common.collect.ImmutableMap;

/** An example of using the Java SDK to create an agent engine. */
public final class AgentEngineCreate {
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

    // Optionally, delete to clean up resources.
    DeleteAgentEngineOperation deleteOperation =
        client.agentEngines.privateDelete(
            createOperation.response().get().name().get(), true, null);
  }

  private AgentEngineCreate() {}
}
