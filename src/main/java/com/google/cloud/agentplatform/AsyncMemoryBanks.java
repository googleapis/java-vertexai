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

import com.google.cloud.agentplatform.types.CreateMemoryBankConfig;
import com.google.cloud.agentplatform.types.DeleteMemoryBankConfig;
import com.google.cloud.agentplatform.types.DeleteMemoryBankOperation;
import com.google.cloud.agentplatform.types.GetMemoryBankConfig;
import com.google.cloud.agentplatform.types.GetMemoryBankOperationConfig;
import com.google.cloud.agentplatform.types.IngestEventsConfig;
import com.google.cloud.agentplatform.types.IngestionDirectContentsSource;
import com.google.cloud.agentplatform.types.ListMemoryBanksConfig;
import com.google.cloud.agentplatform.types.ListReasoningEnginesResponse;
import com.google.cloud.agentplatform.types.MemoryBankIngestEventsOperation;
import com.google.cloud.agentplatform.types.MemoryBankOperation;
import com.google.cloud.agentplatform.types.MemoryGenerationTriggerConfig;
import com.google.cloud.agentplatform.types.ReasoningEngine;
import com.google.cloud.agentplatform.types.ReasoningEngineContextSpecMemoryBankConfig;
import com.google.genai.ApiClient;
import com.google.genai.ApiResponse;
import com.google.genai.Common.BuiltRequest;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/** Async module of {@link MemoryBanks} */
public final class AsyncMemoryBanks {
  public final AsyncMemories memories;

  MemoryBanks memoryBanks;
  ApiClient apiClient;

  public AsyncMemoryBanks(ApiClient apiClient) {
    this.apiClient = apiClient;
    this.memoryBanks = new MemoryBanks(apiClient);

    this.memories = new AsyncMemories(apiClient);
  }

  CompletableFuture<MemoryBankOperation> privateCreate(
      ReasoningEngineContextSpecMemoryBankConfig memoryBankConfig, CreateMemoryBankConfig config) {

    BuiltRequest builtRequest = memoryBanks.buildRequestForPrivateCreate(memoryBankConfig, config);
    return this.apiClient
        .asyncRequest("post", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return memoryBanks.processResponseForPrivateCreate(res, config);
              }
            });
  }

  CompletableFuture<DeleteMemoryBankOperation> privateDelete(
      String name, boolean force, DeleteMemoryBankConfig config) {

    BuiltRequest builtRequest = memoryBanks.buildRequestForPrivateDelete(name, force, config);
    return this.apiClient
        .asyncRequest(
            "delete", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return memoryBanks.processResponseForPrivateDelete(res, config);
              }
            });
  }

  CompletableFuture<ReasoningEngine> privateGet(String name, GetMemoryBankConfig config) {

    BuiltRequest builtRequest = memoryBanks.buildRequestForPrivateGet(name, config);
    return this.apiClient
        .asyncRequest("get", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return memoryBanks.processResponseForPrivateGet(res, config);
              }
            });
  }

  CompletableFuture<MemoryBankIngestEventsOperation> privateIngestEvents(
      String name,
      String streamId,
      IngestionDirectContentsSource directContentsSource,
      Map<String, String> scope,
      MemoryGenerationTriggerConfig generationTriggerConfig,
      IngestEventsConfig config) {

    BuiltRequest builtRequest =
        memoryBanks.buildRequestForPrivateIngestEvents(
            name, streamId, directContentsSource, scope, generationTriggerConfig, config);
    return this.apiClient
        .asyncRequest("post", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return memoryBanks.processResponseForPrivateIngestEvents(res, config);
              }
            });
  }

  CompletableFuture<ListReasoningEnginesResponse> privateList(ListMemoryBanksConfig config) {

    BuiltRequest builtRequest = memoryBanks.buildRequestForPrivateList(config);
    return this.apiClient
        .asyncRequest("get", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return memoryBanks.processResponseForPrivateList(res, config);
              }
            });
  }

  CompletableFuture<MemoryBankOperation> privateGetMemoryBankOperation(
      String operationName, GetMemoryBankOperationConfig config) {

    BuiltRequest builtRequest =
        memoryBanks.buildRequestForPrivateGetMemoryBankOperation(operationName, config);
    return this.apiClient
        .asyncRequest("get", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return memoryBanks.processResponseForPrivateGetMemoryBankOperation(res, config);
              }
            });
  }
}
