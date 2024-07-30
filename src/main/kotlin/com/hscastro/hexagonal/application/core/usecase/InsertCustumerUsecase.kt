package com.hscastro.hexagonal.application.core.usecase


import com.hscastro.hexagonal.application.core.domain.Custumer
import com.hscastro.hexagonal.application.ports.`in`.InsertCustumerInputPort
import com.hscastro.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort
import com.hscastro.hexagonal.application.ports.out.InsertCustumerOutputPort


class InsertCustumerUsecase (
    private val findAddressByZipCodeOutputPort: FindAddressByZipCodeOutputPort,
    private val insertCustumerOutputPort: InsertCustumerOutputPort
): InsertCustumerInputPort {

   override fun insert(custumer: Custumer, zipCode: String) {
        custumer.apply {
            address = findAddressByZipCodeOutputPort.find(zipCode)
        }.let {
            insertCustumerOutputPort.insert(it)
        }
    }
}