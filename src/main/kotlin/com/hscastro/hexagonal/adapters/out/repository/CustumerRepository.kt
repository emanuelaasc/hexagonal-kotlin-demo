package com.hscastro.hexagonal.adapters.out.repository

import com.hscastro.hexagonal.adapters.out.repository.entity.CustumerEntity
import org.springframework.data.mongodb.repository.MongoRepository

interface CustumerRepository : MongoRepository<CustumerEntity, String>