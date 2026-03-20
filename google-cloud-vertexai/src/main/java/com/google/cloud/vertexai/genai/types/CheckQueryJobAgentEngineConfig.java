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

/** Config for async querying agent engines. */
@AutoValue
@JsonDeserialize(builder = CheckQueryJobAgentEngineConfig.Builder.class)
public abstract class CheckQueryJobAgentEngineConfig extends JsonSerializable {
  /** Used to override HTTP request options. */
  @JsonProperty("httpOptions")
  public abstract Optional<HttpOptions> httpOptions();

  /** Whether to retrieve the results of the query job. */
  @JsonProperty("retrieveResult")
  public abstract Optional<Boolean> retrieveResult();

  /** Instantiates a builder for CheckQueryJobAgentEngineConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_CheckQueryJobAgentEngineConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for CheckQueryJobAgentEngineConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `CheckQueryJobAgentEngineConfig.builder()` for instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_CheckQueryJobAgentEngineConfig.Builder();
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
     * Setter for retrieveResult.
     *
     * <p>retrieveResult: Whether to retrieve the results of the query job.
     */
    @JsonProperty("retrieveResult")
    public abstract Builder retrieveResult(boolean retrieveResult);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder retrieveResult(Optional<Boolean> retrieveResult);

    /** Clears the value of retrieveResult field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearRetrieveResult() {
      return retrieveResult(Optional.empty());
    }

    public abstract CheckQueryJobAgentEngineConfig build();
  }

  /** Deserializes a JSON string to a CheckQueryJobAgentEngineConfig object. */
  @ExcludeFromGeneratedCoverageReport
  public static CheckQueryJobAgentEngineConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, CheckQueryJobAgentEngineConfig.class);
  }
}
