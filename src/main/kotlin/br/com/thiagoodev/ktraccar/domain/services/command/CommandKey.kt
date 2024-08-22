package br.com.thiagoodev.ktraccar.domain.services.command

enum class CommandKey(val key: String) {
    UNIQUE_ID("uniqueId"),
    FREQUENCY("frequency"),
    LANGUAGE("language"),
    TIMEZONE("timezone"),
    DEVICE_PASSWORD("devicePassword"),
    RADIUS("radius"),
    MESSAGE("message"),
    ENABLE("enable"),
    DATA("data"),
    INDEX("index"),
    PHONE("phone"),
    SERVER("server"),
    PORT("port");

    companion object {
        fun fromKey(key: String): CommandKey? = values().find { it.key == key }
    }
}