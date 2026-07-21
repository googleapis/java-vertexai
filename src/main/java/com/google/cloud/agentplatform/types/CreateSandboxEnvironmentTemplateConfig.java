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
import com.google.genai.types.HttpOptions;
import java.util.Optional;

/** Config for creating a Sandbox Template. */
@AutoValue
@JsonDeserialize(builder = CreateSandboxEnvironmentTemplateConfig.Builder.class)
public abstract class CreateSandboxEnvironmentTemplateConfig extends JsonSerializable {
  /** Used to override HTTP request options. */
  @JsonProperty("httpOptions")
  public abstract Optional<HttpOptions> httpOptions();

  /** The custom container environment for the sandbox template. */
  @JsonProperty("customContainerEnvironment")
  public abstract Optional<SandboxEnvironmentTemplateCustomContainerEnvironment>
      customContainerEnvironment();

  /** The default container environment for the sandbox template. */
  @JsonProperty("defaultContainerEnvironment")
  public abstract Optional<SandboxEnvironmentTemplateDefaultContainerEnvironment>
      defaultContainerEnvironment();

  /** The egress control config for the sandbox template. */
  @JsonProperty("egressControlConfig")
  public abstract Optional<SandboxEnvironmentTemplateEgressControlConfig> egressControlConfig();

  /** Waits for the operation to complete before returning. */
  @JsonProperty("waitForCompletion")
  public abstract Optional<Boolean> waitForCompletion();

  /** Instantiates a builder for CreateSandboxEnvironmentTemplateConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_CreateSandboxEnvironmentTemplateConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for CreateSandboxEnvironmentTemplateConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `CreateSandboxEnvironmentTemplateConfig.builder()` for
     * instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_CreateSandboxEnvironmentTemplateConfig.Builder();
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
     * Setter for customContainerEnvironment.
     *
     * <p>customContainerEnvironment: The custom container environment for the sandbox template.
     */
    @JsonProperty("customContainerEnvironment")
    public abstract Builder customContainerEnvironment(
        SandboxEnvironmentTemplateCustomContainerEnvironment customContainerEnvironment);

    /**
     * Setter for customContainerEnvironment builder.
     *
     * <p>customContainerEnvironment: The custom container environment for the sandbox template.
     */
    @CanIgnoreReturnValue
    public Builder customContainerEnvironment(
        SandboxEnvironmentTemplateCustomContainerEnvironment.Builder
            customContainerEnvironmentBuilder) {
      return customContainerEnvironment(customContainerEnvironmentBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder customContainerEnvironment(
        Optional<SandboxEnvironmentTemplateCustomContainerEnvironment> customContainerEnvironment);

    /** Clears the value of customContainerEnvironment field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearCustomContainerEnvironment() {
      return customContainerEnvironment(Optional.empty());
    }

    /**
     * Setter for defaultContainerEnvironment.
     *
     * <p>defaultContainerEnvironment: The default container environment for the sandbox template.
     */
    @JsonProperty("defaultContainerEnvironment")
    public abstract Builder defaultContainerEnvironment(
        SandboxEnvironmentTemplateDefaultContainerEnvironment defaultContainerEnvironment);

    /**
     * Setter for defaultContainerEnvironment builder.
     *
     * <p>defaultContainerEnvironment: The default container environment for the sandbox template.
     */
    @CanIgnoreReturnValue
    public Builder defaultContainerEnvironment(
        SandboxEnvironmentTemplateDefaultContainerEnvironment.Builder
            defaultContainerEnvironmentBuilder) {
      return defaultContainerEnvironment(defaultContainerEnvironmentBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder defaultContainerEnvironment(
        Optional<SandboxEnvironmentTemplateDefaultContainerEnvironment>
            defaultContainerEnvironment);

    /** Clears the value of defaultContainerEnvironment field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearDefaultContainerEnvironment() {
      return defaultContainerEnvironment(Optional.empty());
    }

    /**
     * Setter for egressControlConfig.
     *
     * <p>egressControlConfig: The egress control config for the sandbox template.
     */
    @JsonProperty("egressControlConfig")
    public abstract Builder egressControlConfig(
        SandboxEnvironmentTemplateEgressControlConfig egressControlConfig);

    /**
     * Setter for egressControlConfig builder.
     *
     * <p>egressControlConfig: The egress control config for the sandbox template.
     */
    @CanIgnoreReturnValue
    public Builder egressControlConfig(
        SandboxEnvironmentTemplateEgressControlConfig.Builder egressControlConfigBuilder) {
      return egressControlConfig(egressControlConfigBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder egressControlConfig(
        Optional<SandboxEnvironmentTemplateEgressControlConfig> egressControlConfig);

    /** Clears the value of egressControlConfig field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearEgressControlConfig() {
      return egressControlConfig(Optional.empty());
    }

    /**
     * Setter for waitForCompletion.
     *
     * <p>waitForCompletion: Waits for the operation to complete before returning.
     */
    @JsonProperty("waitForCompletion")
    public abstract Builder waitForCompletion(boolean waitForCompletion);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder waitForCompletion(Optional<Boolean> waitForCompletion);

    /** Clears the value of waitForCompletion field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearWaitForCompletion() {
      return waitForCompletion(Optional.empty());
    }

    public abstract CreateSandboxEnvironmentTemplateConfig build();
  }

  /** Deserializes a JSON string to a CreateSandboxEnvironmentTemplateConfig object. */
  @ExcludeFromGeneratedCoverageReport
  public static CreateSandboxEnvironmentTemplateConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(
        jsonString, CreateSandboxEnvironmentTemplateConfig.class);
  }
}
