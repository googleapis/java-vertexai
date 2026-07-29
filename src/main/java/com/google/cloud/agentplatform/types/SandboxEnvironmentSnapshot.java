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
import java.time.Duration;
import java.time.Instant;
import java.util.Optional;

/** A sandbox environment snapshot. */
@AutoValue
@JsonDeserialize(builder = SandboxEnvironmentSnapshot.Builder.class)
public abstract class SandboxEnvironmentSnapshot extends JsonSerializable {
  /** The display name of the sandbox environment snapshot. */
  @JsonProperty("displayName")
  public abstract Optional<String> displayName();

  /** Expiration time of the sandbox environment snapshot. */
  @JsonProperty("expireTime")
  public abstract Optional<Instant> expireTime();

  /** Output only. The timestamp when this SandboxEnvironmentSnapshot was created. */
  @JsonProperty("createTime")
  public abstract Optional<Instant> createTime();

  /**
   * Identifier. The resource name of the SandboxEnvironmentSnapshot. Format:
   * `projects/{project}/locations/{location}/reasoningEngines/{reasoning_engine}/sandboxEnvironmentSnapshots/{sandbox_environment_snapshot}`
   */
  @JsonProperty("name")
  public abstract Optional<String> name();

  /**
   * Optional. Owner information for this sandbox snapshot. Different owners will have isolations on
   * snapshot storage and identity. If not set, snapshot will be created as the default owner.
   */
  @JsonProperty("owner")
  public abstract Optional<String> owner();

  /**
   * Output only. The resource name of the parent SandboxEnvironmentSnapshot. Empty if this is a
   * root Snapshot (the first snapshot from a newly created sandbox). Can be used to reconstruct the
   * whole ancestry tree of snapshots.
   */
  @JsonProperty("parentSnapshot")
  public abstract Optional<String> parentSnapshot();

  /**
   * Optional. Input only. Action to take on the source SandboxEnvironment after the snapshot is
   * taken. This field is only used in CreateSandboxEnvironmentSnapshotRequest and it is not stored
   * in the resource.
   */
  @JsonProperty("postSnapshotAction")
  public abstract Optional<PostSnapshotAction> postSnapshotAction();

  /** Optional. Output only. Size of the snapshot data in bytes. */
  @JsonProperty("sizeBytes")
  public abstract Optional<Long> sizeBytes();

  /** Required. The resource name of the source SandboxEnvironment this snapshot was taken from. */
  @JsonProperty("sourceSandboxEnvironment")
  public abstract Optional<String> sourceSandboxEnvironment();

  /**
   * Optional. Input only. The TTL for the sandbox environment snapshot. The expiration time is
   * computed: now + TTL.
   */
  @JsonProperty("ttl")
  public abstract Optional<Duration> ttl();

  /** Output only. The timestamp when this SandboxEnvironment was most recently updated. */
  @JsonProperty("updateTime")
  public abstract Optional<Instant> updateTime();

  /** Instantiates a builder for SandboxEnvironmentSnapshot. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_SandboxEnvironmentSnapshot.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for SandboxEnvironmentSnapshot. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `SandboxEnvironmentSnapshot.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_SandboxEnvironmentSnapshot.Builder();
    }

    /**
     * Setter for displayName.
     *
     * <p>displayName: The display name of the sandbox environment snapshot.
     */
    @JsonProperty("displayName")
    public abstract Builder displayName(String displayName);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder displayName(Optional<String> displayName);

    /** Clears the value of displayName field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearDisplayName() {
      return displayName(Optional.empty());
    }

    /**
     * Setter for expireTime.
     *
     * <p>expireTime: Expiration time of the sandbox environment snapshot.
     */
    @JsonProperty("expireTime")
    public abstract Builder expireTime(Instant expireTime);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder expireTime(Optional<Instant> expireTime);

    /** Clears the value of expireTime field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearExpireTime() {
      return expireTime(Optional.empty());
    }

    /**
     * Setter for createTime.
     *
     * <p>createTime: Output only. The timestamp when this SandboxEnvironmentSnapshot was created.
     */
    @JsonProperty("createTime")
    public abstract Builder createTime(Instant createTime);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder createTime(Optional<Instant> createTime);

    /** Clears the value of createTime field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearCreateTime() {
      return createTime(Optional.empty());
    }

    /**
     * Setter for name.
     *
     * <p>name: Identifier. The resource name of the SandboxEnvironmentSnapshot. Format:
     * `projects/{project}/locations/{location}/reasoningEngines/{reasoning_engine}/sandboxEnvironmentSnapshots/{sandbox_environment_snapshot}`
     */
    @JsonProperty("name")
    public abstract Builder name(String name);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder name(Optional<String> name);

    /** Clears the value of name field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearName() {
      return name(Optional.empty());
    }

    /**
     * Setter for owner.
     *
     * <p>owner: Optional. Owner information for this sandbox snapshot. Different owners will have
     * isolations on snapshot storage and identity. If not set, snapshot will be created as the
     * default owner.
     */
    @JsonProperty("owner")
    public abstract Builder owner(String owner);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder owner(Optional<String> owner);

    /** Clears the value of owner field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearOwner() {
      return owner(Optional.empty());
    }

    /**
     * Setter for parentSnapshot.
     *
     * <p>parentSnapshot: Output only. The resource name of the parent SandboxEnvironmentSnapshot.
     * Empty if this is a root Snapshot (the first snapshot from a newly created sandbox). Can be
     * used to reconstruct the whole ancestry tree of snapshots.
     */
    @JsonProperty("parentSnapshot")
    public abstract Builder parentSnapshot(String parentSnapshot);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder parentSnapshot(Optional<String> parentSnapshot);

    /** Clears the value of parentSnapshot field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearParentSnapshot() {
      return parentSnapshot(Optional.empty());
    }

    /**
     * Setter for postSnapshotAction.
     *
     * <p>postSnapshotAction: Optional. Input only. Action to take on the source SandboxEnvironment
     * after the snapshot is taken. This field is only used in
     * CreateSandboxEnvironmentSnapshotRequest and it is not stored in the resource.
     */
    @JsonProperty("postSnapshotAction")
    public abstract Builder postSnapshotAction(PostSnapshotAction postSnapshotAction);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder postSnapshotAction(Optional<PostSnapshotAction> postSnapshotAction);

    /** Clears the value of postSnapshotAction field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearPostSnapshotAction() {
      return postSnapshotAction(Optional.empty());
    }

    /**
     * Setter for postSnapshotAction given a known enum.
     *
     * <p>postSnapshotAction: Optional. Input only. Action to take on the source SandboxEnvironment
     * after the snapshot is taken. This field is only used in
     * CreateSandboxEnvironmentSnapshotRequest and it is not stored in the resource.
     */
    @CanIgnoreReturnValue
    public Builder postSnapshotAction(PostSnapshotAction.Known knownType) {
      return postSnapshotAction(new PostSnapshotAction(knownType));
    }

    /**
     * Setter for postSnapshotAction given a string.
     *
     * <p>postSnapshotAction: Optional. Input only. Action to take on the source SandboxEnvironment
     * after the snapshot is taken. This field is only used in
     * CreateSandboxEnvironmentSnapshotRequest and it is not stored in the resource.
     */
    @CanIgnoreReturnValue
    public Builder postSnapshotAction(String postSnapshotAction) {
      return postSnapshotAction(new PostSnapshotAction(postSnapshotAction));
    }

    /**
     * Setter for sizeBytes.
     *
     * <p>sizeBytes: Optional. Output only. Size of the snapshot data in bytes.
     */
    @JsonProperty("sizeBytes")
    public abstract Builder sizeBytes(Long sizeBytes);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder sizeBytes(Optional<Long> sizeBytes);

    /** Clears the value of sizeBytes field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearSizeBytes() {
      return sizeBytes(Optional.empty());
    }

    /**
     * Setter for sourceSandboxEnvironment.
     *
     * <p>sourceSandboxEnvironment: Required. The resource name of the source SandboxEnvironment
     * this snapshot was taken from.
     */
    @JsonProperty("sourceSandboxEnvironment")
    public abstract Builder sourceSandboxEnvironment(String sourceSandboxEnvironment);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder sourceSandboxEnvironment(Optional<String> sourceSandboxEnvironment);

    /** Clears the value of sourceSandboxEnvironment field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearSourceSandboxEnvironment() {
      return sourceSandboxEnvironment(Optional.empty());
    }

    /**
     * Setter for ttl.
     *
     * <p>ttl: Optional. Input only. The TTL for the sandbox environment snapshot. The expiration
     * time is computed: now + TTL.
     */
    @JsonProperty("ttl")
    public abstract Builder ttl(Duration ttl);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder ttl(Optional<Duration> ttl);

    /** Clears the value of ttl field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearTtl() {
      return ttl(Optional.empty());
    }

    /**
     * Setter for updateTime.
     *
     * <p>updateTime: Output only. The timestamp when this SandboxEnvironment was most recently
     * updated.
     */
    @JsonProperty("updateTime")
    public abstract Builder updateTime(Instant updateTime);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder updateTime(Optional<Instant> updateTime);

    /** Clears the value of updateTime field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearUpdateTime() {
      return updateTime(Optional.empty());
    }

    public abstract SandboxEnvironmentSnapshot build();
  }

  /** Deserializes a JSON string to a SandboxEnvironmentSnapshot object. */
  @ExcludeFromGeneratedCoverageReport
  public static SandboxEnvironmentSnapshot fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, SandboxEnvironmentSnapshot.class);
  }
}
