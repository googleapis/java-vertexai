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

package com.google.cloud.agentplatform;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.cloud.agentplatform.types.CreateMemoryRequestParameters;
import com.google.cloud.agentplatform.types.DeleteMemoryConfig;
import com.google.cloud.agentplatform.types.DeleteMemoryOperation;
import com.google.cloud.agentplatform.types.DeleteMemoryRequestParameters;
import com.google.cloud.agentplatform.types.GenerateMemoriesConfig;
import com.google.cloud.agentplatform.types.GenerateMemoriesOperation;
import com.google.cloud.agentplatform.types.GenerateMemoriesRequestDirectContentsSource;
import com.google.cloud.agentplatform.types.GenerateMemoriesRequestDirectMemoriesSource;
import com.google.cloud.agentplatform.types.GenerateMemoriesRequestParameters;
import com.google.cloud.agentplatform.types.GenerateMemoriesRequestVertexSessionSource;
import com.google.cloud.agentplatform.types.GetGenerateMemoriesOperationParameters;
import com.google.cloud.agentplatform.types.GetMemoryBankOperationConfig;
import com.google.cloud.agentplatform.types.GetMemoryConfig;
import com.google.cloud.agentplatform.types.GetMemoryOperationParameters;
import com.google.cloud.agentplatform.types.GetMemoryRequestParameters;
import com.google.cloud.agentplatform.types.ListMemoriesConfig;
import com.google.cloud.agentplatform.types.ListMemoriesRequestParameters;
import com.google.cloud.agentplatform.types.ListMemoriesResponse;
import com.google.cloud.agentplatform.types.Memory;
import com.google.cloud.agentplatform.types.MemoryConfig;
import com.google.cloud.agentplatform.types.MemoryConjunctionFilter;
import com.google.cloud.agentplatform.types.MemoryOperation;
import com.google.cloud.agentplatform.types.PurgeMemoriesConfig;
import com.google.cloud.agentplatform.types.PurgeMemoriesOperation;
import com.google.cloud.agentplatform.types.PurgeMemoriesRequestParameters;
import com.google.cloud.agentplatform.types.RetrieveMemoriesConfig;
import com.google.cloud.agentplatform.types.RetrieveMemoriesRequestParameters;
import com.google.cloud.agentplatform.types.RetrieveMemoriesRequestSimilaritySearchParams;
import com.google.cloud.agentplatform.types.RetrieveMemoriesRequestSimpleRetrievalParams;
import com.google.cloud.agentplatform.types.RetrieveMemoriesResponse;
import com.google.cloud.agentplatform.types.RetrieveMemoryProfilesConfig;
import com.google.cloud.agentplatform.types.RetrieveMemoryProfilesRequestParameters;
import com.google.cloud.agentplatform.types.RetrieveProfilesResponse;
import com.google.cloud.agentplatform.types.RollbackMemoryConfig;
import com.google.cloud.agentplatform.types.RollbackMemoryOperation;
import com.google.cloud.agentplatform.types.RollbackMemoryRequestParameters;
import com.google.cloud.agentplatform.types.UpdateMemoryConfig;
import com.google.cloud.agentplatform.types.UpdateMemoryRequestParameters;
import com.google.genai.ApiClient;
import com.google.genai.ApiResponse;
import com.google.genai.Common;
import com.google.genai.Common.BuiltRequest;
import com.google.genai.JsonSerializable;
import com.google.genai.errors.GenAiIOException;
import com.google.genai.types.HttpOptions;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import okhttp3.ResponseBody;

public final class Memories {
  public final MemoryRevisions revisions;

  final ApiClient apiClient;

  public Memories(ApiClient apiClient) {
    this.apiClient = apiClient;
    this.revisions = new MemoryRevisions(apiClient);
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode createMemoryRequestParametersToVertex(JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"fact"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"fact"},
          Common.getValueByPath(fromObject, new String[] {"fact"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"scope"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"scope"},
          Common.getValueByPath(fromObject, new String[] {"scope"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      JsonNode unused =
          memoryConfigToVertex(
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject);
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode deleteMemoryRequestParametersToVertex(JsonNode fromObject, ObjectNode parentObject) {
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
  ObjectNode generateMemoriesConfigToVertex(JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"disableConsolidation"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"disableConsolidation"},
          Common.getValueByPath(fromObject, new String[] {"disableConsolidation"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"revisionLabels"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"revisionLabels"},
          Common.getValueByPath(fromObject, new String[] {"revisionLabels"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"revisionExpireTime"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"revisionExpireTime"},
          Common.getValueByPath(fromObject, new String[] {"revisionExpireTime"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"revisionTtl"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"revisionTtl"},
          Common.getValueByPath(fromObject, new String[] {"revisionTtl"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"disableMemoryRevisions"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"disableMemoryRevisions"},
          Common.getValueByPath(fromObject, new String[] {"disableMemoryRevisions"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"metadata"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"metadata"},
          Common.getValueByPath(fromObject, new String[] {"metadata"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"metadataMergeStrategy"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"metadataMergeStrategy"},
          Common.getValueByPath(fromObject, new String[] {"metadataMergeStrategy"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"allowedTopics"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"allowedTopics"},
          Common.getValueByPath(fromObject, new String[] {"allowedTopics"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode generateMemoriesRequestParametersToVertex(
      JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"vertexSessionSource"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"vertexSessionSource"},
          Common.getValueByPath(fromObject, new String[] {"vertexSessionSource"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"directContentsSource"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"directContentsSource"},
          Common.getValueByPath(fromObject, new String[] {"directContentsSource"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"directMemoriesSource"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"directMemoriesSource"},
          Common.getValueByPath(fromObject, new String[] {"directMemoriesSource"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"scope"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"scope"},
          Common.getValueByPath(fromObject, new String[] {"scope"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      JsonNode unused =
          generateMemoriesConfigToVertex(
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject);
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode getGenerateMemoriesOperationParametersToVertex(
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
  ObjectNode getMemoryOperationParametersToVertex(JsonNode fromObject, ObjectNode parentObject) {
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
  ObjectNode getMemoryRequestParametersToVertex(JsonNode fromObject, ObjectNode parentObject) {
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
  ObjectNode listMemoriesConfigToVertex(JsonNode fromObject, ObjectNode parentObject) {
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

    if (Common.getValueByPath(fromObject, new String[] {"orderBy"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"_query", "orderBy"},
          Common.getValueByPath(fromObject, new String[] {"orderBy"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode listMemoriesRequestParametersToVertex(JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      JsonNode unused =
          listMemoriesConfigToVertex(
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject);
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode memoryConfigToVertex(JsonNode fromObject, ObjectNode parentObject) {
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

    if (Common.getValueByPath(fromObject, new String[] {"ttl"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"ttl"},
          Common.getValueByPath(fromObject, new String[] {"ttl"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"expireTime"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"expireTime"},
          Common.getValueByPath(fromObject, new String[] {"expireTime"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"revisionExpireTime"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"revisionExpireTime"},
          Common.getValueByPath(fromObject, new String[] {"revisionExpireTime"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"revisionTtl"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"revisionTtl"},
          Common.getValueByPath(fromObject, new String[] {"revisionTtl"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"disableMemoryRevisions"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"disableMemoryRevisions"},
          Common.getValueByPath(fromObject, new String[] {"disableMemoryRevisions"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"topics"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"topics"},
          Common.getValueByPath(fromObject, new String[] {"topics"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"metadata"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"metadata"},
          Common.getValueByPath(fromObject, new String[] {"metadata"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"memoryId"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"_query", "memoryId"},
          Common.getValueByPath(fromObject, new String[] {"memoryId"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode purgeMemoriesRequestParametersToVertex(JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"filter"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"filter"},
          Common.getValueByPath(fromObject, new String[] {"filter"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"filterGroups"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"filterGroups"},
          Common.getValueByPath(fromObject, new String[] {"filterGroups"}));
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
  ObjectNode retrieveMemoriesConfigToVertex(JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"filter"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"filter"},
          Common.getValueByPath(fromObject, new String[] {"filter"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"filterGroups"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"filterGroups"},
          Common.getValueByPath(fromObject, new String[] {"filterGroups"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"memoryTypes"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"memoryTypes"},
          Common.getValueByPath(fromObject, new String[] {"memoryTypes"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode retrieveMemoriesRequestParametersToVertex(
      JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"scope"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"scope"},
          Common.getValueByPath(fromObject, new String[] {"scope"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"similaritySearchParams"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"similaritySearchParams"},
          Common.getValueByPath(fromObject, new String[] {"similaritySearchParams"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"simpleRetrievalParams"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"simpleRetrievalParams"},
          Common.getValueByPath(fromObject, new String[] {"simpleRetrievalParams"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      JsonNode unused =
          retrieveMemoriesConfigToVertex(
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject);
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode retrieveMemoryProfilesRequestParametersToVertex(
      JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"scope"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"scope"},
          Common.getValueByPath(fromObject, new String[] {"scope"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode rollbackMemoryRequestParametersToVertex(JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"targetRevisionId"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"targetRevisionId"},
          Common.getValueByPath(fromObject, new String[] {"targetRevisionId"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode updateMemoryConfigToVertex(JsonNode fromObject, ObjectNode parentObject) {
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

    if (Common.getValueByPath(fromObject, new String[] {"ttl"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"ttl"},
          Common.getValueByPath(fromObject, new String[] {"ttl"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"expireTime"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"expireTime"},
          Common.getValueByPath(fromObject, new String[] {"expireTime"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"revisionExpireTime"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"revisionExpireTime"},
          Common.getValueByPath(fromObject, new String[] {"revisionExpireTime"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"revisionTtl"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"revisionTtl"},
          Common.getValueByPath(fromObject, new String[] {"revisionTtl"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"disableMemoryRevisions"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"disableMemoryRevisions"},
          Common.getValueByPath(fromObject, new String[] {"disableMemoryRevisions"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"topics"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"topics"},
          Common.getValueByPath(fromObject, new String[] {"topics"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"metadata"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"metadata"},
          Common.getValueByPath(fromObject, new String[] {"metadata"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"memoryId"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"_query", "memoryId"},
          Common.getValueByPath(fromObject, new String[] {"memoryId"}));
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
  ObjectNode updateMemoryRequestParametersToVertex(JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"fact"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"fact"},
          Common.getValueByPath(fromObject, new String[] {"fact"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"scope"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"scope"},
          Common.getValueByPath(fromObject, new String[] {"scope"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      JsonNode unused =
          updateMemoryConfigToVertex(
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject);
    }

    return toObject;
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForPrivateCreate(
      String name, String fact, Map<String, String> scope, MemoryConfig config) {

    CreateMemoryRequestParameters.Builder parameterBuilder =
        CreateMemoryRequestParameters.builder();

    if (!Common.isZero(name)) {
      parameterBuilder.name(name);
    }
    if (!Common.isZero(fact)) {
      parameterBuilder.fact(fact);
    }
    if (!Common.isZero(scope)) {
      parameterBuilder.scope(scope);
    }
    if (!Common.isZero(config)) {
      parameterBuilder.config(config);
    }
    JsonNode parameterNode = JsonSerializable.toJsonNode(parameterBuilder.build());

    ObjectNode body;
    String path;
    if (this.apiClient.vertexAI()) {
      body = createMemoryRequestParametersToVertex(parameterNode, null);
      path = Common.formatMap("{name}/memories", body.get("_url"));
    } else {
      throw new UnsupportedOperationException(
          "This method is only supported in Gemini Enterprise Agent Platform mode, not in Gemini"
              + " Developer API mode.");
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
  MemoryOperation processResponseForPrivateCreate(ApiResponse response, MemoryConfig config) {
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
          "This method is only supported in Gemini Enterprise Agent Platform mode, not in Gemini"
              + " Developer API mode.");
    }

    return JsonSerializable.fromJsonNode(responseNode, MemoryOperation.class);
  }

  public MemoryOperation privateCreate(
      String name, String fact, Map<String, String> scope, MemoryConfig config) {
    BuiltRequest builtRequest = buildRequestForPrivateCreate(name, fact, scope, config);

    try (ApiResponse response =
        this.apiClient.request(
            "post", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForPrivateCreate(response, config);
    }
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForDelete(String name, DeleteMemoryConfig config) {

    DeleteMemoryRequestParameters.Builder parameterBuilder =
        DeleteMemoryRequestParameters.builder();

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
      body = deleteMemoryRequestParametersToVertex(parameterNode, null);
      path = Common.formatMap("{name}", body.get("_url"));
    } else {
      throw new UnsupportedOperationException(
          "This method is only supported in Gemini Enterprise Agent Platform mode, not in Gemini"
              + " Developer API mode.");
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
  DeleteMemoryOperation processResponseForDelete(ApiResponse response, DeleteMemoryConfig config) {
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
          "This method is only supported in Gemini Enterprise Agent Platform mode, not in Gemini"
              + " Developer API mode.");
    }

    return JsonSerializable.fromJsonNode(responseNode, DeleteMemoryOperation.class);
  }

  public DeleteMemoryOperation delete(String name, DeleteMemoryConfig config) {
    BuiltRequest builtRequest = buildRequestForDelete(name, config);

    try (ApiResponse response =
        this.apiClient.request(
            "delete", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForDelete(response, config);
    }
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForPrivateGenerate(
      String name,
      GenerateMemoriesRequestVertexSessionSource vertexSessionSource,
      GenerateMemoriesRequestDirectContentsSource directContentsSource,
      GenerateMemoriesRequestDirectMemoriesSource directMemoriesSource,
      Map<String, String> scope,
      GenerateMemoriesConfig config) {

    GenerateMemoriesRequestParameters.Builder parameterBuilder =
        GenerateMemoriesRequestParameters.builder();

    if (!Common.isZero(name)) {
      parameterBuilder.name(name);
    }
    if (!Common.isZero(vertexSessionSource)) {
      parameterBuilder.vertexSessionSource(vertexSessionSource);
    }
    if (!Common.isZero(directContentsSource)) {
      parameterBuilder.directContentsSource(directContentsSource);
    }
    if (!Common.isZero(directMemoriesSource)) {
      parameterBuilder.directMemoriesSource(directMemoriesSource);
    }
    if (!Common.isZero(scope)) {
      parameterBuilder.scope(scope);
    }
    if (!Common.isZero(config)) {
      parameterBuilder.config(config);
    }
    JsonNode parameterNode = JsonSerializable.toJsonNode(parameterBuilder.build());

    ObjectNode body;
    String path;
    if (this.apiClient.vertexAI()) {
      body = generateMemoriesRequestParametersToVertex(parameterNode, null);
      path = Common.formatMap("{name}/memories:generate", body.get("_url"));
    } else {
      throw new UnsupportedOperationException(
          "This method is only supported in Gemini Enterprise Agent Platform mode, not in Gemini"
              + " Developer API mode.");
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
  GenerateMemoriesOperation processResponseForPrivateGenerate(
      ApiResponse response, GenerateMemoriesConfig config) {
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
          "This method is only supported in Gemini Enterprise Agent Platform mode, not in Gemini"
              + " Developer API mode.");
    }

    return JsonSerializable.fromJsonNode(responseNode, GenerateMemoriesOperation.class);
  }

  public GenerateMemoriesOperation privateGenerate(
      String name,
      GenerateMemoriesRequestVertexSessionSource vertexSessionSource,
      GenerateMemoriesRequestDirectContentsSource directContentsSource,
      GenerateMemoriesRequestDirectMemoriesSource directMemoriesSource,
      Map<String, String> scope,
      GenerateMemoriesConfig config) {
    BuiltRequest builtRequest =
        buildRequestForPrivateGenerate(
            name, vertexSessionSource, directContentsSource, directMemoriesSource, scope, config);

    try (ApiResponse response =
        this.apiClient.request(
            "post", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForPrivateGenerate(response, config);
    }
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForGet(String name, GetMemoryConfig config) {

    GetMemoryRequestParameters.Builder parameterBuilder = GetMemoryRequestParameters.builder();

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
      body = getMemoryRequestParametersToVertex(parameterNode, null);
      path = Common.formatMap("{name}", body.get("_url"));
    } else {
      throw new UnsupportedOperationException(
          "This method is only supported in Gemini Enterprise Agent Platform mode, not in Gemini"
              + " Developer API mode.");
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
  Memory processResponseForGet(ApiResponse response, GetMemoryConfig config) {
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
          "This method is only supported in Gemini Enterprise Agent Platform mode, not in Gemini"
              + " Developer API mode.");
    }

    return JsonSerializable.fromJsonNode(responseNode, Memory.class);
  }

  public Memory get(String name, GetMemoryConfig config) {
    BuiltRequest builtRequest = buildRequestForGet(name, config);

    try (ApiResponse response =
        this.apiClient.request(
            "get", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForGet(response, config);
    }
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForPrivateList(String name, ListMemoriesConfig config) {

    ListMemoriesRequestParameters.Builder parameterBuilder =
        ListMemoriesRequestParameters.builder();

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
      body = listMemoriesRequestParametersToVertex(parameterNode, null);
      path = Common.formatMap("{name}/memories", body.get("_url"));
    } else {
      throw new UnsupportedOperationException(
          "This method is only supported in Gemini Enterprise Agent Platform mode, not in Gemini"
              + " Developer API mode.");
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
  ListMemoriesResponse processResponseForPrivateList(
      ApiResponse response, ListMemoriesConfig config) {
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
          "This method is only supported in Gemini Enterprise Agent Platform mode, not in Gemini"
              + " Developer API mode.");
    }

    return JsonSerializable.fromJsonNode(responseNode, ListMemoriesResponse.class);
  }

  public ListMemoriesResponse privateList(String name, ListMemoriesConfig config) {
    BuiltRequest builtRequest = buildRequestForPrivateList(name, config);

    try (ApiResponse response =
        this.apiClient.request(
            "get", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForPrivateList(response, config);
    }
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForPrivateGetMemoryOperation(
      String operationName, GetMemoryBankOperationConfig config) {

    GetMemoryOperationParameters.Builder parameterBuilder = GetMemoryOperationParameters.builder();

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
      body = getMemoryOperationParametersToVertex(parameterNode, null);
      path = Common.formatMap("{operationName}", body.get("_url"));
    } else {
      throw new UnsupportedOperationException(
          "This method is only supported in Gemini Enterprise Agent Platform mode, not in Gemini"
              + " Developer API mode.");
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
  MemoryOperation processResponseForPrivateGetMemoryOperation(
      ApiResponse response, GetMemoryBankOperationConfig config) {
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
          "This method is only supported in Gemini Enterprise Agent Platform mode, not in Gemini"
              + " Developer API mode.");
    }

    return JsonSerializable.fromJsonNode(responseNode, MemoryOperation.class);
  }

  public MemoryOperation privateGetMemoryOperation(
      String operationName, GetMemoryBankOperationConfig config) {
    BuiltRequest builtRequest = buildRequestForPrivateGetMemoryOperation(operationName, config);

    try (ApiResponse response =
        this.apiClient.request(
            "get", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForPrivateGetMemoryOperation(response, config);
    }
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForPrivateGetGenerateMemoriesOperation(
      String operationName, GetMemoryBankOperationConfig config) {

    GetGenerateMemoriesOperationParameters.Builder parameterBuilder =
        GetGenerateMemoriesOperationParameters.builder();

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
      body = getGenerateMemoriesOperationParametersToVertex(parameterNode, null);
      path = Common.formatMap("{operationName}", body.get("_url"));
    } else {
      throw new UnsupportedOperationException(
          "This method is only supported in Gemini Enterprise Agent Platform mode, not in Gemini"
              + " Developer API mode.");
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
  GenerateMemoriesOperation processResponseForPrivateGetGenerateMemoriesOperation(
      ApiResponse response, GetMemoryBankOperationConfig config) {
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
          "This method is only supported in Gemini Enterprise Agent Platform mode, not in Gemini"
              + " Developer API mode.");
    }

    return JsonSerializable.fromJsonNode(responseNode, GenerateMemoriesOperation.class);
  }

  public GenerateMemoriesOperation privateGetGenerateMemoriesOperation(
      String operationName, GetMemoryBankOperationConfig config) {
    BuiltRequest builtRequest =
        buildRequestForPrivateGetGenerateMemoriesOperation(operationName, config);

    try (ApiResponse response =
        this.apiClient.request(
            "get", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForPrivateGetGenerateMemoriesOperation(response, config);
    }
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForPrivateRetrieve(
      String name,
      Map<String, String> scope,
      RetrieveMemoriesRequestSimilaritySearchParams similaritySearchParams,
      RetrieveMemoriesRequestSimpleRetrievalParams simpleRetrievalParams,
      RetrieveMemoriesConfig config) {

    RetrieveMemoriesRequestParameters.Builder parameterBuilder =
        RetrieveMemoriesRequestParameters.builder();

    if (!Common.isZero(name)) {
      parameterBuilder.name(name);
    }
    if (!Common.isZero(scope)) {
      parameterBuilder.scope(scope);
    }
    if (!Common.isZero(similaritySearchParams)) {
      parameterBuilder.similaritySearchParams(similaritySearchParams);
    }
    if (!Common.isZero(simpleRetrievalParams)) {
      parameterBuilder.simpleRetrievalParams(simpleRetrievalParams);
    }
    if (!Common.isZero(config)) {
      parameterBuilder.config(config);
    }
    JsonNode parameterNode = JsonSerializable.toJsonNode(parameterBuilder.build());

    ObjectNode body;
    String path;
    if (this.apiClient.vertexAI()) {
      body = retrieveMemoriesRequestParametersToVertex(parameterNode, null);
      path = Common.formatMap("{name}/memories:retrieve", body.get("_url"));
    } else {
      throw new UnsupportedOperationException(
          "This method is only supported in Gemini Enterprise Agent Platform mode, not in Gemini"
              + " Developer API mode.");
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
  RetrieveMemoriesResponse processResponseForPrivateRetrieve(
      ApiResponse response, RetrieveMemoriesConfig config) {
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
          "This method is only supported in Gemini Enterprise Agent Platform mode, not in Gemini"
              + " Developer API mode.");
    }

    return JsonSerializable.fromJsonNode(responseNode, RetrieveMemoriesResponse.class);
  }

  public RetrieveMemoriesResponse privateRetrieve(
      String name,
      Map<String, String> scope,
      RetrieveMemoriesRequestSimilaritySearchParams similaritySearchParams,
      RetrieveMemoriesRequestSimpleRetrievalParams simpleRetrievalParams,
      RetrieveMemoriesConfig config) {
    BuiltRequest builtRequest =
        buildRequestForPrivateRetrieve(
            name, scope, similaritySearchParams, simpleRetrievalParams, config);

    try (ApiResponse response =
        this.apiClient.request(
            "post", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForPrivateRetrieve(response, config);
    }
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForRetrieveProfiles(
      String name, Map<String, String> scope, RetrieveMemoryProfilesConfig config) {

    RetrieveMemoryProfilesRequestParameters.Builder parameterBuilder =
        RetrieveMemoryProfilesRequestParameters.builder();

    if (!Common.isZero(name)) {
      parameterBuilder.name(name);
    }
    if (!Common.isZero(scope)) {
      parameterBuilder.scope(scope);
    }
    if (!Common.isZero(config)) {
      parameterBuilder.config(config);
    }
    JsonNode parameterNode = JsonSerializable.toJsonNode(parameterBuilder.build());

    ObjectNode body;
    String path;
    if (this.apiClient.vertexAI()) {
      body = retrieveMemoryProfilesRequestParametersToVertex(parameterNode, null);
      path = Common.formatMap("{name}/memories:retrieveProfiles", body.get("_url"));
    } else {
      throw new UnsupportedOperationException(
          "This method is only supported in Gemini Enterprise Agent Platform mode, not in Gemini"
              + " Developer API mode.");
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
  RetrieveProfilesResponse processResponseForRetrieveProfiles(
      ApiResponse response, RetrieveMemoryProfilesConfig config) {
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
          "This method is only supported in Gemini Enterprise Agent Platform mode, not in Gemini"
              + " Developer API mode.");
    }

    return JsonSerializable.fromJsonNode(responseNode, RetrieveProfilesResponse.class);
  }

  public RetrieveProfilesResponse retrieveProfiles(
      String name, Map<String, String> scope, RetrieveMemoryProfilesConfig config) {
    BuiltRequest builtRequest = buildRequestForRetrieveProfiles(name, scope, config);

    try (ApiResponse response =
        this.apiClient.request(
            "post", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForRetrieveProfiles(response, config);
    }
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForPrivateRollback(
      String name, String targetRevisionId, RollbackMemoryConfig config) {

    RollbackMemoryRequestParameters.Builder parameterBuilder =
        RollbackMemoryRequestParameters.builder();

    if (!Common.isZero(name)) {
      parameterBuilder.name(name);
    }
    if (!Common.isZero(targetRevisionId)) {
      parameterBuilder.targetRevisionId(targetRevisionId);
    }
    if (!Common.isZero(config)) {
      parameterBuilder.config(config);
    }
    JsonNode parameterNode = JsonSerializable.toJsonNode(parameterBuilder.build());

    ObjectNode body;
    String path;
    if (this.apiClient.vertexAI()) {
      body = rollbackMemoryRequestParametersToVertex(parameterNode, null);
      path = Common.formatMap("{name}:rollback", body.get("_url"));
    } else {
      throw new UnsupportedOperationException(
          "This method is only supported in Gemini Enterprise Agent Platform mode, not in Gemini"
              + " Developer API mode.");
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
  RollbackMemoryOperation processResponseForPrivateRollback(
      ApiResponse response, RollbackMemoryConfig config) {
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
          "This method is only supported in Gemini Enterprise Agent Platform mode, not in Gemini"
              + " Developer API mode.");
    }

    return JsonSerializable.fromJsonNode(responseNode, RollbackMemoryOperation.class);
  }

  public RollbackMemoryOperation privateRollback(
      String name, String targetRevisionId, RollbackMemoryConfig config) {
    BuiltRequest builtRequest = buildRequestForPrivateRollback(name, targetRevisionId, config);

    try (ApiResponse response =
        this.apiClient.request(
            "post", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForPrivateRollback(response, config);
    }
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForPrivateUpdate(
      String name, String fact, Map<String, String> scope, UpdateMemoryConfig config) {

    UpdateMemoryRequestParameters.Builder parameterBuilder =
        UpdateMemoryRequestParameters.builder();

    if (!Common.isZero(name)) {
      parameterBuilder.name(name);
    }
    if (!Common.isZero(fact)) {
      parameterBuilder.fact(fact);
    }
    if (!Common.isZero(scope)) {
      parameterBuilder.scope(scope);
    }
    if (!Common.isZero(config)) {
      parameterBuilder.config(config);
    }
    JsonNode parameterNode = JsonSerializable.toJsonNode(parameterBuilder.build());

    ObjectNode body;
    String path;
    if (this.apiClient.vertexAI()) {
      body = updateMemoryRequestParametersToVertex(parameterNode, null);
      path = Common.formatMap("{name}", body.get("_url"));
    } else {
      throw new UnsupportedOperationException(
          "This method is only supported in Gemini Enterprise Agent Platform mode, not in Gemini"
              + " Developer API mode.");
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
  MemoryOperation processResponseForPrivateUpdate(ApiResponse response, UpdateMemoryConfig config) {
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
          "This method is only supported in Gemini Enterprise Agent Platform mode, not in Gemini"
              + " Developer API mode.");
    }

    return JsonSerializable.fromJsonNode(responseNode, MemoryOperation.class);
  }

  public MemoryOperation privateUpdate(
      String name, String fact, Map<String, String> scope, UpdateMemoryConfig config) {
    BuiltRequest builtRequest = buildRequestForPrivateUpdate(name, fact, scope, config);

    try (ApiResponse response =
        this.apiClient.request(
            "patch", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForPrivateUpdate(response, config);
    }
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForPrivatePurge(
      String name,
      String filter,
      List<MemoryConjunctionFilter> filterGroups,
      boolean force,
      PurgeMemoriesConfig config) {

    PurgeMemoriesRequestParameters.Builder parameterBuilder =
        PurgeMemoriesRequestParameters.builder();

    if (!Common.isZero(name)) {
      parameterBuilder.name(name);
    }
    if (!Common.isZero(filter)) {
      parameterBuilder.filter(filter);
    }
    if (!Common.isZero(filterGroups)) {
      parameterBuilder.filterGroups(filterGroups);
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
      body = purgeMemoriesRequestParametersToVertex(parameterNode, null);
      path = Common.formatMap("{name}/memories:purge", body.get("_url"));
    } else {
      throw new UnsupportedOperationException(
          "This method is only supported in Gemini Enterprise Agent Platform mode, not in Gemini"
              + " Developer API mode.");
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
  PurgeMemoriesOperation processResponseForPrivatePurge(
      ApiResponse response, PurgeMemoriesConfig config) {
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
          "This method is only supported in Gemini Enterprise Agent Platform mode, not in Gemini"
              + " Developer API mode.");
    }

    return JsonSerializable.fromJsonNode(responseNode, PurgeMemoriesOperation.class);
  }

  public PurgeMemoriesOperation privatePurge(
      String name,
      String filter,
      List<MemoryConjunctionFilter> filterGroups,
      boolean force,
      PurgeMemoriesConfig config) {
    BuiltRequest builtRequest =
        buildRequestForPrivatePurge(name, filter, filterGroups, force, config);

    try (ApiResponse response =
        this.apiClient.request(
            "post", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForPrivatePurge(response, config);
    }
  }
}
