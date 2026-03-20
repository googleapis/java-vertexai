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

/** Result of running a query job. */
@AutoValue
@JsonDeserialize(builder = RunQueryJobResult.Builder.class)
public abstract class RunQueryJobResult extends JsonSerializable {
  /** Used to override HTTP request options. */
  @JsonProperty("httpOptions")
  public abstract Optional<HttpOptions> httpOptions();

  /** Name of the agent engine operation to later check for status. */
  @JsonProperty("jobName")
  public abstract Optional<String> jobName();

  /** The GCS URI of the input file. */
  @JsonProperty("inputGcsUri")
  public abstract Optional<String> inputGcsUri();

  /** The GCS URI of the output file. */
  @JsonProperty("outputGcsUri")
  public abstract Optional<String> outputGcsUri();

  /** Instantiates a builder for RunQueryJobResult. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_RunQueryJobResult.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for RunQueryJobResult. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `RunQueryJobResult.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_RunQueryJobResult.Builder();
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
     * Setter for jobName.
     *
     * <p>jobName: Name of the agent engine operation to later check for status.
     */
    @JsonProperty("jobName")
    public abstract Builder jobName(String jobName);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder jobName(Optional<String> jobName);

    /** Clears the value of jobName field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearJobName() {
      return jobName(Optional.empty());
    }

    /**
     * Setter for inputGcsUri.
     *
     * <p>inputGcsUri: The GCS URI of the input file.
     */
    @JsonProperty("inputGcsUri")
    public abstract Builder inputGcsUri(String inputGcsUri);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder inputGcsUri(Optional<String> inputGcsUri);

    /** Clears the value of inputGcsUri field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearInputGcsUri() {
      return inputGcsUri(Optional.empty());
    }

    /**
     * Setter for outputGcsUri.
     *
     * <p>outputGcsUri: The GCS URI of the output file.
     */
    @JsonProperty("outputGcsUri")
    public abstract Builder outputGcsUri(String outputGcsUri);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder outputGcsUri(Optional<String> outputGcsUri);

    /** Clears the value of outputGcsUri field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearOutputGcsUri() {
      return outputGcsUri(Optional.empty());
    }

    public abstract RunQueryJobResult build();
  }

  /** Deserializes a JSON string to a RunQueryJobResult object. */
  @ExcludeFromGeneratedCoverageReport
  public static RunQueryJobResult fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, RunQueryJobResult.class);
  }
}
