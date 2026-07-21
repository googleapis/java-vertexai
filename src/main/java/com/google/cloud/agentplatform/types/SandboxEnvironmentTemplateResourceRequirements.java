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
import java.util.Map;
import java.util.Optional;

/**
 * Message to define resource requests and limits (mirroring Kubernetes) for each sandbox instance
 * created from this template.
 */
@AutoValue
@JsonDeserialize(builder = SandboxEnvironmentTemplateResourceRequirements.Builder.class)
public abstract class SandboxEnvironmentTemplateResourceRequirements extends JsonSerializable {
  /**
   * Optional. The maximum amounts of compute resources allowed. Keys are resource names (e.g.,
   * "cpu", "memory"). Values are quantities (e.g., "500m", "1Gi").
   */
  @JsonProperty("limits")
  public abstract Optional<Map<String, String>> limits();

  /**
   * Optional. The requested amounts of compute resources. Keys are resource names (e.g., "cpu",
   * "memory"). Values are quantities (e.g., "250m", "512Mi").
   */
  @JsonProperty("requests")
  public abstract Optional<Map<String, String>> requests();

  /** Instantiates a builder for SandboxEnvironmentTemplateResourceRequirements. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_SandboxEnvironmentTemplateResourceRequirements.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for SandboxEnvironmentTemplateResourceRequirements. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `SandboxEnvironmentTemplateResourceRequirements.builder()` for
     * instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_SandboxEnvironmentTemplateResourceRequirements.Builder();
    }

    /**
     * Setter for limits.
     *
     * <p>limits: Optional. The maximum amounts of compute resources allowed. Keys are resource
     * names (e.g., "cpu", "memory"). Values are quantities (e.g., "500m", "1Gi").
     */
    @JsonProperty("limits")
    public abstract Builder limits(Map<String, String> limits);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder limits(Optional<Map<String, String>> limits);

    /** Clears the value of limits field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearLimits() {
      return limits(Optional.empty());
    }

    /**
     * Setter for requests.
     *
     * <p>requests: Optional. The requested amounts of compute resources. Keys are resource names
     * (e.g., "cpu", "memory"). Values are quantities (e.g., "250m", "512Mi").
     */
    @JsonProperty("requests")
    public abstract Builder requests(Map<String, String> requests);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder requests(Optional<Map<String, String>> requests);

    /** Clears the value of requests field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearRequests() {
      return requests(Optional.empty());
    }

    public abstract SandboxEnvironmentTemplateResourceRequirements build();
  }

  /** Deserializes a JSON string to a SandboxEnvironmentTemplateResourceRequirements object. */
  @ExcludeFromGeneratedCoverageReport
  public static SandboxEnvironmentTemplateResourceRequirements fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(
        jsonString, SandboxEnvironmentTemplateResourceRequirements.class);
  }
}
