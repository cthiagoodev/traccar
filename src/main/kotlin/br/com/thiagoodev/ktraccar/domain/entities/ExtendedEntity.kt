package br.com.thiagoodev.ktraccar.domain.entities

/**
 * Represents an entity with additional attributes.
 *
 * This class extends [Entity] and provides a mechanism to manage attributes associated with the entity.
 *
 * @property id The unique identifier of the entity.
 * @property attributes A map of attributes associated with the entity. Attributes can be added or updated.
 *
 * @constructor Creates an [ExtendedEntity] instance with the specified identifier.
 */
open class ExtendedEntity(override val id: Long) : Entity(id) {
    /**
     * Internal storage for attributes
     */
    private var _attributes: LinkedHashMap<String, Any> = LinkedHashMap()

    /**
     * Gets or sets the attributes for the entity.
     * Setting the attributes will replace the current attributes with the provided ones.
     */
    var attributes: Map<String, Any>
        get() = _attributes
        set(value) = _attributes.putAll(value)

    /**
     * Checks if the entity has a specific attribute.
     *
     * @param key The key of the attribute to check.
     * @return True if the attribute exists, false otherwise.
     */
    fun hasAttribute(key: String): Boolean = _attributes.containsKey(key)
}
