package com.micro.sendEmail.config

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RabbitMQConfig {
    @Bean
    fun messageConverter(): Jackson2JsonMessageConverter {
        val objectMapper: ObjectMapper = ObjectMapper()
        return Jackson2JsonMessageConverter(objectMapper)
    }
}