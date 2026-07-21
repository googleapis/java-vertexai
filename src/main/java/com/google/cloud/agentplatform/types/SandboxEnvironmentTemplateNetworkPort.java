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

/** Represents a network port in a container. */
@AutoValue
@JsonDeserialize(builder = SandboxEnvironmentTemplateNetworkPort.Builder.class)
public abstract class SandboxEnvironmentTemplateNetworkPort extends JsonSerializable {
  /** Optional. Port number to expose. This must be a valid port number, between 1 and 65535. */
  @JsonProperty("port")
  public abstract Optional<Integer> port();

  /** Optional. Protocol for port. Defaults to TCP if not specified. */
  @JsonProperty("protocol")
  public abstract Optional<Protocol> protocol();

  /** Instantiates a builder for SandboxEnvironmentTemplateNetworkPort. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_SandboxEnvironmentTemplateNetworkPort.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for SandboxEnvironmentTemplateNetworkPort. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `SandboxEnvironmentTemplateNetworkPort.builder()` for
     * instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_SandboxEnvironmentTemplateNetworkPort.Builder();
    }

    /**
     * Setter for port.
     *
     * <p>port: Optional. Port number to expose. This must be a valid port number, between 1 and
     * 65535.
     */
    @JsonProperty("port")
    public abstract Builder port(Integer port);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder port(Optional<Integer> port);

    /** Clears the value of port field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearPort() {
      return port(Optional.empty());
    }

    /**
     * Setter for protocol.
     *
     * <p>protocol: Optional. Protocol for port. Defaults to TCP if not specified.
     */
    @JsonProperty("protocol")
    public abstract Builder protocol(Protocol protocol);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder protocol(Optional<Protocol> protocol);

    /** Clears the value of protocol field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearProtocol() {
      return protocol(Optional.empty());
    }

    /**
     * Setter for protocol given a known enum.
     *
     * <p>protocol: Optional. Protocol for port. Defaults to TCP if not specified.
     */
    @CanIgnoreReturnValue
    public Builder protocol(Protocol.Known knownType) {
      return protocol(new Protocol(knownType));
    }

    /**
     * Setter for protocol given a string.
     *
     * <p>protocol: Optional. Protocol for port. Defaults to TCP if not specified.
     */
    @CanIgnoreReturnValue
    public Builder protocol(String protocol) {
      return protocol(new Protocol(protocol));
    }

    public abstract SandboxEnvironmentTemplateNetworkPort build();
  }

  /** Deserializes a JSON string to a SandboxEnvironmentTemplateNetworkPort object. */
  @ExcludeFromGeneratedCoverageReport
  public static SandboxEnvironmentTemplateNetworkPort fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, SandboxEnvironmentTemplateNetworkPort.class);
  }
}
