package com.micro.sendEmail

import org.springframework.amqp.rabbit.annotation.EnableRabbit
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableRabbit
@SpringBootApplication
class SendEmailApplication

fun main(args: Array<String>) {
	runApplication<SendEmailApplication>(*args)
}
