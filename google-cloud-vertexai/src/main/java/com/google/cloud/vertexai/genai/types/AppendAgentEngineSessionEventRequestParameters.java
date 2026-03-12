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
import java.time.Instant;
import java.util.Optional;

/** Parameters for appending agent engines. */
@AutoValue
@InternalApi
@JsonDeserialize(builder = AppendAgentEngineSessionEventRequestParameters.Builder.class)
public abstract class AppendAgentEngineSessionEventRequestParameters extends JsonSerializable {
  /** Name of the agent engine session. */
  @JsonProperty("name")
  public abstract Optional<String> name();

  /** Author of the agent engine session event. */
  @JsonProperty("author")
  public abstract Optional<String> author();

  /** Invocation ID of the agent engine. */
  @JsonProperty("invocationId")
  public abstract Optional<String> invocationId();

  /** Timestamp indicating when the event was created. */
  @JsonProperty("timestamp")
  public abstract Optional<Instant> timestamp();

  /** */
  @JsonProperty("config")
  public abstract Optional<AppendAgentEngineSessionEventConfig> config();

  /** Instantiates a builder for AppendAgentEngineSessionEventRequestParameters. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_AppendAgentEngineSessionEventRequestParameters.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for AppendAgentEngineSessionEventRequestParameters. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `AppendAgentEngineSessionEventRequestParameters.builder()` for
     * instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_AppendAgentEngineSessionEventRequestParameters.Builder();
    }

    /**
     * Setter for name.
     *
     * <p>name: Name of the agent engine session.
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
     * Setter for author.
     *
     * <p>author: Author of the agent engine session event.
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
     * Setter for invocationId.
     *
     * <p>invocationId: Invocation ID of the agent engine.
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
     * Setter for timestamp.
     *
     * <p>timestamp: Timestamp indicating when the event was created.
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

    /**
     * Setter for config.
     *
     * <p>config:
     */
    @JsonProperty("config")
    public abstract Builder config(AppendAgentEngineSessionEventConfig config);

    /**
     * Setter for config builder.
     *
     * <p>config:
     */
    @CanIgnoreReturnValue
    public Builder config(AppendAgentEngineSessionEventConfig.Builder configBuilder) {
      return config(configBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder config(Optional<AppendAgentEngineSessionEventConfig> config);

    /** Clears the value of config field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearConfig() {
      return config(Optional.empty());
    }

    public abstract AppendAgentEngineSessionEventRequestParameters build();
  }

  /** Deserializes a JSON string to a AppendAgentEngineSessionEventRequestParameters object. */
  @ExcludeFromGeneratedCoverageReport
  public static AppendAgentEngineSessionEventRequestParameters fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(
        jsonString, AppendAgentEngineSessionEventRequestParameters.class);
  }
}
