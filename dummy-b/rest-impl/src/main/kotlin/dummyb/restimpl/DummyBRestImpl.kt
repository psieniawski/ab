package dummyb.restimpl

import dummyb.DummyB
import org.springframework.web.reactive.function.client.WebClient

class DummyBRestImpl(val webClient: WebClient) : DummyB {
    override fun b() = webClient.get().uri("/dummyb").retrieve().bodyToMono(String::class.java).block()!!
}