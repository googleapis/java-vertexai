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

/**
 * Specifies the configuration for fetching source code from a Git repository that is managed by
 * Developer Connect.
 *
 * <p>This includes the repository, revision, and directory to use.
 */
@AutoValue
@JsonDeserialize(builder = ReasoningEngineSpecSourceCodeSpecDeveloperConnectConfig.Builder.class)
public abstract class ReasoningEngineSpecSourceCodeSpecDeveloperConnectConfig
    extends JsonSerializable {
  /**
   * Required. The Developer Connect Git repository link, formatted as
   * `projects/{project_id}/locations/{location_id}/connections/{connection_id}/gitRepositoryLink/{repository_link_id}`.
   */
  @JsonProperty("gitRepositoryLink")
  public abstract Optional<String> gitRepositoryLink();

  /** Required. Directory, relative to the source root, in which to run the build. */
  @JsonProperty("dir")
  public abstract Optional<String> dir();

  /**
   * Required. The revision to fetch from the Git repository such as a branch, a tag, a commit SHA,
   * or any Git ref.
   */
  @JsonProperty("revision")
  public abstract Optional<String> revision();

  /** Instantiates a builder for ReasoningEngineSpecSourceCodeSpecDeveloperConnectConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_ReasoningEngineSpecSourceCodeSpecDeveloperConnectConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for ReasoningEngineSpecSourceCodeSpecDeveloperConnectConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use
     * `ReasoningEngineSpecSourceCodeSpecDeveloperConnectConfig.builder()` for instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_ReasoningEngineSpecSourceCodeSpecDeveloperConnectConfig.Builder();
    }

    /**
     * Setter for gitRepositoryLink.
     *
     * <p>gitRepositoryLink: Required. The Developer Connect Git repository link, formatted as
     * `projects/{project_id}/locations/{location_id}/connections/{connection_id}/gitRepositoryLink/{repository_link_id}`.
     */
    @JsonProperty("gitRepositoryLink")
    public abstract Builder gitRepositoryLink(String gitRepositoryLink);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder gitRepositoryLink(Optional<String> gitRepositoryLink);

    /** Clears the value of gitRepositoryLink field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearGitRepositoryLink() {
      return gitRepositoryLink(Optional.empty());
    }

    /**
     * Setter for dir.
     *
     * <p>dir: Required. Directory, relative to the source root, in which to run the build.
     */
    @JsonProperty("dir")
    public abstract Builder dir(String dir);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder dir(Optional<String> dir);

    /** Clears the value of dir field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearDir() {
      return dir(Optional.empty());
    }

    /**
     * Setter for revision.
     *
     * <p>revision: Required. The revision to fetch from the Git repository such as a branch, a tag,
     * a commit SHA, or any Git ref.
     */
    @JsonProperty("revision")
    public abstract Builder revision(String revision);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder revision(Optional<String> revision);

    /** Clears the value of revision field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearRevision() {
      return revision(Optional.empty());
    }

    public abstract ReasoningEngineSpecSourceCodeSpecDeveloperConnectConfig build();
  }

  /**
   * Deserializes a JSON string to a ReasoningEngineSpecSourceCodeSpecDeveloperConnectConfig object.
   */
  @ExcludeFromGeneratedCoverageReport
  public static ReasoningEngineSpecSourceCodeSpecDeveloperConnectConfig fromJson(
      String jsonString) {
    return JsonSerializable.fromJsonString(
        jsonString, ReasoningEngineSpecSourceCodeSpecDeveloperConnectConfig.class);
  }
}
