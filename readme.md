# Stanton's Kotlin-Multiplatform Template

This repo is designed to be a starter template for any kotlin
multiplatform project. It contains my favourite general purpose
libraries and preferred configuration.

This project is licensed under the MIT License - see the [LICENSE](./LICENSE) file for details.

If you have any suggested improvements, please feel free to either
raise an issue on GitHub or even write a PR.

## Known issues

1. Currently, the wasm target does not build correctly. My guess is that one of my
dependencies is causing a version mismatch between the compose compiler and
the kotlin multiplatform plugin, meaning that skiko is not being built properly. 
I hope to fix these in due course, or maybe it will be fixed in future versions of kotlin
and compose.

## Structure:

The project targets Android, iOS, Web, Desktop (JVM), and Server.
The frontend uses Compose multiplatform and the server uses Ktor.

* [/composeApp](./composeApp/src) is for code that will be shared across frontend applications.
    It contains several subfolders:
    - [commonMain](./composeApp/src/commonMain/kotlin) is for code that’s common for all frontend targets.
    - Other folders are platform specific. The folder jvmMain is for a desktop jvm frontend

* [/iosApp](./iosApp/iosApp) contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform,
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.

* [/server](./server/src/main/kotlin) is for the Ktor server application.

* [/shared](./shared/src) is for the code that will be shared between all targets in the project.
  whether backend or frontend. For example, shared data-classes and utilities.
  The most important subfolder is [commonMain](./shared/src/commonMain/kotlin). If preferred, you can add code to the platform-specific folders here too.
