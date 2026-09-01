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
import java.time.Instant;
import java.util.Optional;

/** A sandbox environment template. */
@AutoValue
@JsonDeserialize(builder = SandboxEnvironmentTemplate.Builder.class)
public abstract class SandboxEnvironmentTemplate extends JsonSerializable {
  /** Output only. The timestamp when this SandboxEnvironmentTemplate was created. */
  @JsonProperty("createTime")
  public abstract Optional<Instant> createTime();

  /** The sandbox environment for custom container workloads. */
  @JsonProperty("customContainerEnvironment")
  public abstract Optional<SandboxEnvironmentTemplateCustomContainerEnvironment>
      customContainerEnvironment();

  /** The sandbox environment for default container workloads. */
  @JsonProperty("defaultContainerEnvironment")
  public abstract Optional<SandboxEnvironmentTemplateDefaultContainerEnvironment>
      defaultContainerEnvironment();

  /** Required. The display name of the SandboxEnvironmentTemplate. */
  @JsonProperty("displayName")
  public abstract Optional<String> displayName();

  /** Optional. The configuration for egress control of this template. */
  @JsonProperty("egressControlConfig")
  public abstract Optional<SandboxEnvironmentTemplateEgressControlConfig> egressControlConfig();

  /**
   * Identifier. The resource name of the SandboxEnvironmentTemplate. Format:
   * `projects/{project}/locations/{location}/reasoningEngines/{reasoning_engine}/sandboxEnvironmentTemplates/{sandbox_environment_template}`
   */
  @JsonProperty("name")
  public abstract Optional<String> name();

  /** Output only. The state of the sandbox environment template. */
  @JsonProperty("state")
  public abstract Optional<SandboxEnvironmentTemplateState> state();

  /** Output only. The timestamp when this SandboxEnvironmentTemplate was most recently updated. */
  @JsonProperty("updateTime")
  public abstract Optional<Instant> updateTime();

  /**
   * Optional. The configuration for private ingress (PSC-E) of this template. When set, the sandbox
   * router is exposed privately via a PSC service attachment so VPC-SC customers can connect from
   * their VPC over a private endpoint instead of the public internet. The resulting service
   * attachment is surfaced on `SandboxEnvironment.connection_info.service_attachment`. Only the
   * PSC-E (service-attachment/ingress) portion of `PrivateServiceConnectConfig` applies here:
   * `enable_private_service_connect` and `project_allowlist` (the consumer projects allowed to
   * connect). The nested `psc_interface_config` (PSC-I / egress) is not used for sandbox ingress;
   * sandbox egress is configured via `egress_control_config` instead.
   */
  @JsonProperty("ingressControlConfig")
  public abstract Optional<PrivateServiceConnectConfig> ingressControlConfig();

  /** Instantiates a builder for SandboxEnvironmentTemplate. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_SandboxEnvironmentTemplate.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for SandboxEnvironmentTemplate. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `SandboxEnvironmentTemplate.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_SandboxEnvironmentTemplate.Builder();
    }

    /**
     * Setter for createTime.
     *
     * <p>createTime: Output only. The timestamp when this SandboxEnvironmentTemplate was created.
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
     * Setter for customContainerEnvironment.
     *
     * <p>customContainerEnvironment: The sandbox environment for custom container workloads.
     */
    @JsonProperty("customContainerEnvironment")
    public abstract Builder customContainerEnvironment(
        SandboxEnvironmentTemplateCustomContainerEnvironment customContainerEnvironment);

    /**
     * Setter for customContainerEnvironment builder.
     *
     * <p>customContainerEnvironment: The sandbox environment for custom container workloads.
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
     * <p>defaultContainerEnvironment: The sandbox environment for default container workloads.
     */
    @JsonProperty("defaultContainerEnvironment")
    public abstract Builder defaultContainerEnvironment(
        SandboxEnvironmentTemplateDefaultContainerEnvironment defaultContainerEnvironment);

    /**
     * Setter for defaultContainerEnvironment builder.
     *
     * <p>defaultContainerEnvironment: The sandbox environment for default container workloads.
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
     * Setter for displayName.
     *
     * <p>displayName: Required. The display name of the SandboxEnvironmentTemplate.
     */
    @JsonProperty("displayName")
    public abstract Builder displayName(String displayName);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder displayName(Optional<String> displayName);

    /** Clears the value of displayName field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearDisplayName() {
      return displayName(Optional.empty());
    }

    /**
     * Setter for egressControlConfig.
     *
     * <p>egressControlConfig: Optional. The configuration for egress control of this template.
     */
    @JsonProperty("egressControlConfig")
    public abstract Builder egressControlConfig(
        SandboxEnvironmentTemplateEgressControlConfig egressControlConfig);

    /**
     * Setter for egressControlConfig builder.
     *
     * <p>egressControlConfig: Optional. The configuration for egress control of this template.
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
     * Setter for name.
     *
     * <p>name: Identifier. The resource name of the SandboxEnvironmentTemplate. Format:
     * `projects/{project}/locations/{location}/reasoningEngines/{reasoning_engine}/sandboxEnvironmentTemplates/{sandbox_environment_template}`
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
     * Setter for state.
     *
     * <p>state: Output only. The state of the sandbox environment template.
     */
    @JsonProperty("state")
    public abstract Builder state(SandboxEnvironmentTemplateState state);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder state(Optional<SandboxEnvironmentTemplateState> state);

    /** Clears the value of state field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearState() {
      return state(Optional.empty());
    }

    /**
     * Setter for state given a known enum.
     *
     * <p>state: Output only. The state of the sandbox environment template.
     */
    @CanIgnoreReturnValue
    public Builder state(SandboxEnvironmentTemplateState.Known knownType) {
      return state(new SandboxEnvironmentTemplateState(knownType));
    }

    /**
     * Setter for state given a string.
     *
     * <p>state: Output only. The state of the sandbox environment template.
     */
    @CanIgnoreReturnValue
    public Builder state(String state) {
      return state(new SandboxEnvironmentTemplateState(state));
    }

    /**
     * Setter for updateTime.
     *
     * <p>updateTime: Output only. The timestamp when this SandboxEnvironmentTemplate was most
     * recently updated.
     */
    @JsonProperty("updateTime")
    public abstract Builder updateTime(Instant updateTime);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder updateTime(Optional<Instant> updateTime);

    /** Clears the value of updateTime field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearUpdateTime() {
      return updateTime(Optional.empty());
    }

    /**
     * Setter for ingressControlConfig.
     *
     * <p>ingressControlConfig: Optional. The configuration for private ingress (PSC-E) of this
     * template. When set, the sandbox router is exposed privately via a PSC service attachment so
     * VPC-SC customers can connect from their VPC over a private endpoint instead of the public
     * internet. The resulting service attachment is surfaced on
     * `SandboxEnvironment.connection_info.service_attachment`. Only the PSC-E
     * (service-attachment/ingress) portion of `PrivateServiceConnectConfig` applies here:
     * `enable_private_service_connect` and `project_allowlist` (the consumer projects allowed to
     * connect). The nested `psc_interface_config` (PSC-I / egress) is not used for sandbox ingress;
     * sandbox egress is configured via `egress_control_config` instead.
     */
    @JsonProperty("ingressControlConfig")
    public abstract Builder ingressControlConfig(PrivateServiceConnectConfig ingressControlConfig);

    /**
     * Setter for ingressControlConfig builder.
     *
     * <p>ingressControlConfig: Optional. The configuration for private ingress (PSC-E) of this
     * template. When set, the sandbox router is exposed privately via a PSC service attachment so
     * VPC-SC customers can connect from their VPC over a private endpoint instead of the public
     * internet. The resulting service attachment is surfaced on
     * `SandboxEnvironment.connection_info.service_attachment`. Only the PSC-E
     * (service-attachment/ingress) portion of `PrivateServiceConnectConfig` applies here:
     * `enable_private_service_connect` and `project_allowlist` (the consumer projects allowed to
     * connect). The nested `psc_interface_config` (PSC-I / egress) is not used for sandbox ingress;
     * sandbox egress is configured via `egress_control_config` instead.
     */
    @CanIgnoreReturnValue
    public Builder ingressControlConfig(
        PrivateServiceConnectConfig.Builder ingressControlConfigBuilder) {
      return ingressControlConfig(ingressControlConfigBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder ingressControlConfig(
        Optional<PrivateServiceConnectConfig> ingressControlConfig);

    /** Clears the value of ingressControlConfig field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearIngressControlConfig() {
      return ingressControlConfig(Optional.empty());
    }

    public abstract SandboxEnvironmentTemplate build();
  }

  /** Deserializes a JSON string to a SandboxEnvironmentTemplate object. */
  @ExcludeFromGeneratedCoverageReport
  public static SandboxEnvironmentTemplate fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, SandboxEnvironmentTemplate.class);
  }
}
