package br.com.thiagoodev.ktraccar.domain.entities

/**
 * Represents a message associated with a device.
 *
 * This class extends [ExtendedEntity] and includes properties related to messaging for a device.
 *
 * @property id The unique identifier of the message.
 * @property deviceId The identifier of the device associated with the message.
 * @property type The type of the message.
 *
 * @constructor Creates a [Message] instance with the specified parameters.
 */
open class Message(
    override val id: Long,
    open val deviceId: Long,
    open val type: String,
) : ExtendedEntity(id)
