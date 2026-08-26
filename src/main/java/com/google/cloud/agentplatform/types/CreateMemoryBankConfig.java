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
import com.google.genai.types.EncryptionSpec;
import com.google.genai.types.HttpOptions;
import java.util.Optional;

/** Config for create memory bank. */
@AutoValue
@JsonDeserialize(builder = CreateMemoryBankConfig.Builder.class)
public abstract class CreateMemoryBankConfig extends JsonSerializable {
  /** Used to override HTTP request options. */
  @JsonProperty("httpOptions")
  public abstract Optional<HttpOptions> httpOptions();

  /**
   * The user-defined name of the Memory Bank.
   *
   * <p>The display name can be up to 128 characters long and can comprise any UTF-8 characters.
   */
  @JsonProperty("displayName")
  public abstract Optional<String> displayName();

  /** The description of the Memory Bank. */
  @JsonProperty("description")
  public abstract Optional<String> description();

  /** The encryption spec to be used for the Memory Bank. */
  @JsonProperty("encryptionSpec")
  public abstract Optional<EncryptionSpec> encryptionSpec();

  /** Instantiates a builder for CreateMemoryBankConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_CreateMemoryBankConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for CreateMemoryBankConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `CreateMemoryBankConfig.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_CreateMemoryBankConfig.Builder();
    }

    /**
     * Setter for httpOptions.
     *
     * <p>httpOptions: Used to override HTTP request options.
     */
    @JsonProperty("httpOptions")
    public abstract Builder httpOptions(HttpOptions httpOptions);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder httpOptions(Optional<HttpOptions> httpOptions);

    /** Clears the value of httpOptions field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearHttpOptions() {
      return httpOptions(Optional.empty());
    }

    /**
     * Setter for displayName.
     *
     * <p>displayName: The user-defined name of the Memory Bank.
     *
     * <p>The display name can be up to 128 characters long and can comprise any UTF-8 characters.
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
     * <p>description: The description of the Memory Bank.
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
     * Setter for encryptionSpec.
     *
     * <p>encryptionSpec: The encryption spec to be used for the Memory Bank.
     */
    @JsonProperty("encryptionSpec")
    public abstract Builder encryptionSpec(EncryptionSpec encryptionSpec);

    /**
     * Setter for encryptionSpec builder.
     *
     * <p>encryptionSpec: The encryption spec to be used for the Memory Bank.
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

    public abstract CreateMemoryBankConfig build();
  }

  /** Deserializes a JSON string to a CreateMemoryBankConfig object. */
  @ExcludeFromGeneratedCoverageReport
  public static CreateMemoryBankConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, CreateMemoryBankConfig.class);
  }
}
