/*
 * Copyright 2025 Google LLC
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

// Auto-generated code. Do not edit.

package com.google.cloud.agentplatform;

import com.google.cloud.agentplatform.types.CreateSandboxEnvironmentTemplateConfig;
import com.google.cloud.agentplatform.types.DeleteSandboxEnvironmentTemplateConfig;
import com.google.cloud.agentplatform.types.DeleteSandboxEnvironmentTemplateOperation;
import com.google.cloud.agentplatform.types.GetAgentEngineOperationConfig;
import com.google.cloud.agentplatform.types.GetSandboxEnvironmentTemplateConfig;
import com.google.cloud.agentplatform.types.ListSandboxEnvironmentTemplatesConfig;
import com.google.cloud.agentplatform.types.ListSandboxEnvironmentTemplatesResponse;
import com.google.cloud.agentplatform.types.SandboxEnvironmentTemplate;
import com.google.cloud.agentplatform.types.SandboxEnvironmentTemplateOperation;
import com.google.genai.ApiClient;
import com.google.genai.ApiResponse;
import com.google.genai.Common.BuiltRequest;
import java.util.concurrent.CompletableFuture;

/** Async module of {@link SandboxTemplates} */
public final class AsyncSandboxTemplates {

  SandboxTemplates sandboxTemplates;
  ApiClient apiClient;

  public AsyncSandboxTemplates(ApiClient apiClient) {
    this.apiClient = apiClient;
    this.sandboxTemplates = new SandboxTemplates(apiClient);
  }

  CompletableFuture<SandboxEnvironmentTemplateOperation> privateCreate(
      String name, String displayName, CreateSandboxEnvironmentTemplateConfig config) {

    BuiltRequest builtRequest =
        sandboxTemplates.buildRequestForPrivateCreate(name, displayName, config);
    return this.apiClient
        .asyncRequest("post", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return sandboxTemplates.processResponseForPrivateCreate(res, config);
              }
            });
  }

  CompletableFuture<DeleteSandboxEnvironmentTemplateOperation> privateDelete(
      String name, DeleteSandboxEnvironmentTemplateConfig config) {

    BuiltRequest builtRequest = sandboxTemplates.buildRequestForPrivateDelete(name, config);
    return this.apiClient
        .asyncRequest(
            "delete", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return sandboxTemplates.processResponseForPrivateDelete(res, config);
              }
            });
  }

  CompletableFuture<SandboxEnvironmentTemplate> privateGet(
      String name, GetSandboxEnvironmentTemplateConfig config) {

    BuiltRequest builtRequest = sandboxTemplates.buildRequestForPrivateGet(name, config);
    return this.apiClient
        .asyncRequest("get", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return sandboxTemplates.processResponseForPrivateGet(res, config);
              }
            });
  }

  CompletableFuture<ListSandboxEnvironmentTemplatesResponse> privateList(
      String name, ListSandboxEnvironmentTemplatesConfig config) {

    BuiltRequest builtRequest = sandboxTemplates.buildRequestForPrivateList(name, config);
    return this.apiClient
        .asyncRequest("get", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return sandboxTemplates.processResponseForPrivateList(res, config);
              }
            });
  }

  public CompletableFuture<SandboxEnvironmentTemplateOperation>
      getSandboxEnvironmentTemplateOperation(
          String operationName, GetAgentEngineOperationConfig config) {

    BuiltRequest builtRequest =
        sandboxTemplates.buildRequestForGetSandboxEnvironmentTemplateOperation(
            operationName, config);
    return this.apiClient
        .asyncRequest("get", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return sandboxTemplates.processResponseForGetSandboxEnvironmentTemplateOperation(
                    res, config);
              }
            });
  }
}
