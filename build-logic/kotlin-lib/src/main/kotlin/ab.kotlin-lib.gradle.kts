import gradle.kotlin.dsl.accessors._15e6c8a47fe4506baa4405afd1b8b845.idea
import org.jetbrains.kotlin.gradle.plugin.mpp.pm20.util.archivesName
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    idea
}

idea{
     module{
         isDownloadSources = true
         isDownloadJavadoc = true
     }
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
        languageVersion.set(JavaLanguageVersion.of("21"))
    }
}

tasks.withType<KotlinCompile> {
    compilerOptions {

    }
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "21"
    }
}


tasks.withType<Test> {
    useJUnitPlatform()
    maxParallelForks = 5
}