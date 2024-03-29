package dummyb.restimpl

import dummyb.DummyB
import org.springframework.web.reactive.function.client.WebClient

class DummyBRestImpl(private val webClient: WebClient) : DummyB {
    override fun b() = webClient.get().uri("/").retrieve().bodyToMono(String::class.java).block()!!
}