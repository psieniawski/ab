package dummyab

import ab.logging.logger
import dummya.DummyA
import dummyb.DummyB

class DummyABImpl(private val dummyA: DummyA, private val dummyB: DummyB) : DummyAB {
    private val log by logger()
    override fun ab(): String {
        log.info("DummyABImpl#ab called")
        return "${dummyA.a()}:${dummyB.b()}"
    }
}