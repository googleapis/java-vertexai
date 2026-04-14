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
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/** The direct contents source for ingesting events. */
@AutoValue
@JsonDeserialize(builder = IngestionDirectContentsSource.Builder.class)
public abstract class IngestionDirectContentsSource extends JsonSerializable {
  /** Required. The events to ingest. */
  @JsonProperty("events")
  public abstract Optional<List<IngestionDirectContentsSourceEvent>> events();

  /** Instantiates a builder for IngestionDirectContentsSource. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_IngestionDirectContentsSource.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for IngestionDirectContentsSource. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `IngestionDirectContentsSource.builder()` for instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_IngestionDirectContentsSource.Builder();
    }

    /**
     * Setter for events.
     *
     * <p>events: Required. The events to ingest.
     */
    @JsonProperty("events")
    public abstract Builder events(List<IngestionDirectContentsSourceEvent> events);

    /**
     * Setter for events.
     *
     * <p>events: Required. The events to ingest.
     */
    @CanIgnoreReturnValue
    public Builder events(IngestionDirectContentsSourceEvent... events) {
      return events(Arrays.asList(events));
    }

    /**
     * Setter for events builder.
     *
     * <p>events: Required. The events to ingest.
     */
    @CanIgnoreReturnValue
    public Builder events(IngestionDirectContentsSourceEvent.Builder... eventsBuilders) {
      return events(
          Arrays.asList(eventsBuilders).stream()
              .map(IngestionDirectContentsSourceEvent.Builder::build)
              .collect(toImmutableList()));
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder events(Optional<List<IngestionDirectContentsSourceEvent>> events);

    /** Clears the value of events field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearEvents() {
      return events(Optional.empty());
    }

    public abstract IngestionDirectContentsSource build();
  }

  /** Deserializes a JSON string to a IngestionDirectContentsSource object. */
  @ExcludeFromGeneratedCoverageReport
  public static IngestionDirectContentsSource fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, IngestionDirectContentsSource.class);
  }
}
