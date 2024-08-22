package br.com.thiagoodev.ktraccar.domain.entities

/**
 * Represents a base entity with a unique identifier.
 *
 * This class serves as a base class for entities that require a unique identifier.
 *
 * @property id The unique identifier of the entity.
 *
 * @constructor Creates an [Entity] instance with the specified identifier.
 */
open class Entity(
    open val id: Long,
)
