# OpenEx collectors

[![Website](https://img.shields.io/badge/website-openex.io-blue.svg)](https://openex.io)
[![Slack Status](https://img.shields.io/badge/slack-3K%2B%20members-4A154B)](https://community.filigran.io)

The following repository is used to store the OpenEx collectors for the platform integration with other tools and applications.

## OpenEx usage

Collectors must be started along with the platform api, using "lib" directory
- openex-api.jar
- lib/openex-collector-01.jar

> java -Dloader.path=file:lib/ -jar openex-api.jar

## Collectors list and statuses

This repository is used to host injectors that are supported by the core development team of OpenEx. Nevertheless, the community is also developping a lot of injectors, third-parties modules directly linked to OpenEx. You can find the list of all available injectors and plugins in the [OpenEx ecosystem dedicated space](https://filigran.notion.site/OpenEx-Ecosystem-30d8eb73d7d04611843e758ddef8941b).

## Contributing

If you want to help use improve or develop new injector, please check out the **[development documentation for new injectors](https://docs.openex.io/latest/development/injectors)**. If you want to make your connector available to the community, **please create a Pull Request on this repository**, then we will integrate it to the CI and in the [OpenEx ecosystem]().

## License

**Unless specified otherwise**, connectors are released under the [Apache 2.0](https://github.com/OpenEx-Platform/injectors/blob/master/LICENSE). If an injector is released by its author under a different license, the subfolder corresponding to it will contain a *LICENSE* file.

## About

OpenEx is a product designed and developed by the company [Filigran](https://filigran.io).

<a href="https://filigran.io" alt="Filigran"><img src="https://filigran.io/wp-content/uploads/2023/08/filigran_text_medium.png" width="200" /></a>