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

/** Metadata the model returned alongside the content it generated. */
@AutoValue
@JsonDeserialize(builder = SchemaPromptSpecContentMetadata.Builder.class)
public abstract class SchemaPromptSpecContentMetadata extends JsonSerializable {
  /** Optional. Citations that apply to the content. */
  @JsonProperty("citationMetadata")
  public abstract Optional<CitationMetadata> citationMetadata();

  /** Optional. Sources used to ground the content. */
  @JsonProperty("groundingMetadata")
  public abstract Optional<GroundingMetadata> groundingMetadata();

  /** Instantiates a builder for SchemaPromptSpecContentMetadata. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_SchemaPromptSpecContentMetadata.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for SchemaPromptSpecContentMetadata. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `SchemaPromptSpecContentMetadata.builder()` for instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_SchemaPromptSpecContentMetadata.Builder();
    }

    /**
     * Setter for citationMetadata.
     *
     * <p>citationMetadata: Optional. Citations that apply to the content.
     */
    @JsonProperty("citationMetadata")
    public abstract Builder citationMetadata(CitationMetadata citationMetadata);

    /**
     * Setter for citationMetadata builder.
     *
     * <p>citationMetadata: Optional. Citations that apply to the content.
     */
    @CanIgnoreReturnValue
    public Builder citationMetadata(CitationMetadata.Builder citationMetadataBuilder) {
      return citationMetadata(citationMetadataBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder citationMetadata(Optional<CitationMetadata> citationMetadata);

    /** Clears the value of citationMetadata field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearCitationMetadata() {
      return citationMetadata(Optional.empty());
    }

    /**
     * Setter for groundingMetadata.
     *
     * <p>groundingMetadata: Optional. Sources used to ground the content.
     */
    @JsonProperty("groundingMetadata")
    public abstract Builder groundingMetadata(GroundingMetadata groundingMetadata);

    /**
     * Setter for groundingMetadata builder.
     *
     * <p>groundingMetadata: Optional. Sources used to ground the content.
     */
    @CanIgnoreReturnValue
    public Builder groundingMetadata(GroundingMetadata.Builder groundingMetadataBuilder) {
      return groundingMetadata(groundingMetadataBuilder.build());
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder groundingMetadata(Optional<GroundingMetadata> groundingMetadata);

    /** Clears the value of groundingMetadata field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearGroundingMetadata() {
      return groundingMetadata(Optional.empty());
    }

    public abstract SchemaPromptSpecContentMetadata build();
  }

  /** Deserializes a JSON string to a SchemaPromptSpecContentMetadata object. */
  @ExcludeFromGeneratedCoverageReport
  public static SchemaPromptSpecContentMetadata fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, SchemaPromptSpecContentMetadata.class);
  }
}
