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
import com.google.genai.types.HttpResponse;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/** Response for listing sandbox environment snapshots. */
@AutoValue
@JsonDeserialize(builder = ListSandboxEnvironmentSnapshotsResponse.Builder.class)
public abstract class ListSandboxEnvironmentSnapshotsResponse extends JsonSerializable {
  /** Used to retain the full HTTP response. */
  @JsonProperty("sdkHttpResponse")
  public abstract Optional<HttpResponse> sdkHttpResponse();

  /** */
  @JsonProperty("nextPageToken")
  public abstract Optional<String> nextPageToken();

  /** List of sandbox environment snapshots. */
  @JsonProperty("sandboxEnvironmentSnapshots")
  public abstract Optional<List<SandboxEnvironmentSnapshot>> sandboxEnvironmentSnapshots();

  /** Instantiates a builder for ListSandboxEnvironmentSnapshotsResponse. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_ListSandboxEnvironmentSnapshotsResponse.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for ListSandboxEnvironmentSnapshotsResponse. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `ListSandboxEnvironmentSnapshotsResponse.builder()` for
     * instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_ListSandboxEnvironmentSnapshotsResponse.Builder();
    }

    /**
     * Setter for sdkHttpResponse.
     *
     * <p>sdkHttpResponse: Used to retain the full HTTP response.
     */
    @JsonProperty("sdkHttpResponse")
    public abstract Builder sdkHttpResponse(HttpResponse sdkHttpResponse);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder sdkHttpResponse(Optional<HttpResponse> sdkHttpResponse);

    /** Clears the value of sdkHttpResponse field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearSdkHttpResponse() {
      return sdkHttpResponse(Optional.empty());
    }

    /**
     * Setter for nextPageToken.
     *
     * <p>nextPageToken:
     */
    @JsonProperty("nextPageToken")
    public abstract Builder nextPageToken(String nextPageToken);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder nextPageToken(Optional<String> nextPageToken);

    /** Clears the value of nextPageToken field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearNextPageToken() {
      return nextPageToken(Optional.empty());
    }

    /**
     * Setter for sandboxEnvironmentSnapshots.
     *
     * <p>sandboxEnvironmentSnapshots: List of sandbox environment snapshots.
     */
    @JsonProperty("sandboxEnvironmentSnapshots")
    public abstract Builder sandboxEnvironmentSnapshots(
        List<SandboxEnvironmentSnapshot> sandboxEnvironmentSnapshots);

    /**
     * Setter for sandboxEnvironmentSnapshots.
     *
     * <p>sandboxEnvironmentSnapshots: List of sandbox environment snapshots.
     */
    @CanIgnoreReturnValue
    public Builder sandboxEnvironmentSnapshots(
        SandboxEnvironmentSnapshot... sandboxEnvironmentSnapshots) {
      return sandboxEnvironmentSnapshots(Arrays.asList(sandboxEnvironmentSnapshots));
    }

    /**
     * Setter for sandboxEnvironmentSnapshots builder.
     *
     * <p>sandboxEnvironmentSnapshots: List of sandbox environment snapshots.
     */
    @CanIgnoreReturnValue
    public Builder sandboxEnvironmentSnapshots(
        SandboxEnvironmentSnapshot.Builder... sandboxEnvironmentSnapshotsBuilders) {
      return sandboxEnvironmentSnapshots(
          Arrays.asList(sandboxEnvironmentSnapshotsBuilders).stream()
              .map(SandboxEnvironmentSnapshot.Builder::build)
              .collect(toImmutableList()));
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder sandboxEnvironmentSnapshots(
        Optional<List<SandboxEnvironmentSnapshot>> sandboxEnvironmentSnapshots);

    /** Clears the value of sandboxEnvironmentSnapshots field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearSandboxEnvironmentSnapshots() {
      return sandboxEnvironmentSnapshots(Optional.empty());
    }

    public abstract ListSandboxEnvironmentSnapshotsResponse build();
  }

  /** Deserializes a JSON string to a ListSandboxEnvironmentSnapshotsResponse object. */
  @ExcludeFromGeneratedCoverageReport
  public static ListSandboxEnvironmentSnapshotsResponse fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(
        jsonString, ListSandboxEnvironmentSnapshotsResponse.class);
  }
}
