package br.com.thiagoodev.ktraccar.domain.services.sms

interface SmsService {
    fun sendMessage(destAddress: String, message: String, command: Boolean)
}