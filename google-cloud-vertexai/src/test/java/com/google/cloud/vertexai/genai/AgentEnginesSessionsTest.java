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

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.google.cloud.vertexai.genai.types.AgentEngineSessionOperation;
import com.google.cloud.vertexai.genai.types.DeleteAgentEngineSessionOperation;
import com.google.cloud.vertexai.genai.types.ListReasoningEnginesSessionsResponse;
import com.google.cloud.vertexai.genai.types.UpdateAgentEngineSessionConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.extension.ExtendWith;

@EnabledIfEnvironmentVariable(
    named = "GOOGLE_GENAI_REPLAYS_DIRECTORY",
    matches = ".*genai/replays.*")
@ExtendWith(EnvironmentVariablesMockingExtension.class)
public class AgentEnginesSessionsTest {

  @Test
  public void testPrivateCreateAgentEngineSession() throws Exception {
    Client client =
        TestUtils.createClient(
            true, "ae_session_private_create/test_private_create_session.vertex.json");

    AgentEngineSessionOperation operation =
        client.agentEngines.sessions.privateCreate(
            "projects/964831358985/locations/us-central1/reasoningEngines/2886612747586371584",
            "test-user-id",
            null);

    assertNotNull(operation.name());
  }

  @Test
  public void testPrivateListAgentEngineSession() throws Exception {
    Client client =
        TestUtils.createClient(
            true, "ae_session_private_list/test_private_list_session.vertex.json");

    ListReasoningEnginesSessionsResponse response =
        client.agentEngines.sessions.privateList("reasoningEngines/2886612747586371584", null);

    assertNotNull(response.sessions());
    assertFalse(response.sessions().get().isEmpty());
  }

  @Test
  public void testPrivateGetAgentEngineSession() throws Exception {
    Client client =
        TestUtils.createClient(
            true, "ae_session_private_get/test_private_get_session_operation.vertex.json");

    AgentEngineSessionOperation operation =
        client.agentEngines.sessions.privateGetSessionOperation(
            "reasoningEngines/2886612747586371584/sessions/3080649749292908544/operations/758783840595476480",
            null);

    assertNotNull(operation.name());
  }

  @Test
  public void testPrivateUpdateAgentEngineSession() throws Exception {
    Client client =
        TestUtils.createClient(
            true, "ae_session_private_update/test_private_update_session.vertex.json");

    AgentEngineSessionOperation operation =
        client.agentEngines.sessions.privateUpdate(
            "reasoningEngines/2886612747586371584/sessions/3080649749292908544",
            UpdateAgentEngineSessionConfig.builder()
                .displayName("test-agent-engine-session-updated")
                .userId("test-user-id")
                .build());

    assertNotNull(operation.name());
  }

  @Test
  public void testDeleteAgentEngineSession() throws Exception {
    Client client =
        TestUtils.createClient(
            true, "ae_session_delete/test_delete_session_non_blocking.vertex.json");

    DeleteAgentEngineSessionOperation operation =
        client.agentEngines.sessions.delete(
            "reasoningEngines/2886612747586371584/sessions/8521561049109889024", null);

    assertNotNull(operation.name());
  }
}
