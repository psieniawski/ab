package dummya

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@SpringBootApplication
//@Import(LocalConfig::class)
class DummyaApp

fun main(args: Array<String>) {
    runApplication<DummyaApp>(*args)
}