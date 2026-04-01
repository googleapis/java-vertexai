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

/** Config for checking a query job on an agent engine. */
@AutoValue
@JsonDeserialize(builder = RunQueryJobAgentEngineConfig.Builder.class)
public abstract class RunQueryJobAgentEngineConfig extends JsonSerializable {
  /** Used to override HTTP request options. */
  @JsonProperty("httpOptions")
  public abstract Optional<HttpOptions> httpOptions();

  /** The query to send to the agent engine. */
  @JsonProperty("query")
  public abstract Optional<String> query();

  /**
   * The GCS URI to use for the output. If it is a file, the system use this file to store the
   * response. If it represents a directory, the system automatically generate a file for the
   * response. In both cases, the input query will be stored in the same directory under the same
   * file name prefix as the output file.
   */
  @JsonProperty("outputGcsUri")
  public abstract Optional<String> outputGcsUri();

  /** Instantiates a builder for RunQueryJobAgentEngineConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_RunQueryJobAgentEngineConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for RunQueryJobAgentEngineConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `RunQueryJobAgentEngineConfig.builder()` for instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_RunQueryJobAgentEngineConfig.Builder();
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
     * Setter for query.
     *
     * <p>query: The query to send to the agent engine.
     */
    @JsonProperty("query")
    public abstract Builder query(String query);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder query(Optional<String> query);

    /** Clears the value of query field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearQuery() {
      return query(Optional.empty());
    }

    /**
     * Setter for outputGcsUri.
     *
     * <p>outputGcsUri: The GCS URI to use for the output. If it is a file, the system use this file
     * to store the response. If it represents a directory, the system automatically generate a file
     * for the response. In both cases, the input query will be stored in the same directory under
     * the same file name prefix as the output file.
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

    public abstract RunQueryJobAgentEngineConfig build();
  }

  /** Deserializes a JSON string to a RunQueryJobAgentEngineConfig object. */
  @ExcludeFromGeneratedCoverageReport
  public static RunQueryJobAgentEngineConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, RunQueryJobAgentEngineConfig.class);
  }
}
