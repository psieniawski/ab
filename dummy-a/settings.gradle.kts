pluginManagement {
    includeBuild("../build-logic")
    repositories {
        gradlePluginPortal()
        maven { url = uri("https://repo.spring.io/milestone") }
    }
}

//rootProject.name = "dummy-a"

include("api")
include("impl")
include("rest-impl")
include("spring-rest-api")
include("impl-spring-boot-starter")
include("boot-app")