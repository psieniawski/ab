plugins {
    id("ab.spring-kotlin-lib")
}
group = "ab.dummy-b"

dependencies {
    api(project(":api"))
    implementation("org.springframework.boot:spring-boot")
    implementation("org.springframework.boot:spring-boot-autoconfigure")
    implementation("org.springframework.boot:spring-boot-starter-webflux")
//    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")

}