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
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.genai.JsonSerializable;
import com.google.genai.types.HttpOptions;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/** Config for retrieving memories. */
@AutoValue
@JsonDeserialize(builder = RetrieveAgentEngineMemoriesConfig.Builder.class)
public abstract class RetrieveAgentEngineMemoriesConfig extends JsonSerializable {
  /** Used to override HTTP request options. */
  @JsonProperty("httpOptions")
  public abstract Optional<HttpOptions> httpOptions();

  /**
   * The standard list filter that will be applied to the retrieved memories. More detail in
   * [AIP-160](https://google.aip.dev/160).
   *
   * <p>Supported fields: `fact` `create_time` `update_time`
   */
  @JsonProperty("filter")
  public abstract Optional<String> filter();

  /**
   * Metadata filters that will be applied to the retrieved memories' `metadata` using OR logic.
   * Filters are defined using disjunctive normal form (OR of ANDs).
   *
   * <p>For example: `filter_groups: [{filters: [{key: "author", value: {string_value: "agent
   * `123"}, op: EQUAL}]}, {filters: [{key: "label", value: {string_value: "travel"}, op: EQUAL},
   * {key: "author", value: {string_value: "agent 321"}, op: EQUAL}]}]`
   *
   * <p>would be equivalent to the logical expression: `(metadata.author = "agent 123" OR
   * (metadata.label = "travel" AND metadata.author = "agent 321"))`.
   */
  @JsonProperty("filterGroups")
  public abstract Optional<List<MemoryConjunctionFilter>> filterGroups();

  /**
   * Specifies the types of memories to retrieve. If this field is empty or not provided, the
   * request will default to retrieving only memories of type `NATURAL_LANGUAGE_COLLECTION`. If
   * populated, the request will retrieve memories matching any of the specified `MemoryType`
   * values.
   */
  @JsonProperty("memoryTypes")
  public abstract Optional<List<MemoryType>> memoryTypes();

  /** Instantiates a builder for RetrieveAgentEngineMemoriesConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_RetrieveAgentEngineMemoriesConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for RetrieveAgentEngineMemoriesConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `RetrieveAgentEngineMemoriesConfig.builder()` for
     * instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_RetrieveAgentEngineMemoriesConfig.Builder();
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
     * Setter for filter.
     *
     * <p>filter: The standard list filter that will be applied to the retrieved memories. More
     * detail in [AIP-160](https://google.aip.dev/160).
     *
     * <p>Supported fields: `fact` `create_time` `update_time`
     */
    @JsonProperty("filter")
    public abstract Builder filter(String filter);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder filter(Optional<String> filter);

    /** Clears the value of filter field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearFilter() {
      return filter(Optional.empty());
    }

    /**
     * Setter for filterGroups.
     *
     * <p>filterGroups: Metadata filters that will be applied to the retrieved memories' `metadata`
     * using OR logic. Filters are defined using disjunctive normal form (OR of ANDs).
     *
     * <p>For example: `filter_groups: [{filters: [{key: "author", value: {string_value: "agent
     * `123"}, op: EQUAL}]}, {filters: [{key: "label", value: {string_value: "travel"}, op: EQUAL},
     * {key: "author", value: {string_value: "agent 321"}, op: EQUAL}]}]`
     *
     * <p>would be equivalent to the logical expression: `(metadata.author = "agent 123" OR
     * (metadata.label = "travel" AND metadata.author = "agent 321"))`.
     */
    @JsonProperty("filterGroups")
    public abstract Builder filterGroups(List<MemoryConjunctionFilter> filterGroups);

    /**
     * Setter for filterGroups.
     *
     * <p>filterGroups: Metadata filters that will be applied to the retrieved memories' `metadata`
     * using OR logic. Filters are defined using disjunctive normal form (OR of ANDs).
     *
     * <p>For example: `filter_groups: [{filters: [{key: "author", value: {string_value: "agent
     * `123"}, op: EQUAL}]}, {filters: [{key: "label", value: {string_value: "travel"}, op: EQUAL},
     * {key: "author", value: {string_value: "agent 321"}, op: EQUAL}]}]`
     *
     * <p>would be equivalent to the logical expression: `(metadata.author = "agent 123" OR
     * (metadata.label = "travel" AND metadata.author = "agent 321"))`.
     */
    @CanIgnoreReturnValue
    public Builder filterGroups(MemoryConjunctionFilter... filterGroups) {
      return filterGroups(Arrays.asList(filterGroups));
    }

    /**
     * Setter for filterGroups builder.
     *
     * <p>filterGroups: Metadata filters that will be applied to the retrieved memories' `metadata`
     * using OR logic. Filters are defined using disjunctive normal form (OR of ANDs).
     *
     * <p>For example: `filter_groups: [{filters: [{key: "author", value: {string_value: "agent
     * `123"}, op: EQUAL}]}, {filters: [{key: "label", value: {string_value: "travel"}, op: EQUAL},
     * {key: "author", value: {string_value: "agent 321"}, op: EQUAL}]}]`
     *
     * <p>would be equivalent to the logical expression: `(metadata.author = "agent 123" OR
     * (metadata.label = "travel" AND metadata.author = "agent 321"))`.
     */
    @CanIgnoreReturnValue
    public Builder filterGroups(MemoryConjunctionFilter.Builder... filterGroupsBuilders) {
      return filterGroups(
          Arrays.asList(filterGroupsBuilders).stream()
              .map(MemoryConjunctionFilter.Builder::build)
              .collect(toImmutableList()));
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder filterGroups(Optional<List<MemoryConjunctionFilter>> filterGroups);

    /** Clears the value of filterGroups field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearFilterGroups() {
      return filterGroups(Optional.empty());
    }

    /**
     * Setter for memoryTypes.
     *
     * <p>memoryTypes: Specifies the types of memories to retrieve. If this field is empty or not
     * provided, the request will default to retrieving only memories of type
     * `NATURAL_LANGUAGE_COLLECTION`. If populated, the request will retrieve memories matching any
     * of the specified `MemoryType` values.
     */
    @JsonProperty("memoryTypes")
    public abstract Builder memoryTypes(List<MemoryType> memoryTypes);

    /**
     * Setter for memoryTypes.
     *
     * <p>memoryTypes: Specifies the types of memories to retrieve. If this field is empty or not
     * provided, the request will default to retrieving only memories of type
     * `NATURAL_LANGUAGE_COLLECTION`. If populated, the request will retrieve memories matching any
     * of the specified `MemoryType` values.
     */
    @CanIgnoreReturnValue
    public Builder memoryTypes(MemoryType... memoryTypes) {
      return memoryTypes(Arrays.asList(memoryTypes));
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder memoryTypes(Optional<List<MemoryType>> memoryTypes);

    /** Clears the value of memoryTypes field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearMemoryTypes() {
      return memoryTypes(Optional.empty());
    }

    /**
     * Setter for memoryTypes given a varargs of strings.
     *
     * <p>memoryTypes: Specifies the types of memories to retrieve. If this field is empty or not
     * provided, the request will default to retrieving only memories of type
     * `NATURAL_LANGUAGE_COLLECTION`. If populated, the request will retrieve memories matching any
     * of the specified `MemoryType` values.
     */
    @CanIgnoreReturnValue
    public Builder memoryTypes(String... memoryTypes) {
      return memoryTypesFromString(Arrays.asList(memoryTypes));
    }

    /**
     * Setter for memoryTypes given a varargs of known enums.
     *
     * <p>memoryTypes: Specifies the types of memories to retrieve. If this field is empty or not
     * provided, the request will default to retrieving only memories of type
     * `NATURAL_LANGUAGE_COLLECTION`. If populated, the request will retrieve memories matching any
     * of the specified `MemoryType` values.
     */
    @CanIgnoreReturnValue
    public Builder memoryTypes(MemoryType.Known... knownTypes) {
      return memoryTypesFromKnown(Arrays.asList(knownTypes));
    }

    /**
     * Setter for memoryTypes given a list of known enums.
     *
     * <p>memoryTypes: Specifies the types of memories to retrieve. If this field is empty or not
     * provided, the request will default to retrieving only memories of type
     * `NATURAL_LANGUAGE_COLLECTION`. If populated, the request will retrieve memories matching any
     * of the specified `MemoryType` values.
     */
    @CanIgnoreReturnValue
    public Builder memoryTypesFromKnown(List<MemoryType.Known> knownTypes) {
      ImmutableList<MemoryType> listItems =
          knownTypes.stream().map(MemoryType::new).collect(toImmutableList());
      return memoryTypes(listItems);
    }

    /**
     * Setter for memoryTypes given a list of strings.
     *
     * <p>memoryTypes: Specifies the types of memories to retrieve. If this field is empty or not
     * provided, the request will default to retrieving only memories of type
     * `NATURAL_LANGUAGE_COLLECTION`. If populated, the request will retrieve memories matching any
     * of the specified `MemoryType` values.
     */
    @CanIgnoreReturnValue
    public Builder memoryTypesFromString(List<String> memoryTypes) {
      ImmutableList<MemoryType> listItems =
          memoryTypes.stream().map(MemoryType::new).collect(toImmutableList());
      return memoryTypes(listItems);
    }

    public abstract RetrieveAgentEngineMemoriesConfig build();
  }

  /** Deserializes a JSON string to a RetrieveAgentEngineMemoriesConfig object. */
  @ExcludeFromGeneratedCoverageReport
  public static RetrieveAgentEngineMemoriesConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, RetrieveAgentEngineMemoriesConfig.class);
  }
}
