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
import com.google.api.core.InternalApi;
import com.google.auto.value.AutoValue;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.genai.JsonSerializable;
import java.util.Optional;

/** Parameters for updating memory banks. */
@AutoValue
@InternalApi
@JsonDeserialize(builder = UpdateMemoryBankRequestParameters.Builder.class)
public abstract class UpdateMemoryBankRequestParameters extends JsonSerializable {
  /** Name of the memory bank. */
  @JsonProperty("name")
  public abstract Optional<String> name();

  /** */
  @JsonProperty("memoryBankConfig")
  public abstract Optional<ReasoningEngineContextSpecMemoryBankConfig> memoryBankConfig();

  /** */
  @JsonProperty("config")
  public abstract Optional<UpdateMemoryBankConfig> config();

  /** Instantiates a builder for UpdateMemoryBankRequestParameters. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_UpdateMemoryBankRequestParameters.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for UpdateMemoryBankRequestParameters. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `UpdateMemoryBankRequestParameters.builder()` for
     * instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_UpdateMemoryBankRequestParameters.Builder();
    }

    /**
     * Setter for name.
     *
     * <p>name: Name of the memory bank.
     */
    @JsonProperty("name")
    public abstract Builder name(String name);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder name(Optional<String> name);

    /** Clears the value of name field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearName() {
      return name(Optional.empty());
    }

    /**
     * Setter for memoryBankConfig.
     *
     * <p>memoryBankConfig:
     */
    @JsonProperty("memoryBankConfig")
    public abstract Builder memoryBankConfig(
        ReasoningEngineContextSpecMemoryBankConfig memoryBankConfig);

    /**
     * Setter for memoryBankConfig builder.
     *
     * <p>memoryBankConfig:
     */
    @CanIgnoreReturnValue
    public Builder memoryBankConfig(
        ReasoningEngineContextSpecMemoryBankConfig.Builder memoryBankConfigBuilder) {
      return memoryBankConfig(memoryBankConfigBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder memoryBankConfig(
        Optional<ReasoningEngineContextSpecMemoryBankConfig> memoryBankConfig);

    /** Clears the value of memoryBankConfig field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearMemoryBankConfig() {
      return memoryBankConfig(Optional.empty());
    }

    /**
     * Setter for config.
     *
     * <p>config:
     */
    @JsonProperty("config")
    public abstract Builder config(UpdateMemoryBankConfig config);

    /**
     * Setter for config builder.
     *
     * <p>config:
     */
    @CanIgnoreReturnValue
    public Builder config(UpdateMemoryBankConfig.Builder configBuilder) {
      return config(configBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder config(Optional<UpdateMemoryBankConfig> config);

    /** Clears the value of config field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearConfig() {
      return config(Optional.empty());
    }

    public abstract UpdateMemoryBankRequestParameters build();
  }

  /** Deserializes a JSON string to a UpdateMemoryBankRequestParameters object. */
  @ExcludeFromGeneratedCoverageReport
  public static UpdateMemoryBankRequestParameters fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, UpdateMemoryBankRequestParameters.class);
  }
}
