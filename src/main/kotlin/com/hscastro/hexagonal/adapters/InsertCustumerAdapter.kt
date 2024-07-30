package com.hscastro.hexagonal.adapters

import com.hscastro.hexagonal.adapters.out.repository.entity.CustumerEntity

import com.hscastro.hexagonal.adapters.out.repository.CustumerRepository
import com.hscastro.hexagonal.application.core.domain.Custumer
import com.hscastro.hexagonal.application.ports.out.InsertCustumerOutputPort
import org.springframework.stereotype.Component

@Component
class InsertCustumerAdapter(
    private val custumerRepository: CustumerRepository

) : InsertCustumerOutputPort {

    override fun insert(custumer: Custumer) {
        custumerRepository.save(CustumerEntity(custumer))
    }
}