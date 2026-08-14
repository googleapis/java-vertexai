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

import static com.google.common.collect.ImmutableList.toImmutableList;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.genai.JsonSerializable;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/** The response for listing Memory Banks. */
@AutoValue
@JsonDeserialize(builder = ListMemoryBanksResponse.Builder.class)
public abstract class ListMemoryBanksResponse extends JsonSerializable {
  /** The list of Memory Banks. */
  @JsonProperty("memoryBanks")
  public abstract Optional<List<MemoryBank>> memoryBanks();

  /** Instantiates a builder for ListMemoryBanksResponse. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_ListMemoryBanksResponse.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for ListMemoryBanksResponse. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `ListMemoryBanksResponse.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_ListMemoryBanksResponse.Builder();
    }

    /**
     * Setter for memoryBanks.
     *
     * <p>memoryBanks: The list of Memory Banks.
     */
    @JsonProperty("memoryBanks")
    @CanIgnoreReturnValue
    public Builder memoryBanks(List<MemoryBank> memoryBanks) {
      if (memoryBanks().isPresent()) {
        List<MemoryBank> list = new java.util.ArrayList<>(memoryBanks().get());
        list.addAll(memoryBanks);
        return memoryBanks(java.util.Optional.of(list));
      }
      return memoryBanks(java.util.Optional.of(memoryBanks));
    }

    /**
     * Setter for memoryBanks.
     *
     * <p>memoryBanks: The list of Memory Banks.
     */
    @CanIgnoreReturnValue
    public Builder memoryBanks(MemoryBank... memoryBanks) {
      return memoryBanks(Arrays.asList(memoryBanks));
    }

    /**
     * Setter for memoryBanks builder.
     *
     * <p>memoryBanks: The list of Memory Banks.
     */
    @CanIgnoreReturnValue
    public Builder memoryBanks(MemoryBank.Builder... memoryBanksBuilders) {
      return memoryBanks(
          Arrays.asList(memoryBanksBuilders).stream()
              .map(MemoryBank.Builder::build)
              .collect(toImmutableList()));
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Optional<List<MemoryBank>> memoryBanks();

    @ExcludeFromGeneratedCoverageReport
    abstract Builder memoryBanks(Optional<List<MemoryBank>> memoryBanks);

    /** Clears the value of memoryBanks field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearMemoryBanks() {
      return memoryBanks(Optional.empty());
    }

    public abstract ListMemoryBanksResponse build();
  }

  /** Deserializes a JSON string to a ListMemoryBanksResponse object. */
  @ExcludeFromGeneratedCoverageReport
  public static ListMemoryBanksResponse fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, ListMemoryBanksResponse.class);
  }
}
