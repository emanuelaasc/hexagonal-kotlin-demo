package com.hscastro.hexagonal.application.ports.`in`

import com.hscastro.hexagonal.application.core.domain.Custumer


interface FindCustumerByIdInputPort {
    fun find(id: String): Custumer
}