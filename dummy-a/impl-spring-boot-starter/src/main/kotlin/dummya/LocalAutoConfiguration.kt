package dummya

import org.springframework.boot.autoconfigure.AutoConfiguration
import org.springframework.context.annotation.Bean

@AutoConfiguration
class LocalAutoConfiguration {
    @Bean
    fun dummyA(): DummyA = DummyAImpl()
}