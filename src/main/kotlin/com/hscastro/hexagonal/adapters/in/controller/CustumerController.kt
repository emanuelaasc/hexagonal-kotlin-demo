package com.hscastro.hexagonal.adapters.`in`.controller

import com.hscastro.hexagonal.application.core.domain.Custumer
import com.hscastro.hexagonal.application.ports.`in`.FindCustumerByIdInputPort
import com.hscastro.hexagonal.application.ports.`in`.InsertCustumerInputPort
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/v1/custumers")
class CustumerController(
    private val findCustumerByIdInputPort: FindCustumerByIdInputPort,
    private val insertCustumerInputPort: InsertCustumerInputPort
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun insert(@ResponseBody custumerRequest: CustumerRequest): ResponseEntity<Void> {
        val address = findCustumerByIdInputPort.find(id)
        insertCustumerInputPort.insert(custumer, address)
    }
}