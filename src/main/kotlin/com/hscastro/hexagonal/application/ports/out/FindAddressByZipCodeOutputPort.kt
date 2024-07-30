package com.hscastro.hexagonal.application.ports.out

import com.hscastro.hexagonal.application.core.domain.Address


interface FindAddressByZipCodeOutputPort {
    fun find(address: String): Address
}