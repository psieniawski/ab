package dummyb

import ab.logging.logger

class DummyBImpl : DummyB {
    private val log by logger()
    override fun b(): String {
        log.info("DummyBImpl#b called")
        return "BB"
    }
}