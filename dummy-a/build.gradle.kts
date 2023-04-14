plugins {
    kotlin("jvm") apply false
    kotlin("plugin.spring") apply false
    id("org.springframework.boot") apply false
}

group = "ab"

val allSubprojects =
    listOf("api", "boot-app", "impl", "impl-spring-boot-starter","rest-impl", "spring-rest-api")//.map { ":$it" }

tasks.register("build") {
    group = "build"
    description = "Build all sources"
    allSubprojects.forEach {
        dependsOn(project(it).tasks["build"])
    }
}

tasks.register("clean") {
    group = "clean"
    description = "Clean"
    allSubprojects.forEach {
        dependsOn(project(it).tasks["clean"])
    }
}

tasks.register("buildImage") {
    group = "build"
    description = "Build Image"
    dependsOn(project(":boot-app").tasks["bootBuildImage"])
}