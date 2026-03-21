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
import java.util.Map;
import java.util.Optional;

/** Actions are parts of events that are executed by the agent. */
@AutoValue
@JsonDeserialize(builder = EventActions.Builder.class)
public abstract class EventActions extends JsonSerializable {
  /**
   * Optional. Indicates that the event is updating an artifact. key is the filename, value is the
   * version.
   */
  @JsonProperty("artifactDelta")
  public abstract Optional<Map<String, Integer>> artifactDelta();

  /** Optional. The agent is escalating to a higher level agent. */
  @JsonProperty("escalate")
  public abstract Optional<Boolean> escalate();

  /**
   * Optional. Will only be set by a tool response indicating tool request euc. Struct key is the
   * function call id since one function call response (from model) could correspond to multiple
   * function calls. Struct value is the required auth config, which can be another struct.
   */
  @JsonProperty("requestedAuthConfigs")
  public abstract Optional<Map<String, Object>> requestedAuthConfigs();

  /**
   * Optional. If true, it won't call model to summarize function response. Only used for
   * function_response event.
   */
  @JsonProperty("skipSummarization")
  public abstract Optional<Boolean> skipSummarization();

  /** Optional. Indicates that the event is updating the state with the given delta. */
  @JsonProperty("stateDelta")
  public abstract Optional<Map<String, Object>> stateDelta();

  /** Optional. If set, the event transfers to the specified agent. */
  @JsonProperty("transferAgent")
  public abstract Optional<String> transferAgent();

  /** Instantiates a builder for EventActions. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_EventActions.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for EventActions. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `EventActions.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_EventActions.Builder();
    }

    /**
     * Setter for artifactDelta.
     *
     * <p>artifactDelta: Optional. Indicates that the event is updating an artifact. key is the
     * filename, value is the version.
     */
    @JsonProperty("artifactDelta")
    public abstract Builder artifactDelta(Map<String, Integer> artifactDelta);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder artifactDelta(Optional<Map<String, Integer>> artifactDelta);

    /** Clears the value of artifactDelta field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearArtifactDelta() {
      return artifactDelta(Optional.empty());
    }

    /**
     * Setter for escalate.
     *
     * <p>escalate: Optional. The agent is escalating to a higher level agent.
     */
    @JsonProperty("escalate")
    public abstract Builder escalate(boolean escalate);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder escalate(Optional<Boolean> escalate);

    /** Clears the value of escalate field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearEscalate() {
      return escalate(Optional.empty());
    }

    /**
     * Setter for requestedAuthConfigs.
     *
     * <p>requestedAuthConfigs: Optional. Will only be set by a tool response indicating tool
     * request euc. Struct key is the function call id since one function call response (from model)
     * could correspond to multiple function calls. Struct value is the required auth config, which
     * can be another struct.
     */
    @JsonProperty("requestedAuthConfigs")
    public abstract Builder requestedAuthConfigs(Map<String, Object> requestedAuthConfigs);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder requestedAuthConfigs(Optional<Map<String, Object>> requestedAuthConfigs);

    /** Clears the value of requestedAuthConfigs field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearRequestedAuthConfigs() {
      return requestedAuthConfigs(Optional.empty());
    }

    /**
     * Setter for skipSummarization.
     *
     * <p>skipSummarization: Optional. If true, it won't call model to summarize function response.
     * Only used for function_response event.
     */
    @JsonProperty("skipSummarization")
    public abstract Builder skipSummarization(boolean skipSummarization);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder skipSummarization(Optional<Boolean> skipSummarization);

    /** Clears the value of skipSummarization field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearSkipSummarization() {
      return skipSummarization(Optional.empty());
    }

    /**
     * Setter for stateDelta.
     *
     * <p>stateDelta: Optional. Indicates that the event is updating the state with the given delta.
     */
    @JsonProperty("stateDelta")
    public abstract Builder stateDelta(Map<String, Object> stateDelta);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder stateDelta(Optional<Map<String, Object>> stateDelta);

    /** Clears the value of stateDelta field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearStateDelta() {
      return stateDelta(Optional.empty());
    }

    /**
     * Setter for transferAgent.
     *
     * <p>transferAgent: Optional. If set, the event transfers to the specified agent.
     */
    @JsonProperty("transferAgent")
    public abstract Builder transferAgent(String transferAgent);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder transferAgent(Optional<String> transferAgent);

    /** Clears the value of transferAgent field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearTransferAgent() {
      return transferAgent(Optional.empty());
    }

    public abstract EventActions build();
  }

  /** Deserializes a JSON string to a EventActions object. */
  @ExcludeFromGeneratedCoverageReport
  public static EventActions fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, EventActions.class);
  }
}
