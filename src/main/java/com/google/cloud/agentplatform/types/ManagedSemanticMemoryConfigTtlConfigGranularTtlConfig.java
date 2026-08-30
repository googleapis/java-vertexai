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

/** The configuration for granular TTL. */
@AutoValue
@JsonDeserialize(builder = ManagedSemanticMemoryConfigTtlConfigGranularTtlConfig.Builder.class)
public abstract class ManagedSemanticMemoryConfigTtlConfigGranularTtlConfig
    extends JsonSerializable {
  /** Optional. The TTL duration for memories uploaded via CreateMemory. */
  @JsonProperty("createTtl")
  public abstract Optional<String> createTtl();

  /** Optional. The TTL duration for memories generated via GenerateMemories. */
  @JsonProperty("generateCreatedTtl")
  public abstract Optional<String> generateCreatedTtl();

  /**
   * Optional. The TTL duration for memories updated via GenerateMemories
   * (GenerateMemoriesResponse.GeneratedMemory.Action.UPDATED). In the case of an UPDATE action, the
   * `expire_time` of the existing memory will be updated to the new value (now + TTL).
   */
  @JsonProperty("generateUpdatedTtl")
  public abstract Optional<String> generateUpdatedTtl();

  /** Instantiates a builder for ManagedSemanticMemoryConfigTtlConfigGranularTtlConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_ManagedSemanticMemoryConfigTtlConfigGranularTtlConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for ManagedSemanticMemoryConfigTtlConfigGranularTtlConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use
     * `ManagedSemanticMemoryConfigTtlConfigGranularTtlConfig.builder()` for instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_ManagedSemanticMemoryConfigTtlConfigGranularTtlConfig.Builder();
    }

    /**
     * Setter for createTtl.
     *
     * <p>createTtl: Optional. The TTL duration for memories uploaded via CreateMemory.
     */
    @JsonProperty("createTtl")
    public abstract Builder createTtl(String createTtl);

    @ExcludeFromGeneratedCoverageReport
    abstract Optional<String> createTtl();

    @ExcludeFromGeneratedCoverageReport
    abstract Builder createTtl(Optional<String> createTtl);

    /** Clears the value of createTtl field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearCreateTtl() {
      return createTtl(Optional.empty());
    }

    /**
     * Setter for generateCreatedTtl.
     *
     * <p>generateCreatedTtl: Optional. The TTL duration for memories generated via
     * GenerateMemories.
     */
    @JsonProperty("generateCreatedTtl")
    public abstract Builder generateCreatedTtl(String generateCreatedTtl);

    @ExcludeFromGeneratedCoverageReport
    abstract Optional<String> generateCreatedTtl();

    @ExcludeFromGeneratedCoverageReport
    abstract Builder generateCreatedTtl(Optional<String> generateCreatedTtl);

    /** Clears the value of generateCreatedTtl field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearGenerateCreatedTtl() {
      return generateCreatedTtl(Optional.empty());
    }

    /**
     * Setter for generateUpdatedTtl.
     *
     * <p>generateUpdatedTtl: Optional. The TTL duration for memories updated via GenerateMemories
     * (GenerateMemoriesResponse.GeneratedMemory.Action.UPDATED). In the case of an UPDATE action,
     * the `expire_time` of the existing memory will be updated to the new value (now + TTL).
     */
    @JsonProperty("generateUpdatedTtl")
    public abstract Builder generateUpdatedTtl(String generateUpdatedTtl);

    @ExcludeFromGeneratedCoverageReport
    abstract Optional<String> generateUpdatedTtl();

    @ExcludeFromGeneratedCoverageReport
    abstract Builder generateUpdatedTtl(Optional<String> generateUpdatedTtl);

    /** Clears the value of generateUpdatedTtl field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearGenerateUpdatedTtl() {
      return generateUpdatedTtl(Optional.empty());
    }

    public abstract ManagedSemanticMemoryConfigTtlConfigGranularTtlConfig build();
  }

  /**
   * Deserializes a JSON string to a ManagedSemanticMemoryConfigTtlConfigGranularTtlConfig object.
   */
  @ExcludeFromGeneratedCoverageReport
  public static ManagedSemanticMemoryConfigTtlConfigGranularTtlConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(
        jsonString, ManagedSemanticMemoryConfigTtlConfigGranularTtlConfig.class);
  }
}
