plugins {
    id("ab.kotlin-lib")
    kotlin("plugin.spring")
}

// moved to kotlin-lib
//repositories {
//    maven { url = uri("https://repo.spring.io/libs-milestone") }
//}

dependencies {
// moved to kotlin-lib
//    implementation(platform("ab.platform:product-platform"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
}