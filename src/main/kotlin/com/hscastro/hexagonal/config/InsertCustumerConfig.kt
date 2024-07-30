package com.hscastro.hexagonal.config

import com.hscastro.hexagonal.adapters.FindAddressByZipCodeOutputAdapter
import com.hscastro.hexagonal.adapters.InsertCustumerAdapter
import com.hscastro.hexagonal.application.core.usecase.InsertCustumerUsecase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class InsertCustumerConfig{

    @Bean
    fun insertCustumer(
        findAddressByZipCodeOutputAdapter: FindAddressByZipCodeOutputAdapter,
        insertCustumerAdapter: InsertCustumerAdapter
    ) = InsertCustumerUsecase(findAddressByZipCodeOutputAdapter, insertCustumerAdapter)
}