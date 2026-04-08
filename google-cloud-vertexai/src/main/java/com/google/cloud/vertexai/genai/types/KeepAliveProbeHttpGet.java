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

/** Specifies the HTTP GET configuration for the probe. */
@AutoValue
@JsonDeserialize(builder = KeepAliveProbeHttpGet.Builder.class)
public abstract class KeepAliveProbeHttpGet extends JsonSerializable {
  /** Required. Specifies the path of the HTTP GET request (e.g., `"/is_busy"`). */
  @JsonProperty("path")
  public abstract Optional<String> path();

  /** Optional. Specifies the port number on the container to which the request is sent. */
  @JsonProperty("port")
  public abstract Optional<Integer> port();

  /** Instantiates a builder for KeepAliveProbeHttpGet. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_KeepAliveProbeHttpGet.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for KeepAliveProbeHttpGet. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `KeepAliveProbeHttpGet.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_KeepAliveProbeHttpGet.Builder();
    }

    /**
     * Setter for path.
     *
     * <p>path: Required. Specifies the path of the HTTP GET request (e.g., `"/is_busy"`).
     */
    @JsonProperty("path")
    public abstract Builder path(String path);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder path(Optional<String> path);

    /** Clears the value of path field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearPath() {
      return path(Optional.empty());
    }

    /**
     * Setter for port.
     *
     * <p>port: Optional. Specifies the port number on the container to which the request is sent.
     */
    @JsonProperty("port")
    public abstract Builder port(Integer port);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder port(Optional<Integer> port);

    /** Clears the value of port field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearPort() {
      return port(Optional.empty());
    }

    public abstract KeepAliveProbeHttpGet build();
  }

  /** Deserializes a JSON string to a KeepAliveProbeHttpGet object. */
  @ExcludeFromGeneratedCoverageReport
  public static KeepAliveProbeHttpGet fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, KeepAliveProbeHttpGet.class);
  }
}
