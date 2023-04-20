// 1-to-1 with https://docs.gradle.org/current/javadoc/org/gradle/api/initialization/Settings.html
// the script is compiled into a subclass of https://gradle.github.io/kotlin-dsl-docs/api/org.gradle.kotlin.dsl/-kotlin-settings-script/index.html
// Executed during Initialization phase: https://docs.gradle.org/current/userguide/build_lifecycle.html
rootProject.name = "ab"

val kotlinVersion: String by settings
val springBootVersion: String by settings

val allSubprojects = listOf("build-logic", "platforms", "tech", "dummy-a", "dummy-b", "dummy-ab")

allSubprojects.forEach {
    includeBuild(it)
}
