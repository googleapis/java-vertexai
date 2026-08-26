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

/** A memory bank. */
@AutoValue
@JsonDeserialize(builder = MemoryBank.Builder.class)
public abstract class MemoryBank extends JsonSerializable {
  /**
   * Required. Represents the ID of the schema. Must be 1-63 characters, start with a lowercase
   * letter, and consist of lowercase letters, numbers, and hyphens.
   */
  @JsonProperty("name")
  public abstract Optional<String> name();

  /**
   * Represents the configuration for managed memories in Memory Bank. If not set, then the default
   * configuration will be used.
   */
  @JsonProperty("managedSemanticMemoryConfig")
  public abstract Optional<ManagedSemanticMemoryConfig> managedSemanticMemoryConfig();

  /** Represents the display name of the Memory Bank. */
  @JsonProperty("displayName")
  public abstract Optional<String> displayName();

  /** Represents the description of the Memory Bank. */
  @JsonProperty("description")
  public abstract Optional<String> description();

  /** Timestamp when this Memory Bank was created. */
  @JsonProperty("createTime")
  public abstract Optional<Instant> createTime();

  /** Timestamp when this Memory Bank was most recently updated. */
  @JsonProperty("updateTime")
  public abstract Optional<Instant> updateTime();

  /**
   * Customer-managed encryption key spec for a Memory Bank. If set, this Memory Bank and all
   * sub-resources of this Memory Bank will be secured by this key.
   */
  @JsonProperty("encryptionSpec")
  public abstract Optional<EncryptionSpec> encryptionSpec();

  /** Instantiates a builder for MemoryBank. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_MemoryBank.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for MemoryBank. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `MemoryBank.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_MemoryBank.Builder();
    }

    /**
     * Setter for name.
     *
     * <p>name: Required. Represents the ID of the schema. Must be 1-63 characters, start with a
     * lowercase letter, and consist of lowercase letters, numbers, and hyphens.
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
     * Setter for managedSemanticMemoryConfig.
     *
     * <p>managedSemanticMemoryConfig: Represents the configuration for managed memories in Memory
     * Bank. If not set, then the default configuration will be used.
     */
    @JsonProperty("managedSemanticMemoryConfig")
    public abstract Builder managedSemanticMemoryConfig(
        ManagedSemanticMemoryConfig managedSemanticMemoryConfig);

    /**
     * Setter for managedSemanticMemoryConfig builder.
     *
     * <p>managedSemanticMemoryConfig: Represents the configuration for managed memories in Memory
     * Bank. If not set, then the default configuration will be used.
     */
    @CanIgnoreReturnValue
    public Builder managedSemanticMemoryConfig(
        ManagedSemanticMemoryConfig.Builder managedSemanticMemoryConfigBuilder) {
      return managedSemanticMemoryConfig(managedSemanticMemoryConfigBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder managedSemanticMemoryConfig(
        Optional<ManagedSemanticMemoryConfig> managedSemanticMemoryConfig);

    /** Clears the value of managedSemanticMemoryConfig field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearManagedSemanticMemoryConfig() {
      return managedSemanticMemoryConfig(Optional.empty());
    }

    /**
     * Setter for displayName.
     *
     * <p>displayName: Represents the display name of the Memory Bank.
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
     * Setter for description.
     *
     * <p>description: Represents the description of the Memory Bank.
     */
    @JsonProperty("description")
    public abstract Builder description(String description);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder description(Optional<String> description);

    /** Clears the value of description field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearDescription() {
      return description(Optional.empty());
    }

    /**
     * Setter for createTime.
     *
     * <p>createTime: Timestamp when this Memory Bank was created.
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
     * Setter for updateTime.
     *
     * <p>updateTime: Timestamp when this Memory Bank was most recently updated.
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
     * Setter for encryptionSpec.
     *
     * <p>encryptionSpec: Customer-managed encryption key spec for a Memory Bank. If set, this
     * Memory Bank and all sub-resources of this Memory Bank will be secured by this key.
     */
    @JsonProperty("encryptionSpec")
    public abstract Builder encryptionSpec(EncryptionSpec encryptionSpec);

    /**
     * Setter for encryptionSpec builder.
     *
     * <p>encryptionSpec: Customer-managed encryption key spec for a Memory Bank. If set, this
     * Memory Bank and all sub-resources of this Memory Bank will be secured by this key.
     */
    @CanIgnoreReturnValue
    public Builder encryptionSpec(EncryptionSpec.Builder encryptionSpecBuilder) {
      return encryptionSpec(encryptionSpecBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder encryptionSpec(Optional<EncryptionSpec> encryptionSpec);

    /** Clears the value of encryptionSpec field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearEncryptionSpec() {
      return encryptionSpec(Optional.empty());
    }

    public abstract MemoryBank build();
  }

  /** Deserializes a JSON string to a MemoryBank object. */
  @ExcludeFromGeneratedCoverageReport
  public static MemoryBank fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, MemoryBank.class);
  }
}
