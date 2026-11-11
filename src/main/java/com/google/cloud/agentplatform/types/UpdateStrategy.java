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

/** The strategy for updating warm pool instances when the template is updated. */
public class UpdateStrategy {

  /** Enum representing the known values for UpdateStrategy. */
  public enum Known {
    /** Unspecified update strategy. Defaults to ON_REPLENISH. */
    UPDATE_STRATEGY_UNSPECIFIED,

    /**
     * Existing warm pool pods are left running and new pods use the updated template as the warm
     * pool is replenished.
     */
    ON_REPLENISH,

    /** Existing warm pool pods are recreated immediately with the updated template. */
    RECREATE
  }

  private Known updateStrategyEnum;
  private final String value;

  @JsonCreator
  public UpdateStrategy(String value) {
    this.value = value;
    for (Known updateStrategyEnum : Known.values()) {
      if (Ascii.equalsIgnoreCase(updateStrategyEnum.toString(), value)) {
        this.updateStrategyEnum = updateStrategyEnum;
        break;
      }
    }
    if (this.updateStrategyEnum == null) {
      this.updateStrategyEnum = Known.UPDATE_STRATEGY_UNSPECIFIED;
    }
  }

  public UpdateStrategy(Known knownValue) {
    this.updateStrategyEnum = knownValue;
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

    if (!(o instanceof UpdateStrategy)) {
      return false;
    }

    UpdateStrategy other = (UpdateStrategy) o;

    if (this.updateStrategyEnum != Known.UPDATE_STRATEGY_UNSPECIFIED
        && other.updateStrategyEnum != Known.UPDATE_STRATEGY_UNSPECIFIED) {
      return this.updateStrategyEnum == other.updateStrategyEnum;
    } else if (this.updateStrategyEnum == Known.UPDATE_STRATEGY_UNSPECIFIED
        && other.updateStrategyEnum == Known.UPDATE_STRATEGY_UNSPECIFIED) {
      return this.value.equals(other.value);
    }
    return false;
  }

  @ExcludeFromGeneratedCoverageReport
  @Override
  public int hashCode() {
    if (this.updateStrategyEnum != Known.UPDATE_STRATEGY_UNSPECIFIED) {
      return this.updateStrategyEnum.hashCode();
    } else {
      return Objects.hashCode(this.value);
    }
  }

  @ExcludeFromGeneratedCoverageReport
  public Known knownEnum() {
    return this.updateStrategyEnum;
  }
}
