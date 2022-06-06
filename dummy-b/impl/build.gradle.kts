plugins {
    kotlin("jvm") version "1.6.21"
    `java-library`
}
repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":api"))

    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}
