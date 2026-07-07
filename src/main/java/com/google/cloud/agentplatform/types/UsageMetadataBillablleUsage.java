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

/** [Deprecated] Billable usage information. */
@AutoValue
@JsonDeserialize(builder = UsageMetadataBillablleUsage.Builder.class)
public abstract class UsageMetadataBillablleUsage extends JsonSerializable {
  /** The number of text characters. */
  @JsonProperty("textCount")
  public abstract Optional<Integer> textCount();

  /** The number of images. */
  @JsonProperty("imageCount")
  public abstract Optional<Integer> imageCount();

  /** The duration of video in seconds. */
  @JsonProperty("videoDurationSeconds")
  public abstract Optional<Integer> videoDurationSeconds();

  /** The duration of audio in seconds. */
  @JsonProperty("audioDurationSeconds")
  public abstract Optional<Integer> audioDurationSeconds();

  /** Instantiates a builder for UsageMetadataBillablleUsage. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_UsageMetadataBillablleUsage.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for UsageMetadataBillablleUsage. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `UsageMetadataBillablleUsage.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_UsageMetadataBillablleUsage.Builder();
    }

    /**
     * Setter for textCount.
     *
     * <p>textCount: The number of text characters.
     */
    @JsonProperty("textCount")
    public abstract Builder textCount(Integer textCount);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder textCount(Optional<Integer> textCount);

    /** Clears the value of textCount field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearTextCount() {
      return textCount(Optional.empty());
    }

    /**
     * Setter for imageCount.
     *
     * <p>imageCount: The number of images.
     */
    @JsonProperty("imageCount")
    public abstract Builder imageCount(Integer imageCount);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder imageCount(Optional<Integer> imageCount);

    /** Clears the value of imageCount field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearImageCount() {
      return imageCount(Optional.empty());
    }

    /**
     * Setter for videoDurationSeconds.
     *
     * <p>videoDurationSeconds: The duration of video in seconds.
     */
    @JsonProperty("videoDurationSeconds")
    public abstract Builder videoDurationSeconds(Integer videoDurationSeconds);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder videoDurationSeconds(Optional<Integer> videoDurationSeconds);

    /** Clears the value of videoDurationSeconds field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearVideoDurationSeconds() {
      return videoDurationSeconds(Optional.empty());
    }

    /**
     * Setter for audioDurationSeconds.
     *
     * <p>audioDurationSeconds: The duration of audio in seconds.
     */
    @JsonProperty("audioDurationSeconds")
    public abstract Builder audioDurationSeconds(Integer audioDurationSeconds);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder audioDurationSeconds(Optional<Integer> audioDurationSeconds);

    /** Clears the value of audioDurationSeconds field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearAudioDurationSeconds() {
      return audioDurationSeconds(Optional.empty());
    }

    public abstract UsageMetadataBillablleUsage build();
  }

  /** Deserializes a JSON string to a UsageMetadataBillablleUsage object. */
  @ExcludeFromGeneratedCoverageReport
  public static UsageMetadataBillablleUsage fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, UsageMetadataBillablleUsage.class);
  }
}
