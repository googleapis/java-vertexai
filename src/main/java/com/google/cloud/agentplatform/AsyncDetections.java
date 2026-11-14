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

import com.google.cloud.agentplatform.types.DetectContentConfig;
import com.google.cloud.agentplatform.types.DetectContentResponse;
import com.google.genai.ApiClient;
import com.google.genai.ApiResponse;
import com.google.genai.Common.BuiltRequest;
import com.google.genai.types.Content;
import java.util.concurrent.CompletableFuture;

/** Async module of {@link Detections} */
public final class AsyncDetections {

  Detections detections;
  ApiClient apiClient;

  public AsyncDetections(ApiClient apiClient) {
    this.apiClient = apiClient;
    this.detections = new Detections(apiClient);
  }

  public CompletableFuture<DetectContentResponse> detectContent(
      String model, Content content, DetectContentConfig config) {

    BuiltRequest builtRequest = detections.buildRequestForDetectContent(model, content, config);
    return this.apiClient
        .asyncRequest("post", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())
        .thenApplyAsync(
            response -> {
              try (ApiResponse res = response) {
                return detections.processResponseForDetectContent(res, config);
              }
            });
  }
}
