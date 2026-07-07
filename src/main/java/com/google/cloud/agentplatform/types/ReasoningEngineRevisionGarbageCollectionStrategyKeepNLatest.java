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

/** Keeps only the latest N Runtime Revisions active. */
@AutoValue
@JsonDeserialize(
    builder = ReasoningEngineRevisionGarbageCollectionStrategyKeepNLatest.Builder.class)
public abstract class ReasoningEngineRevisionGarbageCollectionStrategyKeepNLatest
    extends JsonSerializable {
  /**
   * Required. Specifies the maximum number of Runtime Revisions to keep active. If an update to
   * Reasoning Engine would result in exceeding this number of active Runtime Revisions, a new
   * Runtime Revision will be created, while the oldest Runtime Revision will be automatically
   * deprecated, providing it's not configured to serve traffic via `traffic_config`. If the oldest
   * Runtime Revision is configured to serve traffic, the update will fail validation. No changes
   * will be made to the Reasoning Engine, existing Runtime Revisions, and no new Runtime Revision
   * will be created.
   */
  @JsonProperty("maxActiveRevisions")
  public abstract Optional<Integer> maxActiveRevisions();

  /** Instantiates a builder for ReasoningEngineRevisionGarbageCollectionStrategyKeepNLatest. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_ReasoningEngineRevisionGarbageCollectionStrategyKeepNLatest.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for ReasoningEngineRevisionGarbageCollectionStrategyKeepNLatest. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use
     * `ReasoningEngineRevisionGarbageCollectionStrategyKeepNLatest.builder()` for instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_ReasoningEngineRevisionGarbageCollectionStrategyKeepNLatest.Builder();
    }

    /**
     * Setter for maxActiveRevisions.
     *
     * <p>maxActiveRevisions: Required. Specifies the maximum number of Runtime Revisions to keep
     * active. If an update to Reasoning Engine would result in exceeding this number of active
     * Runtime Revisions, a new Runtime Revision will be created, while the oldest Runtime Revision
     * will be automatically deprecated, providing it's not configured to serve traffic via
     * `traffic_config`. If the oldest Runtime Revision is configured to serve traffic, the update
     * will fail validation. No changes will be made to the Reasoning Engine, existing Runtime
     * Revisions, and no new Runtime Revision will be created.
     */
    @JsonProperty("maxActiveRevisions")
    public abstract Builder maxActiveRevisions(Integer maxActiveRevisions);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder maxActiveRevisions(Optional<Integer> maxActiveRevisions);

    /** Clears the value of maxActiveRevisions field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearMaxActiveRevisions() {
      return maxActiveRevisions(Optional.empty());
    }

    public abstract ReasoningEngineRevisionGarbageCollectionStrategyKeepNLatest build();
  }

  /**
   * Deserializes a JSON string to a ReasoningEngineRevisionGarbageCollectionStrategyKeepNLatest
   * object.
   */
  @ExcludeFromGeneratedCoverageReport
  public static ReasoningEngineRevisionGarbageCollectionStrategyKeepNLatest fromJson(
      String jsonString) {
    return JsonSerializable.fromJsonString(
        jsonString, ReasoningEngineRevisionGarbageCollectionStrategyKeepNLatest.class);
  }
}
