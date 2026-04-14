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
import com.google.genai.types.HttpOptions;
import java.util.Optional;

/** Config for ingesting events. */
@AutoValue
@JsonDeserialize(builder = IngestEventsConfig.Builder.class)
public abstract class IngestEventsConfig extends JsonSerializable {
  /** Used to override HTTP request options. */
  @JsonProperty("httpOptions")
  public abstract Optional<HttpOptions> httpOptions();

  /**
   * Waits for the underlying memory generation operation to complete before returning. Defaults to
   * false.
   */
  @JsonProperty("waitForCompletion")
  public abstract Optional<Boolean> waitForCompletion();

  /**
   * Optional. Forces a flush of all pending events in the stream and triggers memory generation
   * immediately bypassing any conditions configured in the `generation_trigger_config`.
   */
  @JsonProperty("forceFlush")
  public abstract Optional<Boolean> forceFlush();

  /** Instantiates a builder for IngestEventsConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_IngestEventsConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for IngestEventsConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `IngestEventsConfig.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_IngestEventsConfig.Builder();
    }

    /**
     * Setter for httpOptions.
     *
     * <p>httpOptions: Used to override HTTP request options.
     */
    @JsonProperty("httpOptions")
    public abstract Builder httpOptions(HttpOptions httpOptions);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder httpOptions(Optional<HttpOptions> httpOptions);

    /** Clears the value of httpOptions field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearHttpOptions() {
      return httpOptions(Optional.empty());
    }

    /**
     * Setter for waitForCompletion.
     *
     * <p>waitForCompletion: Waits for the underlying memory generation operation to complete before
     * returning. Defaults to false.
     */
    @JsonProperty("waitForCompletion")
    public abstract Builder waitForCompletion(boolean waitForCompletion);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder waitForCompletion(Optional<Boolean> waitForCompletion);

    /** Clears the value of waitForCompletion field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearWaitForCompletion() {
      return waitForCompletion(Optional.empty());
    }

    /**
     * Setter for forceFlush.
     *
     * <p>forceFlush: Optional. Forces a flush of all pending events in the stream and triggers
     * memory generation immediately bypassing any conditions configured in the
     * `generation_trigger_config`.
     */
    @JsonProperty("forceFlush")
    public abstract Builder forceFlush(boolean forceFlush);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder forceFlush(Optional<Boolean> forceFlush);

    /** Clears the value of forceFlush field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearForceFlush() {
      return forceFlush(Optional.empty());
    }

    public abstract IngestEventsConfig build();
  }

  /** Deserializes a JSON string to a IngestEventsConfig object. */
  @ExcludeFromGeneratedCoverageReport
  public static IngestEventsConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, IngestEventsConfig.class);
  }
}
