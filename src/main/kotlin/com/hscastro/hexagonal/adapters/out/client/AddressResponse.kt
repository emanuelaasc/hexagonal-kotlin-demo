package com.hscastro.hexagonal.adapters.out.client

import com.hscastro.hexagonal.application.core.domain.Address


data class AddressResponse(
    val street: String,
    val city: String,
    val state: String
){
    fun toAddress() = Address(street, city, state)
}
