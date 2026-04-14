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
import java.util.Map;
import java.util.Optional;

/** A memory profile. */
@AutoValue
@JsonDeserialize(builder = MemoryProfile.Builder.class)
public abstract class MemoryProfile extends JsonSerializable {
  /**
   * Represents the ID of the schema. This ID corresponds to the `schema_id` defined inside the
   * SchemaConfig, under StructuredMemoryCustomizationConfig.
   */
  @JsonProperty("schemaId")
  public abstract Optional<String> schemaId();

  /** Represents the profile data. */
  @JsonProperty("profile")
  public abstract Optional<Map<String, Object>> profile();

  /** Instantiates a builder for MemoryProfile. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_MemoryProfile.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for MemoryProfile. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `MemoryProfile.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_MemoryProfile.Builder();
    }

    /**
     * Setter for schemaId.
     *
     * <p>schemaId: Represents the ID of the schema. This ID corresponds to the `schema_id` defined
     * inside the SchemaConfig, under StructuredMemoryCustomizationConfig.
     */
    @JsonProperty("schemaId")
    public abstract Builder schemaId(String schemaId);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder schemaId(Optional<String> schemaId);

    /** Clears the value of schemaId field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearSchemaId() {
      return schemaId(Optional.empty());
    }

    /**
     * Setter for profile.
     *
     * <p>profile: Represents the profile data.
     */
    @JsonProperty("profile")
    public abstract Builder profile(Map<String, Object> profile);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder profile(Optional<Map<String, Object>> profile);

    /** Clears the value of profile field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearProfile() {
      return profile(Optional.empty());
    }

    public abstract MemoryProfile build();
  }

  /** Deserializes a JSON string to a MemoryProfile object. */
  @ExcludeFromGeneratedCoverageReport
  public static MemoryProfile fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, MemoryProfile.class);
  }
}
