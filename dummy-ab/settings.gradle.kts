pluginManagement {
    includeBuild("../build-logic")

    plugins {
        val kotlinVersion: String by settings
        val springBootVersion: String by settings
        kotlin("jvm") version "$kotlinVersion" apply false
        kotlin("plugin.spring") version "$kotlinVersion" apply false
        id("org.springframework.boot") version "$springBootVersion" apply false
    }

    repositories {
        gradlePluginPortal()
//        maven { url = uri("https://repo.spring.io/milestone") }
    }
}

//rootProject.name = "dummy-ab"

include("api")
include("impl")
include("spring-rest-api")
include("impl-spring-boot-starter")
include("boot-app")