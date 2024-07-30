package com.hscastro.hexagonal.application.core.domain

data class Custumer (
    val id: String? = null,
    val name: String,
    var address: Address? = null,
    val cpf: String,
    val isValidCpf: Boolean = false
)