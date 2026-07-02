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

package com.google.cloud.agentplatform.types;

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
  /** Optional. Specifies to trigger generation when the event count reaches this limit. */
  @JsonProperty("eventCount")
  public abstract Optional<Integer> eventCount();

  /**
   * Optional. Specifies to trigger generation at a fixed interval. The duration must have a
   * minute-level granularity.
   */
  @JsonProperty("fixedInterval")
  public abstract Optional<Duration> fixedInterval();

  /**
   * Optional. Specifies to trigger generation if the stream is inactive for the specified duration
   * after the most recent event. The duration must have a minute-level granularity.
   */
  @JsonProperty("idleDuration")
  public abstract Optional<Duration> idleDuration();

  /** Optional. Re-include the last N already-processed events in the next window. */
  @JsonProperty("overlapEventCount")
  public abstract Optional<Integer> overlapEventCount();

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
     * <p>eventCount: Optional. Specifies to trigger generation when the event count reaches this
     * limit.
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
     * <p>fixedInterval: Optional. Specifies to trigger generation at a fixed interval. The duration
     * must have a minute-level granularity.
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
     * <p>idleDuration: Optional. Specifies to trigger generation if the stream is inactive for the
     * specified duration after the most recent event. The duration must have a minute-level
     * granularity.
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

    /**
     * Setter for overlapEventCount.
     *
     * <p>overlapEventCount: Optional. Re-include the last N already-processed events in the next
     * window.
     */
    @JsonProperty("overlapEventCount")
    public abstract Builder overlapEventCount(Integer overlapEventCount);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder overlapEventCount(Optional<Integer> overlapEventCount);

    /** Clears the value of overlapEventCount field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearOverlapEventCount() {
      return overlapEventCount(Optional.empty());
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
