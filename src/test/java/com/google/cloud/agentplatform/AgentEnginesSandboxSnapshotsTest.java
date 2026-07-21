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

package com.google.cloud.agentplatform;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.google.cloud.agentplatform.types.AgentEngineSandboxSnapshotOperation;
import com.google.cloud.agentplatform.types.CreateAgentEngineSandboxSnapshotConfig;
import com.google.cloud.agentplatform.types.DeleteSandboxEnvironmentSnapshotOperation;
import com.google.cloud.agentplatform.types.ListSandboxEnvironmentSnapshotsResponse;
import com.google.cloud.agentplatform.types.SandboxEnvironmentSnapshot;
import java.time.Duration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.extension.ExtendWith;

@EnabledIfEnvironmentVariable(
    named = "GOOGLE_GENAI_REPLAYS_DIRECTORY",
    matches = ".*genai/replays.*")
@ExtendWith(EnvironmentVariablesMockingExtension.class)
public class AgentEnginesSandboxSnapshotsTest {

  @Test
  public void testCreateSandboxSnapshot() throws Exception {
    Client client =
        TestUtils.createClient(
            true, "ae_sandbox_snapshots_create/test_create_sandbox_snapshot.vertex.json");

    AgentEngineSandboxSnapshotOperation operation =
        client.agentEngines.sandboxes.snapshots.privateCreate(
            "projects/802583348448/locations/us-central1/reasoningEngines/6130241318758121472/sandboxEnvironments/525190525100228608",
            CreateAgentEngineSandboxSnapshotConfig.builder()
                .displayName("test_snapshot")
                .ttl(Duration.ofSeconds(3600))
                .owner("test_owner")
                .build());

    assertNotNull(operation.name());
  }

  @Test
  public void testGetSandboxSnapshot() throws Exception {
    Client client =
        TestUtils.createClient(
            true, "ae_sandbox_snapshots_get/test_get_sandbox_snapshot.vertex.json");

    String snapshotName =
        "projects/802583348448/locations/us-central1/reasoningEngines/6130241318758121472/sandboxEnvironmentSnapshots/2433069698686910464";
    SandboxEnvironmentSnapshot snapshot =
        client.agentEngines.sandboxes.snapshots.privateGet(snapshotName, null);

    assertNotNull(snapshot.name());
  }

  @Test
  public void testListSandboxSnapshots() throws Exception {
    Client client =
        TestUtils.createClient(
            true, "ae_sandbox_snapshots_list/test_list_sandbox_snapshots.vertex.json");

    ListSandboxEnvironmentSnapshotsResponse response =
        client.agentEngines.sandboxes.snapshots.privateList(
            "projects/802583348448/locations/us-central1/reasoningEngines/6130241318758121472",
            null);

    assertNotNull(response.sandboxEnvironmentSnapshots());
  }

  @Test
  public void testDeleteSandboxSnapshot() throws Exception {
    Client client =
        TestUtils.createClient(
            true, "ae_sandbox_snapshots_delete/test_delete_sandbox_snapshot.vertex.json");

    DeleteSandboxEnvironmentSnapshotOperation operation =
        client.agentEngines.sandboxes.snapshots.privateDelete(
            "projects/802583348448/locations/us-central1/reasoningEngines/6130241318758121472/sandboxEnvironmentSnapshots/421086565159141376",
            null);

    assertNotNull(operation);
  }
}
