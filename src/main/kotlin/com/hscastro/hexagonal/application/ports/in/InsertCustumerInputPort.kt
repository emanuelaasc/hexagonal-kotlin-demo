package com.hscastro.hexagonal.application.ports.`in`

import com.hscastro.hexagonal.application.core.domain.Custumer

interface InsertCustumerInputPort {
   fun insert(custumer: Custumer, zipCode: String): Unit{ }
}