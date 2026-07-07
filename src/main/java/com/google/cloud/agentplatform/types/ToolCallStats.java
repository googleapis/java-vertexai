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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.genai.JsonSerializable;
import java.util.Optional;

/** */
@AutoValue
@JsonDeserialize(builder = ToolCallStats.Builder.class)
public abstract class ToolCallStats extends JsonSerializable {
  /**
   * Output only. Note: Assuming `ToolType` mapping or just standardizing on strings depending on
   * Vertex's `Tool` definitions.
   */
  @JsonProperty("functionName")
  public abstract Optional<String> functionName();

  /** toolCallCount */
  @JsonProperty("toolCallCount")
  public abstract Optional<Integer> toolCallCount();

  /** serverExecuted */
  @JsonProperty("serverExecuted")
  public abstract Optional<Boolean> serverExecuted();

  /** Instantiates a builder for ToolCallStats. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_ToolCallStats.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for ToolCallStats. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `ToolCallStats.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_ToolCallStats.Builder();
    }

    /**
     * Setter for functionName.
     *
     * <p>functionName: Output only. Note: Assuming `ToolType` mapping or just standardizing on
     * strings depending on Vertex's `Tool` definitions.
     */
    @JsonProperty("functionName")
    public abstract Builder functionName(String functionName);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder functionName(Optional<String> functionName);

    /** Clears the value of functionName field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearFunctionName() {
      return functionName(Optional.empty());
    }

    /**
     * Setter for toolCallCount.
     *
     * <p>toolCallCount: toolCallCount
     */
    @JsonProperty("toolCallCount")
    public abstract Builder toolCallCount(Integer toolCallCount);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder toolCallCount(Optional<Integer> toolCallCount);

    /** Clears the value of toolCallCount field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearToolCallCount() {
      return toolCallCount(Optional.empty());
    }

    /**
     * Setter for serverExecuted.
     *
     * <p>serverExecuted: serverExecuted
     */
    @JsonProperty("serverExecuted")
    public abstract Builder serverExecuted(boolean serverExecuted);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder serverExecuted(Optional<Boolean> serverExecuted);

    /** Clears the value of serverExecuted field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearServerExecuted() {
      return serverExecuted(Optional.empty());
    }

    public abstract ToolCallStats build();
  }

  /** Deserializes a JSON string to a ToolCallStats object. */
  @ExcludeFromGeneratedCoverageReport
  public static ToolCallStats fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, ToolCallStats.class);
  }
}
