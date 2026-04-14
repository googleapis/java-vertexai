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

/** The configuration for triggering memory generation for ingested events. */
@AutoValue
@JsonDeserialize(builder = MemoryGenerationTriggerConfig.Builder.class)
public abstract class MemoryGenerationTriggerConfig extends JsonSerializable {
  /**
   * Optional. Represents the active rule that determines when to flush the buffer. If not set, then
   * the stream will be force flushed immediately.
   */
  @JsonProperty("generationRule")
  public abstract Optional<MemoryGenerationTriggerConfigGenerationTriggerRule> generationRule();

  /** Instantiates a builder for MemoryGenerationTriggerConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_MemoryGenerationTriggerConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for MemoryGenerationTriggerConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `MemoryGenerationTriggerConfig.builder()` for instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_MemoryGenerationTriggerConfig.Builder();
    }

    /**
     * Setter for generationRule.
     *
     * <p>generationRule: Optional. Represents the active rule that determines when to flush the
     * buffer. If not set, then the stream will be force flushed immediately.
     */
    @JsonProperty("generationRule")
    public abstract Builder generationRule(
        MemoryGenerationTriggerConfigGenerationTriggerRule generationRule);

    /**
     * Setter for generationRule builder.
     *
     * <p>generationRule: Optional. Represents the active rule that determines when to flush the
     * buffer. If not set, then the stream will be force flushed immediately.
     */
    @CanIgnoreReturnValue
    public Builder generationRule(
        MemoryGenerationTriggerConfigGenerationTriggerRule.Builder generationRuleBuilder) {
      return generationRule(generationRuleBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder generationRule(
        Optional<MemoryGenerationTriggerConfigGenerationTriggerRule> generationRule);

    /** Clears the value of generationRule field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearGenerationRule() {
      return generationRule(Optional.empty());
    }

    public abstract MemoryGenerationTriggerConfig build();
  }

  /** Deserializes a JSON string to a MemoryGenerationTriggerConfig object. */
  @ExcludeFromGeneratedCoverageReport
  public static MemoryGenerationTriggerConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, MemoryGenerationTriggerConfig.class);
  }
}
