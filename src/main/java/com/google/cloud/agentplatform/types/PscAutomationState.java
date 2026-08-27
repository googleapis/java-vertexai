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

/** Output only. The state of the PSC service automation. */
public class PscAutomationState {

  /** Enum representing the known values for PscAutomationState. */
  public enum Known {
    /** Should not be used. */
    PSC_AUTOMATION_STATE_UNSPECIFIED,

    /** The PSC service automation is successful. */
    PSC_AUTOMATION_STATE_SUCCESSFUL,

    /** The PSC service automation has failed. */
    PSC_AUTOMATION_STATE_FAILED
  }

  private Known pscAutomationStateEnum;
  private final String value;

  @JsonCreator
  public PscAutomationState(String value) {
    this.value = value;
    for (Known pscAutomationStateEnum : Known.values()) {
      if (Ascii.equalsIgnoreCase(pscAutomationStateEnum.toString(), value)) {
        this.pscAutomationStateEnum = pscAutomationStateEnum;
        break;
      }
    }
    if (this.pscAutomationStateEnum == null) {
      this.pscAutomationStateEnum = Known.PSC_AUTOMATION_STATE_UNSPECIFIED;
    }
  }

  public PscAutomationState(Known knownValue) {
    this.pscAutomationStateEnum = knownValue;
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

    if (!(o instanceof PscAutomationState)) {
      return false;
    }

    PscAutomationState other = (PscAutomationState) o;

    if (this.pscAutomationStateEnum != Known.PSC_AUTOMATION_STATE_UNSPECIFIED
        && other.pscAutomationStateEnum != Known.PSC_AUTOMATION_STATE_UNSPECIFIED) {
      return this.pscAutomationStateEnum == other.pscAutomationStateEnum;
    } else if (this.pscAutomationStateEnum == Known.PSC_AUTOMATION_STATE_UNSPECIFIED
        && other.pscAutomationStateEnum == Known.PSC_AUTOMATION_STATE_UNSPECIFIED) {
      return this.value.equals(other.value);
    }
    return false;
  }

  @ExcludeFromGeneratedCoverageReport
  @Override
  public int hashCode() {
    if (this.pscAutomationStateEnum != Known.PSC_AUTOMATION_STATE_UNSPECIFIED) {
      return this.pscAutomationStateEnum.hashCode();
    } else {
      return Objects.hashCode(this.value);
    }
  }

  @ExcludeFromGeneratedCoverageReport
  public Known knownEnum() {
    return this.pscAutomationStateEnum;
  }
}
