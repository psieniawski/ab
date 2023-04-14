pluginManagement {
    includeBuild("../build-logic")
    plugins {
        val kotlinVersion: String by settings
          kotlin("jvm") version "$kotlinVersion" apply false
          kotlin("plugin.spring") version "$kotlinVersion" apply false
    }

    repositories {
        gradlePluginPortal()
//        maven { url = uri("https://repo.spring.io/milestone") }
    }
}

rootProject.name = "tech"

include("boot-app")
include("logging")