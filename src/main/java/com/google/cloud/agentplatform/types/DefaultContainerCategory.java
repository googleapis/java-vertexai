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

/** The category of the default container image. */
public class DefaultContainerCategory {

  /** Enum representing the known values for DefaultContainerCategory. */
  public enum Known {
    /** The default value. This value is unused. */
    DEFAULT_CONTAINER_CATEGORY_UNSPECIFIED,

    /** The default container image for Computer Use. */
    DEFAULT_CONTAINER_CATEGORY_COMPUTER_USE
  }

  private Known defaultContainerCategoryEnum;
  private final String value;

  @JsonCreator
  public DefaultContainerCategory(String value) {
    this.value = value;
    for (Known defaultContainerCategoryEnum : Known.values()) {
      if (Ascii.equalsIgnoreCase(defaultContainerCategoryEnum.toString(), value)) {
        this.defaultContainerCategoryEnum = defaultContainerCategoryEnum;
        break;
      }
    }
    if (this.defaultContainerCategoryEnum == null) {
      this.defaultContainerCategoryEnum = Known.DEFAULT_CONTAINER_CATEGORY_UNSPECIFIED;
    }
  }

  public DefaultContainerCategory(Known knownValue) {
    this.defaultContainerCategoryEnum = knownValue;
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

    if (!(o instanceof DefaultContainerCategory)) {
      return false;
    }

    DefaultContainerCategory other = (DefaultContainerCategory) o;

    if (this.defaultContainerCategoryEnum != Known.DEFAULT_CONTAINER_CATEGORY_UNSPECIFIED
        && other.defaultContainerCategoryEnum != Known.DEFAULT_CONTAINER_CATEGORY_UNSPECIFIED) {
      return this.defaultContainerCategoryEnum == other.defaultContainerCategoryEnum;
    } else if (this.defaultContainerCategoryEnum == Known.DEFAULT_CONTAINER_CATEGORY_UNSPECIFIED
        && other.defaultContainerCategoryEnum == Known.DEFAULT_CONTAINER_CATEGORY_UNSPECIFIED) {
      return this.value.equals(other.value);
    }
    return false;
  }

  @ExcludeFromGeneratedCoverageReport
  @Override
  public int hashCode() {
    if (this.defaultContainerCategoryEnum != Known.DEFAULT_CONTAINER_CATEGORY_UNSPECIFIED) {
      return this.defaultContainerCategoryEnum.hashCode();
    } else {
      return Objects.hashCode(this.value);
    }
  }

  @ExcludeFromGeneratedCoverageReport
  public Known knownEnum() {
    return this.defaultContainerCategoryEnum;
  }
}
