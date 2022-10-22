package dummya

import ab.logging.logger

class DummyAImpl : DummyA {
    private val log by logger()
    override fun a(): String {
        log.info("DummyAImpl#a called")
        return "AA"
    }
}