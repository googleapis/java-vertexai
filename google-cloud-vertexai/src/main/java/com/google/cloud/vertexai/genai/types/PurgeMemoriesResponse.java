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
import java.util.Optional;

/** The response for purging memories. */
@AutoValue
@JsonDeserialize(builder = PurgeMemoriesResponse.Builder.class)
public abstract class PurgeMemoriesResponse extends JsonSerializable {
  /** The number of memories that were purged. */
  @JsonProperty("purgeCount")
  public abstract Optional<Integer> purgeCount();

  /** Instantiates a builder for PurgeMemoriesResponse. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_PurgeMemoriesResponse.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for PurgeMemoriesResponse. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `PurgeMemoriesResponse.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_PurgeMemoriesResponse.Builder();
    }

    /**
     * Setter for purgeCount.
     *
     * <p>purgeCount: The number of memories that were purged.
     */
    @JsonProperty("purgeCount")
    public abstract Builder purgeCount(Integer purgeCount);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder purgeCount(Optional<Integer> purgeCount);

    /** Clears the value of purgeCount field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearPurgeCount() {
      return purgeCount(Optional.empty());
    }

    public abstract PurgeMemoriesResponse build();
  }

  /** Deserializes a JSON string to a PurgeMemoriesResponse object. */
  @ExcludeFromGeneratedCoverageReport
  public static PurgeMemoriesResponse fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, PurgeMemoriesResponse.class);
  }
}
