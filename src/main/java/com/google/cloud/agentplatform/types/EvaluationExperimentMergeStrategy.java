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

/** Merge strategy for the evaluation experiment. */
public class EvaluationExperimentMergeStrategy {

  /** Enum representing the known values for EvaluationExperimentMergeStrategy. */
  public enum Known {
    /** Unspecified merge strategy. */
    MERGE_STRATEGY_UNSPECIFIED,

    /** Default. Runs are treated as an independent, sequential history. */
    SEQUENTIAL_HISTORY,

    /** Runs are parallel iterations contributing to a shared result set. */
    SHARED_RESULT_SET,

    EVALUATION_EXPERIMENT_MERGE_STRATEGY_UNSPECIFIED
  }

  private Known evaluationExperimentMergeStrategyEnum;
  private final String value;

  @JsonCreator
  public EvaluationExperimentMergeStrategy(String value) {
    this.value = value;
    for (Known evaluationExperimentMergeStrategyEnum : Known.values()) {
      if (Ascii.equalsIgnoreCase(evaluationExperimentMergeStrategyEnum.toString(), value)) {
        this.evaluationExperimentMergeStrategyEnum = evaluationExperimentMergeStrategyEnum;
        break;
      }
    }
    if (this.evaluationExperimentMergeStrategyEnum == null) {
      this.evaluationExperimentMergeStrategyEnum =
          Known.EVALUATION_EXPERIMENT_MERGE_STRATEGY_UNSPECIFIED;
    }
  }

  public EvaluationExperimentMergeStrategy(Known knownValue) {
    this.evaluationExperimentMergeStrategyEnum = knownValue;
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

    if (!(o instanceof EvaluationExperimentMergeStrategy)) {
      return false;
    }

    EvaluationExperimentMergeStrategy other = (EvaluationExperimentMergeStrategy) o;

    if (this.evaluationExperimentMergeStrategyEnum
            != Known.EVALUATION_EXPERIMENT_MERGE_STRATEGY_UNSPECIFIED
        && other.evaluationExperimentMergeStrategyEnum
            != Known.EVALUATION_EXPERIMENT_MERGE_STRATEGY_UNSPECIFIED) {
      return this.evaluationExperimentMergeStrategyEnum
          == other.evaluationExperimentMergeStrategyEnum;
    } else if (this.evaluationExperimentMergeStrategyEnum
            == Known.EVALUATION_EXPERIMENT_MERGE_STRATEGY_UNSPECIFIED
        && other.evaluationExperimentMergeStrategyEnum
            == Known.EVALUATION_EXPERIMENT_MERGE_STRATEGY_UNSPECIFIED) {
      return this.value.equals(other.value);
    }
    return false;
  }

  @ExcludeFromGeneratedCoverageReport
  @Override
  public int hashCode() {
    if (this.evaluationExperimentMergeStrategyEnum
        != Known.EVALUATION_EXPERIMENT_MERGE_STRATEGY_UNSPECIFIED) {
      return this.evaluationExperimentMergeStrategyEnum.hashCode();
    } else {
      return Objects.hashCode(this.value);
    }
  }

  @ExcludeFromGeneratedCoverageReport
  public Known knownEnum() {
    return this.evaluationExperimentMergeStrategyEnum;
  }
}
