package dummya

import org.springframework.boot.autoconfigure.AutoConfiguration
import org.springframework.context.annotation.Bean

@AutoConfiguration
class LocalConfig {
    @Bean
    fun dummyA(): DummyA = DummyAImpl()
}