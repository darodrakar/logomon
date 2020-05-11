package solutions.loreweaver.logomon.moka7.configuration

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "s7")
class S7Configuration(
        val address: String? = ""
)