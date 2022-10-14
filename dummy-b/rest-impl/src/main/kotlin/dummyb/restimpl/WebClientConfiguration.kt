package dummyb.restimpl

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class WebClientConfiguration {

    @Bean("dummyBWebClient")
    fun webClient(clientProps: ClientProperties, webClientBuilder: WebClient.Builder) =
        webClientBuilder.baseUrl(clientProps.serviceUri.toString()).build()

    @Bean
    fun dummyBRestImpl(@Qualifier("dummyBWebClient") webClient: WebClient) = DummyBRestImpl(webClient)

}