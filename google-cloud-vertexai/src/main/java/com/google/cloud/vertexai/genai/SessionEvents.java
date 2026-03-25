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
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.cloud.vertexai.genai.types.AppendAgentEngineSessionEventConfig;
import com.google.cloud.vertexai.genai.types.AppendAgentEngineSessionEventRequestParameters;
import com.google.cloud.vertexai.genai.types.AppendAgentEngineSessionEventResponse;
import com.google.cloud.vertexai.genai.types.ListAgentEngineSessionEventsConfig;
import com.google.cloud.vertexai.genai.types.ListAgentEngineSessionEventsRequestParameters;
import com.google.cloud.vertexai.genai.types.ListAgentEngineSessionEventsResponse;
import com.google.genai.ApiClient;
import com.google.genai.ApiResponse;
import com.google.genai.Common;
import com.google.genai.Common.BuiltRequest;
import com.google.genai.JsonSerializable;
import com.google.genai.errors.GenAiIOException;
import com.google.genai.types.HttpOptions;
import java.io.IOException;
import java.time.Instant;
import java.util.Optional;
import okhttp3.ResponseBody;

public final class SessionEvents {

  final ApiClient apiClient;

  public SessionEvents(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode appendAgentEngineSessionEventConfigToVertex(
      JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"content"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"content"},
          Common.getValueByPath(fromObject, new String[] {"content"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"actions"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"actions"},
          Common.getValueByPath(fromObject, new String[] {"actions"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"errorCode"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"errorCode"},
          Common.getValueByPath(fromObject, new String[] {"errorCode"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"errorMessage"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"errorMessage"},
          Common.getValueByPath(fromObject, new String[] {"errorMessage"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"eventMetadata"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"eventMetadata"},
          Common.getValueByPath(fromObject, new String[] {"eventMetadata"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"rawEvent"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"rawEvent"},
          Common.getValueByPath(fromObject, new String[] {"rawEvent"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode appendAgentEngineSessionEventRequestParametersToVertex(
      JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper().createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"author"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"author"},
          Common.getValueByPath(fromObject, new String[] {"author"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"invocationId"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"invocationId"},
          Common.getValueByPath(fromObject, new String[] {"invocationId"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"timestamp"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"timestamp"},
          Common.getValueByPath(fromObject, new String[] {"timestamp"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      JsonNode unused =
          appendAgentEngineSessionEventConfigToVertex(
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject);
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode listAgentEngineSessionEventsConfigToVertex(
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
  ObjectNode listAgentEngineSessionEventsRequestParametersToVertex(
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
          listAgentEngineSessionEventsConfigToVertex(
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject);
    }

    return toObject;
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForAppend(
      String name,
      String author,
      String invocationId,
      Instant timestamp,
      AppendAgentEngineSessionEventConfig config) {

    AppendAgentEngineSessionEventRequestParameters.Builder parameterBuilder =
        AppendAgentEngineSessionEventRequestParameters.builder();

    if (!Common.isZero(name)) {
      parameterBuilder.name(name);
    }
    if (!Common.isZero(author)) {
      parameterBuilder.author(author);
    }
    if (!Common.isZero(invocationId)) {
      parameterBuilder.invocationId(invocationId);
    }
    if (!Common.isZero(timestamp)) {
      parameterBuilder.timestamp(timestamp);
    }
    if (!Common.isZero(config)) {
      parameterBuilder.config(config);
    }
    JsonNode parameterNode = JsonSerializable.toJsonNode(parameterBuilder.build());

    ObjectNode body;
    String path;
    if (this.apiClient.vertexAI()) {
      body = appendAgentEngineSessionEventRequestParametersToVertex(parameterNode, null);
      path = Common.formatMap("{name}:appendEvent", body.get("_url"));
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
  AppendAgentEngineSessionEventResponse processResponseForAppend(
      ApiResponse response, AppendAgentEngineSessionEventConfig config) {
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

    return JsonSerializable.fromJsonNode(responseNode, AppendAgentEngineSessionEventResponse.class);
  }

  public AppendAgentEngineSessionEventResponse append(
      String name,
      String author,
      String invocationId,
      Instant timestamp,
      AppendAgentEngineSessionEventConfig config) {
    BuiltRequest builtRequest =
        buildRequestForAppend(name, author, invocationId, timestamp, config);

    try (ApiResponse response =
        this.apiClient.request(
            "post", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForAppend(response, config);
    }
  }

  /** A shared buildRequest method for both sync and async methods. */
  BuiltRequest buildRequestForPrivateList(String name, ListAgentEngineSessionEventsConfig config) {

    ListAgentEngineSessionEventsRequestParameters.Builder parameterBuilder =
        ListAgentEngineSessionEventsRequestParameters.builder();

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
      body = listAgentEngineSessionEventsRequestParametersToVertex(parameterNode, null);
      path = Common.formatMap("{name}/events", body.get("_url"));
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
  ListAgentEngineSessionEventsResponse processResponseForPrivateList(
      ApiResponse response, ListAgentEngineSessionEventsConfig config) {
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

    return JsonSerializable.fromJsonNode(responseNode, ListAgentEngineSessionEventsResponse.class);
  }

  ListAgentEngineSessionEventsResponse privateList(
      String name, ListAgentEngineSessionEventsConfig config) {
    BuiltRequest builtRequest = buildRequestForPrivateList(name, config);

    try (ApiResponse response =
        this.apiClient.request(
            "get", builtRequest.path(), builtRequest.body(), builtRequest.httpOptions())) {
      return processResponseForPrivateList(response, config);
    }
  }
}
