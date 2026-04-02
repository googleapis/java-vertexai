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

package com.google.cloud.vertexai.genai.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.google.common.base.Ascii;
import java.util.Objects;

/** The type of the memory. */
public class MemoryType {

  /** Enum representing the known values for MemoryType. */
  public enum Known {
    /** Represents an unspecified memory type. This value should not be used. */
    MEMORY_TYPE_UNSPECIFIED,

    /** Indicates belonging to a collection of natural language memories. */
    NATURAL_LANGUAGE_COLLECTION,

    /** Indicates belonging to a structured profile. */
    STRUCTURED_PROFILE
  }

  private Known memoryTypeEnum;
  private final String value;

  @JsonCreator
  public MemoryType(String value) {
    this.value = value;
    for (Known memoryTypeEnum : Known.values()) {
      if (Ascii.equalsIgnoreCase(memoryTypeEnum.toString(), value)) {
        this.memoryTypeEnum = memoryTypeEnum;
        break;
      }
    }
    if (this.memoryTypeEnum == null) {
      this.memoryTypeEnum = Known.MEMORY_TYPE_UNSPECIFIED;
    }
  }

  public MemoryType(Known knownValue) {
    this.memoryTypeEnum = knownValue;
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

    if (!(o instanceof MemoryType)) {
      return false;
    }

    MemoryType other = (MemoryType) o;

    if (this.memoryTypeEnum != Known.MEMORY_TYPE_UNSPECIFIED
        && other.memoryTypeEnum != Known.MEMORY_TYPE_UNSPECIFIED) {
      return this.memoryTypeEnum == other.memoryTypeEnum;
    } else if (this.memoryTypeEnum == Known.MEMORY_TYPE_UNSPECIFIED
        && other.memoryTypeEnum == Known.MEMORY_TYPE_UNSPECIFIED) {
      return this.value.equals(other.value);
    }
    return false;
  }

  @ExcludeFromGeneratedCoverageReport
  @Override
  public int hashCode() {
    if (this.memoryTypeEnum != Known.MEMORY_TYPE_UNSPECIFIED) {
      return this.memoryTypeEnum.hashCode();
    } else {
      return Objects.hashCode(this.value);
    }
  }

  @ExcludeFromGeneratedCoverageReport
  public Known knownEnum() {
    return this.memoryTypeEnum;
  }
}
