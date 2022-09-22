plugins {
    id("ab.spring-kotlin-lib")
    id("org.springframework.boot")
}

springBoot {
    mainClass.value("ab.TheAppKt")
}

dependencies {
    implementation("ab.tech:boot-app")
}
