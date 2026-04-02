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

package com.google.cloud.vertexai.genai.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.genai.JsonSerializable;
import java.util.Optional;

/** Represents configuration for customizing how memories are consolidated. */
@AutoValue
@JsonDeserialize(builder = MemoryBankCustomizationConfigConsolidationConfig.Builder.class)
public abstract class MemoryBankCustomizationConfigConsolidationConfig extends JsonSerializable {
  /**
   * Optional. Represents the maximum number of revisions to consider for each candidate memory. If
   * not set, then the default value (1) will be used, which means that only the latest revision
   * will be considered.
   */
  @JsonProperty("revisionsPerCandidateCount")
  public abstract Optional<Integer> revisionsPerCandidateCount();

  /** Instantiates a builder for MemoryBankCustomizationConfigConsolidationConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_MemoryBankCustomizationConfigConsolidationConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for MemoryBankCustomizationConfigConsolidationConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `MemoryBankCustomizationConfigConsolidationConfig.builder()`
     * for instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_MemoryBankCustomizationConfigConsolidationConfig.Builder();
    }

    /**
     * Setter for revisionsPerCandidateCount.
     *
     * <p>revisionsPerCandidateCount: Optional. Represents the maximum number of revisions to
     * consider for each candidate memory. If not set, then the default value (1) will be used,
     * which means that only the latest revision will be considered.
     */
    @JsonProperty("revisionsPerCandidateCount")
    public abstract Builder revisionsPerCandidateCount(Integer revisionsPerCandidateCount);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder revisionsPerCandidateCount(Optional<Integer> revisionsPerCandidateCount);

    /** Clears the value of revisionsPerCandidateCount field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearRevisionsPerCandidateCount() {
      return revisionsPerCandidateCount(Optional.empty());
    }

    public abstract MemoryBankCustomizationConfigConsolidationConfig build();
  }

  /** Deserializes a JSON string to a MemoryBankCustomizationConfigConsolidationConfig object. */
  @ExcludeFromGeneratedCoverageReport
  public static MemoryBankCustomizationConfigConsolidationConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(
        jsonString, MemoryBankCustomizationConfigConsolidationConfig.class);
  }
}
