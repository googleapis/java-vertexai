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

import com.google.cloud.agentplatform.types.CreateSandboxEnvironmentTemplateConfig;
import com.google.cloud.agentplatform.types.DeleteSandboxEnvironmentTemplateOperation;
import com.google.cloud.agentplatform.types.ListSandboxEnvironmentTemplatesResponse;
import com.google.cloud.agentplatform.types.SandboxEnvironmentTemplate;
import com.google.cloud.agentplatform.types.SandboxEnvironmentTemplateDefaultContainerEnvironment;
import com.google.cloud.agentplatform.types.SandboxEnvironmentTemplateEgressControlConfig;
import com.google.cloud.agentplatform.types.SandboxEnvironmentTemplateOperation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.extension.ExtendWith;

@EnabledIfEnvironmentVariable(
    named = "GOOGLE_GENAI_REPLAYS_DIRECTORY",
    matches = ".*genai/replays.*")
@ExtendWith(EnvironmentVariablesMockingExtension.class)
public class AgentEnginesSandboxTemplatesTest {

  @Test
  public void testCreateSandboxTemplate() throws Exception {
    Client client =
        TestUtils.createClient(
            true,
            "ae_sandbox_templates_default_create/test_sandbox_templates_default_create.vertex.json");

    SandboxEnvironmentTemplateOperation operation =
        client.agentEngines.sandboxes.templates.privateCreate(
            "projects/802583348448/locations/us-central1/reasoningEngines/6130241318758121472",
            "Test Sandbox Template 1",
            CreateSandboxEnvironmentTemplateConfig.builder()
                .defaultContainerEnvironment(
                    SandboxEnvironmentTemplateDefaultContainerEnvironment.builder()
                        .defaultContainerCategory(
                            "DEFAULT_CONTAINER_CATEGORY_COMPUTER_USE")
                        .build())
                .egressControlConfig(
                    SandboxEnvironmentTemplateEgressControlConfig.builder()
                        .internetAccess(true)
                        .build())
                .build());

    assertNotNull(operation.name());
  }

  @Test
  public void testGetSandboxTemplate() throws Exception {
    Client client =
        TestUtils.createClient(
            true, "ae_sandbox_templates_get/test_sandbox_templates_get.vertex.json");

    String templateName =
        "projects/254005681254/locations/us-central1/reasoningEngines/208148546254274560/sandboxEnvironmentTemplates/4632233691727265792";
    SandboxEnvironmentTemplate template =
        client.agentEngines.sandboxes.templates.privateGet(templateName, null);

    assertNotNull(template.name());
  }

  @Test
  public void testListSandboxTemplates() throws Exception {
    Client client =
        TestUtils.createClient(
            true, "ae_sandbox_templates_list/test_sandbox_templates_list.vertex.json");

    ListSandboxEnvironmentTemplatesResponse response =
        client.agentEngines.sandboxes.templates.privateList(
            "projects/254005681254/locations/us-central1/reasoningEngines/208148546254274560",
            null);

    assertNotNull(response.sandboxEnvironmentTemplates());
  }

  @Test
  public void testDeleteSandboxTemplate() throws Exception {
    Client client =
        TestUtils.createClient(
            true, "ae_sandbox_templates_delete/test_sandbox_templates_delete.vertex.json");

    DeleteSandboxEnvironmentTemplateOperation operation =
        client.agentEngines.sandboxes.templates.privateDelete(
            "projects/254005681254/locations/us-central1/reasoningEngines/208148546254274560/sandboxEnvironmentTemplates/4632233691727265792",
            null);

    assertNotNull(operation);
  }

  @Test
  public void testGetSandboxTemplateOperation() throws Exception {
    Client client =
        TestUtils.createClient(
            true,
            "ae_sandbox_templates_get_sandbox_template_operation/test_get_sandbox_template_operation.vertex.json");

    String operationName =
        "projects/254005681254/locations/us-central1/operations/7252775414349692928";
    SandboxEnvironmentTemplateOperation operation =
        client.agentEngines.sandboxes.templates.getSandboxEnvironmentTemplateOperation(
            operationName, null);

    assertNotNull(operation.name());
  }
}
