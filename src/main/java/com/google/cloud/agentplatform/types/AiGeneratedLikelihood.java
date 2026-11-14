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
import com.fasterxml.jackson.annotation.JsonValue;
import com.google.common.base.Ascii;
import java.util.Objects;

/** Categorical likelihood that the content was generated or modified by AI. */
public class AiGeneratedLikelihood {

  /** Enum representing the known values for AiGeneratedLikelihood. */
  public enum Known {
    /** Default unspecified likelihood. */
    AI_GENERATED_LIKELIHOOD_UNSPECIFIED,

    /** Very low likelihood that the content is AI-generated or AI-modified. */
    VERY_LOW,

    /** Low likelihood that the content is AI-generated or AI-modified. */
    LOW,

    /** Medium likelihood that the content is AI-generated or AI-modified. */
    MEDIUM,

    /** High likelihood that the content is AI-generated or AI-modified. */
    HIGH,

    /** Very high likelihood that the content is AI-generated or AI-modified. */
    VERY_HIGH
  }

  private Known aiGeneratedLikelihoodEnum;
  private final String value;

  @JsonCreator
  public AiGeneratedLikelihood(String value) {
    this.value = value;
    for (Known aiGeneratedLikelihoodEnum : Known.values()) {
      if (Ascii.equalsIgnoreCase(aiGeneratedLikelihoodEnum.toString(), value)) {
        this.aiGeneratedLikelihoodEnum = aiGeneratedLikelihoodEnum;
        break;
      }
    }
    if (this.aiGeneratedLikelihoodEnum == null) {
      this.aiGeneratedLikelihoodEnum = Known.AI_GENERATED_LIKELIHOOD_UNSPECIFIED;
    }
  }

  public AiGeneratedLikelihood(Known knownValue) {
    this.aiGeneratedLikelihoodEnum = knownValue;
    this.value = knownValue.toString();
  }

  @ExcludeFromGeneratedCoverageReport
  @Override
  @JsonValue
  public String toString() {
    return this.value;
  }

  @ExcludeFromGeneratedCoverageReport
  @SuppressWarnings("PatternMatchingInstanceof")
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null) {
      return false;
    }

    if (!(o instanceof AiGeneratedLikelihood)) {
      return false;
    }

    AiGeneratedLikelihood other = (AiGeneratedLikelihood) o;

    if (this.aiGeneratedLikelihoodEnum != Known.AI_GENERATED_LIKELIHOOD_UNSPECIFIED
        && other.aiGeneratedLikelihoodEnum != Known.AI_GENERATED_LIKELIHOOD_UNSPECIFIED) {
      return this.aiGeneratedLikelihoodEnum == other.aiGeneratedLikelihoodEnum;
    } else if (this.aiGeneratedLikelihoodEnum == Known.AI_GENERATED_LIKELIHOOD_UNSPECIFIED
        && other.aiGeneratedLikelihoodEnum == Known.AI_GENERATED_LIKELIHOOD_UNSPECIFIED) {
      return this.value.equals(other.value);
    }
    return false;
  }

  @ExcludeFromGeneratedCoverageReport
  @Override
  public int hashCode() {
    if (this.aiGeneratedLikelihoodEnum != Known.AI_GENERATED_LIKELIHOOD_UNSPECIFIED) {
      return this.aiGeneratedLikelihoodEnum.hashCode();
    } else {
      return Objects.hashCode(this.value);
    }
  }

  @ExcludeFromGeneratedCoverageReport
  public Known knownEnum() {
    return this.aiGeneratedLikelihoodEnum;
  }
}
