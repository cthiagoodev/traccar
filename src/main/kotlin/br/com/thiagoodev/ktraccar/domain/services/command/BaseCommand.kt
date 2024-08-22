package br.com.thiagoodev.ktraccar.domain.services.command

import br.com.thiagoodev.ktraccar.domain.entities.Message

/**
 * Represents a base class for commands associated with a device.
 *
 * This class extends [Message] and adds additional properties specific to commands.
 *
 * @property id The unique identifier of the command.
 * @property deviceId The identifier of the device associated with the command.
 * @property type The type of the command.
 * @property textChannel Indicates whether the command is associated with a text channel.
 *
 * @constructor Creates a [BaseCommand] instance with the specified parameters.
 */
open class BaseCommand(
    override val id: Long,
    override val deviceId: Long,
    override val type: String,
    open val textChannel: Boolean,
) : Message(id, deviceId, type)
