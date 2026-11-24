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

/** C2PA edit action recorded in the manifest history. */
public class C2paResultManifestAction {

  /** Enum representing the known values for C2paResultManifestAction. */
  public enum Known {
    /** Default unspecified action. */
    ACTION_UNSPECIFIED,

    /** Adjusted color using GenAI tools. */
    ADJUSTED_COLOR_USING_GENAI_TOOLS,

    /** Adjusted color using non-GenAI tools. */
    ADJUSTED_COLOR_USING_NON_GENAI_TOOLS,

    /** Adjusted color using tools possibly powered by GenAI. */
    ADJUSTED_COLOR_USING_TOOLS_POSSIBLY_POWERED_BY_GENAI,

    /** Changed orientation. */
    CHANGED_ORIENTATION,

    /** Cropped using GenAI tools. */
    CROPPED_USING_GENAI_TOOLS,

    /** Cropped using non-GenAI tools. */
    CROPPED_USING_NON_GENAI_TOOLS,

    /** Cropped using tools possibly powered by GenAI. */
    CROPPED_USING_TOOLS_POSSIBLY_POWERED_BY_GENAI,

    /** Deleted content using GenAI tools. */
    DELETED_CONTENT_USING_GENAI_TOOLS,

    /** Deleted content using non-GenAI tools. */
    DELETED_CONTENT_USING_NON_GENAI_TOOLS,

    /** Deleted content using tools possibly powered by GenAI. */
    DELETED_CONTENT_USING_TOOLS_POSSIBLY_POWERED_BY_GENAI,

    /** Edited using GenAI tools. */
    EDITED_USING_GENAI_TOOLS,

    /** Edited using non-GenAI tools. */
    EDITED_USING_NON_GENAI_TOOLS,

    /** Edited using tools possibly powered by GenAI. */
    EDITED_USING_TOOLS_POSSIBLY_POWERED_BY_GENAI,

    /** Edited metadata. */
    EDITED_METADATA,

    /** Enhanced without changing content. */
    ENHANCED_WITHOUT_CHANGING_CONTENT,

    /** Stylized using GenAI filters. */
    STYLIZED_USING_GENAI_FILTERS,

    /** Stylized using non-GenAI filters. */
    STYLIZED_USING_NON_GENAI_FILTERS,

    /** Stylized using filters possibly powered by GenAI. */
    STYLIZED_USING_FILTERS_POSSIBLY_POWERED_BY_GENAI,

    /** Removed sensitive metadata. */
    REMOVED_SENSITIVE_METADATA,

    C2PA_RESULT_MANIFEST_ACTION_UNSPECIFIED
  }

  private Known c2paResultManifestActionEnum;
  private final String value;

  @JsonCreator
  public C2paResultManifestAction(String value) {
    this.value = value;
    for (Known c2paResultManifestActionEnum : Known.values()) {
      if (Ascii.equalsIgnoreCase(c2paResultManifestActionEnum.toString(), value)) {
        this.c2paResultManifestActionEnum = c2paResultManifestActionEnum;
        break;
      }
    }
    if (this.c2paResultManifestActionEnum == null) {
      this.c2paResultManifestActionEnum = Known.C2PA_RESULT_MANIFEST_ACTION_UNSPECIFIED;
    }
  }

  public C2paResultManifestAction(Known knownValue) {
    this.c2paResultManifestActionEnum = knownValue;
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

    if (!(o instanceof C2paResultManifestAction)) {
      return false;
    }

    C2paResultManifestAction other = (C2paResultManifestAction) o;

    if (this.c2paResultManifestActionEnum != Known.C2PA_RESULT_MANIFEST_ACTION_UNSPECIFIED
        && other.c2paResultManifestActionEnum != Known.C2PA_RESULT_MANIFEST_ACTION_UNSPECIFIED) {
      return this.c2paResultManifestActionEnum == other.c2paResultManifestActionEnum;
    } else if (this.c2paResultManifestActionEnum == Known.C2PA_RESULT_MANIFEST_ACTION_UNSPECIFIED
        && other.c2paResultManifestActionEnum == Known.C2PA_RESULT_MANIFEST_ACTION_UNSPECIFIED) {
      return this.value.equals(other.value);
    }
    return false;
  }

  @ExcludeFromGeneratedCoverageReport
  @Override
  public int hashCode() {
    if (this.c2paResultManifestActionEnum != Known.C2PA_RESULT_MANIFEST_ACTION_UNSPECIFIED) {
      return this.c2paResultManifestActionEnum.hashCode();
    } else {
      return Objects.hashCode(this.value);
    }
  }

  @ExcludeFromGeneratedCoverageReport
  public Known knownEnum() {
    return this.c2paResultManifestActionEnum;
  }
}
