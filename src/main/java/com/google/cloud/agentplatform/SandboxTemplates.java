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
import com.google.cloud.agentplatform.types.CreateSandboxEnvironmentTemplateConfig;
import com.google.cloud.agentplatform.types.CreateSandboxEnvironmentTemplateRequestParameters;
import com.google.cloud.agentplatform.types.DeleteSandboxEnvironmentTemplateConfig;
import com.google.cloud.agentplatform.types.DeleteSandboxEnvironmentTemplateOperation;
import com.google.cloud.agentplatform.types.DeleteSandboxEnvironmentTemplateRequestParameters;
import com.google.cloud.agentplatform.types.GetAgentEngineOperationConfig;
import com.google.cloud.agentplatform.types.GetSandboxEnvironmentTemplateConfig;
import com.google.cloud.agentplatform.types.GetSandboxEnvironmentTemplateOperationParameters;
import com.google.cloud.agentplatform.types.GetSandboxEnvironmentTemplateRequestParameters;
import com.google.cloud.agentplatform.types.ListSandboxEnvironmentTemplatesConfig;
import com.google.cloud.agentplatform.types.ListSandboxEnvironmentTemplatesRequestParameters;
import com.google.cloud.agentplatform.types.ListSandboxEnvironmentTemplatesResponse;
import com.google.cloud.agentplatform.types.SandboxEnvironmentTemplate;
import com.google.cloud.agentplatform.types.SandboxEnvironmentTemplateOperation;
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

public final class SandboxTemplates {

  final ApiClient apiClient;

  public SandboxTemplates(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode createSandboxEnvironmentTemplateConfigToVertex(
      JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"customContainerEnvironment"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"customContainerEnvironment"},
          Common.getValueByPath(fromObject, new String[] {"customContainerEnvironment"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"defaultContainerEnvironment"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"defaultContainerEnvironment"},
          Common.getValueByPath(fromObject, new String[] {"defaultContainerEnvironment"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"egressControlConfig"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"egressControlConfig"},
          Common.getValueByPath(fromObject, new String[] {"egressControlConfig"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode createSandboxEnvironmentTemplateRequestParametersToVertex(
      JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"displayName"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"displayName"},
          Common.getValueByPath(fromObject, new String[] {"displayName"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      JsonNode unused =
          createSandboxEnvironmentTemplateConfigToVertex(
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject);
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode deleteSandboxEnvironmentTemplateRequestParametersToVertex(
      JsonNode fromObject, ObjectNode parentObject) {
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
  ObjectNode getSandboxEnvironmentTemplateOperationParametersToVertex(
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
  ObjectNode getSandboxEnvironmentTemplateRequestParametersToVertex(
      JsonNode fromObject, ObjectNode parentObject) {
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
  ObjectNode listSandboxEnvironmentTemplatesConfigToVertex(
      JsonNode fromObject, ObjectNode parentObject) {
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
  ObjectNode listSandboxEnvironmentTemplatesRequestParametersToVertex(
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
          listSandboxEnvironmentTemplatesConfigToVertex(
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject);
    }

    return toObject;
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForPrivateCreate(
      String name, String displayName, CreateSandboxEnvironmentTemplateConfig config) {

    CreateSandboxEnvironmentTemplateRequestParameters.Builder parameterBuilder =
        CreateSandboxEnvironmentTemplateRequestParameters.builder();

    if (!Common.isZero(name)) {
      parameterBuilder.name(name);
    }
    if (!Common.isZero(displayName)) {
      parameterBuilder.displayName(displayName);
    }
    if (!Common.isZero(config)) {
      parameterBuilder.config(config);
    }
    JsonNode parameterNode = JsonSerializable.toJsonNode(parameterBuilder.build());

    ObjectNode body;
    String path;
    if (this.apiClient.vertexAI()) {
      body = createSandboxEnvironmentTemplateRequestParametersToVertex(parameterNode, null);
      path = Common.formatMap("{name}/sandboxEnvironmentTemplates", body.get("_url"));
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
  SandboxEnvironmentTemplateOperation processResponseForPrivateCreate(
      ApiResponse response, CreateSandboxEnvironmentTemplateConfig config) {
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

    return JsonSerializable.fromJsonNode(responseNode, SandboxEnvironmentTemplateOperation.class);
  }

  SandboxEnvironmentTemplateOperation privateCreate(
      String name, String displayName, CreateSandboxEnvironmentTemplateConfig config) {
    BuiltRequest builtRequest = buildRequestForPrivateCreate(name, displayName, config);

    try (ApiResponse response =
        this.apiClient.request(
            "post", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForPrivateCreate(response, config);
    }
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForPrivateDelete(
      String name, DeleteSandboxEnvironmentTemplateConfig config) {

    DeleteSandboxEnvironmentTemplateRequestParameters.Builder parameterBuilder =
        DeleteSandboxEnvironmentTemplateRequestParameters.builder();

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
      body = deleteSandboxEnvironmentTemplateRequestParametersToVertex(parameterNode, null);
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
  DeleteSandboxEnvironmentTemplateOperation processResponseForPrivateDelete(
      ApiResponse response, DeleteSandboxEnvironmentTemplateConfig config) {
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

    return JsonSerializable.fromJsonNode(
        responseNode, DeleteSandboxEnvironmentTemplateOperation.class);
  }

  DeleteSandboxEnvironmentTemplateOperation privateDelete(
      String name, DeleteSandboxEnvironmentTemplateConfig config) {
    BuiltRequest builtRequest = buildRequestForPrivateDelete(name, config);

    try (ApiResponse response =
        this.apiClient.request(
            "delete", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForPrivateDelete(response, config);
    }
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForPrivateGet(String name, GetSandboxEnvironmentTemplateConfig config) {

    GetSandboxEnvironmentTemplateRequestParameters.Builder parameterBuilder =
        GetSandboxEnvironmentTemplateRequestParameters.builder();

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
      body = getSandboxEnvironmentTemplateRequestParametersToVertex(parameterNode, null);
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
  SandboxEnvironmentTemplate processResponseForPrivateGet(
      ApiResponse response, GetSandboxEnvironmentTemplateConfig config) {
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

    return JsonSerializable.fromJsonNode(responseNode, SandboxEnvironmentTemplate.class);
  }

  SandboxEnvironmentTemplate privateGet(String name, GetSandboxEnvironmentTemplateConfig config) {
    BuiltRequest builtRequest = buildRequestForPrivateGet(name, config);

    try (ApiResponse response =
        this.apiClient.request(
            "get", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForPrivateGet(response, config);
    }
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForPrivateList(
      String name, ListSandboxEnvironmentTemplatesConfig config) {

    ListSandboxEnvironmentTemplatesRequestParameters.Builder parameterBuilder =
        ListSandboxEnvironmentTemplatesRequestParameters.builder();

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
      body = listSandboxEnvironmentTemplatesRequestParametersToVertex(parameterNode, null);
      path = Common.formatMap("{name}/sandboxEnvironmentTemplates", body.get("_url"));
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
  ListSandboxEnvironmentTemplatesResponse processResponseForPrivateList(
      ApiResponse response, ListSandboxEnvironmentTemplatesConfig config) {
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

    return JsonSerializable.fromJsonNode(
        responseNode, ListSandboxEnvironmentTemplatesResponse.class);
  }

  ListSandboxEnvironmentTemplatesResponse privateList(
      String name, ListSandboxEnvironmentTemplatesConfig config) {
    BuiltRequest builtRequest = buildRequestForPrivateList(name, config);

    try (ApiResponse response =
        this.apiClient.request(
            "get", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForPrivateList(response, config);
    }
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForGetSandboxEnvironmentTemplateOperation(
      String operationName, GetAgentEngineOperationConfig config) {

    GetSandboxEnvironmentTemplateOperationParameters.Builder parameterBuilder =
        GetSandboxEnvironmentTemplateOperationParameters.builder();

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
      body = getSandboxEnvironmentTemplateOperationParametersToVertex(parameterNode, null);
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
  SandboxEnvironmentTemplateOperation processResponseForGetSandboxEnvironmentTemplateOperation(
      ApiResponse response, GetAgentEngineOperationConfig config) {
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

    return JsonSerializable.fromJsonNode(responseNode, SandboxEnvironmentTemplateOperation.class);
  }

  public SandboxEnvironmentTemplateOperation getSandboxEnvironmentTemplateOperation(
      String operationName, GetAgentEngineOperationConfig config) {
    BuiltRequest builtRequest =
        buildRequestForGetSandboxEnvironmentTemplateOperation(operationName, config);

    try (ApiResponse response =
        this.apiClient.request(
            "get", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForGetSandboxEnvironmentTemplateOperation(response, config);
    }
  }
}
