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

/** Traffic distribution configuration. */
@AutoValue
@JsonDeserialize(builder = ReasoningEngineTrafficConfig.Builder.class)
public abstract class ReasoningEngineTrafficConfig extends JsonSerializable {
  /**
   * Optional. Traffic distribution configuration, where all traffic is sent to the latest Runtime
   * Revision.
   */
  @JsonProperty("trafficSplitAlwaysLatest")
  public abstract Optional<ReasoningEngineTrafficConfigTrafficSplitAlwaysLatest>
      trafficSplitAlwaysLatest();

  /**
   * Optional. Manual traffic distribution configuration, where the user specifies the Runtime
   * Revision IDs and the percentage of traffic to send to each.
   */
  @JsonProperty("trafficSplitManual")
  public abstract Optional<ReasoningEngineTrafficConfigTrafficSplitManual> trafficSplitManual();

  /** Instantiates a builder for ReasoningEngineTrafficConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_ReasoningEngineTrafficConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for ReasoningEngineTrafficConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `ReasoningEngineTrafficConfig.builder()` for instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_ReasoningEngineTrafficConfig.Builder();
    }

    /**
     * Setter for trafficSplitAlwaysLatest.
     *
     * <p>trafficSplitAlwaysLatest: Optional. Traffic distribution configuration, where all traffic
     * is sent to the latest Runtime Revision.
     */
    @JsonProperty("trafficSplitAlwaysLatest")
    public abstract Builder trafficSplitAlwaysLatest(
        ReasoningEngineTrafficConfigTrafficSplitAlwaysLatest trafficSplitAlwaysLatest);

    /**
     * Setter for trafficSplitAlwaysLatest builder.
     *
     * <p>trafficSplitAlwaysLatest: Optional. Traffic distribution configuration, where all traffic
     * is sent to the latest Runtime Revision.
     */
    @CanIgnoreReturnValue
    public Builder trafficSplitAlwaysLatest(
        ReasoningEngineTrafficConfigTrafficSplitAlwaysLatest.Builder
            trafficSplitAlwaysLatestBuilder) {
      return trafficSplitAlwaysLatest(trafficSplitAlwaysLatestBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder trafficSplitAlwaysLatest(
        Optional<ReasoningEngineTrafficConfigTrafficSplitAlwaysLatest> trafficSplitAlwaysLatest);

    /** Clears the value of trafficSplitAlwaysLatest field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearTrafficSplitAlwaysLatest() {
      return trafficSplitAlwaysLatest(Optional.empty());
    }

    /**
     * Setter for trafficSplitManual.
     *
     * <p>trafficSplitManual: Optional. Manual traffic distribution configuration, where the user
     * specifies the Runtime Revision IDs and the percentage of traffic to send to each.
     */
    @JsonProperty("trafficSplitManual")
    public abstract Builder trafficSplitManual(
        ReasoningEngineTrafficConfigTrafficSplitManual trafficSplitManual);

    /**
     * Setter for trafficSplitManual builder.
     *
     * <p>trafficSplitManual: Optional. Manual traffic distribution configuration, where the user
     * specifies the Runtime Revision IDs and the percentage of traffic to send to each.
     */
    @CanIgnoreReturnValue
    public Builder trafficSplitManual(
        ReasoningEngineTrafficConfigTrafficSplitManual.Builder trafficSplitManualBuilder) {
      return trafficSplitManual(trafficSplitManualBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder trafficSplitManual(
        Optional<ReasoningEngineTrafficConfigTrafficSplitManual> trafficSplitManual);

    /** Clears the value of trafficSplitManual field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearTrafficSplitManual() {
      return trafficSplitManual(Optional.empty());
    }

    public abstract ReasoningEngineTrafficConfig build();
  }

  /** Deserializes a JSON string to a ReasoningEngineTrafficConfig object. */
  @ExcludeFromGeneratedCoverageReport
  public static ReasoningEngineTrafficConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, ReasoningEngineTrafficConfig.class);
  }
}
