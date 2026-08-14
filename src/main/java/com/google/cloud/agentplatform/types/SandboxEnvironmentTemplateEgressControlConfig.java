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

/** Configuration for egress control of sandbox instances. */
@AutoValue
@JsonDeserialize(builder = SandboxEnvironmentTemplateEgressControlConfig.Builder.class)
public abstract class SandboxEnvironmentTemplateEgressControlConfig extends JsonSerializable {
  /** Optional. Whether to allow internet access. */
  @JsonProperty("internetAccess")
  public abstract Optional<Boolean> internetAccess();

  /** Optional. The customer VPC network that sandbox egress is routed into. */
  @JsonProperty("customerVpcNetwork")
  public abstract Optional<String> customerVpcNetwork();

  /**
   * Optional. DNS peering configurations that allow sandbox egress to resolve customer-internal
   * domains via the customer VPC.
   */
  @JsonProperty("dnsPeeringConfigs")
  public abstract Optional<List<SandboxEnvironmentTemplateEgressControlConfigDnsPeeringConfig>>
      dnsPeeringConfigs();

  /**
   * Optional. The name of the customer VPC NetworkAttachment used to draw a PSC interface IP into
   * the customer VPC for sandbox egress.
   */
  @JsonProperty("networkAttachment")
  public abstract Optional<String> networkAttachment();

  /** Instantiates a builder for SandboxEnvironmentTemplateEgressControlConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_SandboxEnvironmentTemplateEgressControlConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for SandboxEnvironmentTemplateEgressControlConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `SandboxEnvironmentTemplateEgressControlConfig.builder()` for
     * instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_SandboxEnvironmentTemplateEgressControlConfig.Builder();
    }

    /**
     * Setter for internetAccess.
     *
     * <p>internetAccess: Optional. Whether to allow internet access.
     */
    @JsonProperty("internetAccess")
    public abstract Builder internetAccess(boolean internetAccess);

    @ExcludeFromGeneratedCoverageReport
    abstract Optional<Boolean> internetAccess();

    @ExcludeFromGeneratedCoverageReport
    abstract Builder internetAccess(Optional<Boolean> internetAccess);

    /** Clears the value of internetAccess field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearInternetAccess() {
      return internetAccess(Optional.empty());
    }

    /**
     * Setter for customerVpcNetwork.
     *
     * <p>customerVpcNetwork: Optional. The customer VPC network that sandbox egress is routed into.
     */
    @JsonProperty("customerVpcNetwork")
    public abstract Builder customerVpcNetwork(String customerVpcNetwork);

    @ExcludeFromGeneratedCoverageReport
    abstract Optional<String> customerVpcNetwork();

    @ExcludeFromGeneratedCoverageReport
    abstract Builder customerVpcNetwork(Optional<String> customerVpcNetwork);

    /** Clears the value of customerVpcNetwork field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearCustomerVpcNetwork() {
      return customerVpcNetwork(Optional.empty());
    }

    /**
     * Setter for dnsPeeringConfigs.
     *
     * <p>dnsPeeringConfigs: Optional. DNS peering configurations that allow sandbox egress to
     * resolve customer-internal domains via the customer VPC.
     */
    @JsonProperty("dnsPeeringConfigs")
    @CanIgnoreReturnValue
    public Builder dnsPeeringConfigs(
        List<SandboxEnvironmentTemplateEgressControlConfigDnsPeeringConfig> dnsPeeringConfigs) {
      if (dnsPeeringConfigs().isPresent()) {
        List<SandboxEnvironmentTemplateEgressControlConfigDnsPeeringConfig> list =
            new java.util.ArrayList<>(dnsPeeringConfigs().get());
        list.addAll(dnsPeeringConfigs);
        return dnsPeeringConfigs(java.util.Optional.of(list));
      }
      return dnsPeeringConfigs(java.util.Optional.of(dnsPeeringConfigs));
    }

    /**
     * Setter for dnsPeeringConfigs.
     *
     * <p>dnsPeeringConfigs: Optional. DNS peering configurations that allow sandbox egress to
     * resolve customer-internal domains via the customer VPC.
     */
    @CanIgnoreReturnValue
    public Builder dnsPeeringConfigs(
        SandboxEnvironmentTemplateEgressControlConfigDnsPeeringConfig... dnsPeeringConfigs) {
      return dnsPeeringConfigs(Arrays.asList(dnsPeeringConfigs));
    }

    /**
     * Setter for dnsPeeringConfigs builder.
     *
     * <p>dnsPeeringConfigs: Optional. DNS peering configurations that allow sandbox egress to
     * resolve customer-internal domains via the customer VPC.
     */
    @CanIgnoreReturnValue
    public Builder dnsPeeringConfigs(
        SandboxEnvironmentTemplateEgressControlConfigDnsPeeringConfig.Builder...
            dnsPeeringConfigsBuilders) {
      return dnsPeeringConfigs(
          Arrays.asList(dnsPeeringConfigsBuilders).stream()
              .map(SandboxEnvironmentTemplateEgressControlConfigDnsPeeringConfig.Builder::build)
              .collect(toImmutableList()));
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Optional<List<SandboxEnvironmentTemplateEgressControlConfigDnsPeeringConfig>>
        dnsPeeringConfigs();

    @ExcludeFromGeneratedCoverageReport
    abstract Builder dnsPeeringConfigs(
        Optional<List<SandboxEnvironmentTemplateEgressControlConfigDnsPeeringConfig>>
            dnsPeeringConfigs);

    /** Clears the value of dnsPeeringConfigs field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearDnsPeeringConfigs() {
      return dnsPeeringConfigs(Optional.empty());
    }

    /**
     * Setter for networkAttachment.
     *
     * <p>networkAttachment: Optional. The name of the customer VPC NetworkAttachment used to draw a
     * PSC interface IP into the customer VPC for sandbox egress.
     */
    @JsonProperty("networkAttachment")
    public abstract Builder networkAttachment(String networkAttachment);

    @ExcludeFromGeneratedCoverageReport
    abstract Optional<String> networkAttachment();

    @ExcludeFromGeneratedCoverageReport
    abstract Builder networkAttachment(Optional<String> networkAttachment);

    /** Clears the value of networkAttachment field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearNetworkAttachment() {
      return networkAttachment(Optional.empty());
    }

    public abstract SandboxEnvironmentTemplateEgressControlConfig build();
  }

  /** Deserializes a JSON string to a SandboxEnvironmentTemplateEgressControlConfig object. */
  @ExcludeFromGeneratedCoverageReport
  public static SandboxEnvironmentTemplateEgressControlConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(
        jsonString, SandboxEnvironmentTemplateEgressControlConfig.class);
  }
}
