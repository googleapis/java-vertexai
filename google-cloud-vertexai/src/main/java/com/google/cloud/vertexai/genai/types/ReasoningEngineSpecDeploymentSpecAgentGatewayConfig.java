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
import java.util.Optional;

/** Agent Gateway configuration for a Reasoning Engine deployment. */
@AutoValue
@JsonDeserialize(builder = ReasoningEngineSpecDeploymentSpecAgentGatewayConfig.Builder.class)
public abstract class ReasoningEngineSpecDeploymentSpecAgentGatewayConfig extends JsonSerializable {
  /**
   * Optional. Configuration for traffic originating from the Reasoning Engine. When unset, outgoing
   * traffic is not routed through an Agent Gateway.
   */
  @JsonProperty("agentToAnywhereConfig")
  public abstract Optional<ReasoningEngineSpecDeploymentSpecAgentGatewayConfigAgentToAnywhereConfig>
      agentToAnywhereConfig();

  /**
   * Optional. Configuration for traffic targeting the Reasoning Engine. When unset, incoming
   * traffic is not routed through an Agent Gateway.
   */
  @JsonProperty("clientToAgentConfig")
  public abstract Optional<ReasoningEngineSpecDeploymentSpecAgentGatewayConfigClientToAgentConfig>
      clientToAgentConfig();

  /** Instantiates a builder for ReasoningEngineSpecDeploymentSpecAgentGatewayConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_ReasoningEngineSpecDeploymentSpecAgentGatewayConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for ReasoningEngineSpecDeploymentSpecAgentGatewayConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use
     * `ReasoningEngineSpecDeploymentSpecAgentGatewayConfig.builder()` for instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_ReasoningEngineSpecDeploymentSpecAgentGatewayConfig.Builder();
    }

    /**
     * Setter for agentToAnywhereConfig.
     *
     * <p>agentToAnywhereConfig: Optional. Configuration for traffic originating from the Reasoning
     * Engine. When unset, outgoing traffic is not routed through an Agent Gateway.
     */
    @JsonProperty("agentToAnywhereConfig")
    public abstract Builder agentToAnywhereConfig(
        ReasoningEngineSpecDeploymentSpecAgentGatewayConfigAgentToAnywhereConfig
            agentToAnywhereConfig);

    /**
     * Setter for agentToAnywhereConfig builder.
     *
     * <p>agentToAnywhereConfig: Optional. Configuration for traffic originating from the Reasoning
     * Engine. When unset, outgoing traffic is not routed through an Agent Gateway.
     */
    @CanIgnoreReturnValue
    public Builder agentToAnywhereConfig(
        ReasoningEngineSpecDeploymentSpecAgentGatewayConfigAgentToAnywhereConfig.Builder
            agentToAnywhereConfigBuilder) {
      return agentToAnywhereConfig(agentToAnywhereConfigBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder agentToAnywhereConfig(
        Optional<ReasoningEngineSpecDeploymentSpecAgentGatewayConfigAgentToAnywhereConfig>
            agentToAnywhereConfig);

    /** Clears the value of agentToAnywhereConfig field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearAgentToAnywhereConfig() {
      return agentToAnywhereConfig(Optional.empty());
    }

    /**
     * Setter for clientToAgentConfig.
     *
     * <p>clientToAgentConfig: Optional. Configuration for traffic targeting the Reasoning Engine.
     * When unset, incoming traffic is not routed through an Agent Gateway.
     */
    @JsonProperty("clientToAgentConfig")
    public abstract Builder clientToAgentConfig(
        ReasoningEngineSpecDeploymentSpecAgentGatewayConfigClientToAgentConfig clientToAgentConfig);

    /**
     * Setter for clientToAgentConfig builder.
     *
     * <p>clientToAgentConfig: Optional. Configuration for traffic targeting the Reasoning Engine.
     * When unset, incoming traffic is not routed through an Agent Gateway.
     */
    @CanIgnoreReturnValue
    public Builder clientToAgentConfig(
        ReasoningEngineSpecDeploymentSpecAgentGatewayConfigClientToAgentConfig.Builder
            clientToAgentConfigBuilder) {
      return clientToAgentConfig(clientToAgentConfigBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder clientToAgentConfig(
        Optional<ReasoningEngineSpecDeploymentSpecAgentGatewayConfigClientToAgentConfig>
            clientToAgentConfig);

    /** Clears the value of clientToAgentConfig field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearClientToAgentConfig() {
      return clientToAgentConfig(Optional.empty());
    }

    public abstract ReasoningEngineSpecDeploymentSpecAgentGatewayConfig build();
  }

  /** Deserializes a JSON string to a ReasoningEngineSpecDeploymentSpecAgentGatewayConfig object. */
  @ExcludeFromGeneratedCoverageReport
  public static ReasoningEngineSpecDeploymentSpecAgentGatewayConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(
        jsonString, ReasoningEngineSpecDeploymentSpecAgentGatewayConfig.class);
  }
}
