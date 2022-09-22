package dummyb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DummybApp

fun main(args: Array<String>) {
    runApplication<DummybApp>(*args)
}