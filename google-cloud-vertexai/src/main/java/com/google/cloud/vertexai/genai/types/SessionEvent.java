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
import com.google.genai.types.Content;
import java.time.Instant;
import java.util.Optional;

/** A session event. */
@AutoValue
@JsonDeserialize(builder = SessionEvent.Builder.class)
public abstract class SessionEvent extends JsonSerializable {
  /** Optional. Content of the event provided by the author. */
  @JsonProperty("content")
  public abstract Optional<Content> content();

  /** Optional. Actions executed by the agent. */
  @JsonProperty("actions")
  public abstract Optional<EventActions> actions();

  /** Required. The name of the agent that sent the event, or user. */
  @JsonProperty("author")
  public abstract Optional<String> author();

  /** Optional. Error code if the response is an error. Code varies by model. */
  @JsonProperty("errorCode")
  public abstract Optional<String> errorCode();

  /** Optional. Error message if the response is an error. */
  @JsonProperty("errorMessage")
  public abstract Optional<String> errorMessage();

  /** Optional. Metadata relating to this event. */
  @JsonProperty("eventMetadata")
  public abstract Optional<EventMetadata> eventMetadata();

  /** Required. The invocation id of the event, multiple events can have the same invocation id. */
  @JsonProperty("invocationId")
  public abstract Optional<String> invocationId();

  /**
   * Identifier. The resource name of the event.
   * Format:`projects/{project}/locations/{location}/reasoningEngines/{reasoning_engine}/sessions/{session}/events/{event}`.
   */
  @JsonProperty("name")
  public abstract Optional<String> name();

  /** Required. Timestamp when the event was created on client side. */
  @JsonProperty("timestamp")
  public abstract Optional<Instant> timestamp();

  /** Instantiates a builder for SessionEvent. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_SessionEvent.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for SessionEvent. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `SessionEvent.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_SessionEvent.Builder();
    }

    /**
     * Setter for content.
     *
     * <p>content: Optional. Content of the event provided by the author.
     */
    @JsonProperty("content")
    public abstract Builder content(Content content);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder content(Optional<Content> content);

    /** Clears the value of content field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearContent() {
      return content(Optional.empty());
    }

    /**
     * Setter for actions.
     *
     * <p>actions: Optional. Actions executed by the agent.
     */
    @JsonProperty("actions")
    public abstract Builder actions(EventActions actions);

    /**
     * Setter for actions builder.
     *
     * <p>actions: Optional. Actions executed by the agent.
     */
    @CanIgnoreReturnValue
    public Builder actions(EventActions.Builder actionsBuilder) {
      return actions(actionsBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder actions(Optional<EventActions> actions);

    /** Clears the value of actions field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearActions() {
      return actions(Optional.empty());
    }

    /**
     * Setter for author.
     *
     * <p>author: Required. The name of the agent that sent the event, or user.
     */
    @JsonProperty("author")
    public abstract Builder author(String author);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder author(Optional<String> author);

    /** Clears the value of author field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearAuthor() {
      return author(Optional.empty());
    }

    /**
     * Setter for errorCode.
     *
     * <p>errorCode: Optional. Error code if the response is an error. Code varies by model.
     */
    @JsonProperty("errorCode")
    public abstract Builder errorCode(String errorCode);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder errorCode(Optional<String> errorCode);

    /** Clears the value of errorCode field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearErrorCode() {
      return errorCode(Optional.empty());
    }

    /**
     * Setter for errorMessage.
     *
     * <p>errorMessage: Optional. Error message if the response is an error.
     */
    @JsonProperty("errorMessage")
    public abstract Builder errorMessage(String errorMessage);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder errorMessage(Optional<String> errorMessage);

    /** Clears the value of errorMessage field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearErrorMessage() {
      return errorMessage(Optional.empty());
    }

    /**
     * Setter for eventMetadata.
     *
     * <p>eventMetadata: Optional. Metadata relating to this event.
     */
    @JsonProperty("eventMetadata")
    public abstract Builder eventMetadata(EventMetadata eventMetadata);

    /**
     * Setter for eventMetadata builder.
     *
     * <p>eventMetadata: Optional. Metadata relating to this event.
     */
    @CanIgnoreReturnValue
    public Builder eventMetadata(EventMetadata.Builder eventMetadataBuilder) {
      return eventMetadata(eventMetadataBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder eventMetadata(Optional<EventMetadata> eventMetadata);

    /** Clears the value of eventMetadata field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearEventMetadata() {
      return eventMetadata(Optional.empty());
    }

    /**
     * Setter for invocationId.
     *
     * <p>invocationId: Required. The invocation id of the event, multiple events can have the same
     * invocation id.
     */
    @JsonProperty("invocationId")
    public abstract Builder invocationId(String invocationId);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder invocationId(Optional<String> invocationId);

    /** Clears the value of invocationId field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearInvocationId() {
      return invocationId(Optional.empty());
    }

    /**
     * Setter for name.
     *
     * <p>name: Identifier. The resource name of the event.
     * Format:`projects/{project}/locations/{location}/reasoningEngines/{reasoning_engine}/sessions/{session}/events/{event}`.
     */
    @JsonProperty("name")
    public abstract Builder name(String name);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder name(Optional<String> name);

    /** Clears the value of name field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearName() {
      return name(Optional.empty());
    }

    /**
     * Setter for timestamp.
     *
     * <p>timestamp: Required. Timestamp when the event was created on client side.
     */
    @JsonProperty("timestamp")
    public abstract Builder timestamp(Instant timestamp);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder timestamp(Optional<Instant> timestamp);

    /** Clears the value of timestamp field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearTimestamp() {
      return timestamp(Optional.empty());
    }

    public abstract SessionEvent build();
  }

  /** Deserializes a JSON string to a SessionEvent object. */
  @ExcludeFromGeneratedCoverageReport
  public static SessionEvent fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, SessionEvent.class);
  }
}
