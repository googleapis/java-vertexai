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

/** Specification for an Example Store. */
@AutoValue
@JsonDeserialize(builder = ReasoningEngineContextSpecExampleStoreConfig.Builder.class)
public abstract class ReasoningEngineContextSpecExampleStoreConfig extends JsonSerializable {
  /**
   * Optional. Configuration for how to perform similarity search on examples. If not set, the
   * Example Store will use the default embedding model `text-embedding-005`.
   */
  @JsonProperty("similaritySearchConfig")
  public abstract Optional<ReasoningEngineContextSpecExampleStoreConfigSimilaritySearchConfig>
      similaritySearchConfig();

  /** Instantiates a builder for ReasoningEngineContextSpecExampleStoreConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_ReasoningEngineContextSpecExampleStoreConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for ReasoningEngineContextSpecExampleStoreConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `ReasoningEngineContextSpecExampleStoreConfig.builder()` for
     * instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_ReasoningEngineContextSpecExampleStoreConfig.Builder();
    }

    /**
     * Setter for similaritySearchConfig.
     *
     * <p>similaritySearchConfig: Optional. Configuration for how to perform similarity search on
     * examples. If not set, the Example Store will use the default embedding model
     * `text-embedding-005`.
     */
    @JsonProperty("similaritySearchConfig")
    public abstract Builder similaritySearchConfig(
        ReasoningEngineContextSpecExampleStoreConfigSimilaritySearchConfig similaritySearchConfig);

    /**
     * Setter for similaritySearchConfig builder.
     *
     * <p>similaritySearchConfig: Optional. Configuration for how to perform similarity search on
     * examples. If not set, the Example Store will use the default embedding model
     * `text-embedding-005`.
     */
    @CanIgnoreReturnValue
    public Builder similaritySearchConfig(
        ReasoningEngineContextSpecExampleStoreConfigSimilaritySearchConfig.Builder
            similaritySearchConfigBuilder) {
      return similaritySearchConfig(similaritySearchConfigBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder similaritySearchConfig(
        Optional<ReasoningEngineContextSpecExampleStoreConfigSimilaritySearchConfig>
            similaritySearchConfig);

    /** Clears the value of similaritySearchConfig field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearSimilaritySearchConfig() {
      return similaritySearchConfig(Optional.empty());
    }

    public abstract ReasoningEngineContextSpecExampleStoreConfig build();
  }

  /** Deserializes a JSON string to a ReasoningEngineContextSpecExampleStoreConfig object. */
  @ExcludeFromGeneratedCoverageReport
  public static ReasoningEngineContextSpecExampleStoreConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(
        jsonString, ReasoningEngineContextSpecExampleStoreConfig.class);
  }
}
