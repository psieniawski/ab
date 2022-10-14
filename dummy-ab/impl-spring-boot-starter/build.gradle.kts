plugins {
    id("ab.spring-kotlin-lib")
}

dependencies {
    implementation(project(":impl"))
    implementation("ab.dummy-a:api")
    implementation("ab.dummy-b:api")
    implementation("org.springframework.boot:spring-boot-autoconfigure")
}
