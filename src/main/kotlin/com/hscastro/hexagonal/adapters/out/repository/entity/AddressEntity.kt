package com.hscastro.hexagonal.adapters.out.repositories.entity

import com.hscastro.hexagonal.application.core.domain.Address


class AddressEntity(
    val street: String,
    val city: String,
    val state: String
) {
    constructor(address: Address): this(
        address.street,
        address.city,
        address.state
    )
}