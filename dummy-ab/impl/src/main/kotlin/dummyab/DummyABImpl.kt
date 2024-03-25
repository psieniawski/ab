package dummyab

import ab.logging.logger
import dummya.DummyA
import dummyb.DummyB
import java.util.concurrent.TimeUnit
import kotlin.random.Random

class DummyABImpl(private val dummyA: DummyA, private val dummyB: DummyB) : DummyAB {
    private val log by logger()
    private val random: Random = Random(System.nanoTime())
    override fun ab(): String {
        log.info("DummyABImpl#ab called")

        val i = random.nextInt(100)
        val sleep = if (i >= 95) 40L else 5L
        try {
            log.info("Going sleep")
            TimeUnit.MILLISECONDS.sleep(sleep)
            log.info("Waking up")
        } catch (e: InterruptedException) {
            Thread.currentThread().interrupt()
        }
        val ret = "${dummyA.a()}:${dummyB.b()}"
        log.info("Returning: $ret")
        return ret
    }
}