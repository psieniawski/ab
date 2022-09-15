dependencyResolutionManagement {
    repositories {
        gradlePluginPortal()
        maven { url = uri("https://repo.spring.io/milestone") }
    }
}


includeBuild("../platforms")


rootProject.name = "build-logic"
include("kotlin-lib")
include("spring-kotlin-lib")
include("spring-boot-kotlin-app")

