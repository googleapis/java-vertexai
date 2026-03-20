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

/** Result of checking a query job. */
@AutoValue
@JsonDeserialize(builder = CheckQueryJobResult.Builder.class)
public abstract class CheckQueryJobResult extends JsonSerializable {
  /** Used to override HTTP request options. */
  @JsonProperty("httpOptions")
  public abstract Optional<HttpOptions> httpOptions();

  /** Name of the agent engine operation. */
  @JsonProperty("operationName")
  public abstract Optional<String> operationName();

  /** The GCS URI of the output file. */
  @JsonProperty("outputGcsUri")
  public abstract Optional<String> outputGcsUri();

  /** Status of the operation. */
  @JsonProperty("status")
  public abstract Optional<String> status();

  /** JSON result of the operation. */
  @JsonProperty("result")
  public abstract Optional<String> result();

  /** Instantiates a builder for CheckQueryJobResult. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_CheckQueryJobResult.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for CheckQueryJobResult. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `CheckQueryJobResult.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_CheckQueryJobResult.Builder();
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
     * Setter for operationName.
     *
     * <p>operationName: Name of the agent engine operation.
     */
    @JsonProperty("operationName")
    public abstract Builder operationName(String operationName);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder operationName(Optional<String> operationName);

    /** Clears the value of operationName field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearOperationName() {
      return operationName(Optional.empty());
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

    /**
     * Setter for status.
     *
     * <p>status: Status of the operation.
     */
    @JsonProperty("status")
    public abstract Builder status(String status);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder status(Optional<String> status);

    /** Clears the value of status field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearStatus() {
      return status(Optional.empty());
    }

    /**
     * Setter for result.
     *
     * <p>result: JSON result of the operation.
     */
    @JsonProperty("result")
    public abstract Builder result(String result);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder result(Optional<String> result);

    /** Clears the value of result field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearResult() {
      return result(Optional.empty());
    }

    public abstract CheckQueryJobResult build();
  }

  /** Deserializes a JSON string to a CheckQueryJobResult object. */
  @ExcludeFromGeneratedCoverageReport
  public static CheckQueryJobResult fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, CheckQueryJobResult.class);
  }
}
