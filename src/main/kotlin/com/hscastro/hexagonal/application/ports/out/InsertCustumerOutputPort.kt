package com.hscastro.hexagonal.application.ports.out

import com.hscastro.hexagonal.application.core.domain.Custumer


interface InsertCustumerOutputPort {

    fun insert(custumer: Custumer)
}