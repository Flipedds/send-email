package com.micro.sendEmail.consumers

import com.micro.sendEmail.dtos.EmailDto
import com.micro.sendEmail.services.EmailService
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.stereotype.Component

@Component
class SendEmailConsumer(
    private val emailService: EmailService,
) {
    @RabbitListener(queues = ["\${broker.queue.send.email.name}"])
    fun listenSendEmailQueue(@Payload emailDto: EmailDto) {
        emailService sendEmailFrom emailDto
    }
}