package dummya.restimpl

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.boot.context.properties.bind.DefaultValue
import java.net.URI


@ConfigurationProperties("dummy-a")
data class ClientProperties @ConstructorBinding constructor(@param:DefaultValue("localhost:8080") val serviceUri: URI)