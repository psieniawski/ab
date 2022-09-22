pluginManagement {
    includeBuild("../build-logic")
    repositories {
        gradlePluginPortal()
        maven { url = uri("https://repo.spring.io/milestone") }
    }
}

rootProject.name = "dummy-b"

include("api")
include("impl")
include("spring-rest-api")
include("impl-spring-boot-starter")
include("app")