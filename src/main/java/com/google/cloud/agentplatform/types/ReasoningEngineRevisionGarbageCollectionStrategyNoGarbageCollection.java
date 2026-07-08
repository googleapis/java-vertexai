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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;
import com.google.genai.JsonSerializable;

/** Performs no automatic garbage collection on Runtime Revisions. */
@AutoValue
@JsonDeserialize(
    builder = ReasoningEngineRevisionGarbageCollectionStrategyNoGarbageCollection.Builder.class)
public abstract class ReasoningEngineRevisionGarbageCollectionStrategyNoGarbageCollection
    extends JsonSerializable {
  /**
   * Instantiates a builder for ReasoningEngineRevisionGarbageCollectionStrategyNoGarbageCollection.
   */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_ReasoningEngineRevisionGarbageCollectionStrategyNoGarbageCollection
        .Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for ReasoningEngineRevisionGarbageCollectionStrategyNoGarbageCollection. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use
     * `ReasoningEngineRevisionGarbageCollectionStrategyNoGarbageCollection.builder()` for
     * instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_ReasoningEngineRevisionGarbageCollectionStrategyNoGarbageCollection
          .Builder();
    }

    public abstract ReasoningEngineRevisionGarbageCollectionStrategyNoGarbageCollection build();
  }

  /**
   * Deserializes a JSON string to a
   * ReasoningEngineRevisionGarbageCollectionStrategyNoGarbageCollection object.
   */
  @ExcludeFromGeneratedCoverageReport
  public static ReasoningEngineRevisionGarbageCollectionStrategyNoGarbageCollection fromJson(
      String jsonString) {
    return JsonSerializable.fromJsonString(
        jsonString, ReasoningEngineRevisionGarbageCollectionStrategyNoGarbageCollection.class);
  }
}
