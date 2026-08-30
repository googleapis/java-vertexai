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

/** The configuration for automatic TTL ('time-to-live') of the memories. */
@AutoValue
@JsonDeserialize(builder = ManagedSemanticMemoryConfigTtlConfig.Builder.class)
public abstract class ManagedSemanticMemoryConfigTtlConfig extends JsonSerializable {
  /**
   * The default TTL for memories in the Memory Bank. If not set, TTL will not be applied
   * automatically. The TTL can be explicitly set by modifying the `expire_time` of each Memory
   * resource.
   */
  @JsonProperty("defaultTtl")
  public abstract Optional<String> defaultTtl();

  /** The granular TTL config for memories. */
  @JsonProperty("granularTtlConfig")
  public abstract Optional<ManagedSemanticMemoryConfigTtlConfigGranularTtlConfig>
      granularTtlConfig();

  /**
   * The default TTL for memory revisions in the Memory Bank. If not set, TTL will not be applied
   * automatically. The TTL can be explicitly set by modifying the `expire_time` of each Memory
   * resource.
   */
  @JsonProperty("memoryRevisionDefaultTtl")
  public abstract Optional<String> memoryRevisionDefaultTtl();

  /** Instantiates a builder for ManagedSemanticMemoryConfigTtlConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_ManagedSemanticMemoryConfigTtlConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for ManagedSemanticMemoryConfigTtlConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `ManagedSemanticMemoryConfigTtlConfig.builder()` for
     * instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_ManagedSemanticMemoryConfigTtlConfig.Builder();
    }

    /**
     * Setter for defaultTtl.
     *
     * <p>defaultTtl: The default TTL for memories in the Memory Bank. If not set, TTL will not be
     * applied automatically. The TTL can be explicitly set by modifying the `expire_time` of each
     * Memory resource.
     */
    @JsonProperty("defaultTtl")
    public abstract Builder defaultTtl(String defaultTtl);

    @ExcludeFromGeneratedCoverageReport
    abstract Optional<String> defaultTtl();

    @ExcludeFromGeneratedCoverageReport
    abstract Builder defaultTtl(Optional<String> defaultTtl);

    /** Clears the value of defaultTtl field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearDefaultTtl() {
      return defaultTtl(Optional.empty());
    }

    /**
     * Setter for granularTtlConfig.
     *
     * <p>granularTtlConfig: The granular TTL config for memories.
     */
    @JsonProperty("granularTtlConfig")
    public abstract Builder granularTtlConfig(
        ManagedSemanticMemoryConfigTtlConfigGranularTtlConfig granularTtlConfig);

    /**
     * Setter for granularTtlConfig builder.
     *
     * <p>granularTtlConfig: The granular TTL config for memories.
     */
    @CanIgnoreReturnValue
    public Builder granularTtlConfig(
        ManagedSemanticMemoryConfigTtlConfigGranularTtlConfig.Builder granularTtlConfigBuilder) {
      return granularTtlConfig(granularTtlConfigBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Optional<ManagedSemanticMemoryConfigTtlConfigGranularTtlConfig> granularTtlConfig();

    @ExcludeFromGeneratedCoverageReport
    abstract Builder granularTtlConfig(
        Optional<ManagedSemanticMemoryConfigTtlConfigGranularTtlConfig> granularTtlConfig);

    /** Clears the value of granularTtlConfig field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearGranularTtlConfig() {
      return granularTtlConfig(Optional.empty());
    }

    /**
     * Setter for memoryRevisionDefaultTtl.
     *
     * <p>memoryRevisionDefaultTtl: The default TTL for memory revisions in the Memory Bank. If not
     * set, TTL will not be applied automatically. The TTL can be explicitly set by modifying the
     * `expire_time` of each Memory resource.
     */
    @JsonProperty("memoryRevisionDefaultTtl")
    public abstract Builder memoryRevisionDefaultTtl(String memoryRevisionDefaultTtl);

    @ExcludeFromGeneratedCoverageReport
    abstract Optional<String> memoryRevisionDefaultTtl();

    @ExcludeFromGeneratedCoverageReport
    abstract Builder memoryRevisionDefaultTtl(Optional<String> memoryRevisionDefaultTtl);

    /** Clears the value of memoryRevisionDefaultTtl field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearMemoryRevisionDefaultTtl() {
      return memoryRevisionDefaultTtl(Optional.empty());
    }

    public abstract ManagedSemanticMemoryConfigTtlConfig build();
  }

  /** Deserializes a JSON string to a ManagedSemanticMemoryConfigTtlConfig object. */
  @ExcludeFromGeneratedCoverageReport
  public static ManagedSemanticMemoryConfigTtlConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, ManagedSemanticMemoryConfigTtlConfig.class);
  }
}
