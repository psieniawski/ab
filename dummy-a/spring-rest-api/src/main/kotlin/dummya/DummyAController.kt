package dummya

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("dummya")
class DummyAController(val dummyA: DummyA) {

    @GetMapping
    fun get() = dummyA.a()

}