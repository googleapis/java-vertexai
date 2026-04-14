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
import com.google.api.core.InternalApi;
import com.google.auto.value.AutoValue;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.genai.JsonSerializable;
import java.util.Map;
import java.util.Optional;

/** Parameters for retrieving agent engine memory profiles. */
@AutoValue
@InternalApi
@JsonDeserialize(builder = RetrieveMemoryProfilesRequestParameters.Builder.class)
public abstract class RetrieveMemoryProfilesRequestParameters extends JsonSerializable {
  /** Name of the agent engine to retrieve memory profiles from. */
  @JsonProperty("name")
  public abstract Optional<String> name();

  /**
   * The scope of the memories to retrieve.
   *
   * <p>A memory must have exactly the same scope as the scope provided here to be retrieved (i.e.
   * same keys and values). Order does not matter, but it is case-sensitive.
   */
  @JsonProperty("scope")
  public abstract Optional<Map<String, String>> scope();

  /** */
  @JsonProperty("config")
  public abstract Optional<RetrieveMemoryProfilesConfig> config();

  /** Instantiates a builder for RetrieveMemoryProfilesRequestParameters. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_RetrieveMemoryProfilesRequestParameters.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for RetrieveMemoryProfilesRequestParameters. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `RetrieveMemoryProfilesRequestParameters.builder()` for
     * instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_RetrieveMemoryProfilesRequestParameters.Builder();
    }

    /**
     * Setter for name.
     *
     * <p>name: Name of the agent engine to retrieve memory profiles from.
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
     * Setter for scope.
     *
     * <p>scope: The scope of the memories to retrieve.
     *
     * <p>A memory must have exactly the same scope as the scope provided here to be retrieved (i.e.
     * same keys and values). Order does not matter, but it is case-sensitive.
     */
    @JsonProperty("scope")
    public abstract Builder scope(Map<String, String> scope);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder scope(Optional<Map<String, String>> scope);

    /** Clears the value of scope field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearScope() {
      return scope(Optional.empty());
    }

    /**
     * Setter for config.
     *
     * <p>config:
     */
    @JsonProperty("config")
    public abstract Builder config(RetrieveMemoryProfilesConfig config);

    /**
     * Setter for config builder.
     *
     * <p>config:
     */
    @CanIgnoreReturnValue
    public Builder config(RetrieveMemoryProfilesConfig.Builder configBuilder) {
      return config(configBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder config(Optional<RetrieveMemoryProfilesConfig> config);

    /** Clears the value of config field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearConfig() {
      return config(Optional.empty());
    }

    public abstract RetrieveMemoryProfilesRequestParameters build();
  }

  /** Deserializes a JSON string to a RetrieveMemoryProfilesRequestParameters object. */
  @ExcludeFromGeneratedCoverageReport
  public static RetrieveMemoryProfilesRequestParameters fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(
        jsonString, RetrieveMemoryProfilesRequestParameters.class);
  }
}
