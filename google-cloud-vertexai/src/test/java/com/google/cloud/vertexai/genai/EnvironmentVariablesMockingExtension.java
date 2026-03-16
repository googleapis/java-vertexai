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

package com.google.cloud.vertexai.genai;

import com.google.common.collect.ImmutableMap;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ExtensionContext.Namespace;
import org.junit.jupiter.api.extension.ExtensionContext.Store;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolver;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import com.google.genai.ApiClient;

/**
 * Extension that mocks the default environment variables in the ApiClient class.
 *
 * <p>This extension is used to mock the default environment variables in the ApiClient class in
 * order to avoid reading the actual environment variables in replay mode.
 */
public class EnvironmentVariablesMockingExtension
    implements BeforeEachCallback, AfterEachCallback, ParameterResolver {

  private static final Namespace NAMESPACE =
      Namespace.create(EnvironmentVariablesMockingExtension.class);
  private static final String MOCKED_STATIC_KEY = "mockedStaticApiClient";

  @Override
  public void beforeEach(ExtensionContext context) throws Exception {
    String clientMode = System.getenv("GOOGLE_GENAI_CLIENT_MODE");
    if (clientMode != null && clientMode.equals("api")) {
      return;
    }

    MockedStatic<ApiClient> mockedStatic =
        Mockito.mockStatic(ApiClient.class, Mockito.CALLS_REAL_METHODS);

    mockedStatic.when(ApiClient::defaultEnvironmentVariables).thenReturn(ImmutableMap.of());

    getStore(context).put(MOCKED_STATIC_KEY, mockedStatic);
  }

  @Override
  public void afterEach(ExtensionContext context) throws Exception {
    MockedStatic<?> mockedStatic = getStore(context).remove(MOCKED_STATIC_KEY, MockedStatic.class);
    if (mockedStatic != null) {
      mockedStatic.close();
    }
  }

  @Override
  public boolean supportsParameter(
      ParameterContext parameterContext, ExtensionContext extensionContext) {
    return parameterContext.getParameter().getType() == MockedStatic.class;
  }

  @Override
  public Object resolveParameter(
      ParameterContext parameterContext, ExtensionContext extensionContext) {
    return getStore(extensionContext).get(MOCKED_STATIC_KEY, MockedStatic.class);
  }

  private Store getStore(ExtensionContext context) {
    return context.getStore(Namespace.create(context.getRequiredTestMethod()));
  }
}
