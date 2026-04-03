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
 * A single target for the traffic split, specifying a Runtime Revision and the percentage of
 * traffic to send to it.
 */
@AutoValue
@JsonDeserialize(builder = ReasoningEngineTrafficConfigTrafficSplitManualTarget.Builder.class)
public abstract class ReasoningEngineTrafficConfigTrafficSplitManualTarget
    extends JsonSerializable {
  /** Required. Specifies percent of the traffic to this Runtime Revision. */
  @JsonProperty("percent")
  public abstract Optional<Integer> percent();

  /**
   * Required. The Runtime Revision name to which to send this portion of traffic, if traffic
   * allocation is by Runtime Revision.
   */
  @JsonProperty("runtimeRevisionName")
  public abstract Optional<String> runtimeRevisionName();

  /** Instantiates a builder for ReasoningEngineTrafficConfigTrafficSplitManualTarget. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_ReasoningEngineTrafficConfigTrafficSplitManualTarget.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for ReasoningEngineTrafficConfigTrafficSplitManualTarget. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use
     * `ReasoningEngineTrafficConfigTrafficSplitManualTarget.builder()` for instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_ReasoningEngineTrafficConfigTrafficSplitManualTarget.Builder();
    }

    /**
     * Setter for percent.
     *
     * <p>percent: Required. Specifies percent of the traffic to this Runtime Revision.
     */
    @JsonProperty("percent")
    public abstract Builder percent(Integer percent);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder percent(Optional<Integer> percent);

    /** Clears the value of percent field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearPercent() {
      return percent(Optional.empty());
    }

    /**
     * Setter for runtimeRevisionName.
     *
     * <p>runtimeRevisionName: Required. The Runtime Revision name to which to send this portion of
     * traffic, if traffic allocation is by Runtime Revision.
     */
    @JsonProperty("runtimeRevisionName")
    public abstract Builder runtimeRevisionName(String runtimeRevisionName);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder runtimeRevisionName(Optional<String> runtimeRevisionName);

    /** Clears the value of runtimeRevisionName field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearRuntimeRevisionName() {
      return runtimeRevisionName(Optional.empty());
    }

    public abstract ReasoningEngineTrafficConfigTrafficSplitManualTarget build();
  }

  /**
   * Deserializes a JSON string to a ReasoningEngineTrafficConfigTrafficSplitManualTarget object.
   */
  @ExcludeFromGeneratedCoverageReport
  public static ReasoningEngineTrafficConfigTrafficSplitManualTarget fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(
        jsonString, ReasoningEngineTrafficConfigTrafficSplitManualTarget.class);
  }
}
