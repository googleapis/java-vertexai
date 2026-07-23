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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.genai.JsonSerializable;
import com.google.genai.types.HttpOptions;
import java.util.Optional;

/** Config for listing sandbox environment snapshots. */
@AutoValue
@JsonDeserialize(builder = ListSandboxEnvironmentSnapshotsConfig.Builder.class)
public abstract class ListSandboxEnvironmentSnapshotsConfig extends JsonSerializable {
  /** Used to override HTTP request options. */
  @JsonProperty("httpOptions")
  public abstract Optional<HttpOptions> httpOptions();

  /** */
  @JsonProperty("pageSize")
  public abstract Optional<Integer> pageSize();

  /** */
  @JsonProperty("pageToken")
  public abstract Optional<String> pageToken();

  /** An expression for filtering the results of the request. */
  @JsonProperty("filter")
  public abstract Optional<String> filter();

  /** Instantiates a builder for ListSandboxEnvironmentSnapshotsConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_ListSandboxEnvironmentSnapshotsConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for ListSandboxEnvironmentSnapshotsConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `ListSandboxEnvironmentSnapshotsConfig.builder()` for
     * instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_ListSandboxEnvironmentSnapshotsConfig.Builder();
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
     * Setter for pageSize.
     *
     * <p>pageSize:
     */
    @JsonProperty("pageSize")
    public abstract Builder pageSize(Integer pageSize);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder pageSize(Optional<Integer> pageSize);

    /** Clears the value of pageSize field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearPageSize() {
      return pageSize(Optional.empty());
    }

    /**
     * Setter for pageToken.
     *
     * <p>pageToken:
     */
    @JsonProperty("pageToken")
    public abstract Builder pageToken(String pageToken);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder pageToken(Optional<String> pageToken);

    /** Clears the value of pageToken field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearPageToken() {
      return pageToken(Optional.empty());
    }

    /**
     * Setter for filter.
     *
     * <p>filter: An expression for filtering the results of the request.
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

    public abstract ListSandboxEnvironmentSnapshotsConfig build();
  }

  /** Deserializes a JSON string to a ListSandboxEnvironmentSnapshotsConfig object. */
  @ExcludeFromGeneratedCoverageReport
  public static ListSandboxEnvironmentSnapshotsConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, ListSandboxEnvironmentSnapshotsConfig.class);
  }
}
