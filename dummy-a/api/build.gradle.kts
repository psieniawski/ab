plugins {
    id("ab.kotlin-lib")
}
// https://docs.gradle.org/current/userguide/composite_builds.html#included_build_declaring_substitutions
// Gradle will inspect the group and name for the projects in the included build, and substitute project dependencies
// for any external dependency matching ${project.group}:${project.name}.
group = "ab.dummy-a"