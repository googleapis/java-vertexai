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

/** Config for canceling async querying agent engines. */
@AutoValue
@JsonDeserialize(builder = CancelQueryJobAgentEngineConfig.Builder.class)
public abstract class CancelQueryJobAgentEngineConfig extends JsonSerializable {
  /** Used to override HTTP request options. */
  @JsonProperty("httpOptions")
  public abstract Optional<HttpOptions> httpOptions();

  /** Name of the longrunning operation returned from run_query_job. */
  @JsonProperty("operationName")
  public abstract Optional<String> operationName();

  /** Instantiates a builder for CancelQueryJobAgentEngineConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_CancelQueryJobAgentEngineConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for CancelQueryJobAgentEngineConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `CancelQueryJobAgentEngineConfig.builder()` for instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_CancelQueryJobAgentEngineConfig.Builder();
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
     * <p>operationName: Name of the longrunning operation returned from run_query_job.
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

    public abstract CancelQueryJobAgentEngineConfig build();
  }

  /** Deserializes a JSON string to a CancelQueryJobAgentEngineConfig object. */
  @ExcludeFromGeneratedCoverageReport
  public static CancelQueryJobAgentEngineConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, CancelQueryJobAgentEngineConfig.class);
  }
}
