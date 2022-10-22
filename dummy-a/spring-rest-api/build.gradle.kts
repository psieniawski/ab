plugins {
    id("ab.spring-kotlin-lib")
}

dependencies {
    implementation(project(":api"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("ab.tech:logging")
}
