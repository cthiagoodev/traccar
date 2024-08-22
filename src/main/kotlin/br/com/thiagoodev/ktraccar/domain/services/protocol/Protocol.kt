package br.com.thiagoodev.ktraccar.domain.services.protocol

import br.com.thiagoodev.ktraccar.domain.services.command.Command
import br.com.thiagoodev.ktraccar.domain.services.connection.TrackerConnector
import io.ktor.network.sockets.*
import io.netty.channel.Channel

/**
 * Defines the contract for a communication protocol used in device interactions.
 *
 * This interface provides methods for managing connectors, sending commands, and defining supported commands for a specific protocol.
 *
 * @property name The name of the protocol.
 */
interface Protocol {

    /**
     * Gets the name of the protocol.
     *
     * @return The protocol name.
     */
    val name: String

    /**
     * Retrieves a list of [TrackerConnector]s supported by the protocol.
     *
     * @return A list of supported tracker connectors.
     */
    fun connectors(): List<TrackerConnector>

    /**
     * Retrieves a list of data commands supported by the protocol.
     *
     * @return A list of supported data commands.
     */
    fun supportedDataCommands(): List<String>

    /**
     * Retrieves a list of text commands supported by the protocol.
     *
     * @return A list of supported text commands.
     */
    fun supportedTextCommands(): List<String>

    /**
     * Sends a data command using the specified channel and remote address.
     *
     * @param channel The channel through which to send the command.
     * @param remoteAddress The address of the remote endpoint.
     * @param command The command to send.
     */
    fun sendDataCommand(channel: Channel, remoteAddress: SocketAddress, command: Command)

    /**
     * Sends a text command to the specified destination address.
     *
     * @param destAddress The destination address for the command.
     * @param command The command to send.
     */
    fun sendTextCommand(destAddress: String, command: Command)
}
