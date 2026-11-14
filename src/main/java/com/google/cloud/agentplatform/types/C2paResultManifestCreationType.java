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

/** IPTC Digital Source Type creation classification recorded in the C2PA manifest. */
public class C2paResultManifestCreationType {

  /** Enum representing the known values for C2paResultManifestCreationType. */
  public enum Known {
    /** Default unspecified creation type. */
    CREATION_TYPE_UNSPECIFIED,

    /** Media of unknown provenance. */
    MEDIA_OF_UNKNOWN_PROVENANCE,

    /** Blank file. */
    BLANK_FILE,

    /** Real-life capture (e.g., camera or microphone). */
    REAL_LIFE_CAPTURE,

    /** Real-life capture with in-line non-GenAI enhancements. */
    REAL_LIFE_CAPTURE_WITH_IN_LINE_NON_GENAI_ENHANCEMENTS,

    /** Real-life stitched capture (e.g., panorama). */
    REAL_LIFE_STITCHED_CAPTURE,

    /** Partly GenAI creation. */
    PARTLY_GENAI_CREATION,

    /** Fully GenAI creation. */
    FULLY_GENAI_CREATION,

    /** Non-GenAI digital creation. */
    NON_GENAI_DIGITAL_CREATION,

    /** Composition which may contain GenAI content. */
    COMPOSITION_WHICH_MAY_CONTAIN_GENAI_CONTENT,

    /** Digital art which may contain GenAI content. */
    DIGITAL_ART_WHICH_MAY_CONTAIN_GENAI_CONTENT,

    /** Screen capture which may contain GenAI content. */
    SCREEN_CAPTURE_WHICH_MAY_CONTAIN_GENAI_CONTENT,

    C2PA_RESULT_MANIFEST_CREATION_TYPE_UNSPECIFIED
  }

  private Known c2paResultManifestCreationTypeEnum;
  private final String value;

  @JsonCreator
  public C2paResultManifestCreationType(String value) {
    this.value = value;
    for (Known c2paResultManifestCreationTypeEnum : Known.values()) {
      if (Ascii.equalsIgnoreCase(c2paResultManifestCreationTypeEnum.toString(), value)) {
        this.c2paResultManifestCreationTypeEnum = c2paResultManifestCreationTypeEnum;
        break;
      }
    }
    if (this.c2paResultManifestCreationTypeEnum == null) {
      this.c2paResultManifestCreationTypeEnum =
          Known.C2PA_RESULT_MANIFEST_CREATION_TYPE_UNSPECIFIED;
    }
  }

  public C2paResultManifestCreationType(Known knownValue) {
    this.c2paResultManifestCreationTypeEnum = knownValue;
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

    if (!(o instanceof C2paResultManifestCreationType)) {
      return false;
    }

    C2paResultManifestCreationType other = (C2paResultManifestCreationType) o;

    if (this.c2paResultManifestCreationTypeEnum
            != Known.C2PA_RESULT_MANIFEST_CREATION_TYPE_UNSPECIFIED
        && other.c2paResultManifestCreationTypeEnum
            != Known.C2PA_RESULT_MANIFEST_CREATION_TYPE_UNSPECIFIED) {
      return this.c2paResultManifestCreationTypeEnum == other.c2paResultManifestCreationTypeEnum;
    } else if (this.c2paResultManifestCreationTypeEnum
            == Known.C2PA_RESULT_MANIFEST_CREATION_TYPE_UNSPECIFIED
        && other.c2paResultManifestCreationTypeEnum
            == Known.C2PA_RESULT_MANIFEST_CREATION_TYPE_UNSPECIFIED) {
      return this.value.equals(other.value);
    }
    return false;
  }

  @ExcludeFromGeneratedCoverageReport
  @Override
  public int hashCode() {
    if (this.c2paResultManifestCreationTypeEnum
        != Known.C2PA_RESULT_MANIFEST_CREATION_TYPE_UNSPECIFIED) {
      return this.c2paResultManifestCreationTypeEnum.hashCode();
    } else {
      return Objects.hashCode(this.value);
    }
  }

  @ExcludeFromGeneratedCoverageReport
  public Known knownEnum() {
    return this.c2paResultManifestCreationTypeEnum;
  }
}
