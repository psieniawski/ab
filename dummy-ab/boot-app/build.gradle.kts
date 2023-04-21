import org.springframework.boot.gradle.tasks.bundling.BootBuildImage

plugins {
    id("ab.spring-boot-kotlin-app")
}

group = "ab"
version = "0.0.1-SNAPSHOT"


dependencies {
    implementation(project(":impl-spring-boot-starter"))
    implementation(project(":spring-rest-api"))

// for distributed
//    implementation("ab.dummy-a:rest-impl")
//    implementation("ab.dummy-b:rest-impl")

// for monolith
    implementation("ab.dummy-a:impl-spring-boot-starter")
    implementation("ab.dummy-b:impl-spring-boot-starter")

}
