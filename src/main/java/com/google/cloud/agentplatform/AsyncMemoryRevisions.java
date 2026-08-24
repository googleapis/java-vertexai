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

import com.google.cloud.agentplatform.types.GetMemoryRevisionConfig;
import com.google.cloud.agentplatform.types.ListMemoryRevisionsConfig;
import com.google.cloud.agentplatform.types.ListMemoryRevisionsResponse;
import com.google.cloud.agentplatform.types.MemoryRevision;
import com.google.genai.ApiClient;
import com.google.genai.ApiResponse;
import com.google.genai.Common.BuiltRequest;
import java.util.concurrent.CompletableFuture;

/** Async module of {@link MemoryRevisions} */
public final class AsyncMemoryRevisions {

  MemoryRevisions memoryRevisions;
  ApiClient apiClient;

  public AsyncMemoryRevisions(ApiClient apiClient) {
    this.apiClient = apiClient;
    this.memoryRevisions = new MemoryRevisions(apiClient);
  }

  public CompletableFuture<MemoryRevision> get(String name, GetMemoryRevisionConfig config) {

    BuiltRequest builtRequest = memoryRevisions.buildRequestForGet(name, config);
    return this.apiClient
        .asyncRequest("get", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return memoryRevisions.processResponseForGet(res, config);
              }
            });
  }

  CompletableFuture<ListMemoryRevisionsResponse> privateList(
      String name, ListMemoryRevisionsConfig config) {

    BuiltRequest builtRequest = memoryRevisions.buildRequestForPrivateList(name, config);
    return this.apiClient
        .asyncRequest("get", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return memoryRevisions.processResponseForPrivateList(res, config);
              }
            });
  }
}
