package dummyab

import org.springframework.boot.autoconfigure.AutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@AutoConfiguration
@EnableWebMvc
@ComponentScan(basePackageClasses = [DummyABController::class])
class WebAutoConfiguration