package com.micro.sendEmail.services

import com.micro.sendEmail.builders.EmailMessageBuilder
import com.micro.sendEmail.dtos.EmailDto
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.mail.MailException
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Service

@Service
class EmailService(
    val emailSender: JavaMailSender,
    val emailMessageBuilder: EmailMessageBuilder,
) {
    private val logger: Logger = LoggerFactory.getLogger(EmailService::class.java)

    infix fun sendEmailFrom(emailDto: EmailDto) {
        try {
            logger.info("Sending e-mail to ${emailDto.to} ......")
            emailSender.send(emailMessageBuilder buildEmailMessageFrom emailDto)
        } catch (e: MailException) {
            logger.error(e.message)
        }
    }
}
