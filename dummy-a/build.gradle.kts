// 1-to-1 relationship with https://docs.gradle.org/current/javadoc/org/gradle/api/Project.html
// the script is compiled into subclass of https://gradle.github.io/kotlin-dsl-docs/api/org.gradle.kotlin.dsl/-kotlin-build-script/index.html
// Executed during Configuration phase: https://docs.gradle.org/current/userguide/build_lifecycle.html
// Prepares build configuration to be executed during Execution phase
// When Gradle executes a Kotlin build script (.gradle.kts), it compiles the script into a subclass of KotlinBuildScript.
plugins {
    // apply false: plugin version is only declared here, so subprojects can use the plugin without version declaration
    kotlin("jvm") version "1.7.10" apply false
}