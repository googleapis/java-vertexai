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
import com.google.api.core.InternalApi;
import com.google.auto.value.AutoValue;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.genai.JsonSerializable;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/** Parameters for purging agent engine memories. */
@AutoValue
@InternalApi
@JsonDeserialize(builder = PurgeAgentEngineMemoriesRequestParameters.Builder.class)
public abstract class PurgeAgentEngineMemoriesRequestParameters extends JsonSerializable {
  /** Name of the Agent Engine to purge memories from. */
  @JsonProperty("name")
  public abstract Optional<String> name();

  /**
   * The standard list filter to determine which memories to purge. More detail in
   * [AIP-160](https://google.aip.dev/160).
   */
  @JsonProperty("filter")
  public abstract Optional<String> filter();

  /**
   * Metadata filters that will be applied to the memories' `metadata` using OR logic. Filters are
   * defined using disjunctive normal form (OR of ANDs).
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
   * If true, the memories will actually be purged. If false, the purge request will be validated
   * but not executed.
   */
  @JsonProperty("force")
  public abstract Optional<Boolean> force();

  /** */
  @JsonProperty("config")
  public abstract Optional<PurgeAgentEngineMemoriesConfig> config();

  /** Instantiates a builder for PurgeAgentEngineMemoriesRequestParameters. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_PurgeAgentEngineMemoriesRequestParameters.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for PurgeAgentEngineMemoriesRequestParameters. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `PurgeAgentEngineMemoriesRequestParameters.builder()` for
     * instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_PurgeAgentEngineMemoriesRequestParameters.Builder();
    }

    /**
     * Setter for name.
     *
     * <p>name: Name of the Agent Engine to purge memories from.
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
     * Setter for filter.
     *
     * <p>filter: The standard list filter to determine which memories to purge. More detail in
     * [AIP-160](https://google.aip.dev/160).
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
     * <p>filterGroups: Metadata filters that will be applied to the memories' `metadata` using OR
     * logic. Filters are defined using disjunctive normal form (OR of ANDs).
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
     * <p>filterGroups: Metadata filters that will be applied to the memories' `metadata` using OR
     * logic. Filters are defined using disjunctive normal form (OR of ANDs).
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
     * <p>filterGroups: Metadata filters that will be applied to the memories' `metadata` using OR
     * logic. Filters are defined using disjunctive normal form (OR of ANDs).
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
     * Setter for force.
     *
     * <p>force: If true, the memories will actually be purged. If false, the purge request will be
     * validated but not executed.
     */
    @JsonProperty("force")
    public abstract Builder force(boolean force);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder force(Optional<Boolean> force);

    /** Clears the value of force field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearForce() {
      return force(Optional.empty());
    }

    /**
     * Setter for config.
     *
     * <p>config:
     */
    @JsonProperty("config")
    public abstract Builder config(PurgeAgentEngineMemoriesConfig config);

    /**
     * Setter for config builder.
     *
     * <p>config:
     */
    @CanIgnoreReturnValue
    public Builder config(PurgeAgentEngineMemoriesConfig.Builder configBuilder) {
      return config(configBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder config(Optional<PurgeAgentEngineMemoriesConfig> config);

    /** Clears the value of config field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearConfig() {
      return config(Optional.empty());
    }

    public abstract PurgeAgentEngineMemoriesRequestParameters build();
  }

  /** Deserializes a JSON string to a PurgeAgentEngineMemoriesRequestParameters object. */
  @ExcludeFromGeneratedCoverageReport
  public static PurgeAgentEngineMemoriesRequestParameters fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(
        jsonString, PurgeAgentEngineMemoriesRequestParameters.class);
  }
}
