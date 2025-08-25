@file:Suppress("UnstableApiUsage")

rootProject.name = "KmpTemplate"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
            mavenCentral()
            google()
            maven {
                url = uri("https://plugins.gradle.org/m2/")
            }
            maven("https://us-central1-maven.pkg.dev/varabyte-repos/public")
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google {
            mavenContent {
                gradlePluginPortal()
                google()
                mavenCentral()
                maven("https://plugins.gradle.org/m2/")
                maven("https://kotlin.bintray.com/kotlinx")
                maven("https://us-central1-maven.pkg.dev/varabyte-repos/public")
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

include(":composeApp")
include(":server")
include(":shared")