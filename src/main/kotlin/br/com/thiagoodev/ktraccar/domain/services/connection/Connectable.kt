package br.com.thiagoodev.ktraccar.domain.services.connection

/**
 * Interface that defines basic operations for managing the connection of tracking devices.
 */
interface Connectable {

    /**
     * Establishes a connection with the tracking device.
     * This function should be implemented to start communication with the tracking device and enable data sending and receiving.
     */
    fun start()

    /**
     * Closes the connection with the tracking device.
     * This function should be implemented to end communication with the tracking device and release any associated resources.
     */
    fun stop()
}
