package dummya.restimpl

import dummya.DummyA
import org.springframework.web.reactive.function.client.WebClient

class DummyARestImpl(private val webClient: WebClient) : DummyA {
    override fun a() = webClient.get().uri("/").retrieve().bodyToMono(String::class.java).block()!!
}