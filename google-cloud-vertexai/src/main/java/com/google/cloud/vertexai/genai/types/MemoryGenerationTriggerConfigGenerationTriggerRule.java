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
import java.time.Duration;
import java.util.Optional;

/** Represents the active rule that determines when to flush the buffer. */
@AutoValue
@JsonDeserialize(builder = MemoryGenerationTriggerConfigGenerationTriggerRule.Builder.class)
public abstract class MemoryGenerationTriggerConfigGenerationTriggerRule extends JsonSerializable {
  /** Specifies to trigger generation when the event count reaches this limit. */
  @JsonProperty("eventCount")
  public abstract Optional<Integer> eventCount();

  /**
   * Specifies to trigger generation at a fixed interval. The duration must have a minute-level
   * granularity.
   */
  @JsonProperty("fixedInterval")
  public abstract Optional<Duration> fixedInterval();

  /**
   * Specifies to trigger generation if the stream is inactive for the specified duration after the
   * most recent event. The duration must have a minute-level granularity.
   */
  @JsonProperty("idleDuration")
  public abstract Optional<Duration> idleDuration();

  /** Instantiates a builder for MemoryGenerationTriggerConfigGenerationTriggerRule. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_MemoryGenerationTriggerConfigGenerationTriggerRule.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for MemoryGenerationTriggerConfigGenerationTriggerRule. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `MemoryGenerationTriggerConfigGenerationTriggerRule.builder()`
     * for instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_MemoryGenerationTriggerConfigGenerationTriggerRule.Builder();
    }

    /**
     * Setter for eventCount.
     *
     * <p>eventCount: Specifies to trigger generation when the event count reaches this limit.
     */
    @JsonProperty("eventCount")
    public abstract Builder eventCount(Integer eventCount);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder eventCount(Optional<Integer> eventCount);

    /** Clears the value of eventCount field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearEventCount() {
      return eventCount(Optional.empty());
    }

    /**
     * Setter for fixedInterval.
     *
     * <p>fixedInterval: Specifies to trigger generation at a fixed interval. The duration must have
     * a minute-level granularity.
     */
    @JsonProperty("fixedInterval")
    public abstract Builder fixedInterval(Duration fixedInterval);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder fixedInterval(Optional<Duration> fixedInterval);

    /** Clears the value of fixedInterval field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearFixedInterval() {
      return fixedInterval(Optional.empty());
    }

    /**
     * Setter for idleDuration.
     *
     * <p>idleDuration: Specifies to trigger generation if the stream is inactive for the specified
     * duration after the most recent event. The duration must have a minute-level granularity.
     */
    @JsonProperty("idleDuration")
    public abstract Builder idleDuration(Duration idleDuration);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder idleDuration(Optional<Duration> idleDuration);

    /** Clears the value of idleDuration field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearIdleDuration() {
      return idleDuration(Optional.empty());
    }

    public abstract MemoryGenerationTriggerConfigGenerationTriggerRule build();
  }

  /** Deserializes a JSON string to a MemoryGenerationTriggerConfigGenerationTriggerRule object. */
  @ExcludeFromGeneratedCoverageReport
  public static MemoryGenerationTriggerConfigGenerationTriggerRule fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(
        jsonString, MemoryGenerationTriggerConfigGenerationTriggerRule.class);
  }
}
