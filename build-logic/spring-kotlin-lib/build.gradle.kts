plugins {
    `kotlin-dsl`
}
dependencies {
    implementation(project(":kotlin-lib"))
    implementation("org.jetbrains.kotlin:kotlin-allopen")
}