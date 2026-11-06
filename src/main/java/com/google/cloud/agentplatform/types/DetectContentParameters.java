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
import com.google.genai.types.Content;
import java.util.Optional;

/** Parameters for the detect_content method. */
@AutoValue
@InternalApi
@JsonDeserialize(builder = DetectContentParameters.Builder.class)
public abstract class DetectContentParameters extends JsonSerializable {
  /**
   * The name of the publisher model requested to serve the prediction. Format:
   * ``ai-content-detection``, ``ai-content-detection@{version}``,
   * ``publishers/google/models/ai-content-detection``, or
   * ``projects/{project}/locations/{location}/publishers/{publisher}/models/{model}``.
   */
  @JsonProperty("model")
  public abstract Optional<String> model();

  /**
   * Required. The image to analyze. Must contain exactly one ``inline_data`` part with
   * ``mime_type`` ``image/jpeg``, ``image/png``, or ``image/webp``, at most 20 MiB.
   */
  @JsonProperty("content")
  public abstract Optional<Content> content();

  /** Configuration that contains optional parameters. */
  @JsonProperty("config")
  public abstract Optional<DetectContentConfig> config();

  /** Instantiates a builder for DetectContentParameters. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_DetectContentParameters.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for DetectContentParameters. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `DetectContentParameters.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_DetectContentParameters.Builder();
    }

    /**
     * Setter for model.
     *
     * <p>model: The name of the publisher model requested to serve the prediction. Format:
     * ``ai-content-detection``, ``ai-content-detection@{version}``,
     * ``publishers/google/models/ai-content-detection``, or
     * ``projects/{project}/locations/{location}/publishers/{publisher}/models/{model}``.
     */
    @JsonProperty("model")
    public abstract Builder model(String model);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder model(Optional<String> model);

    /** Clears the value of model field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearModel() {
      return model(Optional.empty());
    }

    /**
     * Setter for content.
     *
     * <p>content: Required. The image to analyze. Must contain exactly one ``inline_data`` part
     * with ``mime_type`` ``image/jpeg``, ``image/png``, or ``image/webp``, at most 20 MiB.
     */
    @JsonProperty("content")
    public abstract Builder content(Content content);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder content(Optional<Content> content);

    /** Clears the value of content field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearContent() {
      return content(Optional.empty());
    }

    /**
     * Setter for config.
     *
     * <p>config: Configuration that contains optional parameters.
     */
    @JsonProperty("config")
    public abstract Builder config(DetectContentConfig config);

    /**
     * Setter for config builder.
     *
     * <p>config: Configuration that contains optional parameters.
     */
    @CanIgnoreReturnValue
    public Builder config(DetectContentConfig.Builder configBuilder) {
      return config(configBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder config(Optional<DetectContentConfig> config);

    /** Clears the value of config field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearConfig() {
      return config(Optional.empty());
    }

    public abstract DetectContentParameters build();
  }

  /** Deserializes a JSON string to a DetectContentParameters object. */
  @ExcludeFromGeneratedCoverageReport
  public static DetectContentParameters fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, DetectContentParameters.class);
  }
}
