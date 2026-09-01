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

/** Output only. The state of the sandbox environment template. */
public class SandboxEnvironmentTemplateState {

  /** Enum representing the known values for SandboxEnvironmentTemplateState. */
  public enum Known {
    /** The default value. This value is unused. */
    UNSPECIFIED,

    /** Runtime resources are being allocated for the sandbox environment. */
    PROVISIONING,

    /** Sandbox runtime is ready for serving. */
    ACTIVE,

    /** Sandbox runtime is halted, performing tear down tasks. */
    DEPROVISIONING,

    /** Sandbox has terminated with underlying runtime failure. */
    DELETED,

    /** Sandbox has failed to provision. */
    FAILED,

    SANDBOX_ENVIRONMENT_TEMPLATE_STATE_UNSPECIFIED
  }

  private Known sandboxEnvironmentTemplateStateEnum;
  private final String value;

  @JsonCreator
  public SandboxEnvironmentTemplateState(String value) {
    this.value = value;
    for (Known sandboxEnvironmentTemplateStateEnum : Known.values()) {
      if (Ascii.equalsIgnoreCase(sandboxEnvironmentTemplateStateEnum.toString(), value)) {
        this.sandboxEnvironmentTemplateStateEnum = sandboxEnvironmentTemplateStateEnum;
        break;
      }
    }
    if (this.sandboxEnvironmentTemplateStateEnum == null) {
      this.sandboxEnvironmentTemplateStateEnum =
          Known.SANDBOX_ENVIRONMENT_TEMPLATE_STATE_UNSPECIFIED;
    }
  }

  public SandboxEnvironmentTemplateState(Known knownValue) {
    this.sandboxEnvironmentTemplateStateEnum = knownValue;
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

    if (!(o instanceof SandboxEnvironmentTemplateState)) {
      return false;
    }

    SandboxEnvironmentTemplateState other = (SandboxEnvironmentTemplateState) o;

    if (this.sandboxEnvironmentTemplateStateEnum
            != Known.SANDBOX_ENVIRONMENT_TEMPLATE_STATE_UNSPECIFIED
        && other.sandboxEnvironmentTemplateStateEnum
            != Known.SANDBOX_ENVIRONMENT_TEMPLATE_STATE_UNSPECIFIED) {
      return this.sandboxEnvironmentTemplateStateEnum == other.sandboxEnvironmentTemplateStateEnum;
    } else if (this.sandboxEnvironmentTemplateStateEnum
            == Known.SANDBOX_ENVIRONMENT_TEMPLATE_STATE_UNSPECIFIED
        && other.sandboxEnvironmentTemplateStateEnum
            == Known.SANDBOX_ENVIRONMENT_TEMPLATE_STATE_UNSPECIFIED) {
      return this.value.equals(other.value);
    }
    return false;
  }

  @ExcludeFromGeneratedCoverageReport
  @Override
  public int hashCode() {
    if (this.sandboxEnvironmentTemplateStateEnum
        != Known.SANDBOX_ENVIRONMENT_TEMPLATE_STATE_UNSPECIFIED) {
      return this.sandboxEnvironmentTemplateStateEnum.hashCode();
    } else {
      return Objects.hashCode(this.value);
    }
  }

  @ExcludeFromGeneratedCoverageReport
  public Known knownEnum() {
    return this.sandboxEnvironmentTemplateStateEnum;
  }
}
