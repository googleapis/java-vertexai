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

/** The configuration for managed semantic memory. */
@AutoValue
@JsonDeserialize(builder = ManagedSemanticMemoryConfig.Builder.class)
public abstract class ManagedSemanticMemoryConfig extends JsonSerializable {
  /** Represents configuration for LLMs calls. */
  @JsonProperty("generationConfig")
  public abstract Optional<ManagedSemanticMemoryConfigGenerationConfig> generationConfig();

  /** Configuration for how to perform similarity search on memories. */
  @JsonProperty("similaritySearchConfig")
  public abstract Optional<ManagedSemanticMemoryConfigSimilaritySearchConfig>
      similaritySearchConfig();

  /**
   * Configuration for how to customize Memory Bank behavior for a particular scope for unstructured
   * memories.
   */
  @JsonProperty("unstructuredMemoryConfigs")
  public abstract Optional<List<MemoryBankCustomizationConfig>> unstructuredMemoryConfigs();

  /** Configuration for organizing structured memories for a particular scope. */
  @JsonProperty("structuredMemoryConfigs")
  public abstract Optional<List<StructuredMemoryConfig>> structuredMemoryConfigs();

  /**
   * Configuration for automatic TTL ('time-to-live') of the memories in the Memory Bank. If not
   * set, TTL will not be applied automatically. The TTL can be explicitly set by modifying the
   * `expire_time` of each Memory resource.
   */
  @JsonProperty("ttlConfig")
  public abstract Optional<ManagedSemanticMemoryConfigTtlConfig> ttlConfig();

  /** If true, no memory revisions will be created for any requests to Memory Bank. */
  @JsonProperty("disableMemoryRevisions")
  public abstract Optional<Boolean> disableMemoryRevisions();

  /** Instantiates a builder for ManagedSemanticMemoryConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_ManagedSemanticMemoryConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for ManagedSemanticMemoryConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `ManagedSemanticMemoryConfig.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_ManagedSemanticMemoryConfig.Builder();
    }

    /**
     * Setter for generationConfig.
     *
     * <p>generationConfig: Represents configuration for LLMs calls.
     */
    @JsonProperty("generationConfig")
    public abstract Builder generationConfig(
        ManagedSemanticMemoryConfigGenerationConfig generationConfig);

    /**
     * Setter for generationConfig builder.
     *
     * <p>generationConfig: Represents configuration for LLMs calls.
     */
    @CanIgnoreReturnValue
    public Builder generationConfig(
        ManagedSemanticMemoryConfigGenerationConfig.Builder generationConfigBuilder) {
      return generationConfig(generationConfigBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Optional<ManagedSemanticMemoryConfigGenerationConfig> generationConfig();

    @ExcludeFromGeneratedCoverageReport
    abstract Builder generationConfig(
        Optional<ManagedSemanticMemoryConfigGenerationConfig> generationConfig);

    /** Clears the value of generationConfig field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearGenerationConfig() {
      return generationConfig(Optional.empty());
    }

    /**
     * Setter for similaritySearchConfig.
     *
     * <p>similaritySearchConfig: Configuration for how to perform similarity search on memories.
     */
    @JsonProperty("similaritySearchConfig")
    public abstract Builder similaritySearchConfig(
        ManagedSemanticMemoryConfigSimilaritySearchConfig similaritySearchConfig);

    /**
     * Setter for similaritySearchConfig builder.
     *
     * <p>similaritySearchConfig: Configuration for how to perform similarity search on memories.
     */
    @CanIgnoreReturnValue
    public Builder similaritySearchConfig(
        ManagedSemanticMemoryConfigSimilaritySearchConfig.Builder similaritySearchConfigBuilder) {
      return similaritySearchConfig(similaritySearchConfigBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Optional<ManagedSemanticMemoryConfigSimilaritySearchConfig> similaritySearchConfig();

    @ExcludeFromGeneratedCoverageReport
    abstract Builder similaritySearchConfig(
        Optional<ManagedSemanticMemoryConfigSimilaritySearchConfig> similaritySearchConfig);

    /** Clears the value of similaritySearchConfig field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearSimilaritySearchConfig() {
      return similaritySearchConfig(Optional.empty());
    }

    /**
     * Setter for unstructuredMemoryConfigs.
     *
     * <p>unstructuredMemoryConfigs: Configuration for how to customize Memory Bank behavior for a
     * particular scope for unstructured memories.
     */
    @JsonProperty("unstructuredMemoryConfigs")
    @CanIgnoreReturnValue
    public Builder unstructuredMemoryConfigs(
        List<MemoryBankCustomizationConfig> unstructuredMemoryConfigs) {
      if (unstructuredMemoryConfigs().isPresent()) {
        List<MemoryBankCustomizationConfig> list =
            new java.util.ArrayList<>(unstructuredMemoryConfigs().get());
        list.addAll(unstructuredMemoryConfigs);
        return unstructuredMemoryConfigs(java.util.Optional.of(list));
      }
      return unstructuredMemoryConfigs(java.util.Optional.of(unstructuredMemoryConfigs));
    }

    /**
     * Setter for unstructuredMemoryConfigs.
     *
     * <p>unstructuredMemoryConfigs: Configuration for how to customize Memory Bank behavior for a
     * particular scope for unstructured memories.
     */
    @CanIgnoreReturnValue
    public Builder unstructuredMemoryConfigs(
        MemoryBankCustomizationConfig... unstructuredMemoryConfigs) {
      return unstructuredMemoryConfigs(Arrays.asList(unstructuredMemoryConfigs));
    }

    /**
     * Setter for unstructuredMemoryConfigs builder.
     *
     * <p>unstructuredMemoryConfigs: Configuration for how to customize Memory Bank behavior for a
     * particular scope for unstructured memories.
     */
    @CanIgnoreReturnValue
    public Builder unstructuredMemoryConfigs(
        MemoryBankCustomizationConfig.Builder... unstructuredMemoryConfigsBuilders) {
      return unstructuredMemoryConfigs(
          Arrays.asList(unstructuredMemoryConfigsBuilders).stream()
              .map(MemoryBankCustomizationConfig.Builder::build)
              .collect(toImmutableList()));
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Optional<List<MemoryBankCustomizationConfig>> unstructuredMemoryConfigs();

    @ExcludeFromGeneratedCoverageReport
    abstract Builder unstructuredMemoryConfigs(
        Optional<List<MemoryBankCustomizationConfig>> unstructuredMemoryConfigs);

    /** Clears the value of unstructuredMemoryConfigs field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearUnstructuredMemoryConfigs() {
      return unstructuredMemoryConfigs(Optional.empty());
    }

    /**
     * Setter for structuredMemoryConfigs.
     *
     * <p>structuredMemoryConfigs: Configuration for organizing structured memories for a particular
     * scope.
     */
    @JsonProperty("structuredMemoryConfigs")
    @CanIgnoreReturnValue
    public Builder structuredMemoryConfigs(List<StructuredMemoryConfig> structuredMemoryConfigs) {
      if (structuredMemoryConfigs().isPresent()) {
        List<StructuredMemoryConfig> list =
            new java.util.ArrayList<>(structuredMemoryConfigs().get());
        list.addAll(structuredMemoryConfigs);
        return structuredMemoryConfigs(java.util.Optional.of(list));
      }
      return structuredMemoryConfigs(java.util.Optional.of(structuredMemoryConfigs));
    }

    /**
     * Setter for structuredMemoryConfigs.
     *
     * <p>structuredMemoryConfigs: Configuration for organizing structured memories for a particular
     * scope.
     */
    @CanIgnoreReturnValue
    public Builder structuredMemoryConfigs(StructuredMemoryConfig... structuredMemoryConfigs) {
      return structuredMemoryConfigs(Arrays.asList(structuredMemoryConfigs));
    }

    /**
     * Setter for structuredMemoryConfigs builder.
     *
     * <p>structuredMemoryConfigs: Configuration for organizing structured memories for a particular
     * scope.
     */
    @CanIgnoreReturnValue
    public Builder structuredMemoryConfigs(
        StructuredMemoryConfig.Builder... structuredMemoryConfigsBuilders) {
      return structuredMemoryConfigs(
          Arrays.asList(structuredMemoryConfigsBuilders).stream()
              .map(StructuredMemoryConfig.Builder::build)
              .collect(toImmutableList()));
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Optional<List<StructuredMemoryConfig>> structuredMemoryConfigs();

    @ExcludeFromGeneratedCoverageReport
    abstract Builder structuredMemoryConfigs(
        Optional<List<StructuredMemoryConfig>> structuredMemoryConfigs);

    /** Clears the value of structuredMemoryConfigs field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearStructuredMemoryConfigs() {
      return structuredMemoryConfigs(Optional.empty());
    }

    /**
     * Setter for ttlConfig.
     *
     * <p>ttlConfig: Configuration for automatic TTL ('time-to-live') of the memories in the Memory
     * Bank. If not set, TTL will not be applied automatically. The TTL can be explicitly set by
     * modifying the `expire_time` of each Memory resource.
     */
    @JsonProperty("ttlConfig")
    public abstract Builder ttlConfig(ManagedSemanticMemoryConfigTtlConfig ttlConfig);

    /**
     * Setter for ttlConfig builder.
     *
     * <p>ttlConfig: Configuration for automatic TTL ('time-to-live') of the memories in the Memory
     * Bank. If not set, TTL will not be applied automatically. The TTL can be explicitly set by
     * modifying the `expire_time` of each Memory resource.
     */
    @CanIgnoreReturnValue
    public Builder ttlConfig(ManagedSemanticMemoryConfigTtlConfig.Builder ttlConfigBuilder) {
      return ttlConfig(ttlConfigBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Optional<ManagedSemanticMemoryConfigTtlConfig> ttlConfig();

    @ExcludeFromGeneratedCoverageReport
    abstract Builder ttlConfig(Optional<ManagedSemanticMemoryConfigTtlConfig> ttlConfig);

    /** Clears the value of ttlConfig field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearTtlConfig() {
      return ttlConfig(Optional.empty());
    }

    /**
     * Setter for disableMemoryRevisions.
     *
     * <p>disableMemoryRevisions: If true, no memory revisions will be created for any requests to
     * Memory Bank.
     */
    @JsonProperty("disableMemoryRevisions")
    public abstract Builder disableMemoryRevisions(boolean disableMemoryRevisions);

    @ExcludeFromGeneratedCoverageReport
    abstract Optional<Boolean> disableMemoryRevisions();

    @ExcludeFromGeneratedCoverageReport
    abstract Builder disableMemoryRevisions(Optional<Boolean> disableMemoryRevisions);

    /** Clears the value of disableMemoryRevisions field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearDisableMemoryRevisions() {
      return disableMemoryRevisions(Optional.empty());
    }

    public abstract ManagedSemanticMemoryConfig build();
  }

  /** Deserializes a JSON string to a ManagedSemanticMemoryConfig object. */
  @ExcludeFromGeneratedCoverageReport
  public static ManagedSemanticMemoryConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, ManagedSemanticMemoryConfig.class);
  }
}
