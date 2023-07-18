import gradle.kotlin.dsl.accessors._c3b5a8584877c7599cd6fe5cb3cf4f8d.implementation
import gradle.kotlin.dsl.accessors._c3b5a8584877c7599cd6fe5cb3cf4f8d.testImplementation
import org.jetbrains.kotlin.gradle.plugin.mpp.pm20.util.archivesName
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
}

repositories {
    mavenCentral()
//    maven { url = uri("https://repo.spring.io/libs-milestone") }
}

group = "${rootProject.group}.${rootProject.name}"
archivesName.set("${rootProject.name}_$name")
version = rootProject.version

dependencies {
    implementation(platform("ab.platform:product-platform"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    testImplementation("org.assertj:assertj-core")
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of("17"))
    }
}

tasks.withType<KotlinCompile> {
    compilerOptions {

    }
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}


tasks.withType<Test> {
    useJUnitPlatform()
    maxParallelForks = 5
}