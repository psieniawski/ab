plugins {
    `java-platform`
}

group = "ab.platform"

//javaPlatform.allowDependencies()
val kotlinVersion = "1.7.10"
val springBootVersion = "3.0.0-M4"

dependencies {
    constraints {
        api("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:$kotlinVersion")
        api("org.jetbrains.kotlin:kotlin-allopen:$kotlinVersion")
        api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion")
        api("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")

        api("org.springframework.boot:org.springframework.boot.gradle.plugin:$springBootVersion")
    }
}