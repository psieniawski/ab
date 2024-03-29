plugins {
    kotlin("jvm") apply false
    kotlin("plugin.spring") apply false
    id("org.springframework.boot") apply false
}

group = "ab"

tasks.register("build") {
    group = "build"
    description = "Build all sources"
    dependsOn(project(":api").tasks["build"])
    dependsOn(project(":impl").tasks["build"])
    dependsOn(project(":rest-impl").tasks["build"])
    dependsOn(project(":spring-rest-api").tasks["build"])
    dependsOn(project(":impl-spring-boot-starter").tasks["build"])
    dependsOn(project(":boot-app").tasks["build"])
}

tasks.register("clean") {
    group = "clean"
    description = "Clean"
    dependsOn(project(":api").tasks["clean"])
    dependsOn(project(":impl").tasks["clean"])
    dependsOn(project(":rest-impl").tasks["clean"])
    dependsOn(project(":spring-rest-api").tasks["clean"])
    dependsOn(project(":impl-spring-boot-starter").tasks["clean"])
    dependsOn(project(":boot-app").tasks["clean"])
}

tasks.register("buildImage") {
    group = "build"
    description = "Build Image"
    dependsOn(project(":boot-app").tasks["bootBuildImage"])
}