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

import com.google.cloud.vertexai.genai.types.AppendAgentEngineSessionEventResponse;
import com.google.cloud.vertexai.genai.types.ListAgentEngineSessionEventsResponse;
import java.time.Instant;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.extension.ExtendWith;

@EnabledIfEnvironmentVariable(
    named = "GOOGLE_GENAI_REPLAYS_DIRECTORY",
    matches = ".*genai/replays.*")
@ExtendWith(EnvironmentVariablesMockingExtension.class)
public class AgentEnginesSessionEventsTest {

  @Test
  public void testPrivateAppendAgentEngineSessionEvents() throws Exception {
    Client client =
        TestUtils.createClient(
            true, "ae_session_events_append/test_append_session_event.vertex.json");

    AppendAgentEngineSessionEventResponse response =
        client.agentEngines.sessions.events.append(
            "reasoningEngines/2886612747586371584/sessions/6922431337672474624",
            "test-user-123",
            "test-invocation-id",
            Instant.ofEpochSecond(1234567860L),
            null);

    assertNotNull(response);
  }

  @Test
  public void testPrivateListAgentEngineSessionEvents() throws Exception {
    Client client =
        TestUtils.createClient(
            true, "ae_session_events_private_list/test_private_list_session_events.vertex.json");

    ListAgentEngineSessionEventsResponse response =
        client.agentEngines.sessions.events.privateList(
            "reasoningEngines/2886612747586371584/sessions/6922431337672474624", null);

    assertNotNull(response.sessionEvents());
    assertFalse(response.sessionEvents().get().isEmpty());
  }
}
