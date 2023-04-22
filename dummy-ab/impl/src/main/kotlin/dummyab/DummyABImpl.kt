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
        val sleep = if (i >= 95) 400L else 50L
        try {
            TimeUnit.MILLISECONDS.sleep(sleep)
        } catch (e: InterruptedException) {
            Thread.currentThread().interrupt()
        }

        return "${dummyA.a()}:${dummyB.b()}"
    }
}