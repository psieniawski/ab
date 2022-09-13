dependencyResolutionManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
}
includeBuild("../platforms")


rootProject.name = "build-logic"
include("kotlin-lib")
include("spring-kotlin-lib")