package dummya.restimpl

import dummya.DummyA
import org.springframework.web.reactive.function.client.WebClient

class DummyARestImpl(val webClient: WebClient) : DummyA {
    override fun a() = webClient.get().uri("/dummya").retrieve().bodyToMono(String::class.java).block()!!
}