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

import com.google.cloud.agentplatform.types.AgentEngineSandboxSnapshotOperation;
import com.google.cloud.agentplatform.types.CreateAgentEngineSandboxSnapshotConfig;
import com.google.cloud.agentplatform.types.DeleteSandboxEnvironmentSnapshotConfig;
import com.google.cloud.agentplatform.types.DeleteSandboxEnvironmentSnapshotOperation;
import com.google.cloud.agentplatform.types.GetAgentEngineOperationConfig;
import com.google.cloud.agentplatform.types.GetSandboxEnvironmentSnapshotConfig;
import com.google.cloud.agentplatform.types.ListSandboxEnvironmentSnapshotsConfig;
import com.google.cloud.agentplatform.types.ListSandboxEnvironmentSnapshotsResponse;
import com.google.cloud.agentplatform.types.SandboxEnvironmentSnapshot;
import com.google.genai.ApiClient;
import com.google.genai.ApiResponse;
import com.google.genai.Common.BuiltRequest;
import java.util.concurrent.CompletableFuture;

/** Async module of {@link SandboxSnapshots} */
public final class AsyncSandboxSnapshots {

  SandboxSnapshots sandboxSnapshots;
  ApiClient apiClient;

  public AsyncSandboxSnapshots(ApiClient apiClient) {
    this.apiClient = apiClient;
    this.sandboxSnapshots = new SandboxSnapshots(apiClient);
  }

  CompletableFuture<AgentEngineSandboxSnapshotOperation> privateCreate(
      String sourceSandboxEnvironmentName, CreateAgentEngineSandboxSnapshotConfig config) {

    BuiltRequest builtRequest =
        sandboxSnapshots.buildRequestForPrivateCreate(sourceSandboxEnvironmentName, config);
    return this.apiClient
        .asyncRequest("post", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return sandboxSnapshots.processResponseForPrivateCreate(res, config);
              }
            });
  }

  CompletableFuture<DeleteSandboxEnvironmentSnapshotOperation> privateDelete(
      String name, DeleteSandboxEnvironmentSnapshotConfig config) {

    BuiltRequest builtRequest = sandboxSnapshots.buildRequestForPrivateDelete(name, config);
    return this.apiClient
        .asyncRequest(
            "delete", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return sandboxSnapshots.processResponseForPrivateDelete(res, config);
              }
            });
  }

  CompletableFuture<SandboxEnvironmentSnapshot> privateGet(
      String name, GetSandboxEnvironmentSnapshotConfig config) {

    BuiltRequest builtRequest = sandboxSnapshots.buildRequestForPrivateGet(name, config);
    return this.apiClient
        .asyncRequest("get", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return sandboxSnapshots.processResponseForPrivateGet(res, config);
              }
            });
  }

  CompletableFuture<ListSandboxEnvironmentSnapshotsResponse> privateList(
      String name, ListSandboxEnvironmentSnapshotsConfig config) {

    BuiltRequest builtRequest = sandboxSnapshots.buildRequestForPrivateList(name, config);
    return this.apiClient
        .asyncRequest("get", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return sandboxSnapshots.processResponseForPrivateList(res, config);
              }
            });
  }

  public CompletableFuture<AgentEngineSandboxSnapshotOperation> getSandboxSnapshotOperation(
      String operationName, GetAgentEngineOperationConfig config) {

    BuiltRequest builtRequest =
        sandboxSnapshots.buildRequestForGetSandboxSnapshotOperation(operationName, config);
    return this.apiClient
        .asyncRequest("get", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return sandboxSnapshots.processResponseForGetSandboxSnapshotOperation(res, config);
              }
            });
  }
}
