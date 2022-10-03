plugins {
    `java-platform`
}

group = "ab.platform"
javaPlatform.allowDependencies()

val springBootVersion = "3.0.0-M5"

dependencies {
    api(platform("org.springframework.boot:spring-boot-dependencies:$springBootVersion"))
}
