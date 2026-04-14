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
import com.google.genai.types.Schema;
import java.util.Optional;

/** Represents the OpenAPI schema of the structured memories. */
@AutoValue
@JsonDeserialize(builder = StructuredMemorySchemaConfig.Builder.class)
public abstract class StructuredMemorySchemaConfig extends JsonSerializable {
  /** Required. Represents the OpenAPI schema of the structured memories. */
  @JsonProperty("memorySchema")
  public abstract Optional<Schema> memorySchema();

  /**
   * Required. Represents the ID of the schema. Must be 1-63 characters, start with a lowercase
   * letter, and consist of lowercase letters, numbers, and hyphens.
   */
  @JsonProperty("id")
  public abstract Optional<String> id();

  /**
   * Optional. Represents the type of the structured memories associated with the schema. If not
   * set, then `STRUCTURED_PROFILE` will be used.
   */
  @JsonProperty("memoryType")
  public abstract Optional<MemoryType> memoryType();

  /** Instantiates a builder for StructuredMemorySchemaConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_StructuredMemorySchemaConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for StructuredMemorySchemaConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `StructuredMemorySchemaConfig.builder()` for instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_StructuredMemorySchemaConfig.Builder();
    }

    /**
     * Setter for memorySchema.
     *
     * <p>memorySchema: Required. Represents the OpenAPI schema of the structured memories.
     */
    @JsonProperty("memorySchema")
    public abstract Builder memorySchema(Schema memorySchema);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder memorySchema(Optional<Schema> memorySchema);

    /** Clears the value of memorySchema field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearMemorySchema() {
      return memorySchema(Optional.empty());
    }

    /**
     * Setter for id.
     *
     * <p>id: Required. Represents the ID of the schema. Must be 1-63 characters, start with a
     * lowercase letter, and consist of lowercase letters, numbers, and hyphens.
     */
    @JsonProperty("id")
    public abstract Builder id(String id);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder id(Optional<String> id);

    /** Clears the value of id field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearId() {
      return id(Optional.empty());
    }

    /**
     * Setter for memoryType.
     *
     * <p>memoryType: Optional. Represents the type of the structured memories associated with the
     * schema. If not set, then `STRUCTURED_PROFILE` will be used.
     */
    @JsonProperty("memoryType")
    public abstract Builder memoryType(MemoryType memoryType);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder memoryType(Optional<MemoryType> memoryType);

    /** Clears the value of memoryType field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearMemoryType() {
      return memoryType(Optional.empty());
    }

    /**
     * Setter for memoryType given a known enum.
     *
     * <p>memoryType: Optional. Represents the type of the structured memories associated with the
     * schema. If not set, then `STRUCTURED_PROFILE` will be used.
     */
    @CanIgnoreReturnValue
    public Builder memoryType(MemoryType.Known knownType) {
      return memoryType(new MemoryType(knownType));
    }

    /**
     * Setter for memoryType given a string.
     *
     * <p>memoryType: Optional. Represents the type of the structured memories associated with the
     * schema. If not set, then `STRUCTURED_PROFILE` will be used.
     */
    @CanIgnoreReturnValue
    public Builder memoryType(String memoryType) {
      return memoryType(new MemoryType(memoryType));
    }

    public abstract StructuredMemorySchemaConfig build();
  }

  /** Deserializes a JSON string to a StructuredMemorySchemaConfig object. */
  @ExcludeFromGeneratedCoverageReport
  public static StructuredMemorySchemaConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, StructuredMemorySchemaConfig.class);
  }
}
