package ab.logging

import org.slf4j.Logger
import org.slf4j.LoggerFactory

// https://stackoverflow.com/questions/34416869/idiomatic-way-of-logging-in-kotlin
fun <R : Any> R.logger(): Lazy<Logger> {
    return lazy { LoggerFactory.getLogger((this.javaClass).name) }
}
