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

package com.google.cloud.vertexai.genai;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.google.cloud.vertexai.genai.types.AgentEngineOperation;
import com.google.cloud.vertexai.genai.types.CreateAgentEngineConfig;
import com.google.cloud.vertexai.genai.types.DeleteAgentEngineOperation;
import com.google.common.collect.ImmutableMap;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.extension.ExtendWith;

@EnabledIfEnvironmentVariable(
    named = "GOOGLE_GENAI_REPLAYS_DIRECTORY",
    matches = ".*genai/replays.*")
@ExtendWith(EnvironmentVariablesMockingExtension.class)
public class AgentEnginesTest {

  @Test
  public void testCreateAgentEngine() throws Exception {
    Client client =
        TestUtils.createClient(true, "create_agent_engine/test_create_with_labels.vertex.json");

    CreateAgentEngineConfig config =
        CreateAgentEngineConfig.builder()
            .labels(ImmutableMap.of("test-label", "test-value"))
            .build();
    AgentEngineOperation createOperation = client.agentEngines.privateCreate(config);

    assertNotNull(createOperation.name());

    while (!createOperation.done().filter(Boolean::booleanValue).isPresent()) {
      try {
        Thread.sleep(10000); // Sleep for 10 seconds.
        createOperation =
            client.agentEngines.privateGetAgentOperation(createOperation.name().get(), null);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
    assertNotNull(createOperation.response());

    // Delete
    DeleteAgentEngineOperation deleteOperation =
        client.agentEngines.privateDelete(
            createOperation.response().get().name().get(), true, null);
    assertNotNull(deleteOperation.name());
  }
}
