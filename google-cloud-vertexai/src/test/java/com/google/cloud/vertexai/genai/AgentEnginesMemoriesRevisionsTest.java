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

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.google.cloud.vertexai.genai.types.ListAgentEngineMemoryRevisionsResponse;
import com.google.cloud.vertexai.genai.types.MemoryRevision;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.extension.ExtendWith;

@EnabledIfEnvironmentVariable(
    named = "GOOGLE_GENAI_REPLAYS_DIRECTORY",
    matches = ".*genai/replays.*")
@ExtendWith(EnvironmentVariablesMockingExtension.class)
public class AgentEnginesMemoriesRevisionsTest {

  @Test
  public void testPrivateGetAgentEngineMemoryRevision() throws Exception {
    Client client =
        TestUtils.createClient(
            true, "ae_memory_revisions_get/test_get_memory_revisions.vertex.json");

    String name =
        "projects/964831358985/locations/us-central1/reasoningEngines/2886612747586371584/memories/3858070028511346688/revisions/516064922187071488";

    MemoryRevision revision = client.agentEngines.memories.revisions.get(name, null);

    assertEquals(revision.name().get(), name);
  }

  @Test
  public void testPrivateListAgentEngineMemoryRevisions() throws Exception {
    Client client =
        TestUtils.createClient(
            true,
            "ae_memory_revisions_private_list/test_private_list_memory_revisions.vertex.json");

    String name =
        "projects/964831358985/locations/us-central1/reasoningEngines/2886612747586371584/memories/3858070028511346688";

    ListAgentEngineMemoryRevisionsResponse response =
        client.agentEngines.memories.revisions.privateList(name, null);

    assertEquals(
        response.memoryRevisions().get().get(0).name().get(),
        name + "/revisions/516064922187071488");
  }
}
