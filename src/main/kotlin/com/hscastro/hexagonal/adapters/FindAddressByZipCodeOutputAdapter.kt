package com.hscastro.hexagonal.adapters


import com.hscastro.hexagonal.adapters.out.client.FindAddressByZipCodeClient
import com.hscastro.hexagonal.application.core.domain.Address
import com.hscastro.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort
import org.springframework.stereotype.Component

@Component
class FindAddressByZipCodeOutputAdapter(
    private val findAddressByZipCodeClient: FindAddressByZipCodeClient

): FindAddressByZipCodeOutputPort {
    override fun find(address: String): Address =
        findAddressByZipCodeClient.find(address).toAddress()
}