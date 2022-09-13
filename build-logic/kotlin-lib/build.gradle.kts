plugins {
    `kotlin-dsl`
}
dependencies {
    implementation(platform("ab.platform:plugins-platform"))
    implementation("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin")
//    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.7.10")
//    implementation("org.jetbrains.kotlin:kotlin-reflect:1.7.10")
}