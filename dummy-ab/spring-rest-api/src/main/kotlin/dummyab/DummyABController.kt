package dummyab

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class DummyABController(val dummyAB: DummyAB) {

    @GetMapping
    fun get() = dummyAB.ab()

}