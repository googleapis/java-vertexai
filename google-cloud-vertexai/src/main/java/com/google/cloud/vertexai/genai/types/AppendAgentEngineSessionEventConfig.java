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
import com.google.genai.types.HttpOptions;
import java.util.Optional;

/** Config for appending agent engine session event. */
@AutoValue
@JsonDeserialize(builder = AppendAgentEngineSessionEventConfig.Builder.class)
public abstract class AppendAgentEngineSessionEventConfig extends JsonSerializable {
  /** Used to override HTTP request options. */
  @JsonProperty("httpOptions")
  public abstract Optional<HttpOptions> httpOptions();

  /** The content of the session event. */
  @JsonProperty("content")
  public abstract Optional<Content> content();

  /** Actions are parts of events that are related to the session event. */
  @JsonProperty("actions")
  public abstract Optional<EventActions> actions();

  /** The error code of the session event. */
  @JsonProperty("errorCode")
  public abstract Optional<String> errorCode();

  /** The error message of the session event. */
  @JsonProperty("errorMessage")
  public abstract Optional<String> errorMessage();

  /** Metadata relating to the session event. */
  @JsonProperty("eventMetadata")
  public abstract Optional<EventMetadata> eventMetadata();

  /** Instantiates a builder for AppendAgentEngineSessionEventConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_AppendAgentEngineSessionEventConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for AppendAgentEngineSessionEventConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `AppendAgentEngineSessionEventConfig.builder()` for
     * instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_AppendAgentEngineSessionEventConfig.Builder();
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
     * Setter for content.
     *
     * <p>content: The content of the session event.
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
     * <p>actions: Actions are parts of events that are related to the session event.
     */
    @JsonProperty("actions")
    public abstract Builder actions(EventActions actions);

    /**
     * Setter for actions builder.
     *
     * <p>actions: Actions are parts of events that are related to the session event.
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
     * Setter for errorCode.
     *
     * <p>errorCode: The error code of the session event.
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
     * <p>errorMessage: The error message of the session event.
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
     * <p>eventMetadata: Metadata relating to the session event.
     */
    @JsonProperty("eventMetadata")
    public abstract Builder eventMetadata(EventMetadata eventMetadata);

    /**
     * Setter for eventMetadata builder.
     *
     * <p>eventMetadata: Metadata relating to the session event.
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

    public abstract AppendAgentEngineSessionEventConfig build();
  }

  /** Deserializes a JSON string to a AppendAgentEngineSessionEventConfig object. */
  @ExcludeFromGeneratedCoverageReport
  public static AppendAgentEngineSessionEventConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, AppendAgentEngineSessionEventConfig.class);
  }
}
