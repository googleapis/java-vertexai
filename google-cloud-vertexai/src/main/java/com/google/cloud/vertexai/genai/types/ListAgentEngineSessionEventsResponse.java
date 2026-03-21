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

import static com.google.common.collect.ImmutableList.toImmutableList;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.genai.JsonSerializable;
import com.google.genai.types.HttpResponse;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/** Response for listing agent engine session events. */
@AutoValue
@JsonDeserialize(builder = ListAgentEngineSessionEventsResponse.Builder.class)
public abstract class ListAgentEngineSessionEventsResponse extends JsonSerializable {
  /** Used to retain the full HTTP response. */
  @JsonProperty("sdkHttpResponse")
  public abstract Optional<HttpResponse> sdkHttpResponse();

  /** */
  @JsonProperty("nextPageToken")
  public abstract Optional<String> nextPageToken();

  /** List of session events. */
  @JsonProperty("sessionEvents")
  public abstract Optional<List<SessionEvent>> sessionEvents();

  /** Instantiates a builder for ListAgentEngineSessionEventsResponse. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_ListAgentEngineSessionEventsResponse.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for ListAgentEngineSessionEventsResponse. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `ListAgentEngineSessionEventsResponse.builder()` for
     * instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_ListAgentEngineSessionEventsResponse.Builder();
    }

    /**
     * Setter for sdkHttpResponse.
     *
     * <p>sdkHttpResponse: Used to retain the full HTTP response.
     */
    @JsonProperty("sdkHttpResponse")
    public abstract Builder sdkHttpResponse(HttpResponse sdkHttpResponse);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder sdkHttpResponse(Optional<HttpResponse> sdkHttpResponse);

    /** Clears the value of sdkHttpResponse field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearSdkHttpResponse() {
      return sdkHttpResponse(Optional.empty());
    }

    /**
     * Setter for nextPageToken.
     *
     * <p>nextPageToken:
     */
    @JsonProperty("nextPageToken")
    public abstract Builder nextPageToken(String nextPageToken);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder nextPageToken(Optional<String> nextPageToken);

    /** Clears the value of nextPageToken field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearNextPageToken() {
      return nextPageToken(Optional.empty());
    }

    /**
     * Setter for sessionEvents.
     *
     * <p>sessionEvents: List of session events.
     */
    @JsonProperty("sessionEvents")
    public abstract Builder sessionEvents(List<SessionEvent> sessionEvents);

    /**
     * Setter for sessionEvents.
     *
     * <p>sessionEvents: List of session events.
     */
    @CanIgnoreReturnValue
    public Builder sessionEvents(SessionEvent... sessionEvents) {
      return sessionEvents(Arrays.asList(sessionEvents));
    }

    /**
     * Setter for sessionEvents builder.
     *
     * <p>sessionEvents: List of session events.
     */
    @CanIgnoreReturnValue
    public Builder sessionEvents(SessionEvent.Builder... sessionEventsBuilders) {
      return sessionEvents(
          Arrays.asList(sessionEventsBuilders).stream()
              .map(SessionEvent.Builder::build)
              .collect(toImmutableList()));
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder sessionEvents(Optional<List<SessionEvent>> sessionEvents);

    /** Clears the value of sessionEvents field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearSessionEvents() {
      return sessionEvents(Optional.empty());
    }

    public abstract ListAgentEngineSessionEventsResponse build();
  }

  /** Deserializes a JSON string to a ListAgentEngineSessionEventsResponse object. */
  @ExcludeFromGeneratedCoverageReport
  public static ListAgentEngineSessionEventsResponse fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, ListAgentEngineSessionEventsResponse.class);
  }
}
