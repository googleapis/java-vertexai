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

/** Configuration for egress control of sandbox instances. */
@AutoValue
@JsonDeserialize(builder = SandboxEnvironmentTemplateEgressControlConfig.Builder.class)
public abstract class SandboxEnvironmentTemplateEgressControlConfig extends JsonSerializable {
  /** Optional. Whether to allow internet access. */
  @JsonProperty("internetAccess")
  public abstract Optional<Boolean> internetAccess();

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
    abstract Builder internetAccess(Optional<Boolean> internetAccess);

    /** Clears the value of internetAccess field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearInternetAccess() {
      return internetAccess(Optional.empty());
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
