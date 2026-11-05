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
import java.util.Optional;

/** Specifies source code to be fetched from a public Git repository. */
@AutoValue
@JsonDeserialize(builder = ReasoningEngineSpecSourceCodeSpecGitSource.Builder.class)
public abstract class ReasoningEngineSpecSourceCodeSpecGitSource extends JsonSerializable {
  /** Optional. Directory, relative to the source root, in which to run the build. */
  @JsonProperty("dir")
  public abstract Optional<String> dir();

  /**
   * Required. The revision to fetch from the Git repository: a branch, a tag, or a full commit SHA.
   * Abbreviated commit SHAs are not supported.
   */
  @JsonProperty("revision")
  public abstract Optional<String> revision();

  /** Required. The HTTPS URL of the public Git repository to clone. */
  @JsonProperty("url")
  public abstract Optional<String> url();

  /** Instantiates a builder for ReasoningEngineSpecSourceCodeSpecGitSource. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_ReasoningEngineSpecSourceCodeSpecGitSource.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for ReasoningEngineSpecSourceCodeSpecGitSource. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `ReasoningEngineSpecSourceCodeSpecGitSource.builder()` for
     * instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_ReasoningEngineSpecSourceCodeSpecGitSource.Builder();
    }

    /**
     * Setter for dir.
     *
     * <p>dir: Optional. Directory, relative to the source root, in which to run the build.
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
     * <p>revision: Required. The revision to fetch from the Git repository: a branch, a tag, or a
     * full commit SHA. Abbreviated commit SHAs are not supported.
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

    /**
     * Setter for url.
     *
     * <p>url: Required. The HTTPS URL of the public Git repository to clone.
     */
    @JsonProperty("url")
    public abstract Builder url(String url);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder url(Optional<String> url);

    /** Clears the value of url field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearUrl() {
      return url(Optional.empty());
    }

    public abstract ReasoningEngineSpecSourceCodeSpecGitSource build();
  }

  /** Deserializes a JSON string to a ReasoningEngineSpecSourceCodeSpecGitSource object. */
  @ExcludeFromGeneratedCoverageReport
  public static ReasoningEngineSpecSourceCodeSpecGitSource fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(
        jsonString, ReasoningEngineSpecSourceCodeSpecGitSource.class);
  }
}
