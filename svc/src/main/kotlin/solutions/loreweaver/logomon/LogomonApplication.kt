package solutions.loreweaver.logomon

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class LogomonApplication

fun main(args: Array<String>) {
	runApplication<LogomonApplication>(*args)
}
