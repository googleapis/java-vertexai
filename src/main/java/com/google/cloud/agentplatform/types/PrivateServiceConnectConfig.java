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

/** Represents configuration for private service connect. */
@AutoValue
@JsonDeserialize(builder = PrivateServiceConnectConfig.Builder.class)
public abstract class PrivateServiceConnectConfig extends JsonSerializable {
  /** Required. If true, expose the IndexEndpoint via private service connect. */
  @JsonProperty("enablePrivateServiceConnect")
  public abstract Optional<Boolean> enablePrivateServiceConnect();

  /**
   * Optional. If set to true, enable secure private service connect with IAM authorization.
   * Otherwise, private service connect will be done without authorization. Note latency will be
   * slightly increased if authorization is enabled.
   */
  @JsonProperty("enableSecurePrivateServiceConnect")
  public abstract Optional<Boolean> enableSecurePrivateServiceConnect();

  /** A list of Projects from which the forwarding rule will target the service attachment. */
  @JsonProperty("projectAllowlist")
  public abstract Optional<List<String>> projectAllowlist();

  /**
   * Optional. List of projects and networks where the PSC endpoints will be created. This field is
   * used by Online Inference(Prediction) only.
   */
  @JsonProperty("pscAutomationConfigs")
  public abstract Optional<List<PSCAutomationConfig>> pscAutomationConfigs();

  /**
   * Output only. The name of the generated service attachment resource. This is only populated if
   * the endpoint is deployed with PrivateServiceConnect.
   */
  @JsonProperty("serviceAttachment")
  public abstract Optional<String> serviceAttachment();

  /** Instantiates a builder for PrivateServiceConnectConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_PrivateServiceConnectConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for PrivateServiceConnectConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `PrivateServiceConnectConfig.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_PrivateServiceConnectConfig.Builder();
    }

    /**
     * Setter for enablePrivateServiceConnect.
     *
     * <p>enablePrivateServiceConnect: Required. If true, expose the IndexEndpoint via private
     * service connect.
     */
    @JsonProperty("enablePrivateServiceConnect")
    public abstract Builder enablePrivateServiceConnect(boolean enablePrivateServiceConnect);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder enablePrivateServiceConnect(Optional<Boolean> enablePrivateServiceConnect);

    /** Clears the value of enablePrivateServiceConnect field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearEnablePrivateServiceConnect() {
      return enablePrivateServiceConnect(Optional.empty());
    }

    /**
     * Setter for enableSecurePrivateServiceConnect.
     *
     * <p>enableSecurePrivateServiceConnect: Optional. If set to true, enable secure private service
     * connect with IAM authorization. Otherwise, private service connect will be done without
     * authorization. Note latency will be slightly increased if authorization is enabled.
     */
    @JsonProperty("enableSecurePrivateServiceConnect")
    public abstract Builder enableSecurePrivateServiceConnect(
        boolean enableSecurePrivateServiceConnect);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder enableSecurePrivateServiceConnect(
        Optional<Boolean> enableSecurePrivateServiceConnect);

    /** Clears the value of enableSecurePrivateServiceConnect field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearEnableSecurePrivateServiceConnect() {
      return enableSecurePrivateServiceConnect(Optional.empty());
    }

    /**
     * Setter for projectAllowlist.
     *
     * <p>projectAllowlist: A list of Projects from which the forwarding rule will target the
     * service attachment.
     */
    @JsonProperty("projectAllowlist")
    public abstract Builder projectAllowlist(List<String> projectAllowlist);

    /**
     * Setter for projectAllowlist.
     *
     * <p>projectAllowlist: A list of Projects from which the forwarding rule will target the
     * service attachment.
     */
    @CanIgnoreReturnValue
    public Builder projectAllowlist(String... projectAllowlist) {
      return projectAllowlist(Arrays.asList(projectAllowlist));
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder projectAllowlist(Optional<List<String>> projectAllowlist);

    /** Clears the value of projectAllowlist field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearProjectAllowlist() {
      return projectAllowlist(Optional.empty());
    }

    /**
     * Setter for pscAutomationConfigs.
     *
     * <p>pscAutomationConfigs: Optional. List of projects and networks where the PSC endpoints will
     * be created. This field is used by Online Inference(Prediction) only.
     */
    @JsonProperty("pscAutomationConfigs")
    public abstract Builder pscAutomationConfigs(List<PSCAutomationConfig> pscAutomationConfigs);

    /**
     * Setter for pscAutomationConfigs.
     *
     * <p>pscAutomationConfigs: Optional. List of projects and networks where the PSC endpoints will
     * be created. This field is used by Online Inference(Prediction) only.
     */
    @CanIgnoreReturnValue
    public Builder pscAutomationConfigs(PSCAutomationConfig... pscAutomationConfigs) {
      return pscAutomationConfigs(Arrays.asList(pscAutomationConfigs));
    }

    /**
     * Setter for pscAutomationConfigs builder.
     *
     * <p>pscAutomationConfigs: Optional. List of projects and networks where the PSC endpoints will
     * be created. This field is used by Online Inference(Prediction) only.
     */
    @CanIgnoreReturnValue
    public Builder pscAutomationConfigs(
        PSCAutomationConfig.Builder... pscAutomationConfigsBuilders) {
      return pscAutomationConfigs(
          Arrays.asList(pscAutomationConfigsBuilders).stream()
              .map(PSCAutomationConfig.Builder::build)
              .collect(toImmutableList()));
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder pscAutomationConfigs(Optional<List<PSCAutomationConfig>> pscAutomationConfigs);

    /** Clears the value of pscAutomationConfigs field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearPscAutomationConfigs() {
      return pscAutomationConfigs(Optional.empty());
    }

    /**
     * Setter for serviceAttachment.
     *
     * <p>serviceAttachment: Output only. The name of the generated service attachment resource.
     * This is only populated if the endpoint is deployed with PrivateServiceConnect.
     */
    @JsonProperty("serviceAttachment")
    public abstract Builder serviceAttachment(String serviceAttachment);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder serviceAttachment(Optional<String> serviceAttachment);

    /** Clears the value of serviceAttachment field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearServiceAttachment() {
      return serviceAttachment(Optional.empty());
    }

    public abstract PrivateServiceConnectConfig build();
  }

  /** Deserializes a JSON string to a PrivateServiceConnectConfig object. */
  @ExcludeFromGeneratedCoverageReport
  public static PrivateServiceConnectConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, PrivateServiceConnectConfig.class);
  }
}
