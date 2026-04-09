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

/** Represents configuration for organizing natural language memories for a particular scope. */
@AutoValue
@JsonDeserialize(builder = MemoryBankCustomizationConfig.Builder.class)
public abstract class MemoryBankCustomizationConfig extends JsonSerializable {
  /**
   * Optional. Indicates whether the memories will be generated in the third person (i.e. "The user
   * generates memories with Memory Bank."). By default, the memories will be generated in the first
   * person (i.e. "I generate memories with Memory Bank.")
   */
  @JsonProperty("enableThirdPersonMemories")
  public abstract Optional<Boolean> enableThirdPersonMemories();

  /** Optional. Provides examples of how to generate memories for a particular scope. */
  @JsonProperty("generateMemoriesExamples")
  public abstract Optional<List<MemoryBankCustomizationConfigGenerateMemoriesExample>>
      generateMemoriesExamples();

  /**
   * Optional. Represents topics of information that should be extracted from conversations and
   * stored as memories. If not set, then Memory Bank's default topics will be used.
   */
  @JsonProperty("memoryTopics")
  public abstract Optional<List<MemoryBankCustomizationConfigMemoryTopic>> memoryTopics();

  /**
   * Optional. Represents the scope keys (i.e. 'user_id') for which to use this config. A request's
   * scope must include all of the provided keys for the config to be used (order does not matter).
   * If empty, then the config will be used for all requests that do not have a more specific
   * config. Only one default config is allowed per Memory Bank.
   */
  @JsonProperty("scopeKeys")
  public abstract Optional<List<String>> scopeKeys();

  /** Optional. Represents configuration for customizing how memories are consolidated together. */
  @JsonProperty("consolidationConfig")
  public abstract Optional<MemoryBankCustomizationConfigConsolidationConfig> consolidationConfig();

  /**
   * Optional. Indicates whether natural language memory generation should be disabled for all
   * requests. By default, natural language memory generation is enabled. Set this to `true` when
   * you only want to generate structured memories.
   */
  @JsonProperty("disableNaturalLanguageMemories")
  public abstract Optional<Boolean> disableNaturalLanguageMemories();

  /** Instantiates a builder for MemoryBankCustomizationConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_MemoryBankCustomizationConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for MemoryBankCustomizationConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `MemoryBankCustomizationConfig.builder()` for instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_MemoryBankCustomizationConfig.Builder();
    }

    /**
     * Setter for enableThirdPersonMemories.
     *
     * <p>enableThirdPersonMemories: Optional. Indicates whether the memories will be generated in
     * the third person (i.e. "The user generates memories with Memory Bank."). By default, the
     * memories will be generated in the first person (i.e. "I generate memories with Memory Bank.")
     */
    @JsonProperty("enableThirdPersonMemories")
    public abstract Builder enableThirdPersonMemories(boolean enableThirdPersonMemories);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder enableThirdPersonMemories(Optional<Boolean> enableThirdPersonMemories);

    /** Clears the value of enableThirdPersonMemories field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearEnableThirdPersonMemories() {
      return enableThirdPersonMemories(Optional.empty());
    }

    /**
     * Setter for generateMemoriesExamples.
     *
     * <p>generateMemoriesExamples: Optional. Provides examples of how to generate memories for a
     * particular scope.
     */
    @JsonProperty("generateMemoriesExamples")
    public abstract Builder generateMemoriesExamples(
        List<MemoryBankCustomizationConfigGenerateMemoriesExample> generateMemoriesExamples);

    /**
     * Setter for generateMemoriesExamples.
     *
     * <p>generateMemoriesExamples: Optional. Provides examples of how to generate memories for a
     * particular scope.
     */
    @CanIgnoreReturnValue
    public Builder generateMemoriesExamples(
        MemoryBankCustomizationConfigGenerateMemoriesExample... generateMemoriesExamples) {
      return generateMemoriesExamples(Arrays.asList(generateMemoriesExamples));
    }

    /**
     * Setter for generateMemoriesExamples builder.
     *
     * <p>generateMemoriesExamples: Optional. Provides examples of how to generate memories for a
     * particular scope.
     */
    @CanIgnoreReturnValue
    public Builder generateMemoriesExamples(
        MemoryBankCustomizationConfigGenerateMemoriesExample.Builder...
            generateMemoriesExamplesBuilders) {
      return generateMemoriesExamples(
          Arrays.asList(generateMemoriesExamplesBuilders).stream()
              .map(MemoryBankCustomizationConfigGenerateMemoriesExample.Builder::build)
              .collect(toImmutableList()));
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder generateMemoriesExamples(
        Optional<List<MemoryBankCustomizationConfigGenerateMemoriesExample>>
            generateMemoriesExamples);

    /** Clears the value of generateMemoriesExamples field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearGenerateMemoriesExamples() {
      return generateMemoriesExamples(Optional.empty());
    }

    /**
     * Setter for memoryTopics.
     *
     * <p>memoryTopics: Optional. Represents topics of information that should be extracted from
     * conversations and stored as memories. If not set, then Memory Bank's default topics will be
     * used.
     */
    @JsonProperty("memoryTopics")
    public abstract Builder memoryTopics(
        List<MemoryBankCustomizationConfigMemoryTopic> memoryTopics);

    /**
     * Setter for memoryTopics.
     *
     * <p>memoryTopics: Optional. Represents topics of information that should be extracted from
     * conversations and stored as memories. If not set, then Memory Bank's default topics will be
     * used.
     */
    @CanIgnoreReturnValue
    public Builder memoryTopics(MemoryBankCustomizationConfigMemoryTopic... memoryTopics) {
      return memoryTopics(Arrays.asList(memoryTopics));
    }

    /**
     * Setter for memoryTopics builder.
     *
     * <p>memoryTopics: Optional. Represents topics of information that should be extracted from
     * conversations and stored as memories. If not set, then Memory Bank's default topics will be
     * used.
     */
    @CanIgnoreReturnValue
    public Builder memoryTopics(
        MemoryBankCustomizationConfigMemoryTopic.Builder... memoryTopicsBuilders) {
      return memoryTopics(
          Arrays.asList(memoryTopicsBuilders).stream()
              .map(MemoryBankCustomizationConfigMemoryTopic.Builder::build)
              .collect(toImmutableList()));
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder memoryTopics(
        Optional<List<MemoryBankCustomizationConfigMemoryTopic>> memoryTopics);

    /** Clears the value of memoryTopics field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearMemoryTopics() {
      return memoryTopics(Optional.empty());
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

    /**
     * Setter for consolidationConfig.
     *
     * <p>consolidationConfig: Optional. Represents configuration for customizing how memories are
     * consolidated together.
     */
    @JsonProperty("consolidationConfig")
    public abstract Builder consolidationConfig(
        MemoryBankCustomizationConfigConsolidationConfig consolidationConfig);

    /**
     * Setter for consolidationConfig builder.
     *
     * <p>consolidationConfig: Optional. Represents configuration for customizing how memories are
     * consolidated together.
     */
    @CanIgnoreReturnValue
    public Builder consolidationConfig(
        MemoryBankCustomizationConfigConsolidationConfig.Builder consolidationConfigBuilder) {
      return consolidationConfig(consolidationConfigBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder consolidationConfig(
        Optional<MemoryBankCustomizationConfigConsolidationConfig> consolidationConfig);

    /** Clears the value of consolidationConfig field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearConsolidationConfig() {
      return consolidationConfig(Optional.empty());
    }

    /**
     * Setter for disableNaturalLanguageMemories.
     *
     * <p>disableNaturalLanguageMemories: Optional. Indicates whether natural language memory
     * generation should be disabled for all requests. By default, natural language memory
     * generation is enabled. Set this to `true` when you only want to generate structured memories.
     */
    @JsonProperty("disableNaturalLanguageMemories")
    public abstract Builder disableNaturalLanguageMemories(boolean disableNaturalLanguageMemories);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder disableNaturalLanguageMemories(
        Optional<Boolean> disableNaturalLanguageMemories);

    /** Clears the value of disableNaturalLanguageMemories field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearDisableNaturalLanguageMemories() {
      return disableNaturalLanguageMemories(Optional.empty());
    }

    public abstract MemoryBankCustomizationConfig build();
  }

  /** Deserializes a JSON string to a MemoryBankCustomizationConfig object. */
  @ExcludeFromGeneratedCoverageReport
  public static MemoryBankCustomizationConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, MemoryBankCustomizationConfig.class);
  }
}
