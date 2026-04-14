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

/** Represents the structured value of the memory. */
@AutoValue
@JsonDeserialize(builder = MemoryStructuredContent.Builder.class)
public abstract class MemoryStructuredContent extends JsonSerializable {
  /** Required. Represents the structured value of the memory. */
  @JsonProperty("data")
  public abstract Optional<Map<String, Object>> data();

  /** Required. Represents the schema ID for which this structured memory belongs to. */
  @JsonProperty("schemaId")
  public abstract Optional<String> schemaId();

  /** Instantiates a builder for MemoryStructuredContent. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_MemoryStructuredContent.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for MemoryStructuredContent. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `MemoryStructuredContent.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_MemoryStructuredContent.Builder();
    }

    /**
     * Setter for data.
     *
     * <p>data: Required. Represents the structured value of the memory.
     */
    @JsonProperty("data")
    public abstract Builder data(Map<String, Object> data);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder data(Optional<Map<String, Object>> data);

    /** Clears the value of data field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearData() {
      return data(Optional.empty());
    }

    /**
     * Setter for schemaId.
     *
     * <p>schemaId: Required. Represents the schema ID for which this structured memory belongs to.
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

    public abstract MemoryStructuredContent build();
  }

  /** Deserializes a JSON string to a MemoryStructuredContent object. */
  @ExcludeFromGeneratedCoverageReport
  public static MemoryStructuredContent fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, MemoryStructuredContent.class);
  }
}
