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

package com.google.cloud.vertexai.genai;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.cloud.vertexai.genai.types.AgentEngineOperation;
import com.google.cloud.vertexai.genai.types.CreateAgentEngineConfig;
import com.google.cloud.vertexai.genai.types.CreateAgentEngineRequestParameters;
import com.google.cloud.vertexai.genai.types.DeleteAgentEngineConfig;
import com.google.cloud.vertexai.genai.types.DeleteAgentEngineOperation;
import com.google.cloud.vertexai.genai.types.DeleteAgentEngineRequestParameters;
import com.google.cloud.vertexai.genai.types.GetAgentEngineConfig;
import com.google.cloud.vertexai.genai.types.GetAgentEngineOperationConfig;
import com.google.cloud.vertexai.genai.types.GetAgentEngineOperationParameters;
import com.google.cloud.vertexai.genai.types.GetAgentEngineRequestParameters;
import com.google.cloud.vertexai.genai.types.ListAgentEngineConfig;
import com.google.cloud.vertexai.genai.types.ListAgentEngineRequestParameters;
import com.google.cloud.vertexai.genai.types.ListReasoningEnginesResponse;
import com.google.cloud.vertexai.genai.types.QueryAgentEngineConfig;
import com.google.cloud.vertexai.genai.types.QueryAgentEngineRequestParameters;
import com.google.cloud.vertexai.genai.types.QueryReasoningEngineResponse;
import com.google.cloud.vertexai.genai.types.ReasoningEngine;
import com.google.genai.ApiClient;
import com.google.genai.ApiResponse;
import com.google.genai.Common;
import com.google.genai.Common.BuiltRequest;
import com.google.genai.JsonSerializable;
import com.google.genai.errors.GenAiIOException;
import com.google.genai.types.HttpOptions;
import java.io.IOException;
import java.util.Optional;
import okhttp3.ResponseBody;

public final class AgentEngines {
  public final Sessions sessions;
  public final Sandboxes sandboxes;
  public final Memories memories;
  public final Runtimes runtimes;

  final ApiClient apiClient;

  public AgentEngines(ApiClient apiClient) {
    this.apiClient = apiClient;
    this.sessions = new Sessions(apiClient);
    this.sandboxes = new Sandboxes(apiClient);
    this.memories = new Memories(apiClient);
    this.runtimes = new Runtimes(apiClient);
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode agentEngineOperationFromVertex(JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"metadata"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"metadata"},
          Common.getValueByPath(fromObject, new String[] {"metadata"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"done"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"done"},
          Common.getValueByPath(fromObject, new String[] {"done"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"error"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"error"},
          Common.getValueByPath(fromObject, new String[] {"error"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"response"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"response"},
          reasoningEngineFromVertex(
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"response"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode agentEngineOperationFromVertex(JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"metadata"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"metadata"},
          Common.getValueByPath(fromObject, new String[] {"metadata"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"done"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"done"},
          Common.getValueByPath(fromObject, new String[] {"done"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"error"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"error"},
          Common.getValueByPath(fromObject, new String[] {"error"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"response"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"response"},
          reasoningEngineFromVertex(
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"response"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode createAgentEngineConfigToVertex(JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"displayName"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"displayName"},
          Common.getValueByPath(fromObject, new String[] {"displayName"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"description"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"description"},
          Common.getValueByPath(fromObject, new String[] {"description"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"spec"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"spec"},
          Common.getValueByPath(fromObject, new String[] {"spec"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"contextSpec"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"contextSpec"},
          reasoningEngineContextSpecToVertex(
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"contextSpec"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"pscInterfaceConfig"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"pscInterfaceConfig"},
          Common.getValueByPath(fromObject, new String[] {"pscInterfaceConfig"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"encryptionSpec"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"encryptionSpec"},
          Common.getValueByPath(fromObject, new String[] {"encryptionSpec"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"labels"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"labels"},
          Common.getValueByPath(fromObject, new String[] {"labels"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"sourcePackages"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"sourcePackages"},
          Common.getValueByPath(fromObject, new String[] {"sourcePackages"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"entrypointModule"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"entrypointModule"},
          Common.getValueByPath(fromObject, new String[] {"entrypointModule"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"entrypointObject"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"entrypointObject"},
          Common.getValueByPath(fromObject, new String[] {"entrypointObject"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"requirementsFile"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"requirementsFile"},
          Common.getValueByPath(fromObject, new String[] {"requirementsFile"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"agentFramework"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"agentFramework"},
          Common.getValueByPath(fromObject, new String[] {"agentFramework"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"pythonVersion"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"pythonVersion"},
          Common.getValueByPath(fromObject, new String[] {"pythonVersion"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"agentGatewayConfig"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"agentGatewayConfig"},
          Common.getValueByPath(fromObject, new String[] {"agentGatewayConfig"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode createAgentEngineRequestParametersToVertex(
      JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      JsonNode unused =
          createAgentEngineConfigToVertex(
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject);
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode deleteAgentEngineRequestParametersToVertex(
      JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"force"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"force"},
          Common.getValueByPath(fromObject, new String[] {"force"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode getAgentEngineOperationParametersToVertex(
      JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"operationName"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "operationName"},
          Common.getValueByPath(fromObject, new String[] {"operationName"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode getAgentEngineRequestParametersToVertex(JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode listAgentEngineConfigToVertex(JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"pageSize"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"_query", "pageSize"},
          Common.getValueByPath(fromObject, new String[] {"pageSize"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"pageToken"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"_query", "pageToken"},
          Common.getValueByPath(fromObject, new String[] {"pageToken"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"filter"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"_query", "filter"},
          Common.getValueByPath(fromObject, new String[] {"filter"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode listAgentEngineRequestParametersToVertex(
      JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      JsonNode unused =
          listAgentEngineConfigToVertex(
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject);
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode listReasoningEnginesResponseFromVertex(JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"sdkHttpResponse"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"sdkHttpResponse"},
          Common.getValueByPath(fromObject, new String[] {"sdkHttpResponse"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"nextPageToken"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"nextPageToken"},
          Common.getValueByPath(fromObject, new String[] {"nextPageToken"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"reasoningEngines"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"reasoningEngines"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      for (JsonNode item : keyArray) {
        result.add(reasoningEngineFromVertex(JsonSerializable.toJsonNode(item), toObject));
      }
      Common.setValueByPath(toObject, new String[] {"reasoningEngines"}, result);
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode queryAgentEngineConfigToVertex(JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"classMethod"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"classMethod"},
          Common.getValueByPath(fromObject, new String[] {"classMethod"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"input"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"input"},
          Common.getValueByPath(fromObject, new String[] {"input"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"includeAllFields"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"includeAllFields"},
          Common.getValueByPath(fromObject, new String[] {"includeAllFields"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode queryAgentEngineRequestParametersToVertex(
      JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      JsonNode unused =
          queryAgentEngineConfigToVertex(
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject);
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode reasoningEngineContextSpecFromVertex(JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"memoryBankConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"memoryBankConfig"},
          reasoningEngineContextSpecMemoryBankConfigFromVertex(
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"memoryBankConfig"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode reasoningEngineContextSpecMemoryBankConfigFromVertex(
      JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"customizationConfigs"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"customizationConfigs"},
          Common.getValueByPath(fromObject, new String[] {"customizationConfigs"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"disableMemoryRevisions"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"disableMemoryRevisions"},
          Common.getValueByPath(fromObject, new String[] {"disableMemoryRevisions"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"generationConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"generationConfig"},
          Common.getValueByPath(fromObject, new String[] {"generationConfig"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"similaritySearchConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"similaritySearchConfig"},
          Common.getValueByPath(fromObject, new String[] {"similaritySearchConfig"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"ttlConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"ttlConfig"},
          Common.getValueByPath(fromObject, new String[] {"ttlConfig"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"structuredMemoryConfigs"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"structuredMemoryConfigs"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      for (JsonNode item : keyArray) {
        result.add(structuredMemoryConfigFromVertex(JsonSerializable.toJsonNode(item), toObject));
      }
      Common.setValueByPath(toObject, new String[] {"structuredMemoryConfigs"}, result);
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode reasoningEngineContextSpecMemoryBankConfigToVertex(
      JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"customizationConfigs"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"customizationConfigs"},
          Common.getValueByPath(fromObject, new String[] {"customizationConfigs"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"disableMemoryRevisions"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"disableMemoryRevisions"},
          Common.getValueByPath(fromObject, new String[] {"disableMemoryRevisions"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"generationConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"generationConfig"},
          Common.getValueByPath(fromObject, new String[] {"generationConfig"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"similaritySearchConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"similaritySearchConfig"},
          Common.getValueByPath(fromObject, new String[] {"similaritySearchConfig"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"ttlConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"ttlConfig"},
          Common.getValueByPath(fromObject, new String[] {"ttlConfig"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"structuredMemoryConfigs"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"structuredMemoryConfigs"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      for (JsonNode item : keyArray) {
        result.add(structuredMemoryConfigToVertex(JsonSerializable.toJsonNode(item), toObject));
      }
      Common.setValueByPath(toObject, new String[] {"structuredMemoryConfigs"}, result);
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode reasoningEngineContextSpecToVertex(JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"memoryBankConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"memoryBankConfig"},
          reasoningEngineContextSpecMemoryBankConfigToVertex(
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"memoryBankConfig"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode reasoningEngineFromVertex(JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"encryptionSpec"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"encryptionSpec"},
          Common.getValueByPath(fromObject, new String[] {"encryptionSpec"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"contextSpec"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"contextSpec"},
          reasoningEngineContextSpecFromVertex(
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"contextSpec"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"createTime"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"createTime"},
          Common.getValueByPath(fromObject, new String[] {"createTime"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"description"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"description"},
          Common.getValueByPath(fromObject, new String[] {"description"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"displayName"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"displayName"},
          Common.getValueByPath(fromObject, new String[] {"displayName"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"etag"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"etag"},
          Common.getValueByPath(fromObject, new String[] {"etag"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"labels"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"labels"},
          Common.getValueByPath(fromObject, new String[] {"labels"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"spec"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"spec"},
          Common.getValueByPath(fromObject, new String[] {"spec"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"updateTime"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"updateTime"},
          Common.getValueByPath(fromObject, new String[] {"updateTime"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"trafficConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"trafficConfig"},
          Common.getValueByPath(fromObject, new String[] {"trafficConfig"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode structuredMemoryConfigFromVertex(JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"schemaConfigs"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"schemaConfigs"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      for (JsonNode item : keyArray) {
        result.add(
            structuredMemorySchemaConfigFromVertex(JsonSerializable.toJsonNode(item), toObject));
      }
      Common.setValueByPath(toObject, new String[] {"schemaConfigs"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"scopeKeys"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"scopeKeys"},
          Common.getValueByPath(fromObject, new String[] {"scopeKeys"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode structuredMemoryConfigToVertex(JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"schemaConfigs"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"schemaConfigs"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      for (JsonNode item : keyArray) {
        result.add(
            structuredMemorySchemaConfigToVertex(JsonSerializable.toJsonNode(item), toObject));
      }
      Common.setValueByPath(toObject, new String[] {"schemaConfigs"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"scopeKeys"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"scopeKeys"},
          Common.getValueByPath(fromObject, new String[] {"scopeKeys"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode structuredMemorySchemaConfigFromVertex(JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"schema"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"memorySchema"},
          Common.getValueByPath(fromObject, new String[] {"schema"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"id"}) != null) {
      Common.setValueByPath(
          toObject, new String[] {"id"}, Common.getValueByPath(fromObject, new String[] {"id"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"memoryType"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"memoryType"},
          Common.getValueByPath(fromObject, new String[] {"memoryType"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode structuredMemorySchemaConfigToVertex(JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"memorySchema"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"schema"},
          Common.getValueByPath(fromObject, new String[] {"memorySchema"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"id"}) != null) {
      Common.setValueByPath(
          toObject, new String[] {"id"}, Common.getValueByPath(fromObject, new String[] {"id"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"memoryType"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"memoryType"},
          Common.getValueByPath(fromObject, new String[] {"memoryType"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode updateAgentEngineConfigToVertex(JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"displayName"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"displayName"},
          Common.getValueByPath(fromObject, new String[] {"displayName"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"description"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"description"},
          Common.getValueByPath(fromObject, new String[] {"description"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"spec"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"spec"},
          Common.getValueByPath(fromObject, new String[] {"spec"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"contextSpec"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"contextSpec"},
          reasoningEngineContextSpecToVertex(
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"contextSpec"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"pscInterfaceConfig"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"pscInterfaceConfig"},
          Common.getValueByPath(fromObject, new String[] {"pscInterfaceConfig"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"encryptionSpec"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"encryptionSpec"},
          Common.getValueByPath(fromObject, new String[] {"encryptionSpec"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"labels"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"labels"},
          Common.getValueByPath(fromObject, new String[] {"labels"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"sourcePackages"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"sourcePackages"},
          Common.getValueByPath(fromObject, new String[] {"sourcePackages"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"entrypointModule"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"entrypointModule"},
          Common.getValueByPath(fromObject, new String[] {"entrypointModule"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"entrypointObject"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"entrypointObject"},
          Common.getValueByPath(fromObject, new String[] {"entrypointObject"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"requirementsFile"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"requirementsFile"},
          Common.getValueByPath(fromObject, new String[] {"requirementsFile"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"agentFramework"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"agentFramework"},
          Common.getValueByPath(fromObject, new String[] {"agentFramework"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"pythonVersion"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"pythonVersion"},
          Common.getValueByPath(fromObject, new String[] {"pythonVersion"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"agentGatewayConfig"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"agentGatewayConfig"},
          Common.getValueByPath(fromObject, new String[] {"agentGatewayConfig"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"updateMask"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"_query", "updateMask"},
          Common.getValueByPath(fromObject, new String[] {"updateMask"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode updateAgentEngineRequestParametersToVertex(
      JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      JsonNode unused =
          updateAgentEngineConfigToVertex(
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject);
    }

    return toObject;
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForPrivateCreate(CreateAgentEngineConfig config) {

    CreateAgentEngineRequestParameters.Builder parameterBuilder =
        CreateAgentEngineRequestParameters.builder();

    if (!Common.isZero(config)) {
      parameterBuilder.config(config);
    }
    JsonNode parameterNode = JsonSerializable.toJsonNode(parameterBuilder.build());

    ObjectNode body;
    String path;
    if (this.apiClient.vertexAI()) {
      body = createAgentEngineRequestParametersToVertex(parameterNode, null);
      path = Common.formatMap("reasoningEngines", body.get("_url"));
    } else {
      throw new UnsupportedOperationException(
          "This method is only supported in the Vertex AI client.");
    }
    body.remove("_url");

    JsonNode queryParams = body.get("_query");
    if (queryParams != null) {
      body.remove("_query");
      path = String.format("%s?%s", path, Common.urlEncode((ObjectNode) queryParams));
    }

    // TODO: Remove the hack that removes config.
    Optional<HttpOptions> requestHttpOptions = Optional.empty();
    if (config != null) {
      requestHttpOptions = config.httpOptions();
    }

    return new BuiltRequest(path, JsonSerializable.toJsonString(body), requestHttpOptions);
  }

  /** A shared processResponse function for both sync and async methods. */
  AgentEngineOperation processResponseForPrivateCreate(
      ApiResponse response, CreateAgentEngineConfig config) {
    ResponseBody responseBody = response.getBody();
    String responseString;
    try {
      responseString = responseBody.string();
    } catch (IOException e) {
      throw new GenAiIOException("Failed to read HTTP response.", e);
    }

    JsonNode responseNode = JsonSerializable.stringToJsonNode(responseString);

    if (this.apiClient.vertexAI()) {
      responseNode = agentEngineOperationFromVertex(responseNode, null);
    }

    if (!this.apiClient.vertexAI()) {
      throw new UnsupportedOperationException(
          "This method is only supported in the Vertex AI client.");
    }

    return JsonSerializable.fromJsonNode(responseNode, AgentEngineOperation.class);
  }

  public AgentEngineOperation privateCreate(CreateAgentEngineConfig config) {
    BuiltRequest builtRequest = buildRequestForPrivateCreate(config);

    try (ApiResponse response =
        this.apiClient.request(
            "post", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForPrivateCreate(response, config);
    }
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForPrivateDelete(
      String name, boolean force, DeleteAgentEngineConfig config) {

    DeleteAgentEngineRequestParameters.Builder parameterBuilder =
        DeleteAgentEngineRequestParameters.builder();

    if (!Common.isZero(name)) {
      parameterBuilder.name(name);
    }
    if (!Common.isZero(force)) {
      parameterBuilder.force(force);
    }
    if (!Common.isZero(config)) {
      parameterBuilder.config(config);
    }
    JsonNode parameterNode = JsonSerializable.toJsonNode(parameterBuilder.build());

    ObjectNode body;
    String path;
    if (this.apiClient.vertexAI()) {
      body = deleteAgentEngineRequestParametersToVertex(parameterNode, null);
      path = Common.formatMap("{name}", body.get("_url"));
    } else {
      throw new UnsupportedOperationException(
          "This method is only supported in the Vertex AI client.");
    }
    body.remove("_url");

    JsonNode queryParams = body.get("_query");
    if (queryParams != null) {
      body.remove("_query");
      path = String.format("%s?%s", path, Common.urlEncode((ObjectNode) queryParams));
    }

    // TODO: Remove the hack that removes config.
    Optional<HttpOptions> requestHttpOptions = Optional.empty();
    if (config != null) {
      requestHttpOptions = config.httpOptions();
    }

    return new BuiltRequest(path, JsonSerializable.toJsonString(body), requestHttpOptions);
  }

  /** A shared processResponse function for both sync and async methods. */
  DeleteAgentEngineOperation processResponseForPrivateDelete(
      ApiResponse response, DeleteAgentEngineConfig config) {
    ResponseBody responseBody = response.getBody();
    String responseString;
    try {
      responseString = responseBody.string();
    } catch (IOException e) {
      throw new GenAiIOException("Failed to read HTTP response.", e);
    }

    JsonNode responseNode = JsonSerializable.stringToJsonNode(responseString);

    if (!this.apiClient.vertexAI()) {
      throw new UnsupportedOperationException(
          "This method is only supported in the Vertex AI client.");
    }

    return JsonSerializable.fromJsonNode(responseNode, DeleteAgentEngineOperation.class);
  }

  public DeleteAgentEngineOperation privateDelete(
      String name, boolean force, DeleteAgentEngineConfig config) {
    BuiltRequest builtRequest = buildRequestForPrivateDelete(name, force, config);

    try (ApiResponse response =
        this.apiClient.request(
            "delete", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForPrivateDelete(response, config);
    }
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForPrivateGet(String name, GetAgentEngineConfig config) {

    GetAgentEngineRequestParameters.Builder parameterBuilder =
        GetAgentEngineRequestParameters.builder();

    if (!Common.isZero(name)) {
      parameterBuilder.name(name);
    }
    if (!Common.isZero(config)) {
      parameterBuilder.config(config);
    }
    JsonNode parameterNode = JsonSerializable.toJsonNode(parameterBuilder.build());

    ObjectNode body;
    String path;
    if (this.apiClient.vertexAI()) {
      body = getAgentEngineRequestParametersToVertex(parameterNode, null);
      path = Common.formatMap("{name}", body.get("_url"));
    } else {
      throw new UnsupportedOperationException(
          "This method is only supported in the Vertex AI client.");
    }
    body.remove("_url");

    JsonNode queryParams = body.get("_query");
    if (queryParams != null) {
      body.remove("_query");
      path = String.format("%s?%s", path, Common.urlEncode((ObjectNode) queryParams));
    }

    // TODO: Remove the hack that removes config.
    Optional<HttpOptions> requestHttpOptions = Optional.empty();
    if (config != null) {
      requestHttpOptions = config.httpOptions();
    }

    return new BuiltRequest(path, JsonSerializable.toJsonString(body), requestHttpOptions);
  }

  /** A shared processResponse function for both sync and async methods. */
  ReasoningEngine processResponseForPrivateGet(ApiResponse response, GetAgentEngineConfig config) {
    ResponseBody responseBody = response.getBody();
    String responseString;
    try {
      responseString = responseBody.string();
    } catch (IOException e) {
      throw new GenAiIOException("Failed to read HTTP response.", e);
    }

    JsonNode responseNode = JsonSerializable.stringToJsonNode(responseString);

    if (this.apiClient.vertexAI()) {
      responseNode = reasoningEngineFromVertex(responseNode, null);
    }

    if (!this.apiClient.vertexAI()) {
      throw new UnsupportedOperationException(
          "This method is only supported in the Vertex AI client.");
    }

    return JsonSerializable.fromJsonNode(responseNode, ReasoningEngine.class);
  }

  public ReasoningEngine privateGet(String name, GetAgentEngineConfig config) {
    BuiltRequest builtRequest = buildRequestForPrivateGet(name, config);

    try (ApiResponse response =
        this.apiClient.request(
            "get", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForPrivateGet(response, config);
    }
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForPrivateList(ListAgentEngineConfig config) {

    ListAgentEngineRequestParameters.Builder parameterBuilder =
        ListAgentEngineRequestParameters.builder();

    if (!Common.isZero(config)) {
      parameterBuilder.config(config);
    }
    JsonNode parameterNode = JsonSerializable.toJsonNode(parameterBuilder.build());

    ObjectNode body;
    String path;
    if (this.apiClient.vertexAI()) {
      body = listAgentEngineRequestParametersToVertex(parameterNode, null);
      path = Common.formatMap("reasoningEngines", body.get("_url"));
    } else {
      throw new UnsupportedOperationException(
          "This method is only supported in the Vertex AI client.");
    }
    body.remove("_url");

    JsonNode queryParams = body.get("_query");
    if (queryParams != null) {
      body.remove("_query");
      path = String.format("%s?%s", path, Common.urlEncode((ObjectNode) queryParams));
    }

    // TODO: Remove the hack that removes config.
    Optional<HttpOptions> requestHttpOptions = Optional.empty();
    if (config != null) {
      requestHttpOptions = config.httpOptions();
    }

    return new BuiltRequest(path, JsonSerializable.toJsonString(body), requestHttpOptions);
  }

  /** A shared processResponse function for both sync and async methods. */
  ListReasoningEnginesResponse processResponseForPrivateList(
      ApiResponse response, ListAgentEngineConfig config) {
    ResponseBody responseBody = response.getBody();
    String responseString;
    try {
      responseString = responseBody.string();
    } catch (IOException e) {
      throw new GenAiIOException("Failed to read HTTP response.", e);
    }

    JsonNode responseNode = JsonSerializable.stringToJsonNode(responseString);

    if (this.apiClient.vertexAI()) {
      responseNode = listReasoningEnginesResponseFromVertex(responseNode, null);
    }

    if (!this.apiClient.vertexAI()) {
      throw new UnsupportedOperationException(
          "This method is only supported in the Vertex AI client.");
    }

    return JsonSerializable.fromJsonNode(responseNode, ListReasoningEnginesResponse.class);
  }

  public ListReasoningEnginesResponse privateList(ListAgentEngineConfig config) {
    BuiltRequest builtRequest = buildRequestForPrivateList(config);

    try (ApiResponse response =
        this.apiClient.request(
            "get", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForPrivateList(response, config);
    }
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForPrivateGetAgentOperation(
      String operationName, GetAgentEngineOperationConfig config) {

    GetAgentEngineOperationParameters.Builder parameterBuilder =
        GetAgentEngineOperationParameters.builder();

    if (!Common.isZero(operationName)) {
      parameterBuilder.operationName(operationName);
    }
    if (!Common.isZero(config)) {
      parameterBuilder.config(config);
    }
    JsonNode parameterNode = JsonSerializable.toJsonNode(parameterBuilder.build());

    ObjectNode body;
    String path;
    if (this.apiClient.vertexAI()) {
      body = getAgentEngineOperationParametersToVertex(parameterNode, null);
      path = Common.formatMap("{operationName}", body.get("_url"));
    } else {
      throw new UnsupportedOperationException(
          "This method is only supported in the Vertex AI client.");
    }
    body.remove("_url");

    JsonNode queryParams = body.get("_query");
    if (queryParams != null) {
      body.remove("_query");
      path = String.format("%s?%s", path, Common.urlEncode((ObjectNode) queryParams));
    }

    // TODO: Remove the hack that removes config.
    Optional<HttpOptions> requestHttpOptions = Optional.empty();
    if (config != null) {
      requestHttpOptions = config.httpOptions();
    }

    return new BuiltRequest(path, JsonSerializable.toJsonString(body), requestHttpOptions);
  }

  /** A shared processResponse function for both sync and async methods. */
  AgentEngineOperation processResponseForPrivateGetAgentOperation(
      ApiResponse response, GetAgentEngineOperationConfig config) {
    ResponseBody responseBody = response.getBody();
    String responseString;
    try {
      responseString = responseBody.string();
    } catch (IOException e) {
      throw new GenAiIOException("Failed to read HTTP response.", e);
    }

    JsonNode responseNode = JsonSerializable.stringToJsonNode(responseString);

    if (this.apiClient.vertexAI()) {
      responseNode = agentEngineOperationFromVertex(responseNode, null);
    }

    if (!this.apiClient.vertexAI()) {
      throw new UnsupportedOperationException(
          "This method is only supported in the Vertex AI client.");
    }

    return JsonSerializable.fromJsonNode(responseNode, AgentEngineOperation.class);
  }

  public AgentEngineOperation privateGetAgentOperation(
      String operationName, GetAgentEngineOperationConfig config) {
    BuiltRequest builtRequest = buildRequestForPrivateGetAgentOperation(operationName, config);

    try (ApiResponse response =
        this.apiClient.request(
            "get", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForPrivateGetAgentOperation(response, config);
    }
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForPrivateQuery(String name, QueryAgentEngineConfig config) {

    QueryAgentEngineRequestParameters.Builder parameterBuilder =
        QueryAgentEngineRequestParameters.builder();

    if (!Common.isZero(name)) {
      parameterBuilder.name(name);
    }
    if (!Common.isZero(config)) {
      parameterBuilder.config(config);
    }
    JsonNode parameterNode = JsonSerializable.toJsonNode(parameterBuilder.build());

    ObjectNode body;
    String path;
    if (this.apiClient.vertexAI()) {
      body = queryAgentEngineRequestParametersToVertex(parameterNode, null);
      path = Common.formatMap("{name}:query", body.get("_url"));
    } else {
      throw new UnsupportedOperationException(
          "This method is only supported in the Vertex AI client.");
    }
    body.remove("_url");

    JsonNode queryParams = body.get("_query");
    if (queryParams != null) {
      body.remove("_query");
      path = String.format("%s?%s", path, Common.urlEncode((ObjectNode) queryParams));
    }

    // TODO: Remove the hack that removes config.
    Optional<HttpOptions> requestHttpOptions = Optional.empty();
    if (config != null) {
      requestHttpOptions = config.httpOptions();
    }

    return new BuiltRequest(path, JsonSerializable.toJsonString(body), requestHttpOptions);
  }

  /** A shared processResponse function for both sync and async methods. */
  QueryReasoningEngineResponse processResponseForPrivateQuery(
      ApiResponse response, QueryAgentEngineConfig config) {
    ResponseBody responseBody = response.getBody();
    String responseString;
    try {
      responseString = responseBody.string();
    } catch (IOException e) {
      throw new GenAiIOException("Failed to read HTTP response.", e);
    }

    JsonNode responseNode = JsonSerializable.stringToJsonNode(responseString);

    if (!this.apiClient.vertexAI()) {
      throw new UnsupportedOperationException(
          "This method is only supported in the Vertex AI client.");
    }

    return JsonSerializable.fromJsonNode(responseNode, QueryReasoningEngineResponse.class);
  }

  public QueryReasoningEngineResponse privateQuery(String name, QueryAgentEngineConfig config) {
    BuiltRequest builtRequest = buildRequestForPrivateQuery(name, config);

    try (ApiResponse response =
        this.apiClient.request(
            "post", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForPrivateQuery(response, config);
    }
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForPrivateUpdate(String name, UpdateAgentEngineConfig config) {

    UpdateAgentEngineRequestParameters.Builder parameterBuilder =
        UpdateAgentEngineRequestParameters.builder();

    if (!Common.isZero(name)) {
      parameterBuilder.name(name);
    }
    if (!Common.isZero(config)) {
      parameterBuilder.config(config);
    }
    JsonNode parameterNode = JsonSerializable.toJsonNode(parameterBuilder.build());

    ObjectNode body;
    String path;
    if (this.apiClient.vertexAI()) {
      body = updateAgentEngineRequestParametersToVertex(parameterNode, null);
      path = Common.formatMap("{name}", body.get("_url"));
    } else {
      throw new UnsupportedOperationException(
          "This method is only supported in the Vertex AI client.");
    }
    body.remove("_url");

    JsonNode queryParams = body.get("_query");
    if (queryParams != null) {
      body.remove("_query");
      path = String.format("%s?%s", path, Common.urlEncode((ObjectNode) queryParams));
    }

    // TODO: Remove the hack that removes config.
    Optional<HttpOptions> requestHttpOptions = Optional.empty();
    if (config != null) {
      requestHttpOptions = config.httpOptions();
    }

    return new BuiltRequest(path, JsonSerializable.toJsonString(body), requestHttpOptions);
  }

  /** A shared processResponse function for both sync and async methods. */
  AgentEngineOperation processResponseForPrivateUpdate(
      ApiResponse response, UpdateAgentEngineConfig config) {
    ResponseBody responseBody = response.getBody();
    String responseString;
    try {
      responseString = responseBody.string();
    } catch (IOException e) {
      throw new GenAiIOException("Failed to read HTTP response.", e);
    }

    JsonNode responseNode = JsonSerializable.stringToJsonNode(responseString);

    if (this.apiClient.vertexAI()) {
      responseNode = agentEngineOperationFromVertex(responseNode, null);
    }

    if (!this.apiClient.vertexAI()) {
      throw new UnsupportedOperationException(
          "This method is only supported in the Vertex AI client.");
    }

    return JsonSerializable.fromJsonNode(responseNode, AgentEngineOperation.class);
  }

  public AgentEngineOperation privateUpdate(String name, UpdateAgentEngineConfig config) {
    BuiltRequest builtRequest = buildRequestForPrivateUpdate(name, config);

    try (ApiResponse response =
        this.apiClient.request(
            "patch", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForPrivateUpdate(response, config);
    }
  }
}
