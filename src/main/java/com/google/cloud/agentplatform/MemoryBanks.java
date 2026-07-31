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
import com.google.cloud.agentplatform.types.CreateMemoryBankConfig;
import com.google.cloud.agentplatform.types.CreateMemoryBankRequestParameters;
import com.google.cloud.agentplatform.types.DeleteMemoryBankConfig;
import com.google.cloud.agentplatform.types.DeleteMemoryBankOperation;
import com.google.cloud.agentplatform.types.DeleteMemoryBankRequestParameters;
import com.google.cloud.agentplatform.types.GetMemoryBankOperationConfig;
import com.google.cloud.agentplatform.types.GetMemoryBankOperationParameters;
import com.google.cloud.agentplatform.types.IngestEventsConfig;
import com.google.cloud.agentplatform.types.IngestEventsRequestParameters;
import com.google.cloud.agentplatform.types.IngestionDirectContentsSource;
import com.google.cloud.agentplatform.types.MemoryBankIngestEventsOperation;
import com.google.cloud.agentplatform.types.MemoryBankOperation;
import com.google.cloud.agentplatform.types.MemoryGenerationTriggerConfig;
import com.google.genai.ApiClient;
import com.google.genai.ApiResponse;
import com.google.genai.Common;
import com.google.genai.Common.BuiltRequest;
import com.google.genai.JsonSerializable;
import com.google.genai.errors.GenAiIOException;
import com.google.genai.types.HttpOptions;
import java.io.IOException;
import java.util.Map;
import java.util.Optional;
import okhttp3.ResponseBody;

public final class MemoryBanks {
  public final Memories memories;

  final ApiClient apiClient;

  public MemoryBanks(ApiClient apiClient) {
    this.apiClient = apiClient;
    this.memories = new Memories(apiClient);
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode createMemoryBankRequestParametersToVertex(
      JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode deleteMemoryBankRequestParametersToVertex(
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
  ObjectNode getMemoryBankOperationParametersToVertex(
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
  ObjectNode ingestEventsConfigToVertex(JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"forceFlush"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"forceFlush"},
          Common.getValueByPath(fromObject, new String[] {"forceFlush"}));
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

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ingestEventsRequestParametersToVertex(JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"streamId"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"streamId"},
          Common.getValueByPath(fromObject, new String[] {"streamId"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"directContentsSource"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"directContentsSource"},
          Common.getValueByPath(fromObject, new String[] {"directContentsSource"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"scope"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"scope"},
          Common.getValueByPath(fromObject, new String[] {"scope"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"generationTriggerConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"generationTriggerConfig"},
          Common.getValueByPath(fromObject, new String[] {"generationTriggerConfig"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      JsonNode unused =
          ingestEventsConfigToVertex(
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject);
    }

    return toObject;
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForPrivateCreate(CreateMemoryBankConfig config) {

    CreateMemoryBankRequestParameters.Builder parameterBuilder =
        CreateMemoryBankRequestParameters.builder();

    if (!Common.isZero(config)) {
      parameterBuilder.config(config);
    }
    JsonNode parameterNode = JsonSerializable.toJsonNode(parameterBuilder.build());

    ObjectNode body;
    String path;
    if (this.apiClient.vertexAI()) {
      body = createMemoryBankRequestParametersToVertex(parameterNode, null);
      path = Common.formatMap("reasoningEngines", body.get("_url"));
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
  MemoryBankOperation processResponseForPrivateCreate(
      ApiResponse response, CreateMemoryBankConfig config) {
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

    return JsonSerializable.fromJsonNode(responseNode, MemoryBankOperation.class);
  }

  public MemoryBankOperation privateCreate(CreateMemoryBankConfig config) {
    BuiltRequest builtRequest = buildRequestForPrivateCreate(config);

    try (ApiResponse response =
        this.apiClient.request(
            "post", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForPrivateCreate(response, config);
    }
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForPrivateDelete(
      String name, boolean force, DeleteMemoryBankConfig config) {

    DeleteMemoryBankRequestParameters.Builder parameterBuilder =
        DeleteMemoryBankRequestParameters.builder();

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
      body = deleteMemoryBankRequestParametersToVertex(parameterNode, null);
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
  DeleteMemoryBankOperation processResponseForPrivateDelete(
      ApiResponse response, DeleteMemoryBankConfig config) {
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

    return JsonSerializable.fromJsonNode(responseNode, DeleteMemoryBankOperation.class);
  }

  public DeleteMemoryBankOperation privateDelete(
      String name, boolean force, DeleteMemoryBankConfig config) {
    BuiltRequest builtRequest = buildRequestForPrivateDelete(name, force, config);

    try (ApiResponse response =
        this.apiClient.request(
            "delete", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForPrivateDelete(response, config);
    }
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForPrivateIngestEvents(
      String name,
      String streamId,
      IngestionDirectContentsSource directContentsSource,
      Map<String, String> scope,
      MemoryGenerationTriggerConfig generationTriggerConfig,
      IngestEventsConfig config) {

    IngestEventsRequestParameters.Builder parameterBuilder =
        IngestEventsRequestParameters.builder();

    if (!Common.isZero(name)) {
      parameterBuilder.name(name);
    }
    if (!Common.isZero(streamId)) {
      parameterBuilder.streamId(streamId);
    }
    if (!Common.isZero(directContentsSource)) {
      parameterBuilder.directContentsSource(directContentsSource);
    }
    if (!Common.isZero(scope)) {
      parameterBuilder.scope(scope);
    }
    if (!Common.isZero(generationTriggerConfig)) {
      parameterBuilder.generationTriggerConfig(generationTriggerConfig);
    }
    if (!Common.isZero(config)) {
      parameterBuilder.config(config);
    }
    JsonNode parameterNode = JsonSerializable.toJsonNode(parameterBuilder.build());

    ObjectNode body;
    String path;
    if (this.apiClient.vertexAI()) {
      body = ingestEventsRequestParametersToVertex(parameterNode, null);
      path = Common.formatMap("{name}/memories:ingestEvents", body.get("_url"));
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
  MemoryBankIngestEventsOperation processResponseForPrivateIngestEvents(
      ApiResponse response, IngestEventsConfig config) {
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

    return JsonSerializable.fromJsonNode(responseNode, MemoryBankIngestEventsOperation.class);
  }

  public MemoryBankIngestEventsOperation privateIngestEvents(
      String name,
      String streamId,
      IngestionDirectContentsSource directContentsSource,
      Map<String, String> scope,
      MemoryGenerationTriggerConfig generationTriggerConfig,
      IngestEventsConfig config) {
    BuiltRequest builtRequest =
        buildRequestForPrivateIngestEvents(
            name, streamId, directContentsSource, scope, generationTriggerConfig, config);

    try (ApiResponse response =
        this.apiClient.request(
            "post", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForPrivateIngestEvents(response, config);
    }
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForPrivateGetMemoryBankOperation(
      String operationName, GetMemoryBankOperationConfig config) {

    GetMemoryBankOperationParameters.Builder parameterBuilder =
        GetMemoryBankOperationParameters.builder();

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
      body = getMemoryBankOperationParametersToVertex(parameterNode, null);
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
  MemoryBankOperation processResponseForPrivateGetMemoryBankOperation(
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

    return JsonSerializable.fromJsonNode(responseNode, MemoryBankOperation.class);
  }

  public MemoryBankOperation privateGetMemoryBankOperation(
      String operationName, GetMemoryBankOperationConfig config) {
    BuiltRequest builtRequest = buildRequestForPrivateGetMemoryBankOperation(operationName, config);

    try (ApiResponse response =
        this.apiClient.request(
            "get", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForPrivateGetMemoryBankOperation(response, config);
    }
  }
}
