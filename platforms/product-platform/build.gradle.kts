plugins {
    `java-platform`
}

group = "ab.platform"
javaPlatform.allowDependencies()

val springBootVersion = "2.7.4"

dependencies {
    api(platform("org.springframework.boot:spring-boot-dependencies:$springBootVersion"))
}
