plugins {
    id("ab.spring-kotlin-lib")
}
group = "ab.tech"

dependencies {
    implementation("org.springframework.boot:spring-boot-autoconfigure")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
//    runtimeOnly("io.micrometer:micrometer-registry-prometheus")
}