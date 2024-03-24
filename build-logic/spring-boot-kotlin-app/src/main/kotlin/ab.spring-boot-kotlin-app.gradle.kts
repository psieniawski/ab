//import org.springframework.boot.buildpack.platform.build.PullPolicy.NEVER
//import org.springframework.boot.buildpack.platform.build.PullPolicy.ALWAYS
import org.springframework.boot.gradle.tasks.bundling.BootBuildImage
import org.springframework.boot.gradle.tasks.run.BootRun

plugins {
    id("ab.spring-kotlin-lib")
    id("org.springframework.boot")
}

tasks.withType<BootBuildImage> {
//    https://docs.spring.io/spring-boot/docs/current/gradle-plugin/reference/htmlsingle/#build-image.customization
    imageName.set("ghcr.io/psieniawski/${ext["imageName"]}")
//    pullPolicy = ALWAYS
    environment.set(mapOf("BP_JVM_VERSION" to "21.*"))
//    isVerboseLogging = true

    //for local gradle :dummy-a:boot-app:bootBuildImage --publishImage
    // properties in gradle.properties
//    docker.publishRegistry.apply {
//        username = project.findProperty("registryUsername")?.toString() ?: "NO_USER"
//        password = project.findProperty("registryToken")?.toString() ?: "NO_PASSWORD"
//        url = project.findProperty("registryUrl")?.toString() ?: "NO_REGISTRY_URL"
//    }
}


springBoot {
//    mainClass.value("ab.TheAppKt")
    mainClass.set("ab.TheAppKt")
    buildInfo()
}

tasks.named<BootRun>("bootRun") {
//    jvmArgs = listOf("-XX:+UseShenandoahGC","-Xlog:gc","-Xms512m","-Xmx1g")
    jvmArgs = listOf("-Xlog:gc","-Xms512m","-Xmx1g")
//    jvmArgs = listOf("-XX:+UseSerialGC","-Xlog:gc","-Xms512m","-Xmx1g")
}

dependencies {
    implementation("ab.tech:boot-app")
}
