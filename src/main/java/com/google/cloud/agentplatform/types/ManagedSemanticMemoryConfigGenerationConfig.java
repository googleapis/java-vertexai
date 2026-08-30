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

/** The configuration for generating memories. */
@AutoValue
@JsonDeserialize(builder = ManagedSemanticMemoryConfigGenerationConfig.Builder.class)
public abstract class ManagedSemanticMemoryConfigGenerationConfig extends JsonSerializable {
  /**
   * The model used to generate memories.
   *
   * <p>Format: `projects/{project}/locations/{location}/publishers/google/models/{model}`.
   */
  @JsonProperty("model")
  public abstract Optional<String> model();

  /** The configuration for triggering memory generation. */
  @JsonProperty("generationTriggerConfig")
  public abstract Optional<MemoryGenerationTriggerConfig> generationTriggerConfig();

  /** Instantiates a builder for ManagedSemanticMemoryConfigGenerationConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_ManagedSemanticMemoryConfigGenerationConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for ManagedSemanticMemoryConfigGenerationConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `ManagedSemanticMemoryConfigGenerationConfig.builder()` for
     * instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_ManagedSemanticMemoryConfigGenerationConfig.Builder();
    }

    /**
     * Setter for model.
     *
     * <p>model: The model used to generate memories.
     *
     * <p>Format: `projects/{project}/locations/{location}/publishers/google/models/{model}`.
     */
    @JsonProperty("model")
    public abstract Builder model(String model);

    @ExcludeFromGeneratedCoverageReport
    abstract Optional<String> model();

    @ExcludeFromGeneratedCoverageReport
    abstract Builder model(Optional<String> model);

    /** Clears the value of model field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearModel() {
      return model(Optional.empty());
    }

    /**
     * Setter for generationTriggerConfig.
     *
     * <p>generationTriggerConfig: The configuration for triggering memory generation.
     */
    @JsonProperty("generationTriggerConfig")
    public abstract Builder generationTriggerConfig(
        MemoryGenerationTriggerConfig generationTriggerConfig);

    /**
     * Setter for generationTriggerConfig builder.
     *
     * <p>generationTriggerConfig: The configuration for triggering memory generation.
     */
    @CanIgnoreReturnValue
    public Builder generationTriggerConfig(
        MemoryGenerationTriggerConfig.Builder generationTriggerConfigBuilder) {
      return generationTriggerConfig(generationTriggerConfigBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Optional<MemoryGenerationTriggerConfig> generationTriggerConfig();

    @ExcludeFromGeneratedCoverageReport
    abstract Builder generationTriggerConfig(
        Optional<MemoryGenerationTriggerConfig> generationTriggerConfig);

    /** Clears the value of generationTriggerConfig field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearGenerationTriggerConfig() {
      return generationTriggerConfig(Optional.empty());
    }

    public abstract ManagedSemanticMemoryConfigGenerationConfig build();
  }

  /** Deserializes a JSON string to a ManagedSemanticMemoryConfigGenerationConfig object. */
  @ExcludeFromGeneratedCoverageReport
  public static ManagedSemanticMemoryConfigGenerationConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(
        jsonString, ManagedSemanticMemoryConfigGenerationConfig.class);
  }
}
