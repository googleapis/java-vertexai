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

package com.google.cloud.agentplatform.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.genai.JsonSerializable;
import java.util.Optional;

/** Specification for building container image. */
@AutoValue
@JsonDeserialize(builder = ReasoningEngineSpecBuildSpec.Builder.class)
public abstract class ReasoningEngineSpecBuildSpec extends JsonSerializable {
  /**
   * Optional. Identifier. The resource name of the Cloud Build WorkerPool to use for the build.
   * Format: `projects/{project}/locations/{location}/workerPools/{worker_pool}`
   */
  @JsonProperty("workerPool")
  public abstract Optional<String> workerPool();

  /** Instantiates a builder for ReasoningEngineSpecBuildSpec. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_ReasoningEngineSpecBuildSpec.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for ReasoningEngineSpecBuildSpec. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `ReasoningEngineSpecBuildSpec.builder()` for instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_ReasoningEngineSpecBuildSpec.Builder();
    }

    /**
     * Setter for workerPool.
     *
     * <p>workerPool: Optional. Identifier. The resource name of the Cloud Build WorkerPool to use
     * for the build. Format: `projects/{project}/locations/{location}/workerPools/{worker_pool}`
     */
    @JsonProperty("workerPool")
    public abstract Builder workerPool(String workerPool);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder workerPool(Optional<String> workerPool);

    /** Clears the value of workerPool field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearWorkerPool() {
      return workerPool(Optional.empty());
    }

    public abstract ReasoningEngineSpecBuildSpec build();
  }

  /** Deserializes a JSON string to a ReasoningEngineSpecBuildSpec object. */
  @ExcludeFromGeneratedCoverageReport
  public static ReasoningEngineSpecBuildSpec fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, ReasoningEngineSpecBuildSpec.class);
  }
}
