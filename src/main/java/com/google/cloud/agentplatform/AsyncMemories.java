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

import com.google.cloud.agentplatform.types.DeleteMemoryConfig;
import com.google.cloud.agentplatform.types.DeleteMemoryOperation;
import com.google.cloud.agentplatform.types.GenerateMemoriesConfig;
import com.google.cloud.agentplatform.types.GenerateMemoriesOperation;
import com.google.cloud.agentplatform.types.GenerateMemoriesRequestDirectContentsSource;
import com.google.cloud.agentplatform.types.GenerateMemoriesRequestDirectMemoriesSource;
import com.google.cloud.agentplatform.types.GenerateMemoriesRequestVertexSessionSource;
import com.google.cloud.agentplatform.types.GetMemoryBankOperationConfig;
import com.google.cloud.agentplatform.types.GetMemoryConfig;
import com.google.cloud.agentplatform.types.ListMemoriesConfig;
import com.google.cloud.agentplatform.types.ListMemoriesResponse;
import com.google.cloud.agentplatform.types.Memory;
import com.google.cloud.agentplatform.types.MemoryConfig;
import com.google.cloud.agentplatform.types.MemoryConjunctionFilter;
import com.google.cloud.agentplatform.types.MemoryOperation;
import com.google.cloud.agentplatform.types.PurgeMemoriesConfig;
import com.google.cloud.agentplatform.types.PurgeMemoriesOperation;
import com.google.cloud.agentplatform.types.RetrieveMemoriesConfig;
import com.google.cloud.agentplatform.types.RetrieveMemoriesRequestSimilaritySearchParams;
import com.google.cloud.agentplatform.types.RetrieveMemoriesRequestSimpleRetrievalParams;
import com.google.cloud.agentplatform.types.RetrieveMemoriesResponse;
import com.google.cloud.agentplatform.types.RetrieveMemoryProfilesConfig;
import com.google.cloud.agentplatform.types.RetrieveProfilesResponse;
import com.google.cloud.agentplatform.types.RollbackMemoryConfig;
import com.google.cloud.agentplatform.types.RollbackMemoryOperation;
import com.google.cloud.agentplatform.types.UpdateMemoryConfig;
import com.google.genai.ApiClient;
import com.google.genai.ApiResponse;
import com.google.genai.Common.BuiltRequest;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/** Async module of {@link Memories} */
public final class AsyncMemories {
  public final AsyncMemoryRevisions revisions;

  Memories memories;
  ApiClient apiClient;

  public AsyncMemories(ApiClient apiClient) {
    this.apiClient = apiClient;
    this.memories = new Memories(apiClient);

    this.revisions = new AsyncMemoryRevisions(apiClient);
  }

  CompletableFuture<MemoryOperation> privateCreate(
      String name, String fact, Map<String, String> scope, MemoryConfig config) {

    BuiltRequest builtRequest = memories.buildRequestForPrivateCreate(name, fact, scope, config);
    return this.apiClient
        .asyncRequest("post", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return memories.processResponseForPrivateCreate(res, config);
              }
            });
  }

  public CompletableFuture<DeleteMemoryOperation> delete(String name, DeleteMemoryConfig config) {

    BuiltRequest builtRequest = memories.buildRequestForDelete(name, config);
    return this.apiClient
        .asyncRequest(
            "delete", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return memories.processResponseForDelete(res, config);
              }
            });
  }

  CompletableFuture<GenerateMemoriesOperation> privateGenerate(
      String name,
      GenerateMemoriesRequestVertexSessionSource vertexSessionSource,
      GenerateMemoriesRequestDirectContentsSource directContentsSource,
      GenerateMemoriesRequestDirectMemoriesSource directMemoriesSource,
      Map<String, String> scope,
      GenerateMemoriesConfig config) {

    BuiltRequest builtRequest =
        memories.buildRequestForPrivateGenerate(
            name, vertexSessionSource, directContentsSource, directMemoriesSource, scope, config);
    return this.apiClient
        .asyncRequest("post", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return memories.processResponseForPrivateGenerate(res, config);
              }
            });
  }

  public CompletableFuture<Memory> get(String name, GetMemoryConfig config) {

    BuiltRequest builtRequest = memories.buildRequestForGet(name, config);
    return this.apiClient
        .asyncRequest("get", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return memories.processResponseForGet(res, config);
              }
            });
  }

  CompletableFuture<ListMemoriesResponse> privateList(String name, ListMemoriesConfig config) {

    BuiltRequest builtRequest = memories.buildRequestForPrivateList(name, config);
    return this.apiClient
        .asyncRequest("get", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return memories.processResponseForPrivateList(res, config);
              }
            });
  }

  CompletableFuture<MemoryOperation> privateGetMemoryOperation(
      String operationName, GetMemoryBankOperationConfig config) {

    BuiltRequest builtRequest =
        memories.buildRequestForPrivateGetMemoryOperation(operationName, config);
    return this.apiClient
        .asyncRequest("get", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return memories.processResponseForPrivateGetMemoryOperation(res, config);
              }
            });
  }

  CompletableFuture<GenerateMemoriesOperation> privateGetGenerateMemoriesOperation(
      String operationName, GetMemoryBankOperationConfig config) {

    BuiltRequest builtRequest =
        memories.buildRequestForPrivateGetGenerateMemoriesOperation(operationName, config);
    return this.apiClient
        .asyncRequest("get", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return memories.processResponseForPrivateGetGenerateMemoriesOperation(res, config);
              }
            });
  }

  CompletableFuture<RetrieveMemoriesResponse> privateRetrieve(
      String name,
      Map<String, String> scope,
      RetrieveMemoriesRequestSimilaritySearchParams similaritySearchParams,
      RetrieveMemoriesRequestSimpleRetrievalParams simpleRetrievalParams,
      RetrieveMemoriesConfig config) {

    BuiltRequest builtRequest =
        memories.buildRequestForPrivateRetrieve(
            name, scope, similaritySearchParams, simpleRetrievalParams, config);
    return this.apiClient
        .asyncRequest("post", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return memories.processResponseForPrivateRetrieve(res, config);
              }
            });
  }

  public CompletableFuture<RetrieveProfilesResponse> retrieveProfiles(
      String name, Map<String, String> scope, RetrieveMemoryProfilesConfig config) {

    BuiltRequest builtRequest = memories.buildRequestForRetrieveProfiles(name, scope, config);
    return this.apiClient
        .asyncRequest("post", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return memories.processResponseForRetrieveProfiles(res, config);
              }
            });
  }

  CompletableFuture<RollbackMemoryOperation> privateRollback(
      String name, String targetRevisionId, RollbackMemoryConfig config) {

    BuiltRequest builtRequest =
        memories.buildRequestForPrivateRollback(name, targetRevisionId, config);
    return this.apiClient
        .asyncRequest("post", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return memories.processResponseForPrivateRollback(res, config);
              }
            });
  }

  CompletableFuture<MemoryOperation> privateUpdate(
      String name, String fact, Map<String, String> scope, UpdateMemoryConfig config) {

    BuiltRequest builtRequest = memories.buildRequestForPrivateUpdate(name, fact, scope, config);
    return this.apiClient
        .asyncRequest("patch", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return memories.processResponseForPrivateUpdate(res, config);
              }
            });
  }

  CompletableFuture<PurgeMemoriesOperation> privatePurge(
      String name,
      String filter,
      List<MemoryConjunctionFilter> filterGroups,
      boolean force,
      PurgeMemoriesConfig config) {

    BuiltRequest builtRequest =
        memories.buildRequestForPrivatePurge(name, filter, filterGroups, force, config);
    return this.apiClient
        .asyncRequest("post", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return memories.processResponseForPrivatePurge(res, config);
              }
            });
  }
}
