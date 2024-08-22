package br.com.thiagoodev.ktraccar.domain.services.connection

import io.netty.channel.group.ChannelGroup

/**
 * Interface that defines operations for managing connections to specific tracking devices.
 * This interface extends [Connectable] and adds additional functionality for trackers.
 */
interface TrackerConnector : Connectable {

    /**
     * Checks if the connection uses the datagram protocol.
     *
     * @return true if the connection is based on datagrams, false otherwise.
     */
    fun isDatagram(): Boolean

    /**
     * Checks if the connection is secure.
     *
     * @return true if the connection is secure (e.g., using TLS/SSL), false otherwise.
     */
    fun isSecure(): Boolean

    /**
     * Retrieves the channel group associated with the connection.
     *
     * @return the [ChannelGroup] that represents the group of channels used for communication.
     */
    fun channelGroup(): ChannelGroup
}
