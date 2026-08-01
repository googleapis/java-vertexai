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

/**
 * Input only. Action to take on the source SandboxEnvironment after the snapshot is taken. This
 * field is only used in CreateSandboxEnvironmentSnapshotRequest and it is not stored in the
 * resource.
 */
public class PostSnapshotAction {

  /** Enum representing the known values for PostSnapshotAction. */
  public enum Known {
    /** The default value. This value is unused. */
    POST_SNAPSHOT_ACTION_UNSPECIFIED,

    /** Sandbox environment will continue to run after snapshot is taken. */
    RUNNING,

    /** Sandbox environment will be paused after snapshot is taken. */
    PAUSE
  }

  private Known postSnapshotActionEnum;
  private final String value;

  @JsonCreator
  public PostSnapshotAction(String value) {
    this.value = value;
    for (Known postSnapshotActionEnum : Known.values()) {
      if (Ascii.equalsIgnoreCase(postSnapshotActionEnum.toString(), value)) {
        this.postSnapshotActionEnum = postSnapshotActionEnum;
        break;
      }
    }
    if (this.postSnapshotActionEnum == null) {
      this.postSnapshotActionEnum = Known.POST_SNAPSHOT_ACTION_UNSPECIFIED;
    }
  }

  public PostSnapshotAction(Known knownValue) {
    this.postSnapshotActionEnum = knownValue;
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

    if (!(o instanceof PostSnapshotAction)) {
      return false;
    }

    PostSnapshotAction other = (PostSnapshotAction) o;

    if (this.postSnapshotActionEnum != Known.POST_SNAPSHOT_ACTION_UNSPECIFIED
        && other.postSnapshotActionEnum != Known.POST_SNAPSHOT_ACTION_UNSPECIFIED) {
      return this.postSnapshotActionEnum == other.postSnapshotActionEnum;
    } else if (this.postSnapshotActionEnum == Known.POST_SNAPSHOT_ACTION_UNSPECIFIED
        && other.postSnapshotActionEnum == Known.POST_SNAPSHOT_ACTION_UNSPECIFIED) {
      return this.value.equals(other.value);
    }
    return false;
  }

  @ExcludeFromGeneratedCoverageReport
  @Override
  public int hashCode() {
    if (this.postSnapshotActionEnum != Known.POST_SNAPSHOT_ACTION_UNSPECIFIED) {
      return this.postSnapshotActionEnum.hashCode();
    } else {
      return Objects.hashCode(this.value);
    }
  }

  @ExcludeFromGeneratedCoverageReport
  public Known knownEnum() {
    return this.postSnapshotActionEnum;
  }
}
