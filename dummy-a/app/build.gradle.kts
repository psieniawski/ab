plugins {
    id("ab.spring-kotlin-lib")
    id("org.springframework.boot")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-autoconfigure")

    implementation(project(":impl-spring-boot-starter"))
    implementation(project(":spring-rest-api"))

}