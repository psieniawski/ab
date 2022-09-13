package dummyb

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("dummyb")
class DummyBController(val dummyb: DummyB) {

    @GetMapping
    fun get() = dummyb.b()

}