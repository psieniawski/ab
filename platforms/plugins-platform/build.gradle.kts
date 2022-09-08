plugins {
    id("java-platform")
}

group = "ab.platform"

dependencies {
    constraints {
        api("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:1.7.10")
        api("org.springframework.boot:org.springframework.boot.gradle.plugin:2.7.3")
    }
}
