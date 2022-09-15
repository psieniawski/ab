package dummya

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DummyaApp

fun main(args: Array<String>) {
    runApplication<DummyaApp>(*args)
}