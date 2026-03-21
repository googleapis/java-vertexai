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
import com.google.genai.types.GroundingMetadata;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/** Metadata relating to a LLM response event. */
@AutoValue
@JsonDeserialize(builder = EventMetadata.Builder.class)
public abstract class EventMetadata extends JsonSerializable {
  /** Optional. Metadata returned to client when grounding is enabled. */
  @JsonProperty("groundingMetadata")
  public abstract Optional<GroundingMetadata> groundingMetadata();

  /**
   * Optional. The branch of the event. The format is like agent_1.agent_2.agent_3, where agent_1 is
   * the parent of agent_2, and agent_2 is the parent of agent_3. Branch is used when multiple child
   * agents shouldn't see their siblings' conversation history.
   */
  @JsonProperty("branch")
  public abstract Optional<String> branch();

  /** The custom metadata of the LlmResponse. */
  @JsonProperty("customMetadata")
  public abstract Optional<Map<String, Object>> customMetadata();

  /**
   * Optional. Flag indicating that LLM was interrupted when generating the content. Usually it's
   * due to user interruption during a bidi streaming.
   */
  @JsonProperty("interrupted")
  public abstract Optional<Boolean> interrupted();

  /**
   * Optional. Set of ids of the long running function calls. Agent client will know from this field
   * about which function call is long running. Only valid for function call event.
   */
  @JsonProperty("longRunningToolIds")
  public abstract Optional<List<String>> longRunningToolIds();

  /**
   * Optional. Indicates whether the text content is part of a unfinished text stream. Only used for
   * streaming mode and when the content is plain text.
   */
  @JsonProperty("partial")
  public abstract Optional<Boolean> partial();

  /**
   * Optional. Indicates whether the response from the model is complete. Only used for streaming
   * mode.
   */
  @JsonProperty("turnComplete")
  public abstract Optional<Boolean> turnComplete();

  /** Instantiates a builder for EventMetadata. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_EventMetadata.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for EventMetadata. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `EventMetadata.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_EventMetadata.Builder();
    }

    /**
     * Setter for groundingMetadata.
     *
     * <p>groundingMetadata: Optional. Metadata returned to client when grounding is enabled.
     */
    @JsonProperty("groundingMetadata")
    public abstract Builder groundingMetadata(GroundingMetadata groundingMetadata);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder groundingMetadata(Optional<GroundingMetadata> groundingMetadata);

    /** Clears the value of groundingMetadata field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearGroundingMetadata() {
      return groundingMetadata(Optional.empty());
    }

    /**
     * Setter for branch.
     *
     * <p>branch: Optional. The branch of the event. The format is like agent_1.agent_2.agent_3,
     * where agent_1 is the parent of agent_2, and agent_2 is the parent of agent_3. Branch is used
     * when multiple child agents shouldn't see their siblings' conversation history.
     */
    @JsonProperty("branch")
    public abstract Builder branch(String branch);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder branch(Optional<String> branch);

    /** Clears the value of branch field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearBranch() {
      return branch(Optional.empty());
    }

    /**
     * Setter for customMetadata.
     *
     * <p>customMetadata: The custom metadata of the LlmResponse.
     */
    @JsonProperty("customMetadata")
    public abstract Builder customMetadata(Map<String, Object> customMetadata);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder customMetadata(Optional<Map<String, Object>> customMetadata);

    /** Clears the value of customMetadata field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearCustomMetadata() {
      return customMetadata(Optional.empty());
    }

    /**
     * Setter for interrupted.
     *
     * <p>interrupted: Optional. Flag indicating that LLM was interrupted when generating the
     * content. Usually it's due to user interruption during a bidi streaming.
     */
    @JsonProperty("interrupted")
    public abstract Builder interrupted(boolean interrupted);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder interrupted(Optional<Boolean> interrupted);

    /** Clears the value of interrupted field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearInterrupted() {
      return interrupted(Optional.empty());
    }

    /**
     * Setter for longRunningToolIds.
     *
     * <p>longRunningToolIds: Optional. Set of ids of the long running function calls. Agent client
     * will know from this field about which function call is long running. Only valid for function
     * call event.
     */
    @JsonProperty("longRunningToolIds")
    public abstract Builder longRunningToolIds(List<String> longRunningToolIds);

    /**
     * Setter for longRunningToolIds.
     *
     * <p>longRunningToolIds: Optional. Set of ids of the long running function calls. Agent client
     * will know from this field about which function call is long running. Only valid for function
     * call event.
     */
    @CanIgnoreReturnValue
    public Builder longRunningToolIds(String... longRunningToolIds) {
      return longRunningToolIds(Arrays.asList(longRunningToolIds));
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder longRunningToolIds(Optional<List<String>> longRunningToolIds);

    /** Clears the value of longRunningToolIds field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearLongRunningToolIds() {
      return longRunningToolIds(Optional.empty());
    }

    /**
     * Setter for partial.
     *
     * <p>partial: Optional. Indicates whether the text content is part of a unfinished text stream.
     * Only used for streaming mode and when the content is plain text.
     */
    @JsonProperty("partial")
    public abstract Builder partial(boolean partial);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder partial(Optional<Boolean> partial);

    /** Clears the value of partial field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearPartial() {
      return partial(Optional.empty());
    }

    /**
     * Setter for turnComplete.
     *
     * <p>turnComplete: Optional. Indicates whether the response from the model is complete. Only
     * used for streaming mode.
     */
    @JsonProperty("turnComplete")
    public abstract Builder turnComplete(boolean turnComplete);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder turnComplete(Optional<Boolean> turnComplete);

    /** Clears the value of turnComplete field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearTurnComplete() {
      return turnComplete(Optional.empty());
    }

    public abstract EventMetadata build();
  }

  /** Deserializes a JSON string to a EventMetadata object. */
  @ExcludeFromGeneratedCoverageReport
  public static EventMetadata fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, EventMetadata.class);
  }
}
