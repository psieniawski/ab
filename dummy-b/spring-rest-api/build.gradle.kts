plugins {
    id("ab.spring-kotlin-lib")
}

dependencies {
    implementation(project(":api"))
    implementation("org.springframework.boot:spring-boot-starter-web")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
