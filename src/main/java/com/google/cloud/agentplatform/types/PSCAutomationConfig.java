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

/** PSC config that is used to automatically create PSC endpoints in the user projects. */
@AutoValue
@JsonDeserialize(builder = PSCAutomationConfig.Builder.class)
public abstract class PSCAutomationConfig extends JsonSerializable {
  /** Output only. Error message if the PSC service automation failed. */
  @JsonProperty("errorMessage")
  public abstract Optional<String> errorMessage();

  /** Output only. Forwarding rule created by the PSC service automation. */
  @JsonProperty("forwardingRule")
  public abstract Optional<String> forwardingRule();

  /** Output only. IP address rule created by the PSC service automation. */
  @JsonProperty("ipAddress")
  public abstract Optional<String> ipAddress();

  /**
   * Required. The full name of the Google Compute Engine
   * [network](https://cloud.google.com/compute/docs/networks-and-firewalls#networks).
   * [Format](https://cloud.google.com/compute/docs/reference/rest/v1/networks/get):
   * `projects/{project}/global/networks/{network}`.
   */
  @JsonProperty("network")
  public abstract Optional<String> network();

  /** Required. Project id used to create forwarding rule. */
  @JsonProperty("projectId")
  public abstract Optional<String> projectId();

  /** Output only. The state of the PSC service automation. */
  @JsonProperty("state")
  public abstract Optional<PscAutomationState> state();

  /** Instantiates a builder for PSCAutomationConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_PSCAutomationConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for PSCAutomationConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `PSCAutomationConfig.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_PSCAutomationConfig.Builder();
    }

    /**
     * Setter for errorMessage.
     *
     * <p>errorMessage: Output only. Error message if the PSC service automation failed.
     */
    @JsonProperty("errorMessage")
    public abstract Builder errorMessage(String errorMessage);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder errorMessage(Optional<String> errorMessage);

    /** Clears the value of errorMessage field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearErrorMessage() {
      return errorMessage(Optional.empty());
    }

    /**
     * Setter for forwardingRule.
     *
     * <p>forwardingRule: Output only. Forwarding rule created by the PSC service automation.
     */
    @JsonProperty("forwardingRule")
    public abstract Builder forwardingRule(String forwardingRule);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder forwardingRule(Optional<String> forwardingRule);

    /** Clears the value of forwardingRule field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearForwardingRule() {
      return forwardingRule(Optional.empty());
    }

    /**
     * Setter for ipAddress.
     *
     * <p>ipAddress: Output only. IP address rule created by the PSC service automation.
     */
    @JsonProperty("ipAddress")
    public abstract Builder ipAddress(String ipAddress);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder ipAddress(Optional<String> ipAddress);

    /** Clears the value of ipAddress field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearIpAddress() {
      return ipAddress(Optional.empty());
    }

    /**
     * Setter for network.
     *
     * <p>network: Required. The full name of the Google Compute Engine
     * [network](https://cloud.google.com/compute/docs/networks-and-firewalls#networks).
     * [Format](https://cloud.google.com/compute/docs/reference/rest/v1/networks/get):
     * `projects/{project}/global/networks/{network}`.
     */
    @JsonProperty("network")
    public abstract Builder network(String network);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder network(Optional<String> network);

    /** Clears the value of network field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearNetwork() {
      return network(Optional.empty());
    }

    /**
     * Setter for projectId.
     *
     * <p>projectId: Required. Project id used to create forwarding rule.
     */
    @JsonProperty("projectId")
    public abstract Builder projectId(String projectId);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder projectId(Optional<String> projectId);

    /** Clears the value of projectId field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearProjectId() {
      return projectId(Optional.empty());
    }

    /**
     * Setter for state.
     *
     * <p>state: Output only. The state of the PSC service automation.
     */
    @JsonProperty("state")
    public abstract Builder state(PscAutomationState state);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder state(Optional<PscAutomationState> state);

    /** Clears the value of state field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearState() {
      return state(Optional.empty());
    }

    /**
     * Setter for state given a known enum.
     *
     * <p>state: Output only. The state of the PSC service automation.
     */
    @CanIgnoreReturnValue
    public Builder state(PscAutomationState.Known knownType) {
      return state(new PscAutomationState(knownType));
    }

    /**
     * Setter for state given a string.
     *
     * <p>state: Output only. The state of the PSC service automation.
     */
    @CanIgnoreReturnValue
    public Builder state(String state) {
      return state(new PscAutomationState(state));
    }

    public abstract PSCAutomationConfig build();
  }

  /** Deserializes a JSON string to a PSCAutomationConfig object. */
  @ExcludeFromGeneratedCoverageReport
  public static PSCAutomationConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, PSCAutomationConfig.class);
  }
}
