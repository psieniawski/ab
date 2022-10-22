package dummyb.restimpl

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.bind.ConstructorBinding
import java.net.URI

@ConfigurationProperties("dummy-b")
data class ClientProperties @ConstructorBinding constructor(/*@param:DefaultValue("localhost:8081")*/val serviceUri: URI)