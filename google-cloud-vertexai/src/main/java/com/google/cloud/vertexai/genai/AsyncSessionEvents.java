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

package com.google.cloud.vertexai.genai;

import com.google.cloud.vertexai.genai.types.AppendAgentEngineSessionEventConfig;
import com.google.cloud.vertexai.genai.types.AppendAgentEngineSessionEventResponse;
import com.google.cloud.vertexai.genai.types.ListAgentEngineSessionEventsConfig;
import com.google.cloud.vertexai.genai.types.ListAgentEngineSessionEventsResponse;
import com.google.genai.ApiClient;
import com.google.genai.ApiResponse;
import com.google.genai.Common.BuiltRequest;
import java.time.Instant;
import java.util.concurrent.CompletableFuture;

/** Async module of {@link SessionEvents} */
public final class AsyncSessionEvents {

  SessionEvents sessionEvents;
  ApiClient apiClient;

  public AsyncSessionEvents(ApiClient apiClient) {
    this.apiClient = apiClient;
    this.sessionEvents = new SessionEvents(apiClient);
  }

  public CompletableFuture<AppendAgentEngineSessionEventResponse> append(
      String name,
      String author,
      String invocationId,
      Instant timestamp,
      AppendAgentEngineSessionEventConfig config) {

    BuiltRequest builtRequest =
        sessionEvents.buildRequestForAppend(name, author, invocationId, timestamp, config);
    return this.apiClient
        .asyncRequest("post", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return sessionEvents.processResponseForAppend(res, config);
              }
            });
  }

  CompletableFuture<ListAgentEngineSessionEventsResponse> privateList(
      String name, ListAgentEngineSessionEventsConfig config) {

    BuiltRequest builtRequest = sessionEvents.buildRequestForPrivateList(name, config);
    return this.apiClient
        .asyncRequest("get", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return sessionEvents.processResponseForPrivateList(res, config);
              }
            });
  }
}
