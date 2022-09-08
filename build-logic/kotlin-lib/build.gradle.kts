plugins {
    `kotlin-dsl`
}
dependencies {
    implementation(platform("ab.platform:plugins-platform"))
    implementation("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin")
}