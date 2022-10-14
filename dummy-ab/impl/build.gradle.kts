plugins {
    id("ab.kotlin-lib")
}

dependencies {
    api(project(":api"))
    implementation("ab.dummy-a:api")
    implementation("ab.dummy-b:api")
}