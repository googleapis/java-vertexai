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
import com.google.api.core.InternalApi;
import com.google.auto.value.AutoValue;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.genai.JsonSerializable;
import java.util.Map;
import java.util.Optional;

/** Parameters for purging agent engine memories. */
@AutoValue
@InternalApi
@JsonDeserialize(builder = IngestEventsRequestParameters.Builder.class)
public abstract class IngestEventsRequestParameters extends JsonSerializable {
  /** Name of the Agent Engine to ingest events into. */
  @JsonProperty("name")
  public abstract Optional<String> name();

  /** The ID of the stream to ingest events into. */
  @JsonProperty("streamId")
  public abstract Optional<String> streamId();

  /** The direct memories source of the events that should be ingested. */
  @JsonProperty("directContentsSource")
  public abstract Optional<IngestionDirectContentsSource> directContentsSource();

  /**
   * The scope of the memories that should be generated from the stream.
   *
   * <p>Memories will be consolidated across memories with the same scope. Scope values cannot
   * contain the wildcard character '*'.
   */
  @JsonProperty("scope")
  public abstract Optional<Map<String, String>> scope();

  /** The configuration for the memory generation trigger. */
  @JsonProperty("generationTriggerConfig")
  public abstract Optional<MemoryGenerationTriggerConfig> generationTriggerConfig();

  /** */
  @JsonProperty("config")
  public abstract Optional<IngestEventsConfig> config();

  /** Instantiates a builder for IngestEventsRequestParameters. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_IngestEventsRequestParameters.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for IngestEventsRequestParameters. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `IngestEventsRequestParameters.builder()` for instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_IngestEventsRequestParameters.Builder();
    }

    /**
     * Setter for name.
     *
     * <p>name: Name of the Agent Engine to ingest events into.
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
     * Setter for streamId.
     *
     * <p>streamId: The ID of the stream to ingest events into.
     */
    @JsonProperty("streamId")
    public abstract Builder streamId(String streamId);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder streamId(Optional<String> streamId);

    /** Clears the value of streamId field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearStreamId() {
      return streamId(Optional.empty());
    }

    /**
     * Setter for directContentsSource.
     *
     * <p>directContentsSource: The direct memories source of the events that should be ingested.
     */
    @JsonProperty("directContentsSource")
    public abstract Builder directContentsSource(
        IngestionDirectContentsSource directContentsSource);

    /**
     * Setter for directContentsSource builder.
     *
     * <p>directContentsSource: The direct memories source of the events that should be ingested.
     */
    @CanIgnoreReturnValue
    public Builder directContentsSource(
        IngestionDirectContentsSource.Builder directContentsSourceBuilder) {
      return directContentsSource(directContentsSourceBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder directContentsSource(
        Optional<IngestionDirectContentsSource> directContentsSource);

    /** Clears the value of directContentsSource field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearDirectContentsSource() {
      return directContentsSource(Optional.empty());
    }

    /**
     * Setter for scope.
     *
     * <p>scope: The scope of the memories that should be generated from the stream.
     *
     * <p>Memories will be consolidated across memories with the same scope. Scope values cannot
     * contain the wildcard character '*'.
     */
    @JsonProperty("scope")
    public abstract Builder scope(Map<String, String> scope);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder scope(Optional<Map<String, String>> scope);

    /** Clears the value of scope field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearScope() {
      return scope(Optional.empty());
    }

    /**
     * Setter for generationTriggerConfig.
     *
     * <p>generationTriggerConfig: The configuration for the memory generation trigger.
     */
    @JsonProperty("generationTriggerConfig")
    public abstract Builder generationTriggerConfig(
        MemoryGenerationTriggerConfig generationTriggerConfig);

    /**
     * Setter for generationTriggerConfig builder.
     *
     * <p>generationTriggerConfig: The configuration for the memory generation trigger.
     */
    @CanIgnoreReturnValue
    public Builder generationTriggerConfig(
        MemoryGenerationTriggerConfig.Builder generationTriggerConfigBuilder) {
      return generationTriggerConfig(generationTriggerConfigBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder generationTriggerConfig(
        Optional<MemoryGenerationTriggerConfig> generationTriggerConfig);

    /** Clears the value of generationTriggerConfig field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearGenerationTriggerConfig() {
      return generationTriggerConfig(Optional.empty());
    }

    /**
     * Setter for config.
     *
     * <p>config:
     */
    @JsonProperty("config")
    public abstract Builder config(IngestEventsConfig config);

    /**
     * Setter for config builder.
     *
     * <p>config:
     */
    @CanIgnoreReturnValue
    public Builder config(IngestEventsConfig.Builder configBuilder) {
      return config(configBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder config(Optional<IngestEventsConfig> config);

    /** Clears the value of config field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearConfig() {
      return config(Optional.empty());
    }

    public abstract IngestEventsRequestParameters build();
  }

  /** Deserializes a JSON string to a IngestEventsRequestParameters object. */
  @ExcludeFromGeneratedCoverageReport
  public static IngestEventsRequestParameters fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, IngestEventsRequestParameters.class);
  }
}
