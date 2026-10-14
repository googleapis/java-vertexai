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
import com.google.genai.types.HttpOptions;
import java.util.Optional;

/** Config for updating a memory bank. */
@AutoValue
@JsonDeserialize(builder = UpdateMemoryBankConfig.Builder.class)
public abstract class UpdateMemoryBankConfig extends JsonSerializable {
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

  /** Instantiates a builder for UpdateMemoryBankConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_UpdateMemoryBankConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for UpdateMemoryBankConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `UpdateMemoryBankConfig.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_UpdateMemoryBankConfig.Builder();
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

    public abstract UpdateMemoryBankConfig build();
  }

  /** Deserializes a JSON string to a UpdateMemoryBankConfig object. */
  @ExcludeFromGeneratedCoverageReport
  public static UpdateMemoryBankConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, UpdateMemoryBankConfig.class);
  }
}
