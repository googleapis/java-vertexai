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

/** Configures garbage collection of Runtime Revisions. */
@AutoValue
@JsonDeserialize(builder = ReasoningEngineRevisionGarbageCollectionStrategy.Builder.class)
public abstract class ReasoningEngineRevisionGarbageCollectionStrategy extends JsonSerializable {
  /** Optional. Performs no automatic garbage collection on Runtime Revisions. */
  @JsonProperty("noGarbageCollection")
  public abstract Optional<ReasoningEngineRevisionGarbageCollectionStrategyNoGarbageCollection>
      noGarbageCollection();

  /** Optional. Keeps only the latest N Runtime Revisions active. */
  @JsonProperty("keepNLatest")
  public abstract Optional<ReasoningEngineRevisionGarbageCollectionStrategyKeepNLatest>
      keepNLatest();

  /** Instantiates a builder for ReasoningEngineRevisionGarbageCollectionStrategy. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_ReasoningEngineRevisionGarbageCollectionStrategy.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for ReasoningEngineRevisionGarbageCollectionStrategy. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `ReasoningEngineRevisionGarbageCollectionStrategy.builder()`
     * for instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_ReasoningEngineRevisionGarbageCollectionStrategy.Builder();
    }

    /**
     * Setter for noGarbageCollection.
     *
     * <p>noGarbageCollection: Optional. Performs no automatic garbage collection on Runtime
     * Revisions.
     */
    @JsonProperty("noGarbageCollection")
    public abstract Builder noGarbageCollection(
        ReasoningEngineRevisionGarbageCollectionStrategyNoGarbageCollection noGarbageCollection);

    /**
     * Setter for noGarbageCollection builder.
     *
     * <p>noGarbageCollection: Optional. Performs no automatic garbage collection on Runtime
     * Revisions.
     */
    @CanIgnoreReturnValue
    public Builder noGarbageCollection(
        ReasoningEngineRevisionGarbageCollectionStrategyNoGarbageCollection.Builder
            noGarbageCollectionBuilder) {
      return noGarbageCollection(noGarbageCollectionBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder noGarbageCollection(
        Optional<ReasoningEngineRevisionGarbageCollectionStrategyNoGarbageCollection>
            noGarbageCollection);

    /** Clears the value of noGarbageCollection field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearNoGarbageCollection() {
      return noGarbageCollection(Optional.empty());
    }

    /**
     * Setter for keepNLatest.
     *
     * <p>keepNLatest: Optional. Keeps only the latest N Runtime Revisions active.
     */
    @JsonProperty("keepNLatest")
    public abstract Builder keepNLatest(
        ReasoningEngineRevisionGarbageCollectionStrategyKeepNLatest keepNLatest);

    /**
     * Setter for keepNLatest builder.
     *
     * <p>keepNLatest: Optional. Keeps only the latest N Runtime Revisions active.
     */
    @CanIgnoreReturnValue
    public Builder keepNLatest(
        ReasoningEngineRevisionGarbageCollectionStrategyKeepNLatest.Builder keepNLatestBuilder) {
      return keepNLatest(keepNLatestBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder keepNLatest(
        Optional<ReasoningEngineRevisionGarbageCollectionStrategyKeepNLatest> keepNLatest);

    /** Clears the value of keepNLatest field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearKeepNLatest() {
      return keepNLatest(Optional.empty());
    }

    public abstract ReasoningEngineRevisionGarbageCollectionStrategy build();
  }

  /** Deserializes a JSON string to a ReasoningEngineRevisionGarbageCollectionStrategy object. */
  @ExcludeFromGeneratedCoverageReport
  public static ReasoningEngineRevisionGarbageCollectionStrategy fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(
        jsonString, ReasoningEngineRevisionGarbageCollectionStrategy.class);
  }
}
