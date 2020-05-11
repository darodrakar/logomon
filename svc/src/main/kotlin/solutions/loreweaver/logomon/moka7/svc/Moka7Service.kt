package solutions.loreweaver.logomon.moka7.svc

import Moka7.S7Client
import org.springframework.stereotype.Service
import solutions.loreweaver.logomon.moka7.configuration.S7Configuration

@Service
class Moka7Service(
    val config: S7Configuration
) {

    val client = S7Client()

    fun connect() {
        when (client.Connected) {
            false -> client.ConnectTo(config.address, 0, 0)
        }
    }

}