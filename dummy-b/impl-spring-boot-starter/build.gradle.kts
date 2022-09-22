plugins {
    id("ab.spring-kotlin-lib")
}

dependencies {
    implementation(project(":impl"))
    implementation("org.springframework.boot:spring-boot-autoconfigure")
}
