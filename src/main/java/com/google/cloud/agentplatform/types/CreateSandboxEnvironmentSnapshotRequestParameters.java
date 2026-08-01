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

package com.google.cloud.agentplatform.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.api.core.InternalApi;
import com.google.auto.value.AutoValue;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.genai.JsonSerializable;
import java.util.Optional;

/** Parameters for creating a sandbox environment snapshot. */
@AutoValue
@InternalApi
@JsonDeserialize(builder = CreateSandboxEnvironmentSnapshotRequestParameters.Builder.class)
public abstract class CreateSandboxEnvironmentSnapshotRequestParameters extends JsonSerializable {
  /** Name of the sandbox environment to snapshot. */
  @JsonProperty("sourceSandboxEnvironmentName")
  public abstract Optional<String> sourceSandboxEnvironmentName();

  /** */
  @JsonProperty("config")
  public abstract Optional<CreateAgentEngineSandboxSnapshotConfig> config();

  /** Instantiates a builder for CreateSandboxEnvironmentSnapshotRequestParameters. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_CreateSandboxEnvironmentSnapshotRequestParameters.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for CreateSandboxEnvironmentSnapshotRequestParameters. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `CreateSandboxEnvironmentSnapshotRequestParameters.builder()`
     * for instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_CreateSandboxEnvironmentSnapshotRequestParameters.Builder();
    }

    /**
     * Setter for sourceSandboxEnvironmentName.
     *
     * <p>sourceSandboxEnvironmentName: Name of the sandbox environment to snapshot.
     */
    @JsonProperty("sourceSandboxEnvironmentName")
    public abstract Builder sourceSandboxEnvironmentName(String sourceSandboxEnvironmentName);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder sourceSandboxEnvironmentName(Optional<String> sourceSandboxEnvironmentName);

    /** Clears the value of sourceSandboxEnvironmentName field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearSourceSandboxEnvironmentName() {
      return sourceSandboxEnvironmentName(Optional.empty());
    }

    /**
     * Setter for config.
     *
     * <p>config:
     */
    @JsonProperty("config")
    public abstract Builder config(CreateAgentEngineSandboxSnapshotConfig config);

    /**
     * Setter for config builder.
     *
     * <p>config:
     */
    @CanIgnoreReturnValue
    public Builder config(CreateAgentEngineSandboxSnapshotConfig.Builder configBuilder) {
      return config(configBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder config(Optional<CreateAgentEngineSandboxSnapshotConfig> config);

    /** Clears the value of config field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearConfig() {
      return config(Optional.empty());
    }

    public abstract CreateSandboxEnvironmentSnapshotRequestParameters build();
  }

  /** Deserializes a JSON string to a CreateSandboxEnvironmentSnapshotRequestParameters object. */
  @ExcludeFromGeneratedCoverageReport
  public static CreateSandboxEnvironmentSnapshotRequestParameters fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(
        jsonString, CreateSandboxEnvironmentSnapshotRequestParameters.class);
  }
}
