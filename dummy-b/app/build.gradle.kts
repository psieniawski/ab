plugins {
    id("ab.spring-boot-kotlin-app")
}

dependencies {
    implementation(project(":impl-spring-boot-starter"))
    implementation(project(":spring-rest-api"))
}