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

/** Protocol for port. Defaults to TCP if not specified. */
public class Protocol {

  /** Enum representing the known values for Protocol. */
  public enum Known {
    /** Unspecified protocol. Defaults to TCP. */
    PROTOCOL_UNSPECIFIED,

    /** TCP protocol. */
    TCP,

    /** UDP protocol. */
    UDP
  }

  private Known protocolEnum;
  private final String value;

  @JsonCreator
  public Protocol(String value) {
    this.value = value;
    for (Known protocolEnum : Known.values()) {
      if (Ascii.equalsIgnoreCase(protocolEnum.toString(), value)) {
        this.protocolEnum = protocolEnum;
        break;
      }
    }
    if (this.protocolEnum == null) {
      this.protocolEnum = Known.PROTOCOL_UNSPECIFIED;
    }
  }

  public Protocol(Known knownValue) {
    this.protocolEnum = knownValue;
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

    if (!(o instanceof Protocol)) {
      return false;
    }

    Protocol other = (Protocol) o;

    if (this.protocolEnum != Known.PROTOCOL_UNSPECIFIED
        && other.protocolEnum != Known.PROTOCOL_UNSPECIFIED) {
      return this.protocolEnum == other.protocolEnum;
    } else if (this.protocolEnum == Known.PROTOCOL_UNSPECIFIED
        && other.protocolEnum == Known.PROTOCOL_UNSPECIFIED) {
      return this.value.equals(other.value);
    }
    return false;
  }

  @ExcludeFromGeneratedCoverageReport
  @Override
  public int hashCode() {
    if (this.protocolEnum != Known.PROTOCOL_UNSPECIFIED) {
      return this.protocolEnum.hashCode();
    } else {
      return Objects.hashCode(this.value);
    }
  }

  @ExcludeFromGeneratedCoverageReport
  public Known knownEnum() {
    return this.protocolEnum;
  }
}
