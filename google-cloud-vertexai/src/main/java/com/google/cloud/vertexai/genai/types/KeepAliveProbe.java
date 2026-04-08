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

/**
 * Represents the configuration for keep-alive probe. Contains configuration on a specified endpoint
 * that a deployment host should use to keep the container alive based on the probe settings.
 */
@AutoValue
@JsonDeserialize(builder = KeepAliveProbe.Builder.class)
public abstract class KeepAliveProbe extends JsonSerializable {
  /** Optional. Specifies the HTTP GET configuration for the probe. */
  @JsonProperty("httpGet")
  public abstract Optional<KeepAliveProbeHttpGet> httpGet();

  /**
   * Optional. Specifies the maximum duration (in seconds) to keep the instance alive via this
   * probe. Can be a maximum of 3600 seconds (1 hour).
   */
  @JsonProperty("maxSeconds")
  public abstract Optional<Integer> maxSeconds();

  /** Instantiates a builder for KeepAliveProbe. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_KeepAliveProbe.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for KeepAliveProbe. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `KeepAliveProbe.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_KeepAliveProbe.Builder();
    }

    /**
     * Setter for httpGet.
     *
     * <p>httpGet: Optional. Specifies the HTTP GET configuration for the probe.
     */
    @JsonProperty("httpGet")
    public abstract Builder httpGet(KeepAliveProbeHttpGet httpGet);

    /**
     * Setter for httpGet builder.
     *
     * <p>httpGet: Optional. Specifies the HTTP GET configuration for the probe.
     */
    @CanIgnoreReturnValue
    public Builder httpGet(KeepAliveProbeHttpGet.Builder httpGetBuilder) {
      return httpGet(httpGetBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder httpGet(Optional<KeepAliveProbeHttpGet> httpGet);

    /** Clears the value of httpGet field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearHttpGet() {
      return httpGet(Optional.empty());
    }

    /**
     * Setter for maxSeconds.
     *
     * <p>maxSeconds: Optional. Specifies the maximum duration (in seconds) to keep the instance
     * alive via this probe. Can be a maximum of 3600 seconds (1 hour).
     */
    @JsonProperty("maxSeconds")
    public abstract Builder maxSeconds(Integer maxSeconds);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder maxSeconds(Optional<Integer> maxSeconds);

    /** Clears the value of maxSeconds field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearMaxSeconds() {
      return maxSeconds(Optional.empty());
    }

    public abstract KeepAliveProbe build();
  }

  /** Deserializes a JSON string to a KeepAliveProbe object. */
  @ExcludeFromGeneratedCoverageReport
  public static KeepAliveProbe fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, KeepAliveProbe.class);
  }
}
