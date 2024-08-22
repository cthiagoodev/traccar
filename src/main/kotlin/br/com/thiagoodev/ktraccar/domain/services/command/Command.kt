package br.com.thiagoodev.ktraccar.domain.services.command

import br.com.thiagoodev.ktraccar.domain.data_values.QueryIgnore

/**
 * Represents a command with various attributes related to device commands.
 *
 * @property id The unique identifier of the command.
 * @property deviceId The identifier of the device associated with the command.
 *                    This property is ignored in queries due to the [QueryIgnore] annotation.
 * @property type The type of the command.
 * @property textChannel Indicates if the command is associated with a text channel.
 * @property description A description of the command.
 *
 * @constructor Creates a [Command] instance with the specified parameters.
 */
data class Command(
    override val id: Long,
    @QueryIgnore override val deviceId: Long,
    override val type: String,
    override val textChannel: Boolean,
    val description: String,
) : BaseCommand(id, deviceId, type, textChannel)
