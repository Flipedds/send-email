package com.micro.sendEmail.builders

import com.micro.sendEmail.dtos.EmailDto
import org.springframework.mail.SimpleMailMessage
import org.springframework.stereotype.Component

@Component
class EmailMessageBuilder {
    infix fun buildEmailMessageFrom(emailDto: EmailDto): SimpleMailMessage {
        val message = SimpleMailMessage()
        message.setTo(emailDto.to)
        message.subject = emailDto.subject
        message.text = emailDto.text
        return message
    }
}