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
import com.google.auto.value.AutoValue;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.genai.JsonSerializable;
import java.util.Optional;

/** The default sandbox runtime environment for default container workloads. */
@AutoValue
@JsonDeserialize(builder = SandboxEnvironmentTemplateDefaultContainerEnvironment.Builder.class)
public abstract class SandboxEnvironmentTemplateDefaultContainerEnvironment
    extends JsonSerializable {
  /** Required. The category of the default container image. */
  @JsonProperty("defaultContainerCategory")
  public abstract Optional<DefaultContainerCategory> defaultContainerCategory();

  /** Optional. Resource requests and limits for the default container. */
  @JsonProperty("resources")
  public abstract Optional<SandboxEnvironmentTemplateResourceRequirements> resources();

  /** Instantiates a builder for SandboxEnvironmentTemplateDefaultContainerEnvironment. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_SandboxEnvironmentTemplateDefaultContainerEnvironment.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for SandboxEnvironmentTemplateDefaultContainerEnvironment. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use
     * `SandboxEnvironmentTemplateDefaultContainerEnvironment.builder()` for instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_SandboxEnvironmentTemplateDefaultContainerEnvironment.Builder();
    }

    /**
     * Setter for defaultContainerCategory.
     *
     * <p>defaultContainerCategory: Required. The category of the default container image.
     */
    @JsonProperty("defaultContainerCategory")
    public abstract Builder defaultContainerCategory(
        DefaultContainerCategory defaultContainerCategory);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder defaultContainerCategory(
        Optional<DefaultContainerCategory> defaultContainerCategory);

    /** Clears the value of defaultContainerCategory field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearDefaultContainerCategory() {
      return defaultContainerCategory(Optional.empty());
    }

    /**
     * Setter for defaultContainerCategory given a known enum.
     *
     * <p>defaultContainerCategory: Required. The category of the default container image.
     */
    @CanIgnoreReturnValue
    public Builder defaultContainerCategory(DefaultContainerCategory.Known knownType) {
      return defaultContainerCategory(new DefaultContainerCategory(knownType));
    }

    /**
     * Setter for defaultContainerCategory given a string.
     *
     * <p>defaultContainerCategory: Required. The category of the default container image.
     */
    @CanIgnoreReturnValue
    public Builder defaultContainerCategory(String defaultContainerCategory) {
      return defaultContainerCategory(new DefaultContainerCategory(defaultContainerCategory));
    }

    /**
     * Setter for resources.
     *
     * <p>resources: Optional. Resource requests and limits for the default container.
     */
    @JsonProperty("resources")
    public abstract Builder resources(SandboxEnvironmentTemplateResourceRequirements resources);

    /**
     * Setter for resources builder.
     *
     * <p>resources: Optional. Resource requests and limits for the default container.
     */
    @CanIgnoreReturnValue
    public Builder resources(
        SandboxEnvironmentTemplateResourceRequirements.Builder resourcesBuilder) {
      return resources(resourcesBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder resources(Optional<SandboxEnvironmentTemplateResourceRequirements> resources);

    /** Clears the value of resources field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearResources() {
      return resources(Optional.empty());
    }

    public abstract SandboxEnvironmentTemplateDefaultContainerEnvironment build();
  }

  /**
   * Deserializes a JSON string to a SandboxEnvironmentTemplateDefaultContainerEnvironment object.
   */
  @ExcludeFromGeneratedCoverageReport
  public static SandboxEnvironmentTemplateDefaultContainerEnvironment fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(
        jsonString, SandboxEnvironmentTemplateDefaultContainerEnvironment.class);
  }
}
