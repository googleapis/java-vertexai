# Changelog

## [0.3.0](https://github.com/googleapis/java-vertexai/compare/v0.2.0...v0.3.0) (2026-07-06)


### Features

* Add revision_labels, revision_expire_time, revision_ttl, disable_memory_revisions, metadata, metadata_merge_strategy and overlap_event_count to Memory Bank IngestEvents API ([2dda057](https://github.com/googleapis/java-vertexai/commit/2dda05790073fbd00ac90b0aae9d5ac9cb939b75))


### Documentation

* fix typos across docstrings ([2d9beea](https://github.com/googleapis/java-vertexai/commit/2d9beea29a906170f4a4c7f0922a6194892be535))

## [0.2.0](https://github.com/googleapis/java-vertexai/compare/v0.1.0...v0.2.0) (2026-05-22)


### Features

* add new fields ([1beb7dc](https://github.com/googleapis/java-vertexai/commit/1beb7dc9a4254155b9a2cfc92964b4309de9c3df))

## 0.1.0 (2026-05-11)


### Features

* Add Agent Engine-level configuration for generation_trigger_config. ([5f80eac](https://github.com/googleapis/java-vertexai/commit/5f80eac9d41d7ed07c5f3723b6d0f69095a3fe10))
* Add AgentEngine Memories module ([01da9a3](https://github.com/googleapis/java-vertexai/commit/01da9a3d95789c63940fb02877017b2c32638aa9))
* Add AgentEngine Memories Revisions module ([7196cad](https://github.com/googleapis/java-vertexai/commit/7196cad2633a9028f937e6a4bff3501c25ee3d83))
* Add AgentEngine Sandboxes module ([b690152](https://github.com/googleapis/java-vertexai/commit/b6901521c80b25ed988f7d97e200c86f62548739))
* Add AgentEngine Sessions module ([40c4b7a](https://github.com/googleapis/java-vertexai/commit/40c4b7a531dc37fc7636c9b2794c4fa2e2ab6831))
* Add AgentEngine Sessions module ([aa06c53](https://github.com/googleapis/java-vertexai/commit/aa06c53dbf2c3bbf25ca5e081ab08aff05ab22c4))
* Add consolidation customization to Memory Bank ([27adf0e](https://github.com/googleapis/java-vertexai/commit/27adf0ea0acffd93763c204aa4b72627e811cdb0))
* Add GenAI Client and basic Agent Engine module ([694acaf](https://github.com/googleapis/java-vertexai/commit/694acaf9cdb0e988f67d7d10f75ef881b59c60b7))
* Add ingest_events method for Memory Bank. ([5f80eac](https://github.com/googleapis/java-vertexai/commit/5f80eac9d41d7ed07c5f3723b6d0f69095a3fe10))
* Add memory_types filter to RetrieveMemories ([9f3174b](https://github.com/googleapis/java-vertexai/commit/9f3174b43cac81b75017c5ac5dd73553808c359d))
* Add model_status to GenerateContentResponse (Gemini API only) ([bb078d7](https://github.com/googleapis/java-vertexai/commit/bb078d72188f289788bd71924c773e3e9663f14c))
* Add part_metadata in Part (Gemini API only) ([bb078d7](https://github.com/googleapis/java-vertexai/commit/bb078d72188f289788bd71924c773e3e9663f14c))
* Add rawEvent field to SessionEvents ([cf692e3](https://github.com/googleapis/java-vertexai/commit/cf692e396e6b9457f4fb36b80308ebcf10276f9d))
* Add RetrieveProfiles. ([9f3174b](https://github.com/googleapis/java-vertexai/commit/9f3174b43cac81b75017c5ac5dd73553808c359d))
* Add session_id to Create Session to allow custom session id ([d6af269](https://github.com/googleapis/java-vertexai/commit/d6af2692fe29388669b5f33632d116f7741e7765))
* Add structured data and context to MemoryRevision. ([9f3174b](https://github.com/googleapis/java-vertexai/commit/9f3174b43cac81b75017c5ac5dd73553808c359d))
* Add structured data and memory type to Memory. ([9f3174b](https://github.com/googleapis/java-vertexai/commit/9f3174b43cac81b75017c5ac5dd73553808c359d))
* Add subset_topics to Memory Bank GenerateMemories ([3d7e09e](https://github.com/googleapis/java-vertexai/commit/3d7e09e697df3f6b1ed8821a9e71577e2077950d))
* Add support for agent gateway in agent engine ([fc840bb](https://github.com/googleapis/java-vertexai/commit/fc840bb90f5f0a3b5cade4d183de74e475f93cad))
* add support for keep alive probe in agent engines ([080977f](https://github.com/googleapis/java-vertexai/commit/080977f4d39229aec98cc3b3417626af8ff4d7b7))
* Adds cancel_query_job to SDK for agent engine long running async tasks. ([15a2401](https://github.com/googleapis/java-vertexai/commit/15a2401032dbdf6da279848b7e927cd43181910a))
* faster sandbox creation with templates and snapshots and improve dataplane routing and security. ([2bcf522](https://github.com/googleapis/java-vertexai/commit/2bcf5221c4a14e3572ef2f7b29b2a073b28dcaa6))
* In run_query_job, rename gcs_bucket to gcs_uri and allow the case that user sets the filename for the output. ([dffffd3](https://github.com/googleapis/java-vertexai/commit/dffffd3215d89b40f29e6cbf58cd5820c18d85f6))
* Make AgentEngine module methods public for prototyping ([372858b](https://github.com/googleapis/java-vertexai/commit/372858b9b95b2ab25d79fdfeab30f905a1e78645))
* Move Agent Engines modules into agentplatform namespace ([3ce78d0](https://github.com/googleapis/java-vertexai/commit/3ce78d0f5ef713087b676f0d7c719cba10e797ad))
* Support rendered_parts in GroundingSupport ([bb078d7](https://github.com/googleapis/java-vertexai/commit/bb078d72188f289788bd71924c773e3e9663f14c))
* Update fields from discovery doc change ([#36](https://github.com/googleapis/java-vertexai/issues/36)) ([11ad542](https://github.com/googleapis/java-vertexai/commit/11ad542c2f420894b8e21baf4b2daa2b4fa7ba88))


### Bug Fixes

* Fix name collision on SandboxEnvironment.state by renaming enum to SandboxState ([bb442c8](https://github.com/googleapis/java-vertexai/commit/bb442c8d7d1e77ee0349b92ea5223040ccf24fa6))


### Documentation

* Add more examples for AgentEngine ([cb3d618](https://github.com/googleapis/java-vertexai/commit/cb3d618617b36f0725e3b581803729017d3c2f58))
* introduce Gemini Enterprise Agent Platform to Vertex AI README ([1a44b46](https://github.com/googleapis/java-vertexai/commit/1a44b46831217ddd7f0b2f2eee5d956ef8dbe98d))
* update doc string to replace `Vertex AI` with `Gemini Enterprise Agent Platform`, update method error message to replace `Vertex AI` with `Gemini Enterprise Agent Platform (previously known as Vertex AI)`, update converter error message to replace `Vertex AI` with `Gemini Enterprise Agent Platform` ([407add3](https://github.com/googleapis/java-vertexai/commit/407add34f2be7124ff60384cc5bb0873b0bb1a90))
* Update README with experimental warning ([0c1eff4](https://github.com/googleapis/java-vertexai/commit/0c1eff4636c4a86f592cf6bd81de00e95aa32b60))


### Miscellaneous Chores

* Reset version to 0.0.0 to prepare for 0.1.0 agentplatform release ([4902cc0](https://github.com/googleapis/java-vertexai/commit/4902cc04af19a10fab358dadcd4f182de11903e2))
* Update versions ([79204de](https://github.com/googleapis/java-vertexai/commit/79204ded6ec693e1881f969b9d8e41964ef65981))

## [1.52.0](https://github.com/googleapis/java-vertexai/compare/v1.51.0...v1.52.0) (2026-04-14)


### Features

* Add Agent Engine-level configuration for generation_trigger_config. ([5f80eac](https://github.com/googleapis/java-vertexai/commit/5f80eac9d41d7ed07c5f3723b6d0f69095a3fe10))
* Add ingest_events method for Memory Bank. ([5f80eac](https://github.com/googleapis/java-vertexai/commit/5f80eac9d41d7ed07c5f3723b6d0f69095a3fe10))
* Add memory_types filter to RetrieveMemories ([9f3174b](https://github.com/googleapis/java-vertexai/commit/9f3174b43cac81b75017c5ac5dd73553808c359d))
* Add RetrieveProfiles. ([9f3174b](https://github.com/googleapis/java-vertexai/commit/9f3174b43cac81b75017c5ac5dd73553808c359d))
* Add structured data and context to MemoryRevision. ([9f3174b](https://github.com/googleapis/java-vertexai/commit/9f3174b43cac81b75017c5ac5dd73553808c359d))
* Add structured data and memory type to Memory. ([9f3174b](https://github.com/googleapis/java-vertexai/commit/9f3174b43cac81b75017c5ac5dd73553808c359d))
* Add subset_topics to Memory Bank GenerateMemories ([3d7e09e](https://github.com/googleapis/java-vertexai/commit/3d7e09e697df3f6b1ed8821a9e71577e2077950d))
* Add support for agent gateway in agent engine ([fc840bb](https://github.com/googleapis/java-vertexai/commit/fc840bb90f5f0a3b5cade4d183de74e475f93cad))
* add support for keep alive probe in agent engines ([080977f](https://github.com/googleapis/java-vertexai/commit/080977f4d39229aec98cc3b3417626af8ff4d7b7))
* Adds cancel_query_job to SDK for agent engine long running async tasks. ([15a2401](https://github.com/googleapis/java-vertexai/commit/15a2401032dbdf6da279848b7e927cd43181910a))


### Documentation

* Add more examples for AgentEngine ([cb3d618](https://github.com/googleapis/java-vertexai/commit/cb3d618617b36f0725e3b581803729017d3c2f58))

## [1.51.0](https://github.com/googleapis/java-vertexai/compare/v1.50.0...v1.51.0) (2026-04-07)


### Features

* Add AgentEngine Memories module ([01da9a3](https://github.com/googleapis/java-vertexai/commit/01da9a3d95789c63940fb02877017b2c32638aa9))
* Add AgentEngine Memories Revisions module ([7196cad](https://github.com/googleapis/java-vertexai/commit/7196cad2633a9028f937e6a4bff3501c25ee3d83))
* Add AgentEngine Sandboxes module ([b690152](https://github.com/googleapis/java-vertexai/commit/b6901521c80b25ed988f7d97e200c86f62548739))
* Add consolidation customization to Memory Bank ([27adf0e](https://github.com/googleapis/java-vertexai/commit/27adf0ea0acffd93763c204aa4b72627e811cdb0))
* Add session_id to Create Session to allow custom session id ([d6af269](https://github.com/googleapis/java-vertexai/commit/d6af2692fe29388669b5f33632d116f7741e7765))
* In run_query_job, rename gcs_bucket to gcs_uri and allow the case that user sets the filename for the output. ([dffffd3](https://github.com/googleapis/java-vertexai/commit/dffffd3215d89b40f29e6cbf58cd5820c18d85f6))

## [1.50.0](https://github.com/googleapis/java-vertexai/compare/v1.49.0...v1.50.0) (2026-03-30)


### Features

* Add rawEvent field to SessionEvents ([cf692e3](https://github.com/googleapis/java-vertexai/commit/cf692e396e6b9457f4fb36b80308ebcf10276f9d))
* Make AgentEngine module methods public for prototyping ([372858b](https://github.com/googleapis/java-vertexai/commit/372858b9b95b2ab25d79fdfeab30f905a1e78645))
* Update fields from discovery doc change ([#36](https://github.com/googleapis/java-vertexai/issues/36)) ([11ad542](https://github.com/googleapis/java-vertexai/commit/11ad542c2f420894b8e21baf4b2daa2b4fa7ba88))


### Bug Fixes

* Fix pom file build for Java 25 ([ebdd232](https://github.com/googleapis/java-vertexai/commit/ebdd23289712a15d6e07a81245df1fa7283d2f33))


### Documentation

* Update README with experimental warning ([0c1eff4](https://github.com/googleapis/java-vertexai/commit/0c1eff4636c4a86f592cf6bd81de00e95aa32b60))

## [1.49.0](https://github.com/googleapis/java-vertexai/compare/v1.48.0...v1.49.0) (2026-03-24)


### Features

* Add AgentEngine Sessions Events module ([40c4b7a](https://github.com/googleapis/java-vertexai/commit/40c4b7a531dc37fc7636c9b2794c4fa2e2ab6831))
* Add AgentEngine Sessions module ([aa06c53](https://github.com/googleapis/java-vertexai/commit/aa06c53dbf2c3bbf25ca5e081ab08aff05ab22c4))
* Add GenAI Client and basic Agent Engine module ([694acaf](https://github.com/googleapis/java-vertexai/commit/694acaf9cdb0e988f67d7d10f75ef881b59c60b7))


### Miscellaneous Chores

* Update versions ([79204de](https://github.com/googleapis/java-vertexai/commit/79204ded6ec693e1881f969b9d8e41964ef65981))

## Changelog
