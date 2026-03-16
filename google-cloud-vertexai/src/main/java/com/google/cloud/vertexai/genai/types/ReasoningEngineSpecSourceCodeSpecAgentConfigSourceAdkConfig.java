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
import java.util.Map;
import java.util.Optional;

/** Configuration for the Agent Development Kit (ADK). */
@AutoValue
@JsonDeserialize(
    builder = ReasoningEngineSpecSourceCodeSpecAgentConfigSourceAdkConfig.Builder.class)
public abstract class ReasoningEngineSpecSourceCodeSpecAgentConfigSourceAdkConfig
    extends JsonSerializable {
  /** Required. The value of the ADK config in JSON format. */
  @JsonProperty("jsonConfig")
  public abstract Optional<Map<String, Object>> jsonConfig();

  /** Instantiates a builder for ReasoningEngineSpecSourceCodeSpecAgentConfigSourceAdkConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_ReasoningEngineSpecSourceCodeSpecAgentConfigSourceAdkConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for ReasoningEngineSpecSourceCodeSpecAgentConfigSourceAdkConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use
     * `ReasoningEngineSpecSourceCodeSpecAgentConfigSourceAdkConfig.builder()` for instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_ReasoningEngineSpecSourceCodeSpecAgentConfigSourceAdkConfig.Builder();
    }

    /**
     * Setter for jsonConfig.
     *
     * <p>jsonConfig: Required. The value of the ADK config in JSON format.
     */
    @JsonProperty("jsonConfig")
    public abstract Builder jsonConfig(Map<String, Object> jsonConfig);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder jsonConfig(Optional<Map<String, Object>> jsonConfig);

    /** Clears the value of jsonConfig field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearJsonConfig() {
      return jsonConfig(Optional.empty());
    }

    public abstract ReasoningEngineSpecSourceCodeSpecAgentConfigSourceAdkConfig build();
  }

  /**
   * Deserializes a JSON string to a ReasoningEngineSpecSourceCodeSpecAgentConfigSourceAdkConfig
   * object.
   */
  @ExcludeFromGeneratedCoverageReport
  public static ReasoningEngineSpecSourceCodeSpecAgentConfigSourceAdkConfig fromJson(
      String jsonString) {
    return JsonSerializable.fromJsonString(
        jsonString, ReasoningEngineSpecSourceCodeSpecAgentConfigSourceAdkConfig.class);
  }
}
