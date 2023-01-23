//import org.springframework.boot.buildpack.platform.build.PullPolicy.NEVER
//import org.springframework.boot.buildpack.platform.build.PullPolicy.ALWAYS
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
    imageName.set("ghcr.io/psieniawski/dummy-a")
//    pullPolicy = ALWAYS
    environment.set(mapOf("BP_JVM_VERSION" to "19.*"))
//    isVerboseLogging = true

    //for local gradle :dummy-a:boot-app:bootBuildImage --publishImage
    // properties in gradle.properties
//    docker.publishRegistry.apply {
//        username = project.findProperty("registryUsername")?.toString() ?: "NO_USER"
//        password = project.findProperty("registryToken")?.toString() ?: "NO_PASSWORD"
//        url = project.findProperty("registryUrl")?.toString() ?: "NO_REGISTRY_URL"
//    }
}

