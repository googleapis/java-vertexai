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

/** The direct contents source event for ingesting events. */
@AutoValue
@JsonDeserialize(builder = IngestionDirectContentsSourceEvent.Builder.class)
public abstract class IngestionDirectContentsSourceEvent extends JsonSerializable {
  /** Required. The content of the event. */
  @JsonProperty("content")
  public abstract Optional<Content> content();

  /**
   * Optional. A unique identifier for the event. If an event with the same event_id is ingested
   * multiple times, it will be de-duplicated.
   */
  @JsonProperty("eventId")
  public abstract Optional<String> eventId();

  /**
   * Optional. The time at which the event occurred. If provided, this timestamp will be used for
   * ordering events within a stream. If not provided, the server-side ingestion time will be used.
   */
  @JsonProperty("eventTime")
  public abstract Optional<Instant> eventTime();

  /** Instantiates a builder for IngestionDirectContentsSourceEvent. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_IngestionDirectContentsSourceEvent.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for IngestionDirectContentsSourceEvent. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `IngestionDirectContentsSourceEvent.builder()` for
     * instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_IngestionDirectContentsSourceEvent.Builder();
    }

    /**
     * Setter for content.
     *
     * <p>content: Required. The content of the event.
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
     * Setter for eventId.
     *
     * <p>eventId: Optional. A unique identifier for the event. If an event with the same event_id
     * is ingested multiple times, it will be de-duplicated.
     */
    @JsonProperty("eventId")
    public abstract Builder eventId(String eventId);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder eventId(Optional<String> eventId);

    /** Clears the value of eventId field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearEventId() {
      return eventId(Optional.empty());
    }

    /**
     * Setter for eventTime.
     *
     * <p>eventTime: Optional. The time at which the event occurred. If provided, this timestamp
     * will be used for ordering events within a stream. If not provided, the server-side ingestion
     * time will be used.
     */
    @JsonProperty("eventTime")
    public abstract Builder eventTime(Instant eventTime);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder eventTime(Optional<Instant> eventTime);

    /** Clears the value of eventTime field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearEventTime() {
      return eventTime(Optional.empty());
    }

    public abstract IngestionDirectContentsSourceEvent build();
  }

  /** Deserializes a JSON string to a IngestionDirectContentsSourceEvent object. */
  @ExcludeFromGeneratedCoverageReport
  public static IngestionDirectContentsSourceEvent fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, IngestionDirectContentsSourceEvent.class);
  }
}
