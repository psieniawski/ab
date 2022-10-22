package dummya

import ab.logging.logger
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("dummya")
class DummyAController(val dummyA: DummyA) {
    private val log by logger()
    @GetMapping
    fun get(): String{
        log.info("DummyAController#get called")
        return dummyA.a()
    }
}