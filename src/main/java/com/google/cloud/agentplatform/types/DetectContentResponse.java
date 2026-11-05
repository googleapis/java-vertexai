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

/** Response message for PredictionService.DetectContent. */
@AutoValue
@JsonDeserialize(builder = DetectContentResponse.Builder.class)
public abstract class DetectContentResponse extends JsonSerializable {
  /** Output only. Categorical likelihood that the content was generated or modified by AI. */
  @JsonProperty("aiGeneratedLikelihood")
  public abstract Optional<AiGeneratedLikelihood> aiGeneratedLikelihood();

  /** Output only. C2PA Content Credentials verification results. */
  @JsonProperty("c2pa")
  public abstract Optional<List<C2paResult>> c2pa();

  /** Output only. Unique identifier for the detection response. */
  @JsonProperty("responseId")
  public abstract Optional<String> responseId();

  /**
   * Output only. Version of the detection pipeline that produced the verdict (for example,
   * ``ai-content-detection@001``).
   */
  @JsonProperty("modelVersion")
  public abstract Optional<String> modelVersion();

  /** Instantiates a builder for DetectContentResponse. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_DetectContentResponse.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for DetectContentResponse. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `DetectContentResponse.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_DetectContentResponse.Builder();
    }

    /**
     * Setter for aiGeneratedLikelihood.
     *
     * <p>aiGeneratedLikelihood: Output only. Categorical likelihood that the content was generated
     * or modified by AI.
     */
    @JsonProperty("aiGeneratedLikelihood")
    public abstract Builder aiGeneratedLikelihood(AiGeneratedLikelihood aiGeneratedLikelihood);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder aiGeneratedLikelihood(Optional<AiGeneratedLikelihood> aiGeneratedLikelihood);

    /** Clears the value of aiGeneratedLikelihood field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearAiGeneratedLikelihood() {
      return aiGeneratedLikelihood(Optional.empty());
    }

    /**
     * Setter for aiGeneratedLikelihood given a known enum.
     *
     * <p>aiGeneratedLikelihood: Output only. Categorical likelihood that the content was generated
     * or modified by AI.
     */
    @CanIgnoreReturnValue
    public Builder aiGeneratedLikelihood(AiGeneratedLikelihood.Known knownType) {
      return aiGeneratedLikelihood(new AiGeneratedLikelihood(knownType));
    }

    /**
     * Setter for aiGeneratedLikelihood given a string.
     *
     * <p>aiGeneratedLikelihood: Output only. Categorical likelihood that the content was generated
     * or modified by AI.
     */
    @CanIgnoreReturnValue
    public Builder aiGeneratedLikelihood(String aiGeneratedLikelihood) {
      return aiGeneratedLikelihood(new AiGeneratedLikelihood(aiGeneratedLikelihood));
    }

    /**
     * Setter for c2pa.
     *
     * <p>c2pa: Output only. C2PA Content Credentials verification results.
     */
    @JsonProperty("c2pa")
    public abstract Builder c2pa(List<C2paResult> c2pa);

    /**
     * Setter for c2pa.
     *
     * <p>c2pa: Output only. C2PA Content Credentials verification results.
     */
    @CanIgnoreReturnValue
    public Builder c2pa(C2paResult... c2pa) {
      return c2pa(Arrays.asList(c2pa));
    }

    /**
     * Setter for c2pa builder.
     *
     * <p>c2pa: Output only. C2PA Content Credentials verification results.
     */
    @CanIgnoreReturnValue
    public Builder c2pa(C2paResult.Builder... c2paBuilders) {
      return c2pa(
          Arrays.asList(c2paBuilders).stream()
              .map(C2paResult.Builder::build)
              .collect(toImmutableList()));
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder c2pa(Optional<List<C2paResult>> c2pa);

    /** Clears the value of c2pa field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearC2pa() {
      return c2pa(Optional.empty());
    }

    /**
     * Setter for responseId.
     *
     * <p>responseId: Output only. Unique identifier for the detection response.
     */
    @JsonProperty("responseId")
    public abstract Builder responseId(String responseId);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder responseId(Optional<String> responseId);

    /** Clears the value of responseId field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearResponseId() {
      return responseId(Optional.empty());
    }

    /**
     * Setter for modelVersion.
     *
     * <p>modelVersion: Output only. Version of the detection pipeline that produced the verdict
     * (for example, ``ai-content-detection@001``).
     */
    @JsonProperty("modelVersion")
    public abstract Builder modelVersion(String modelVersion);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder modelVersion(Optional<String> modelVersion);

    /** Clears the value of modelVersion field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearModelVersion() {
      return modelVersion(Optional.empty());
    }

    public abstract DetectContentResponse build();
  }

  /** Deserializes a JSON string to a DetectContentResponse object. */
  @ExcludeFromGeneratedCoverageReport
  public static DetectContentResponse fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, DetectContentResponse.class);
  }
}
