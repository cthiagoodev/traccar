package br.com.thiagoodev.ktraccar.domain.services.command


/**
 * Enum que representa diferentes tipos de comando.
 */
enum class CommandType(val type: String) {
    CUSTOM("custom"),
    DEVICE_IDENTIFICATION("deviceIdentification"),
    POSITION_SINGLE("positionSingle"),
    POSITION_PERIODIC("positionPeriodic"),
    POSITION_STOP("positionStop"),
    ENGINE_STOP("engineStop"),
    ENGINE_RESUME("engineResume"),
    ALARM_ARM("alarmArm"),
    ALARM_DISARM("alarmDisarm"),
    ALARM_DISMISS("alarmDismiss"),
    SET_TIMEZONE("setTimezone"),
    REQUEST_PHOTO("requestPhoto"),
    POWER_OFF("powerOff"),
    REBOOT_DEVICE("rebootDevice"),
    FACTORY_RESET("factoryReset"),
    SEND_SMS("sendSms"),
    SEND_USSD("sendUssd"),
    SOS_NUMBER("sosNumber"),
    SILENCE_TIME("silenceTime"),
    SET_PHONEBOOK("setPhonebook"),
    MESSAGE("message"),
    VOICE_MESSAGE("voiceMessage"),
    OUTPUT_CONTROL("outputControl"),
    VOICE_MONITORING("voiceMonitoring"),
    SET_AGPS("setAgps"),
    SET_INDICATOR("setIndicator"),
    CONFIGURATION("configuration"),
    GET_VERSION("getVersion"),
    FIRMWARE_UPDATE("firmwareUpdate"),
    SET_CONNECTION("setConnection"),
    SET_ODOMETER("setOdometer"),
    GET_MODEM_STATUS("getModemStatus"),
    GET_DEVICE_STATUS("getDeviceStatus"),
    SET_SPEED_LIMIT("setSpeedLimit"),
    MODE_POWER_SAVING("modePowerSaving"),
    MODE_DEEP_SLEEP("modeDeepSleep"),
    ALARM_GEOFENCE("alarmGeofence"),
    ALARM_BATTERY("alarmBattery"),
    ALARM_SOS("alarmSos"),
    ALARM_REMOVE("alarmRemove"),
    ALARM_CLOCK("alarmClock"),
    ALARM_SPEED("alarmSpeed"),
    ALARM_FALL("alarmFall"),
    ALARM_VIBRATION("alarmVibration");

    companion object {
        fun fromType(type: String): CommandType? = values().find { it.type == type }
    }
}