package com.hscastro.hexagonal.adapters.`in`.controller.request

import com.hscastro.hexagonal.application.core.domain.Address
import jakarta.validation.constraints.NotBlank

data class CustumerRequest (
       @field:NotBlank(message = "Name must not be blank")
        val name: String,
        val cpf: String,
        val zipCode: String){
}