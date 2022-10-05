plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(project(":spring-kotlin-lib"))
    implementation("org.springframework.boot:spring-boot-gradle-plugin:2.7.4")
}