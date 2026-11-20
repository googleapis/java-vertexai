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

/** C2PA Content Credentials verification result for a media part. */
@AutoValue
@JsonDeserialize(builder = C2paResult.Builder.class)
public abstract class C2paResult extends JsonSerializable {
  /** Output only. Verification outcome for C2PA Content Credentials. */
  @JsonProperty("outcome")
  public abstract Optional<C2paResultOutcome> outcome();

  /** Output only. Verified C2PA manifest details, populated when outcome is VALID_MANIFEST. */
  @JsonProperty("manifest")
  public abstract Optional<C2paResultManifest> manifest();

  /** Instantiates a builder for C2paResult. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_C2paResult.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for C2paResult. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `C2paResult.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_C2paResult.Builder();
    }

    /**
     * Setter for outcome.
     *
     * <p>outcome: Output only. Verification outcome for C2PA Content Credentials.
     */
    @JsonProperty("outcome")
    public abstract Builder outcome(C2paResultOutcome outcome);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder outcome(Optional<C2paResultOutcome> outcome);

    /** Clears the value of outcome field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearOutcome() {
      return outcome(Optional.empty());
    }

    /**
     * Setter for outcome given a known enum.
     *
     * <p>outcome: Output only. Verification outcome for C2PA Content Credentials.
     */
    @CanIgnoreReturnValue
    public Builder outcome(C2paResultOutcome.Known knownType) {
      return outcome(new C2paResultOutcome(knownType));
    }

    /**
     * Setter for outcome given a string.
     *
     * <p>outcome: Output only. Verification outcome for C2PA Content Credentials.
     */
    @CanIgnoreReturnValue
    public Builder outcome(String outcome) {
      return outcome(new C2paResultOutcome(outcome));
    }

    /**
     * Setter for manifest.
     *
     * <p>manifest: Output only. Verified C2PA manifest details, populated when outcome is
     * VALID_MANIFEST.
     */
    @JsonProperty("manifest")
    public abstract Builder manifest(C2paResultManifest manifest);

    /**
     * Setter for manifest builder.
     *
     * <p>manifest: Output only. Verified C2PA manifest details, populated when outcome is
     * VALID_MANIFEST.
     */
    @CanIgnoreReturnValue
    public Builder manifest(C2paResultManifest.Builder manifestBuilder) {
      return manifest(manifestBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder manifest(Optional<C2paResultManifest> manifest);

    /** Clears the value of manifest field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearManifest() {
      return manifest(Optional.empty());
    }

    public abstract C2paResult build();
  }

  /** Deserializes a JSON string to a C2paResult object. */
  @ExcludeFromGeneratedCoverageReport
  public static C2paResult fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, C2paResult.class);
  }
}
