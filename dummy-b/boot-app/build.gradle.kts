import org.springframework.boot.gradle.tasks.bundling.BootBuildImage

plugins {
    id("ab.spring-boot-kotlin-app")
}

group = "ab"
version = "0.0.1-SNAPSHOT"

dependencies {
    implementation(project(":impl-spring-boot-starter"))
    implementation(project(":spring-rest-api"))
}

tasks.withType<BootBuildImage> {
//    https://docs.spring.io/spring-boot/docs/current/gradle-plugin/reference/htmlsingle/#build-image.customization
    imageName.set("ghcr.io/psieniawski/dummy-b")
    environment.set(mapOf("BP_JVM_VERSION" to "17.*"))
}