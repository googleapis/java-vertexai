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

import static com.google.common.collect.ImmutableList.toImmutableList;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.genai.JsonSerializable;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/** Configuration for organizing structured memories within a scope. */
@AutoValue
@JsonDeserialize(builder = StructuredMemoryConfig.Builder.class)
public abstract class StructuredMemoryConfig extends JsonSerializable {
  /** Optional. Represents configuration of the structured memories' schemas. */
  @JsonProperty("schemaConfigs")
  public abstract Optional<List<StructuredMemorySchemaConfig>> schemaConfigs();

  /**
   * Optional. Represents the scope keys (i.e. 'user_id') for which to use this config. A request's
   * scope must include all of the provided keys for the config to be used (order does not matter).
   * If empty, then the config will be used for all requests that do not have a more specific
   * config. Only one default config is allowed per Memory Bank.
   */
  @JsonProperty("scopeKeys")
  public abstract Optional<List<String>> scopeKeys();

  /** Instantiates a builder for StructuredMemoryConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_StructuredMemoryConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for StructuredMemoryConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `StructuredMemoryConfig.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_StructuredMemoryConfig.Builder();
    }

    /**
     * Setter for schemaConfigs.
     *
     * <p>schemaConfigs: Optional. Represents configuration of the structured memories' schemas.
     */
    @JsonProperty("schemaConfigs")
    public abstract Builder schemaConfigs(List<StructuredMemorySchemaConfig> schemaConfigs);

    /**
     * Setter for schemaConfigs.
     *
     * <p>schemaConfigs: Optional. Represents configuration of the structured memories' schemas.
     */
    @CanIgnoreReturnValue
    public Builder schemaConfigs(StructuredMemorySchemaConfig... schemaConfigs) {
      return schemaConfigs(Arrays.asList(schemaConfigs));
    }

    /**
     * Setter for schemaConfigs builder.
     *
     * <p>schemaConfigs: Optional. Represents configuration of the structured memories' schemas.
     */
    @CanIgnoreReturnValue
    public Builder schemaConfigs(StructuredMemorySchemaConfig.Builder... schemaConfigsBuilders) {
      return schemaConfigs(
          Arrays.asList(schemaConfigsBuilders).stream()
              .map(StructuredMemorySchemaConfig.Builder::build)
              .collect(toImmutableList()));
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder schemaConfigs(Optional<List<StructuredMemorySchemaConfig>> schemaConfigs);

    /** Clears the value of schemaConfigs field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearSchemaConfigs() {
      return schemaConfigs(Optional.empty());
    }

    /**
     * Setter for scopeKeys.
     *
     * <p>scopeKeys: Optional. Represents the scope keys (i.e. 'user_id') for which to use this
     * config. A request's scope must include all of the provided keys for the config to be used
     * (order does not matter). If empty, then the config will be used for all requests that do not
     * have a more specific config. Only one default config is allowed per Memory Bank.
     */
    @JsonProperty("scopeKeys")
    public abstract Builder scopeKeys(List<String> scopeKeys);

    /**
     * Setter for scopeKeys.
     *
     * <p>scopeKeys: Optional. Represents the scope keys (i.e. 'user_id') for which to use this
     * config. A request's scope must include all of the provided keys for the config to be used
     * (order does not matter). If empty, then the config will be used for all requests that do not
     * have a more specific config. Only one default config is allowed per Memory Bank.
     */
    @CanIgnoreReturnValue
    public Builder scopeKeys(String... scopeKeys) {
      return scopeKeys(Arrays.asList(scopeKeys));
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder scopeKeys(Optional<List<String>> scopeKeys);

    /** Clears the value of scopeKeys field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearScopeKeys() {
      return scopeKeys(Optional.empty());
    }

    public abstract StructuredMemoryConfig build();
  }

  /** Deserializes a JSON string to a StructuredMemoryConfig object. */
  @ExcludeFromGeneratedCoverageReport
  public static StructuredMemoryConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, StructuredMemoryConfig.class);
  }
}
