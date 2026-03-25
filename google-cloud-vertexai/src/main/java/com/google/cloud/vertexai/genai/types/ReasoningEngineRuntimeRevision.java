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
import java.time.Instant;
import java.util.Optional;

/** A runtime revision. */
@AutoValue
@JsonDeserialize(builder = ReasoningEngineRuntimeRevision.Builder.class)
public abstract class ReasoningEngineRuntimeRevision extends JsonSerializable {
  /** Output only. Timestamp when this ReasoningEngineRuntimeRevision was created. */
  @JsonProperty("createTime")
  public abstract Optional<Instant> createTime();

  /**
   * Identifier. The resource name of the ReasoningEngineRuntimeRevision. Format:
   * `projects/{project}/locations/{location}/reasoningEngines/{reasoning_engine}/runtimeRevisions/{runtime_revision}`
   */
  @JsonProperty("name")
  public abstract Optional<String> name();

  /**
   * Immutable. Configurations of the ReasoningEngineRuntimeRevision. Contains only revision
   * specific fields.
   */
  @JsonProperty("spec")
  public abstract Optional<ReasoningEngineSpec> spec();

  /** Output only. The state of the revision. */
  @JsonProperty("state")
  public abstract Optional<State> state();

  /** Instantiates a builder for ReasoningEngineRuntimeRevision. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_ReasoningEngineRuntimeRevision.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for ReasoningEngineRuntimeRevision. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `ReasoningEngineRuntimeRevision.builder()` for instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_ReasoningEngineRuntimeRevision.Builder();
    }

    /**
     * Setter for createTime.
     *
     * <p>createTime: Output only. Timestamp when this ReasoningEngineRuntimeRevision was created.
     */
    @JsonProperty("createTime")
    public abstract Builder createTime(Instant createTime);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder createTime(Optional<Instant> createTime);

    /** Clears the value of createTime field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearCreateTime() {
      return createTime(Optional.empty());
    }

    /**
     * Setter for name.
     *
     * <p>name: Identifier. The resource name of the ReasoningEngineRuntimeRevision. Format:
     * `projects/{project}/locations/{location}/reasoningEngines/{reasoning_engine}/runtimeRevisions/{runtime_revision}`
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
     * Setter for spec.
     *
     * <p>spec: Immutable. Configurations of the ReasoningEngineRuntimeRevision. Contains only
     * revision specific fields.
     */
    @JsonProperty("spec")
    public abstract Builder spec(ReasoningEngineSpec spec);

    /**
     * Setter for spec builder.
     *
     * <p>spec: Immutable. Configurations of the ReasoningEngineRuntimeRevision. Contains only
     * revision specific fields.
     */
    @CanIgnoreReturnValue
    public Builder spec(ReasoningEngineSpec.Builder specBuilder) {
      return spec(specBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder spec(Optional<ReasoningEngineSpec> spec);

    /** Clears the value of spec field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearSpec() {
      return spec(Optional.empty());
    }

    /**
     * Setter for state.
     *
     * <p>state: Output only. The state of the revision.
     */
    @JsonProperty("state")
    public abstract Builder state(State state);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder state(Optional<State> state);

    /** Clears the value of state field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearState() {
      return state(Optional.empty());
    }

    /**
     * Setter for state given a known enum.
     *
     * <p>state: Output only. The state of the revision.
     */
    @CanIgnoreReturnValue
    public Builder state(State.Known knownType) {
      return state(new State(knownType));
    }

    /**
     * Setter for state given a string.
     *
     * <p>state: Output only. The state of the revision.
     */
    @CanIgnoreReturnValue
    public Builder state(String state) {
      return state(new State(state));
    }

    public abstract ReasoningEngineRuntimeRevision build();
  }

  /** Deserializes a JSON string to a ReasoningEngineRuntimeRevision object. */
  @ExcludeFromGeneratedCoverageReport
  public static ReasoningEngineRuntimeRevision fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, ReasoningEngineRuntimeRevision.class);
  }
}
