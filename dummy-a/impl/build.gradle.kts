plugins {
    id("ab.kotlin-lib")
}

dependencies {
    api(project(":api"))
    implementation("ab.tech:logging")
}