// The Java Platform plugin brings the ability to declare platforms for the Java ecosystem.
// https://docs.gradle.org/current/userguide/java_platform_plugin.html
plugins {
    `java-platform`
}

group = "ab.platform"

val kotlinVersion : String by project
val springBootVersion : String by project

dependencies {
    constraints {
        api("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:$kotlinVersion")
        api("org.jetbrains.kotlin:kotlin-allopen:$kotlinVersion")
        api("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
        api("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")

        api("org.springframework.boot:org.springframework.boot.gradle.plugin:$springBootVersion")
    }
}
