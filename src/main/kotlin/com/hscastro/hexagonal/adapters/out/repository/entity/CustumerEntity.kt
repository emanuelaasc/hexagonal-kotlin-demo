package com.hscastro.hexagonal.adapters.out.repository.entity

import com.hscastro.hexagonal.adapters.out.repositories.entity.AddressEntity
import com.hscastro.hexagonal.application.core.domain.Custumer
import lombok.Data
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.MongoId

@Data
@Document(collection = "custumers")
class CustumerEntity (

    @MongoId
    var id: String?,
    var nome: String,
    var address: AddressEntity,
    var cpf: String,
    var isValidCpf: Boolean = false
){
    constructor(custumer: Custumer): this(
        custumer.id,
        custumer.name,
        AddressEntity(custumer.address!!),
        custumer.cpf,
        custumer.isValidCpf
    )
}