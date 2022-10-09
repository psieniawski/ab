plugins {
    `java-platform`
}

group = "ab.platform"
javaPlatform.allowDependencies()

val springBootVersion : String by project

dependencies {
    api(platform("org.springframework.boot:spring-boot-dependencies:$springBootVersion"))
}
