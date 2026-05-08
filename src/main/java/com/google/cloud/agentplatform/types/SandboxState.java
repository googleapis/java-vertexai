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

/** Output only. The runtime state of the SandboxEnvironment. */
public class SandboxState {

  /** Enum representing the known values for SandboxState. */
  public enum Known {
    /** The default value. This value is unused. */
    STATE_UNSPECIFIED,

    /** Runtime resources are being allocated for the sandbox environment. */
    STATE_PROVISIONING,

    /** Sandbox runtime is ready for serving. */
    STATE_RUNNING,

    /** Sandbox runtime is halted, performing tear down tasks. */
    STATE_DEPROVISIONING,

    /** Sandbox has terminated with underlying runtime failure. */
    STATE_TERMINATED,

    /** Sandbox runtime has been deleted. */
    STATE_DELETED,

    SANDBOX_STATE_UNSPECIFIED
  }

  private Known sandboxStateEnum;
  private final String value;

  @JsonCreator
  public SandboxState(String value) {
    this.value = value;
    for (Known sandboxStateEnum : Known.values()) {
      if (Ascii.equalsIgnoreCase(sandboxStateEnum.toString(), value)) {
        this.sandboxStateEnum = sandboxStateEnum;
        break;
      }
    }
    if (this.sandboxStateEnum == null) {
      this.sandboxStateEnum = Known.SANDBOX_STATE_UNSPECIFIED;
    }
  }

  public SandboxState(Known knownValue) {
    this.sandboxStateEnum = knownValue;
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

    if (!(o instanceof SandboxState)) {
      return false;
    }

    SandboxState other = (SandboxState) o;

    if (this.sandboxStateEnum != Known.SANDBOX_STATE_UNSPECIFIED
        && other.sandboxStateEnum != Known.SANDBOX_STATE_UNSPECIFIED) {
      return this.sandboxStateEnum == other.sandboxStateEnum;
    } else if (this.sandboxStateEnum == Known.SANDBOX_STATE_UNSPECIFIED
        && other.sandboxStateEnum == Known.SANDBOX_STATE_UNSPECIFIED) {
      return this.value.equals(other.value);
    }
    return false;
  }

  @ExcludeFromGeneratedCoverageReport
  @Override
  public int hashCode() {
    if (this.sandboxStateEnum != Known.SANDBOX_STATE_UNSPECIFIED) {
      return this.sandboxStateEnum.hashCode();
    } else {
      return Objects.hashCode(this.value);
    }
  }

  @ExcludeFromGeneratedCoverageReport
  public Known knownEnum() {
    return this.sandboxStateEnum;
  }
}
