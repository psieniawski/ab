package dummyab

import dummya.DummyA
import dummyb.DummyB
import org.springframework.boot.autoconfigure.AutoConfiguration
import org.springframework.context.annotation.Bean

@AutoConfiguration
class LocalAutoConfiguration {
    @Bean
    fun dummyAB(dummyA: DummyA, dummyB: DummyB) = DummyABImpl(dummyA, dummyB)
}