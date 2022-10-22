pluginManagement {
    includeBuild("../build-logic")
    repositories {
        gradlePluginPortal()
        maven { url = uri("https://repo.spring.io/milestone") }
    }
}

rootProject.name = "tech"

include("boot-app")
include("logging")