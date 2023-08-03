plugins {
    `kotlin-dsl`
}

val springBootVersion = ext["springBootVersion"]

dependencies {
//    compileClasspath(project(":tech:boot-app"))
    implementation(project(":spring-kotlin-lib"))
    implementation("org.springframework.boot:spring-boot-gradle-plugin:$springBootVersion")
}