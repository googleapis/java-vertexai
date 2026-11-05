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

/** Outcome of C2PA Content Credentials verification. */
public class C2paResultOutcome {

  /** Enum representing the known values for C2paResultOutcome. */
  public enum Known {
    /** Default unspecified outcome. */
    OUTCOME_UNSPECIFIED,

    /** Valid C2PA Content Credentials manifest detected and verified. */
    VALID_MANIFEST,

    /** No C2PA Content Credentials manifest found in the media. */
    NOT_DETECTED,

    /** C2PA manifest was found but failed cryptographic or structural validation. */
    INVALID_MANIFEST,

    /** Media format is not supported for C2PA extraction. */
    UNSUPPORTED_FORMAT,

    C2PA_RESULT_OUTCOME_UNSPECIFIED
  }

  private Known c2paResultOutcomeEnum;
  private final String value;

  @JsonCreator
  public C2paResultOutcome(String value) {
    this.value = value;
    for (Known c2paResultOutcomeEnum : Known.values()) {
      if (Ascii.equalsIgnoreCase(c2paResultOutcomeEnum.toString(), value)) {
        this.c2paResultOutcomeEnum = c2paResultOutcomeEnum;
        break;
      }
    }
    if (this.c2paResultOutcomeEnum == null) {
      this.c2paResultOutcomeEnum = Known.C2PA_RESULT_OUTCOME_UNSPECIFIED;
    }
  }

  public C2paResultOutcome(Known knownValue) {
    this.c2paResultOutcomeEnum = knownValue;
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

    if (!(o instanceof C2paResultOutcome)) {
      return false;
    }

    C2paResultOutcome other = (C2paResultOutcome) o;

    if (this.c2paResultOutcomeEnum != Known.C2PA_RESULT_OUTCOME_UNSPECIFIED
        && other.c2paResultOutcomeEnum != Known.C2PA_RESULT_OUTCOME_UNSPECIFIED) {
      return this.c2paResultOutcomeEnum == other.c2paResultOutcomeEnum;
    } else if (this.c2paResultOutcomeEnum == Known.C2PA_RESULT_OUTCOME_UNSPECIFIED
        && other.c2paResultOutcomeEnum == Known.C2PA_RESULT_OUTCOME_UNSPECIFIED) {
      return this.value.equals(other.value);
    }
    return false;
  }

  @ExcludeFromGeneratedCoverageReport
  @Override
  public int hashCode() {
    if (this.c2paResultOutcomeEnum != Known.C2PA_RESULT_OUTCOME_UNSPECIFIED) {
      return this.c2paResultOutcomeEnum.hashCode();
    } else {
      return Objects.hashCode(this.value);
    }
  }

  @ExcludeFromGeneratedCoverageReport
  public Known knownEnum() {
    return this.c2paResultOutcomeEnum;
  }
}
