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

/** Configuration for traffic originating from a Reasoning Engine. */
@AutoValue
@JsonDeserialize(
    builder =
        ReasoningEngineSpecDeploymentSpecAgentGatewayConfigAgentToAnywhereConfig.Builder.class)
public abstract class ReasoningEngineSpecDeploymentSpecAgentGatewayConfigAgentToAnywhereConfig
    extends JsonSerializable {
  /**
   * Required. The resource name of the Agent Gateway for outbound traffic. It must be set to a
   * Google-managed gateway whose `governed_access_path` is `AGENT_TO_ANYWHERE`. Format:
   * `projects/{project}/locations/{location}/agentGateways/{agent_gateway}`
   */
  @JsonProperty("agentGateway")
  public abstract Optional<String> agentGateway();

  /**
   * Instantiates a builder for
   * ReasoningEngineSpecDeploymentSpecAgentGatewayConfigAgentToAnywhereConfig.
   */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_ReasoningEngineSpecDeploymentSpecAgentGatewayConfigAgentToAnywhereConfig
        .Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for ReasoningEngineSpecDeploymentSpecAgentGatewayConfigAgentToAnywhereConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use
     * `ReasoningEngineSpecDeploymentSpecAgentGatewayConfigAgentToAnywhereConfig.builder()` for
     * instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_ReasoningEngineSpecDeploymentSpecAgentGatewayConfigAgentToAnywhereConfig
          .Builder();
    }

    /**
     * Setter for agentGateway.
     *
     * <p>agentGateway: Required. The resource name of the Agent Gateway for outbound traffic. It
     * must be set to a Google-managed gateway whose `governed_access_path` is `AGENT_TO_ANYWHERE`.
     * Format: `projects/{project}/locations/{location}/agentGateways/{agent_gateway}`
     */
    @JsonProperty("agentGateway")
    public abstract Builder agentGateway(String agentGateway);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder agentGateway(Optional<String> agentGateway);

    /** Clears the value of agentGateway field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearAgentGateway() {
      return agentGateway(Optional.empty());
    }

    public abstract ReasoningEngineSpecDeploymentSpecAgentGatewayConfigAgentToAnywhereConfig
        build();
  }

  /**
   * Deserializes a JSON string to a
   * ReasoningEngineSpecDeploymentSpecAgentGatewayConfigAgentToAnywhereConfig object.
   */
  @ExcludeFromGeneratedCoverageReport
  public static ReasoningEngineSpecDeploymentSpecAgentGatewayConfigAgentToAnywhereConfig fromJson(
      String jsonString) {
    return JsonSerializable.fromJsonString(
        jsonString, ReasoningEngineSpecDeploymentSpecAgentGatewayConfigAgentToAnywhereConfig.class);
  }
}
