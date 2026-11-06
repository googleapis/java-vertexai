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
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.genai.JsonSerializable;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/** Verified C2PA manifest metadata extracted from the media. */
@AutoValue
@JsonDeserialize(builder = C2paResultManifest.Builder.class)
public abstract class C2paResultManifest extends JsonSerializable {
  /** Output only. Creation types asserted in the C2PA manifest. */
  @JsonProperty("creationTypes")
  public abstract Optional<List<C2paResultManifestCreationType>> creationTypes();

  /** Output only. Actions recorded in the C2PA manifest. */
  @JsonProperty("actions")
  public abstract Optional<List<C2paResultManifestAction>> actions();

  /** Output only. Organization of the entity that signed the C2PA manifest. */
  @JsonProperty("signerOrganization")
  public abstract Optional<String> signerOrganization();

  /** Output only. Common name of the certificate that signed the C2PA manifest. */
  @JsonProperty("signerCommonName")
  public abstract Optional<String> signerCommonName();

  /** Output only. Claim generator software or hardware recorded in the C2PA manifest. */
  @JsonProperty("claimGenerator")
  public abstract Optional<String> claimGenerator();

  /** Output only. Timestamp when the C2PA manifest was signed. */
  @JsonProperty("signTime")
  public abstract Optional<Instant> signTime();

  /** Instantiates a builder for C2paResultManifest. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_C2paResultManifest.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for C2paResultManifest. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `C2paResultManifest.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_C2paResultManifest.Builder();
    }

    /**
     * Setter for creationTypes.
     *
     * <p>creationTypes: Output only. Creation types asserted in the C2PA manifest.
     */
    @JsonProperty("creationTypes")
    public abstract Builder creationTypes(List<C2paResultManifestCreationType> creationTypes);

    /**
     * Setter for creationTypes.
     *
     * <p>creationTypes: Output only. Creation types asserted in the C2PA manifest.
     */
    @CanIgnoreReturnValue
    public Builder creationTypes(C2paResultManifestCreationType... creationTypes) {
      return creationTypes(Arrays.asList(creationTypes));
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder creationTypes(Optional<List<C2paResultManifestCreationType>> creationTypes);

    /** Clears the value of creationTypes field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearCreationTypes() {
      return creationTypes(Optional.empty());
    }

    /**
     * Setter for creationTypes given a varargs of strings.
     *
     * <p>creationTypes: Output only. Creation types asserted in the C2PA manifest.
     */
    @CanIgnoreReturnValue
    public Builder creationTypes(String... creationTypes) {
      return creationTypesFromString(Arrays.asList(creationTypes));
    }

    /**
     * Setter for creationTypes given a varargs of known enums.
     *
     * <p>creationTypes: Output only. Creation types asserted in the C2PA manifest.
     */
    @CanIgnoreReturnValue
    public Builder creationTypes(C2paResultManifestCreationType.Known... knownTypes) {
      return creationTypesFromKnown(Arrays.asList(knownTypes));
    }

    /**
     * Setter for creationTypes given a list of known enums.
     *
     * <p>creationTypes: Output only. Creation types asserted in the C2PA manifest.
     */
    @CanIgnoreReturnValue
    public Builder creationTypesFromKnown(List<C2paResultManifestCreationType.Known> knownTypes) {
      ImmutableList<C2paResultManifestCreationType> listItems =
          knownTypes.stream().map(C2paResultManifestCreationType::new).collect(toImmutableList());
      return creationTypes(listItems);
    }

    /**
     * Setter for creationTypes given a list of strings.
     *
     * <p>creationTypes: Output only. Creation types asserted in the C2PA manifest.
     */
    @CanIgnoreReturnValue
    public Builder creationTypesFromString(List<String> creationTypes) {
      ImmutableList<C2paResultManifestCreationType> listItems =
          creationTypes.stream()
              .map(C2paResultManifestCreationType::new)
              .collect(toImmutableList());
      return creationTypes(listItems);
    }

    /**
     * Setter for actions.
     *
     * <p>actions: Output only. Actions recorded in the C2PA manifest.
     */
    @JsonProperty("actions")
    public abstract Builder actions(List<C2paResultManifestAction> actions);

    /**
     * Setter for actions.
     *
     * <p>actions: Output only. Actions recorded in the C2PA manifest.
     */
    @CanIgnoreReturnValue
    public Builder actions(C2paResultManifestAction... actions) {
      return actions(Arrays.asList(actions));
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder actions(Optional<List<C2paResultManifestAction>> actions);

    /** Clears the value of actions field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearActions() {
      return actions(Optional.empty());
    }

    /**
     * Setter for actions given a varargs of strings.
     *
     * <p>actions: Output only. Actions recorded in the C2PA manifest.
     */
    @CanIgnoreReturnValue
    public Builder actions(String... actions) {
      return actionsFromString(Arrays.asList(actions));
    }

    /**
     * Setter for actions given a varargs of known enums.
     *
     * <p>actions: Output only. Actions recorded in the C2PA manifest.
     */
    @CanIgnoreReturnValue
    public Builder actions(C2paResultManifestAction.Known... knownTypes) {
      return actionsFromKnown(Arrays.asList(knownTypes));
    }

    /**
     * Setter for actions given a list of known enums.
     *
     * <p>actions: Output only. Actions recorded in the C2PA manifest.
     */
    @CanIgnoreReturnValue
    public Builder actionsFromKnown(List<C2paResultManifestAction.Known> knownTypes) {
      ImmutableList<C2paResultManifestAction> listItems =
          knownTypes.stream().map(C2paResultManifestAction::new).collect(toImmutableList());
      return actions(listItems);
    }

    /**
     * Setter for actions given a list of strings.
     *
     * <p>actions: Output only. Actions recorded in the C2PA manifest.
     */
    @CanIgnoreReturnValue
    public Builder actionsFromString(List<String> actions) {
      ImmutableList<C2paResultManifestAction> listItems =
          actions.stream().map(C2paResultManifestAction::new).collect(toImmutableList());
      return actions(listItems);
    }

    /**
     * Setter for signerOrganization.
     *
     * <p>signerOrganization: Output only. Organization of the entity that signed the C2PA manifest.
     */
    @JsonProperty("signerOrganization")
    public abstract Builder signerOrganization(String signerOrganization);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder signerOrganization(Optional<String> signerOrganization);

    /** Clears the value of signerOrganization field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearSignerOrganization() {
      return signerOrganization(Optional.empty());
    }

    /**
     * Setter for signerCommonName.
     *
     * <p>signerCommonName: Output only. Common name of the certificate that signed the C2PA
     * manifest.
     */
    @JsonProperty("signerCommonName")
    public abstract Builder signerCommonName(String signerCommonName);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder signerCommonName(Optional<String> signerCommonName);

    /** Clears the value of signerCommonName field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearSignerCommonName() {
      return signerCommonName(Optional.empty());
    }

    /**
     * Setter for claimGenerator.
     *
     * <p>claimGenerator: Output only. Claim generator software or hardware recorded in the C2PA
     * manifest.
     */
    @JsonProperty("claimGenerator")
    public abstract Builder claimGenerator(String claimGenerator);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder claimGenerator(Optional<String> claimGenerator);

    /** Clears the value of claimGenerator field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearClaimGenerator() {
      return claimGenerator(Optional.empty());
    }

    /**
     * Setter for signTime.
     *
     * <p>signTime: Output only. Timestamp when the C2PA manifest was signed.
     */
    @JsonProperty("signTime")
    public abstract Builder signTime(Instant signTime);

    @ExcludeFromGeneratedCoverageReport
    abstract Builder signTime(Optional<Instant> signTime);

    /** Clears the value of signTime field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearSignTime() {
      return signTime(Optional.empty());
    }

    public abstract C2paResultManifest build();
  }

  /** Deserializes a JSON string to a C2paResultManifest object. */
  @ExcludeFromGeneratedCoverageReport
  public static C2paResultManifest fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, C2paResultManifest.class);
  }
}
