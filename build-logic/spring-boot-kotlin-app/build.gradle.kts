plugins {
    `kotlin-dsl`
}

val springBootVersion = ext["springBootVersion"]

dependencies {
    implementation(project(":spring-kotlin-lib"))
    implementation("org.springframework.boot:spring-boot-gradle-plugin:$springBootVersion")
}