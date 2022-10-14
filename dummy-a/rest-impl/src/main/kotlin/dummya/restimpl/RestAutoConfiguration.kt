package dummya.restimpl

import org.springframework.boot.autoconfigure.AutoConfiguration
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Import

@AutoConfiguration
@Import(WebClientConfiguration::class)
@EnableConfigurationProperties(ClientProperties::class)
class RestAutoConfiguration