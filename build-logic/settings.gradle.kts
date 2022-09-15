dependencyResolutionManagement {
    repositories {
        gradlePluginPortal()
        maven { url = uri("https://repo.spring.io/milestone") }
//        google()
    }
}
includeBuild("../platforms")


rootProject.name = "build-logic"
include("kotlin-lib")
include("spring-kotlin-lib")

