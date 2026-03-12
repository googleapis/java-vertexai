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

/** Specification for deploying from a container image. */
@AutoValue
@JsonDeserialize(builder = ReasoningEngineSpecContainerSpec.Builder.class)
public abstract class ReasoningEngineSpecContainerSpec extends JsonSerializable {
  /**
   * Required. The Artifact Registry Docker image URI (e.g.,
   * us-central1-docker.pkg.dev/my-project/my-repo/my-image:tag) of the container image that is to
   * be run on each worker replica.
   */
  @JsonProperty("imageUri")
  public abstract Optional<String> imageUri();

  /** Instantiates a builder for ReasoningEngineSpecContainerSpec. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_ReasoningEngineSpecContainerSpec.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for ReasoningEngineSpecContainerSpec. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `ReasoningEngineSpecContainerSpec.builder()` for
     * instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_ReasoningEngineSpecContainerSpec.Builder();
    }

    /**
     * Setter for imageUri.
     *
     * <p>imageUri: Required. The Artifact Registry Docker image URI (e.g.,
     * us-central1-docker.pkg.dev/my-project/my-repo/my-image:tag) of the container image that is to
     * be run on each worker replica.
     */
    @JsonProperty("imageUri")
    public abstract Builder imageUri(String imageUri);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder imageUri(Optional<String> imageUri);

    /** Clears the value of imageUri field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearImageUri() {
      return imageUri(Optional.empty());
    }

    public abstract ReasoningEngineSpecContainerSpec build();
  }

  /** Deserializes a JSON string to a ReasoningEngineSpecContainerSpec object. */
  @ExcludeFromGeneratedCoverageReport
  public static ReasoningEngineSpecContainerSpec fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, ReasoningEngineSpecContainerSpec.class);
  }
}
