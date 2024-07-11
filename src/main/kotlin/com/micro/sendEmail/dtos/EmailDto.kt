package com.micro.sendEmail.dtos

data class EmailDto(val to: String? = null, val subject: String? = null, val text: String? = null)

