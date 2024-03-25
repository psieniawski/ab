package dummya

import ab.logging.logger
import java.util.concurrent.TimeUnit
import kotlin.random.Random

class DummyAImpl : DummyA {
    private val log by logger()
    private val random: Random = Random(System.nanoTime())
    override fun a(): String {
        log.info("DummyAImpl#a called")

        val i = random.nextInt(100)
        val sleep = if (i >= 95) 40L else 5L
        try {
            TimeUnit.MILLISECONDS.sleep(sleep)
        } catch (e: InterruptedException) {
            Thread.currentThread().interrupt()
        }
        log.info("Returning")
        return "AA"
    }
}