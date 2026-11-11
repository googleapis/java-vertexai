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

/** Configuration for a warm pool of sandbox instances. */
@AutoValue
@JsonDeserialize(builder = SandboxEnvironmentTemplateWarmPoolConfig.Builder.class)
public abstract class SandboxEnvironmentTemplateWarmPoolConfig extends JsonSerializable {
  /** Optional. The target number of pre-warmed instances to maintain. */
  @JsonProperty("targetInstanceCount")
  public abstract Optional<Integer> targetInstanceCount();

  /** Optional. The strategy for updating warm pool instances when the template is updated. */
  @JsonProperty("updateStrategy")
  public abstract Optional<UpdateStrategy> updateStrategy();

  /** Instantiates a builder for SandboxEnvironmentTemplateWarmPoolConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_SandboxEnvironmentTemplateWarmPoolConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for SandboxEnvironmentTemplateWarmPoolConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `SandboxEnvironmentTemplateWarmPoolConfig.builder()` for
     * instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_SandboxEnvironmentTemplateWarmPoolConfig.Builder();
    }

    /**
     * Setter for targetInstanceCount.
     *
     * <p>targetInstanceCount: Optional. The target number of pre-warmed instances to maintain.
     */
    @JsonProperty("targetInstanceCount")
    public abstract Builder targetInstanceCount(Integer targetInstanceCount);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder targetInstanceCount(Optional<Integer> targetInstanceCount);

    /** Clears the value of targetInstanceCount field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearTargetInstanceCount() {
      return targetInstanceCount(Optional.empty());
    }

    /**
     * Setter for updateStrategy.
     *
     * <p>updateStrategy: Optional. The strategy for updating warm pool instances when the template
     * is updated.
     */
    @JsonProperty("updateStrategy")
    public abstract Builder updateStrategy(UpdateStrategy updateStrategy);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder updateStrategy(Optional<UpdateStrategy> updateStrategy);

    /** Clears the value of updateStrategy field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearUpdateStrategy() {
      return updateStrategy(Optional.empty());
    }

    /**
     * Setter for updateStrategy given a known enum.
     *
     * <p>updateStrategy: Optional. The strategy for updating warm pool instances when the template
     * is updated.
     */
    @CanIgnoreReturnValue
    public Builder updateStrategy(UpdateStrategy.Known knownType) {
      return updateStrategy(new UpdateStrategy(knownType));
    }

    /**
     * Setter for updateStrategy given a string.
     *
     * <p>updateStrategy: Optional. The strategy for updating warm pool instances when the template
     * is updated.
     */
    @CanIgnoreReturnValue
    public Builder updateStrategy(String updateStrategy) {
      return updateStrategy(new UpdateStrategy(updateStrategy));
    }

    public abstract SandboxEnvironmentTemplateWarmPoolConfig build();
  }

  /** Deserializes a JSON string to a SandboxEnvironmentTemplateWarmPoolConfig object. */
  @ExcludeFromGeneratedCoverageReport
  public static SandboxEnvironmentTemplateWarmPoolConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(
        jsonString, SandboxEnvironmentTemplateWarmPoolConfig.class);
  }
}
