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

/** The customized sandbox runtime environment for BYOC. */
@AutoValue
@JsonDeserialize(builder = SandboxEnvironmentTemplateCustomContainerEnvironment.Builder.class)
public abstract class SandboxEnvironmentTemplateCustomContainerEnvironment
    extends JsonSerializable {
  /** The specification of the custom container environment. */
  @JsonProperty("customContainerSpec")
  public abstract Optional<SandboxEnvironmentTemplateCustomContainerSpec> customContainerSpec();

  /** Ports to expose from the container. */
  @JsonProperty("ports")
  public abstract Optional<List<SandboxEnvironmentTemplateNetworkPort>> ports();

  /** Resource requests and limits for the container. */
  @JsonProperty("resources")
  public abstract Optional<SandboxEnvironmentTemplateResourceRequirements> resources();

  /** Instantiates a builder for SandboxEnvironmentTemplateCustomContainerEnvironment. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_SandboxEnvironmentTemplateCustomContainerEnvironment.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for SandboxEnvironmentTemplateCustomContainerEnvironment. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use
     * `SandboxEnvironmentTemplateCustomContainerEnvironment.builder()` for instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_SandboxEnvironmentTemplateCustomContainerEnvironment.Builder();
    }

    /**
     * Setter for customContainerSpec.
     *
     * <p>customContainerSpec: The specification of the custom container environment.
     */
    @JsonProperty("customContainerSpec")
    public abstract Builder customContainerSpec(
        SandboxEnvironmentTemplateCustomContainerSpec customContainerSpec);

    /**
     * Setter for customContainerSpec builder.
     *
     * <p>customContainerSpec: The specification of the custom container environment.
     */
    @CanIgnoreReturnValue
    public Builder customContainerSpec(
        SandboxEnvironmentTemplateCustomContainerSpec.Builder customContainerSpecBuilder) {
      return customContainerSpec(customContainerSpecBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder customContainerSpec(
        Optional<SandboxEnvironmentTemplateCustomContainerSpec> customContainerSpec);

    /** Clears the value of customContainerSpec field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearCustomContainerSpec() {
      return customContainerSpec(Optional.empty());
    }

    /**
     * Setter for ports.
     *
     * <p>ports: Ports to expose from the container.
     */
    @JsonProperty("ports")
    public abstract Builder ports(List<SandboxEnvironmentTemplateNetworkPort> ports);

    /**
     * Setter for ports.
     *
     * <p>ports: Ports to expose from the container.
     */
    @CanIgnoreReturnValue
    public Builder ports(SandboxEnvironmentTemplateNetworkPort... ports) {
      return ports(Arrays.asList(ports));
    }

    /**
     * Setter for ports builder.
     *
     * <p>ports: Ports to expose from the container.
     */
    @CanIgnoreReturnValue
    public Builder ports(SandboxEnvironmentTemplateNetworkPort.Builder... portsBuilders) {
      return ports(
          Arrays.asList(portsBuilders).stream()
              .map(SandboxEnvironmentTemplateNetworkPort.Builder::build)
              .collect(toImmutableList()));
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder ports(Optional<List<SandboxEnvironmentTemplateNetworkPort>> ports);

    /** Clears the value of ports field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearPorts() {
      return ports(Optional.empty());
    }

    /**
     * Setter for resources.
     *
     * <p>resources: Resource requests and limits for the container.
     */
    @JsonProperty("resources")
    public abstract Builder resources(SandboxEnvironmentTemplateResourceRequirements resources);

    /**
     * Setter for resources builder.
     *
     * <p>resources: Resource requests and limits for the container.
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

    public abstract SandboxEnvironmentTemplateCustomContainerEnvironment build();
  }

  /**
   * Deserializes a JSON string to a SandboxEnvironmentTemplateCustomContainerEnvironment object.
   */
  @ExcludeFromGeneratedCoverageReport
  public static SandboxEnvironmentTemplateCustomContainerEnvironment fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(
        jsonString, SandboxEnvironmentTemplateCustomContainerEnvironment.class);
  }
}
