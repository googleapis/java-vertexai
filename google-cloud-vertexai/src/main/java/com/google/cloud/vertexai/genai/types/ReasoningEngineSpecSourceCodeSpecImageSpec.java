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

/**
 * The image spec for building an image (within a single build step), based on the config file (i.e.
 * Dockerfile) in the source directory.
 */
@AutoValue
@JsonDeserialize(builder = ReasoningEngineSpecSourceCodeSpecImageSpec.Builder.class)
public abstract class ReasoningEngineSpecSourceCodeSpecImageSpec extends JsonSerializable {
  /** Optional. Build arguments to be used. They will be passed through --build-arg flags. */
  @JsonProperty("buildArgs")
  public abstract Optional<Map<String, String>> buildArgs();

  /** Instantiates a builder for ReasoningEngineSpecSourceCodeSpecImageSpec. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_ReasoningEngineSpecSourceCodeSpecImageSpec.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for ReasoningEngineSpecSourceCodeSpecImageSpec. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `ReasoningEngineSpecSourceCodeSpecImageSpec.builder()` for
     * instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_ReasoningEngineSpecSourceCodeSpecImageSpec.Builder();
    }

    /**
     * Setter for buildArgs.
     *
     * <p>buildArgs: Optional. Build arguments to be used. They will be passed through --build-arg
     * flags.
     */
    @JsonProperty("buildArgs")
    public abstract Builder buildArgs(Map<String, String> buildArgs);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder buildArgs(Optional<Map<String, String>> buildArgs);

    /** Clears the value of buildArgs field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearBuildArgs() {
      return buildArgs(Optional.empty());
    }

    public abstract ReasoningEngineSpecSourceCodeSpecImageSpec build();
  }

  /** Deserializes a JSON string to a ReasoningEngineSpecSourceCodeSpecImageSpec object. */
  @ExcludeFromGeneratedCoverageReport
  public static ReasoningEngineSpecSourceCodeSpecImageSpec fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(
        jsonString, ReasoningEngineSpecSourceCodeSpecImageSpec.class);
  }
}
