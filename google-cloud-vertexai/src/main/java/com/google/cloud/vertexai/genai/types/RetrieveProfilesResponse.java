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

/** The response for retrieving memory profiles. */
@AutoValue
@JsonDeserialize(builder = RetrieveProfilesResponse.Builder.class)
public abstract class RetrieveProfilesResponse extends JsonSerializable {
  /**
   * The retrieved structured profiles, which match the schemas under the requested scope. The key
   * is the ID of the schema that the profile is linked with, which corresponds to the `schema_id`
   * defined inside the `SchemaConfig`, under `StructuredMemoryCustomizationConfig`.
   */
  @JsonProperty("profiles")
  public abstract Optional<Map<String, MemoryProfile>> profiles();

  /** Instantiates a builder for RetrieveProfilesResponse. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_RetrieveProfilesResponse.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for RetrieveProfilesResponse. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `RetrieveProfilesResponse.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_RetrieveProfilesResponse.Builder();
    }

    /**
     * Setter for profiles.
     *
     * <p>profiles: The retrieved structured profiles, which match the schemas under the requested
     * scope. The key is the ID of the schema that the profile is linked with, which corresponds to
     * the `schema_id` defined inside the `SchemaConfig`, under
     * `StructuredMemoryCustomizationConfig`.
     */
    @JsonProperty("profiles")
    public abstract Builder profiles(Map<String, MemoryProfile> profiles);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder profiles(Optional<Map<String, MemoryProfile>> profiles);

    /** Clears the value of profiles field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearProfiles() {
      return profiles(Optional.empty());
    }

    public abstract RetrieveProfilesResponse build();
  }

  /** Deserializes a JSON string to a RetrieveProfilesResponse object. */
  @ExcludeFromGeneratedCoverageReport
  public static RetrieveProfilesResponse fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, RetrieveProfilesResponse.class);
  }
}
