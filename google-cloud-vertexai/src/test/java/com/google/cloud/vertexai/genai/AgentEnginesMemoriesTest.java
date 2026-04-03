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

import com.google.cloud.vertexai.genai.types.AgentEngineGenerateMemoriesOperation;
import com.google.cloud.vertexai.genai.types.AgentEngineMemoryOperation;
import com.google.cloud.vertexai.genai.types.AgentEnginePurgeMemoriesOperation;
import com.google.cloud.vertexai.genai.types.AgentEngineRollbackMemoryOperation;
import com.google.cloud.vertexai.genai.types.DeleteAgentEngineMemoryOperation;
import com.google.cloud.vertexai.genai.types.GenerateMemoriesRequestVertexSessionSource;
import com.google.cloud.vertexai.genai.types.ListReasoningEnginesMemoriesResponse;
import com.google.cloud.vertexai.genai.types.Memory;
import com.google.cloud.vertexai.genai.types.RetrieveMemoriesResponse;
import com.google.common.collect.ImmutableMap;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.extension.ExtendWith;

@EnabledIfEnvironmentVariable(
    named = "GOOGLE_GENAI_REPLAYS_DIRECTORY",
    matches = ".*genai/replays.*")
@ExtendWith(EnvironmentVariablesMockingExtension.class)
public class AgentEnginesMemoriesTest {

  @Test
  public void testPrivateCreateAgentEngineMemory() throws Exception {
    Client client =
        TestUtils.createClient(
            true, "ae_memories_private_create/test_private_create_memory.vertex.json");

    AgentEngineMemoryOperation operation =
        client.agentEngines.memories.privateCreate(
            "projects/964831358985/locations/us-central1/reasoningEngines/2886612747586371584",
            "memory_fact",
            ImmutableMap.of("user_id", "123"),
            null);

    assertNotNull(operation.name());
  }

  @Test
  public void testDeleteAgentEngineMemory() throws Exception {
    Client client =
        TestUtils.createClient(true, "ae_memories_delete/test_delete_memory.vertex.json");

    DeleteAgentEngineMemoryOperation operation =
        client.agentEngines.memories.delete(
            "projects/964831358985/locations/us-central1/reasoningEngines/2886612747586371584/memories/5605466683931099136",
            null);

    assertNotNull(operation.name());
  }

  @Test
  public void testPrivateGenerateAgentEngineMemory() throws Exception {
    Client client =
        TestUtils.createClient(
            true, "ae_memories_private_generate/test_private_generate_memory.vertex.json");

    String aeName =
        "projects/964831358985/locations/us-central1/reasoningEngines/2886612747586371584";

    AgentEngineGenerateMemoriesOperation response =
        client.agentEngines.memories.privateGenerate(
            aeName,
            GenerateMemoriesRequestVertexSessionSource.builder()
                .session(
                    "{PROJECT_AND_LOCATION_PATH}/reasoningEngines/2886612747586371584/sessions/6922431337672474624")
                .build(),
            null,
            null,
            null,
            null);

    assertNotNull(response.name());
  }

  @Test
  public void testPrivateGetAgentEngineMemory() throws Exception {
    Client client = TestUtils.createClient(true, "ae_memories_get/test_get_memory.vertex.json");

    Memory response =
        client.agentEngines.memories.get(
            "projects/964831358985/locations/us-central1/reasoningEngines/2886612747586371584/memories/3858070028511346688",
            null);

    assertNotNull(response.name().get());
  }

  @Test
  public void testPrivateGetAgentEngineMemoryOperation() throws Exception {
    Client client =
        TestUtils.createClient(
            true,
            "ae_memories_private_get_memory_operation/test_private_get_memory_operation.vertex.json");

    AgentEngineMemoryOperation operation =
        client.agentEngines.memories.privateGetMemoryOperation(
            "projects/964831358985/locations/us-central1/reasoningEngines/2886612747586371584/memories/3858070028511346688/operations/1044963283964002304",
            null);

    assertNotNull(operation.name());
  }

  @Test
  public void testPrivateGetAgentEngineGenerateMemoryOperation() throws Exception {
    Client client =
        TestUtils.createClient(
            true,
            "ae_memories_private_get_generate_memories_operation/test_private_get_generate_memories_operation.vertex.json");

    AgentEngineGenerateMemoriesOperation operation =
        client.agentEngines.memories.privateGetGenerateMemoriesOperation(
            "projects/964831358985/locations/us-central1/reasoningEngines/2886612747586371584/operations/5669315676343369728",
            null);

    assertNotNull(operation.name());
  }

  @Test
  public void testPrivateListAgentEngineMemory() throws Exception {
    Client client =
        TestUtils.createClient(
            true, "ae_memories_private_list/test_private_list_memory.vertex.json");

    ListReasoningEnginesMemoriesResponse response =
        client.agentEngines.memories.privateList(
            "projects/964831358985/locations/us-central1/reasoningEngines/2886612747586371584",
            null);

    assertNotNull(response.memories().get().get(0).name().get());
  }

  @Test
  public void testPrivateRetrieveAgentEngineMemory() throws Exception {
    Client client =
        TestUtils.createClient(
            true, "ae_memories_private_retrieve/test_private_retrieve.vertex.json");

    RetrieveMemoriesResponse response =
        client.agentEngines.memories.privateRetrieve(
            "projects/964831358985/locations/us-central1/reasoningEngines/2886612747586371584",
            ImmutableMap.of("user_id", "123"),
            null,
            null,
            null);

    assertNotNull(response.retrievedMemories().get().get(0).memory().get());
  }

  @Test
  public void testPrivateRollbackAgentEngineMemory() throws Exception {
    Client client =
        TestUtils.createClient(
            true, "ae_memories_private_rollback/test_private_rollback.vertex.json");

    AgentEngineRollbackMemoryOperation operation =
        client.agentEngines.memories.privateRollback(
            "projects/964831358985/locations/us-central1/reasoningEngines/2886612747586371584/memories/3858070028511346688",
            "3001207491565453312",
            null);

    assertNotNull(operation.name());
  }

  @Test
  public void testPrivateUpdateAgentEngineMemory() throws Exception {
    Client client =
        TestUtils.createClient(
            true, "ae_memories_private_update/test_private_update_memory.vertex.json");

    AgentEngineMemoryOperation operation =
        client.agentEngines.memories.privateUpdate(
            "projects/964831358985/locations/us-central1/reasoningEngines/2886612747586371584/memories/3858070028511346688",
            "memory_fact_updated",
            ImmutableMap.of("user_id", "123"),
            null);

    assertNotNull(operation.name());
  }

  @Test
  public void testPrivatePurgeAgentEngineMemory() throws Exception {
    Client client =
        TestUtils.createClient(true, "ae_memories_private_purge/test_private_purge.vertex.json");

    AgentEnginePurgeMemoriesOperation operation =
        client.agentEngines.memories.privatePurge(
            "projects/964831358985/locations/us-central1/reasoningEngines/6086402690647064576",
            "scope.user_id=123",
            null,
            false,
            null);

    assertNotNull(operation.name());
  }
}
