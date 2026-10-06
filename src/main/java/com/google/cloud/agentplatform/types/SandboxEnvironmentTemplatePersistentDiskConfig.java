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

/**
 * Configuration for attaching a persistent disk (PD) to each SandboxEnvironment created from this
 * template. A persistent disk provides durable, per-sandbox block storage whose contents survive
 * across the sandbox lifecycle events that this service supports (e.g. pause/resume), unlike
 * ephemeral local storage which is lost when the underlying runtime is torn down.
 */
@AutoValue
@JsonDeserialize(builder = SandboxEnvironmentTemplatePersistentDiskConfig.Builder.class)
public abstract class SandboxEnvironmentTemplatePersistentDiskConfig extends JsonSerializable {
  /**
   * Optional. Whether a persistent disk is attached to sandboxes created from this template.
   * Defaults to `false`. This flag lets a template carry (and preserve) disk configuration while
   * keeping the disk detached, so it can be toggled on later without re-specifying the rest of the
   * config. When `false`, the remaining fields in this message are ignored.
   */
  @JsonProperty("enabled")
  public abstract Optional<Boolean> enabled();

  /**
   * Optional. The absolute path inside the sandbox container at which the persistent disk is
   * mounted. Defaults to `/workspace` when unset. Ignored when `enabled` is `false`. Only writes
   * beneath this path land on the disk. Writes elsewhere go to the container's writable layer,
   * which counts against the container's ephemeral storage and is lost when the sandbox's runtime
   * is torn down, so this should be the directory the workload actually writes to. Paths that would
   * shadow the container's system directories (for example `/etc`, `/proc`, or `/usr` itself) are
   * rejected.
   */
  @JsonProperty("mountPath")
  public abstract Optional<String> mountPath();

  /**
   * Optional. The size of the persistent disk in GB. Must be non-negative. When `enabled` is
   * `true`, a positive value is required; when unset or zero while enabled, the service applies a
   * default size. Ignored when `enabled` is `false`.
   */
  @JsonProperty("sizeGb")
  public abstract Optional<Long> sizeGb();

  /** Instantiates a builder for SandboxEnvironmentTemplatePersistentDiskConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_SandboxEnvironmentTemplatePersistentDiskConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for SandboxEnvironmentTemplatePersistentDiskConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * For internal usage. Please use `SandboxEnvironmentTemplatePersistentDiskConfig.builder()` for
     * instantiation.
     */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_SandboxEnvironmentTemplatePersistentDiskConfig.Builder();
    }

    /**
     * Setter for enabled.
     *
     * <p>enabled: Optional. Whether a persistent disk is attached to sandboxes created from this
     * template. Defaults to `false`. This flag lets a template carry (and preserve) disk
     * configuration while keeping the disk detached, so it can be toggled on later without
     * re-specifying the rest of the config. When `false`, the remaining fields in this message are
     * ignored.
     */
    @JsonProperty("enabled")
    public abstract Builder enabled(boolean enabled);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder enabled(Optional<Boolean> enabled);

    /** Clears the value of enabled field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearEnabled() {
      return enabled(Optional.empty());
    }

    /**
     * Setter for mountPath.
     *
     * <p>mountPath: Optional. The absolute path inside the sandbox container at which the
     * persistent disk is mounted. Defaults to `/workspace` when unset. Ignored when `enabled` is
     * `false`. Only writes beneath this path land on the disk. Writes elsewhere go to the
     * container's writable layer, which counts against the container's ephemeral storage and is
     * lost when the sandbox's runtime is torn down, so this should be the directory the workload
     * actually writes to. Paths that would shadow the container's system directories (for example
     * `/etc`, `/proc`, or `/usr` itself) are rejected.
     */
    @JsonProperty("mountPath")
    public abstract Builder mountPath(String mountPath);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder mountPath(Optional<String> mountPath);

    /** Clears the value of mountPath field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearMountPath() {
      return mountPath(Optional.empty());
    }

    /**
     * Setter for sizeGb.
     *
     * <p>sizeGb: Optional. The size of the persistent disk in GB. Must be non-negative. When
     * `enabled` is `true`, a positive value is required; when unset or zero while enabled, the
     * service applies a default size. Ignored when `enabled` is `false`.
     */
    @JsonProperty("sizeGb")
    public abstract Builder sizeGb(Long sizeGb);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder sizeGb(Optional<Long> sizeGb);

    /** Clears the value of sizeGb field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearSizeGb() {
      return sizeGb(Optional.empty());
    }

    public abstract SandboxEnvironmentTemplatePersistentDiskConfig build();
  }

  /** Deserializes a JSON string to a SandboxEnvironmentTemplatePersistentDiskConfig object. */
  @ExcludeFromGeneratedCoverageReport
  public static SandboxEnvironmentTemplatePersistentDiskConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(
        jsonString, SandboxEnvironmentTemplatePersistentDiskConfig.class);
  }
}
