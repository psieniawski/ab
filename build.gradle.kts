// 1-to-1 relationship with https://docs.gradle.org/current/javadoc/org/gradle/api/Project.html
// the script is compiled into subclass of https://gradle.github.io/kotlin-dsl-docs/api/org.gradle.kotlin.dsl/-kotlin-build-script/index.html
// Executed during Configuration phase: https://docs.gradle.org/current/userguide/build_lifecycle.html
// Prepares build configuration to be executed during Execution phase
// When Gradle executes a Kotlin build script (.gradle.kts), it compiles the script into a subclass of KotlinBuildScript.


val allSubprojects = listOf("dummy-a", "dummy-b", "dummy-ab")

tasks.register("build") {
    group = "build"
    description = "Build all sources"
    allSubprojects.forEach { dependsOn(gradle.includedBuild(it).task(":build")) }
}

tasks.register("clean") {
    group = "clean"
    description = "Clean"
    allSubprojects.forEach { dependsOn(gradle.includedBuild(it).task(":clean")) }
}

tasks.register("buildImages") {
    group = "image"
    description = "Build all images"
    allSubprojects.forEach { dependsOn(gradle.includedBuild(it).task(":buildImage")) }
}
