plugins{
    kotlin("jvm") version "1.7.20" apply false
    kotlin("plugin.spring") version "1.7.20" apply false
}



tasks.register("build") {
    group = "build"
    description = "Build all sources"
    dependsOn(project(":boot-app").tasks["build"])
}

tasks.register("clean") {
    group = "clean"
    description = "Clean"
    dependsOn(project(":boot-app").tasks["clean"])
}