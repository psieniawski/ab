plugins{
    kotlin("jvm") version "1.7.10" apply false
    kotlin("plugin.spring") version "1.7.10" apply false
    id("org.springframework.boot") version "3.0.0-M4" apply false
}



tasks.register("build") {
    group = "build"
    description = "Build all sources"
    dependsOn(project(":api").tasks["build"])
    dependsOn(project(":impl").tasks["build"])
    dependsOn(project(":spring-rest-api").tasks["build"])
    dependsOn(project(":impl-spring-boot-starter").tasks["build"])
    dependsOn(project(":app").tasks["build"])
}

tasks.register("clean") {
    group = "clean"
    description = "Clean"
    dependsOn(project(":api").tasks["clean"])
    dependsOn(project(":impl").tasks["clean"])
    dependsOn(project(":spring-rest-api").tasks["clean"])
    dependsOn(project(":impl-spring-boot-starter").tasks["clean"])
    dependsOn(project(":app").tasks["clean"])
}