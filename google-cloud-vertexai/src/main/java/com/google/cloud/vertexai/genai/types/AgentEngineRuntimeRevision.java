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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.genai.JsonSerializable;
import java.util.Optional;

/** An agent engine runtime revision instance. */
@AutoValue
@JsonDeserialize(builder = AgentEngineRuntimeRevision.Builder.class)
public abstract class AgentEngineRuntimeRevision extends JsonSerializable {
  /** The underlying API client. */
  @JsonIgnore
  public abstract Optional<Object> apiClient();

  /** The underlying API client for asynchronous operations. */
  @JsonIgnore
  public abstract Optional<Object> apiAsyncClient();

  /** The underlying API resource (i.e. ReasoningEngineRuntimeRevision). */
  @JsonProperty("apiResource")
  public abstract Optional<ReasoningEngineRuntimeRevision> apiResource();

  /** Instantiates a builder for AgentEngineRuntimeRevision. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_AgentEngineRuntimeRevision.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for AgentEngineRuntimeRevision. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `AgentEngineRuntimeRevision.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_AgentEngineRuntimeRevision.Builder();
    }

    /**
     * Setter for apiClient.
     *
     * <p>apiClient: The underlying API client.
     */
    @JsonIgnore
    public abstract Builder apiClient(Object apiClient);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder apiClient(Optional<Object> apiClient);

    /** Clears the value of apiClient field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearApiClient() {
      return apiClient(Optional.empty());
    }

    /**
     * Setter for apiAsyncClient.
     *
     * <p>apiAsyncClient: The underlying API client for asynchronous operations.
     */
    @JsonIgnore
    public abstract Builder apiAsyncClient(Object apiAsyncClient);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder apiAsyncClient(Optional<Object> apiAsyncClient);

    /** Clears the value of apiAsyncClient field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearApiAsyncClient() {
      return apiAsyncClient(Optional.empty());
    }

    /**
     * Setter for apiResource.
     *
     * <p>apiResource: The underlying API resource (i.e. ReasoningEngineRuntimeRevision).
     */
    @JsonProperty("apiResource")
    public abstract Builder apiResource(ReasoningEngineRuntimeRevision apiResource);

    /**
     * Setter for apiResource builder.
     *
     * <p>apiResource: The underlying API resource (i.e. ReasoningEngineRuntimeRevision).
     */
    @CanIgnoreReturnValue
    public Builder apiResource(ReasoningEngineRuntimeRevision.Builder apiResourceBuilder) {
      return apiResource(apiResourceBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder apiResource(Optional<ReasoningEngineRuntimeRevision> apiResource);

    /** Clears the value of apiResource field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearApiResource() {
      return apiResource(Optional.empty());
    }

    public abstract AgentEngineRuntimeRevision build();
  }

  /** Deserializes a JSON string to a AgentEngineRuntimeRevision object. */
  @ExcludeFromGeneratedCoverageReport
  public static AgentEngineRuntimeRevision fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, AgentEngineRuntimeRevision.class);
  }
}
