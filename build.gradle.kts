// 1-to-1 relationship with https://docs.gradle.org/current/javadoc/org/gradle/api/Project.html
// the script is compiled into subclass of https://gradle.github.io/kotlin-dsl-docs/api/org.gradle.kotlin.dsl/-kotlin-build-script/index.html
// Executed during Configuration phase: https://docs.gradle.org/current/userguide/build_lifecycle.html
// Prepares build configuration to be executed during Execution phase
// When Gradle executes a Kotlin build script (.gradle.kts), it compiles the script into a subclass of KotlinBuildScript.
// This is an example of a lifecycle task that crosses build boundaries defined in the umbrella build.

tasks.register("build") {
    group = "build"
    description = "Build all sources"
    dependsOn(gradle.includedBuild("dummy-a").task(":build"))
    dependsOn(gradle.includedBuild("dummy-b").task(":build"))
}

tasks.register("clean") {
    group = "clean"
    description = "Clean"
    dependsOn(gradle.includedBuild("dummy-a").task(":clean"))
    dependsOn(gradle.includedBuild("dummy-b").task(":clean"))
}
