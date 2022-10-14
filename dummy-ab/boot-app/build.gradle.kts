import org.springframework.boot.gradle.tasks.bundling.BootBuildImage

plugins {
    id("ab.spring-boot-kotlin-app")
}

group = "ab"
version = "0.0.1-SNAPSHOT"

dependencies {
    implementation(project(":impl-spring-boot-starter"))
    implementation(project(":spring-rest-api"))
    implementation("ab.dummy-a:rest-impl")
    implementation("ab.dummy-b:rest-impl")
}

tasks.withType<BootBuildImage> {
    imageName = "ghcr.io/psieniawski/dummy-ab"
    environment = mapOf("BP_JVM_VERSION" to "17.*")
}

