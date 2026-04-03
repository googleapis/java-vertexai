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

import com.google.cloud.vertexai.genai.types.AgentEngineSandboxOperation;
import com.google.cloud.vertexai.genai.types.Chunk;
import com.google.cloud.vertexai.genai.types.DeleteAgentEngineSandboxOperation;
import com.google.cloud.vertexai.genai.types.ExecuteSandboxEnvironmentResponse;
import com.google.cloud.vertexai.genai.types.Metadata;
import com.google.cloud.vertexai.genai.types.ListAgentEngineSandboxesResponse;
import com.google.cloud.vertexai.genai.types.SandboxEnvironment;
import com.google.cloud.vertexai.genai.types.SandboxEnvironmentSpec;
import com.google.cloud.vertexai.genai.types.SandboxEnvironmentSpecCodeExecutionEnvironment;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.genai.JsonSerializable;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.extension.ExtendWith;

@EnabledIfEnvironmentVariable(
    named = "GOOGLE_GENAI_REPLAYS_DIRECTORY",
    matches = ".*genai/replays.*")
@ExtendWith(EnvironmentVariablesMockingExtension.class)
public class AgentEnginesSandboxesTest {

  @Test
  public void testPrivateCreateAgentEngineSandbox() throws Exception {
    Client client =
        TestUtils.createClient(true, "ae_sandboxes_private_create/test_private_create.vertex.json");

    AgentEngineSandboxOperation operation =
        client.agentEngines.sandboxes.privateCreate(
            "projects/964831358985/locations/us-central1/reasoningEngines/2886612747586371584",
            SandboxEnvironmentSpec.builder()
                .codeExecutionEnvironment(
                    SandboxEnvironmentSpecCodeExecutionEnvironment.builder()
                        .machineConfig("MACHINE_CONFIG_VCPU4_RAM4GIB")
                        .build())
                .build(),
            null);

    assertNotNull(operation.name());
  }

  @Test
  public void testPrivateListAgentEngineSandbox() throws Exception {
    Client client =
        TestUtils.createClient(true, "ae_sandboxes_private_list/test_private_list.vertex.json");

    ListAgentEngineSandboxesResponse response =
        client.agentEngines.sandboxes.privateList("reasoningEngines/2886612747586371584", null);

    assertNotNull(response.sandboxEnvironments());
    assertFalse(response.sandboxEnvironments().get().isEmpty());
  }

  @Test
  public void testPrivateGetAgentEngineSandbox() throws Exception {
    Client client =
        TestUtils.createClient(true, "ae_sandboxes_private_get/test_private_get.vertex.json");

    SandboxEnvironment response =
        client.agentEngines.sandboxes.privateGet(
            "projects/964831358985/locations/us-central1/reasoningEngines/2886612747586371584/sandboxEnvironments/3186171392039059456",
            null);

    assertNotNull(response.name());
  }

  @Test
  public void testPrivateGetAgentEngineSandboxOperation() throws Exception {
    Client client =
        TestUtils.createClient(
            true,
            "ae_sandboxes_private_get_sandbox_operation/test_private_get_operation.vertex.json");

    AgentEngineSandboxOperation operation =
        client.agentEngines.sandboxes.privateGetSandboxOperation(
            "projects/964831358985/locations/us-central1/operations/4799455193970245632", null);

    assertNotNull(operation.name());
  }

  @Test
  public void testPrivateExecuteCode() throws Exception {
    Client client =
        TestUtils.createClient(
            true, "ae_sandboxes_private_execute_code/test_private_execute_code.vertex.json");

    String code =
        "\nwith open(\"test.txt\", \"r\") as input:\n"
            + "    with open(\"output.txt\", \"w\") as output_txt:\n"
            + "        for line in input:\n"
            + "            output_txt.write(line)\n";

    String jsonWithSpace = String.format("{\"code\": %s}", JsonSerializable.toJsonString(code));

    Chunk chunk1 =
        Chunk.builder()
            .data(jsonWithSpace.getBytes(StandardCharsets.UTF_8))
            .mimeType("application/json")
            .build();

    Chunk chunk2 =
        Chunk.builder()
            .data("Hello, world!".getBytes(StandardCharsets.UTF_8))
            .metadata(
                Metadata.builder()
                    .attributes(
                        ImmutableMap.of("fileName", "test.txt".getBytes(StandardCharsets.UTF_8)))
                    .build())
            .mimeType("text/plain")
            .build();

    List<Chunk> inputs = ImmutableList.of(chunk1, chunk2);

    ExecuteSandboxEnvironmentResponse response =
        client.agentEngines.sandboxes.privateExecuteCode(
            "reasoningEngines/2886612747586371584/sandboxEnvironments/6068475153556176896",
            inputs,
            null);

    assertNotNull(response.outputs());
  }

  @Test
  public void testDeleteAgentEngineSandbox() throws Exception {
    Client client =
        TestUtils.createClient(true, "ae_sandboxes_private_delete/test_private_delete.vertex.json");

    DeleteAgentEngineSandboxOperation operation =
        client.agentEngines.sandboxes.privateDelete(
            "reasoningEngines/2886612747586371584/sandboxEnvironments/6068475153556176896", null);

    assertNotNull(operation.name());
  }
}
