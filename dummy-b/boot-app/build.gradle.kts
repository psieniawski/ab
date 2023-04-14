plugins {
    id("ab.spring-boot-kotlin-app")
}

group = "ab"
version = "0.0.1-SNAPSHOT"

dependencies {
    implementation(project(":impl-spring-boot-starter"))
    implementation(project(":spring-rest-api"))
}
