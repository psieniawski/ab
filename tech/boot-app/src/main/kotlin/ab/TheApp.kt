package ab

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TheApp

fun main(args: Array<String>) {
    runApplication<TheApp>(*args)
}