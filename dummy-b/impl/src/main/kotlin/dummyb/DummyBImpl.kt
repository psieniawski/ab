package dummyb

import ab.logging.logger
import java.util.concurrent.TimeUnit
import kotlin.random.Random

class DummyBImpl : DummyB {
    private val log by logger()
    private val random: Random = Random(System.nanoTime())
    override fun b(): String {
        log.info("DummyBImpl#b called")

//        val i = random.nextInt(100)
//        val sleep = if (i >= 95) 400L else 50L
//        try {
//            TimeUnit.MILLISECONDS.sleep(sleep)
//        } catch (e: InterruptedException) {
//            Thread.currentThread().interrupt()
//        }
        log.info("Returning")
        return "BB"
    }
}