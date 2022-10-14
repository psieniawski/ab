plugins {
    id("ab.kotlin-lib")
    kotlin("plugin.spring")
}
repositories {
    maven { url = uri("https://repo.spring.io/libs-milestone") }
}

dependencies {
    implementation(platform("ab.platform:product-platform"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
}