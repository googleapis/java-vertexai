# Google Gemini Enterprise Agent Platform SDK for Java

> **Note:** The Gemini Enterprise Agent Platform was formerly known as
> Vertex AI.
> **Note:** The `com.google.agentplatform` package and its classes
> are **experimental**, and may change in future versions.


## Add dependency

<!-- {x-version-update-start:google-cloud-agentplatform:released} -->

```xml
<dependency>
  <groupId>com.google.cloud</groupId>
  <artifactId>google-cloud-agentplatform</artifactId>
  <version>1.52.0</version>
</dependency>
<!-- {x-version-update-end} -->

## Authentication

To learn how to authenticate to the API, see the [Authentication][authentication].

## Authorization

When a client application makes a call to the Vertex AI API, the application
must be granted the [authorization scopes][auth-scopes] that are required for
the API. Additionally, the authenticated principal must have the
[IAM role(s)][predefined-iam-roles] that are required to access the Google Cloud
resources being called.

## Getting Started

Follow the instructions in this section to get started using the Vertex AI SDK for Java.

### Prerequisites

To use the Vertex AI SDK for Java, you must have completed the following:

*   [Create a Google Cloud project][create-project].
*   [Enable the Vertex AI API][enable-api] for your project.
*   [Enable billing][enable-billing] for your project.
*   [Install the Google Cloud Command Line Interface][cloud-cli] and run the
    following commands in command line:

    ```sh
    gcloud auth login &&
    gcloud config set project <var>PROJECT_ID</var>
    ```

To acquire user credentials to use for [Application Default Credentials][adc],
run `gcloud auth application-default login`.

### Install and setup the SDK

You must install the `google-cloud-agentplatform` library.  See the
[Add Dependency](#add-dependency) section
to learn how to add `google-cloud-agentplatform` as a dependency in your code.

### Use the Vertex AI SDK for Java

The `com.google.agentplatform` package is experimental and may change in
future versions. See the examples folder for example usage.

## Versioning


This library follows [Semantic Versioning](http://semver.org/).



## Contribute to this library


Contributions to this library are always welcome and highly encouraged.

See [CONTRIBUTING][contributing] for more information how to get started.

Please note that this project is released with a Contributor Code of Conduct. By participating in
this project you agree to abide by its terms. See [Code of Conduct][code-of-conduct] for more
information.


## License

Apache 2.0 - See [LICENSE][license] for more information.

## CI Status

Java Version | Status
------------ | ------
Java 8 | [![Kokoro CI][kokoro-badge-image-2]][kokoro-badge-link-2]
Java 8 OSX | [![Kokoro CI][kokoro-badge-image-3]][kokoro-badge-link-3]
Java 8 Windows | [![Kokoro CI][kokoro-badge-image-4]][kokoro-badge-link-4]
Java 11 | [![Kokoro CI][kokoro-badge-image-5]][kokoro-badge-link-5]

Java is a registered trademark of Oracle and/or its affiliates.

[product-docs]: https://cloud.google.com/vertex-ai/docs
[javadocs]: https://cloud.google.com/java/docs/reference/google-cloud-vertexai/latest/overview
[kokoro-badge-image-1]: http://storage.googleapis.com/cloud-devrel-public/java/badges/google-cloud-java/java7.svg
[kokoro-badge-link-1]: http://storage.googleapis.com/cloud-devrel-public/java/badges/google-cloud-java/java7.html
[kokoro-badge-image-2]: http://storage.googleapis.com/cloud-devrel-public/java/badges/google-cloud-java/java8.svg
[kokoro-badge-link-2]: http://storage.googleapis.com/cloud-devrel-public/java/badges/google-cloud-java/java8.html
[kokoro-badge-image-3]: http://storage.googleapis.com/cloud-devrel-public/java/badges/google-cloud-java/java8-osx.svg
[kokoro-badge-link-3]: http://storage.googleapis.com/cloud-devrel-public/java/badges/google-cloud-java/java8-osx.html
[kokoro-badge-image-4]: http://storage.googleapis.com/cloud-devrel-public/java/badges/google-cloud-java/java8-win.svg
[kokoro-badge-link-4]: http://storage.googleapis.com/cloud-devrel-public/java/badges/google-cloud-java/java8-win.html
[kokoro-badge-image-5]: http://storage.googleapis.com/cloud-devrel-public/java/badges/google-cloud-java/java11.svg
[kokoro-badge-link-5]: http://storage.googleapis.com/cloud-devrel-public/java/badges/google-cloud-java/java11.html
[stability-image]: https://img.shields.io/badge/stability-stable-green
[maven-version-image]: https://img.shields.io/maven-central/v/com.google.cloud/google-cloud-vertexai.svg
[maven-version-link]: https://central.sonatype.com/artifact/com.google.cloud/google-cloud-vertexai/0.0.1
[authentication]: https://github.com/googleapis/google-cloud-java#authentication
[auth-scopes]: https://developers.google.com/identity/protocols/oauth2/scopes
[predefined-iam-roles]: https://cloud.google.com/iam/docs/understanding-roles#predefined_roles
[iam-policy]: https://cloud.google.com/iam/docs/overview#cloud-iam-policy
[developer-console]: https://console.developers.google.com/
[create-project]: https://cloud.google.com/resource-manager/docs/creating-managing-projects
[cloud-cli]: https://cloud.google.com/cli
[troubleshooting]: https://github.com/googleapis/google-cloud-java/blob/main/TROUBLESHOOTING.md
[contributing]: https://github.com/googleapis/google-cloud-java/blob/main/CONTRIBUTING.md
[code-of-conduct]: https://github.com/googleapis/google-cloud-java/blob/main/CODE_OF_CONDUCT.md#contributor-code-of-conduct
[license]: https://github.com/googleapis/google-cloud-java/blob/main/LICENSE
[enable-billing]: https://cloud.google.com/apis/docs/getting-started#enabling_billing
[enable-api]: https://console.cloud.google.com/flows/enableapi?apiid=aiplatform.googleapis.com
[libraries-bom]: https://github.com/GoogleCloudPlatform/cloud-opensource-java/wiki/The-Google-Cloud-Platform-Libraries-BOM
[shell_img]: https://gstatic.com/cloudssh/images/open-btn.png
[aiplatform-client-libraries]: https://cloud.google.com/java/docs/reference/google-cloud-aiplatform/latest/overview
[adc]: https://cloud.google.com/docs/authentication/application-default-credentials
[semver]: https://semver.org/
[cloudlibs]: https://cloud.google.com/apis/docs/client-libraries-explained
[apilibs]: https://cloud.google.com/apis/docs/client-libraries-explained#google_api_client_libraries
[oracle]: https://www.oracle.com/java/technologies/java-se-support-roadmap.html
[g-c-j]: http://github.com/googleapis/google-cloud-java
[generative-ai-studio]: https://cloud.google.com/generative-ai-studio?hl=en
[generationconfig-ref]: https://cloud.google.com/java/docs/reference/google-cloud-vertexai/latest/com.google.cloud.vertexai.api.GenerationConfig.Builder
[safetysetting-ref]: https://cloud.google.com/java/docs/reference/google-cloud-vertexai/latest/com.google.cloud.vertexai.api.SafetySetting.Builder
[tool-ref]: https://cloud.google.com/java/docs/reference/google-cloud-vertexai/latest/com.google.cloud.vertexai.api.Tool.Builder
[system-instruction]: https://cloud.google.com/vertex-ai/generative-ai/docs/learn/prompts/system-instructions
