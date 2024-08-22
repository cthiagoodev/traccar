package br.com.thiagoodev.ktraccar.domain.services.protocol

import br.com.thiagoodev.ktraccar.domain.services.command.Command
import br.com.thiagoodev.ktraccar.domain.services.command.CommandType
import br.com.thiagoodev.ktraccar.domain.services.connection.TrackerConnector
import br.com.thiagoodev.ktraccar.domain.services.sms.SmsService
import io.ktor.network.sockets.*
import io.netty.channel.Channel

abstract class BaseProtocol(val smsService: SmsService) : Protocol {
    final override var name: String

    override var connectors: MutableList<TrackerConnector> = mutableListOf()

    override var supportedDataCommands: MutableList<String> = mutableListOf()

    override var supportedTextCommands: MutableList<String> = mutableListOf()

    init {
        name = nameFromClass(this::class.java)
    }

    private fun <T> nameFromClass(clazz: Class<T>): String {
        val className: String = clazz.simpleName
        return className.substring(0, className.length - 8).lowercase()
    }

    override fun sendCommand(channel: Channel, remoteAddress: SocketAddress, command: Command) {
        if(supportedDataCommands.contains(command.type)) {
            return channel.writeAndFlush()
        }

        if(command.type == CommandType.CUSTOM.type) {

        }
    }

    override fun sendCommand(destAddress: String, command: Command) {
        TODO("Not yet implemented")
    }
}