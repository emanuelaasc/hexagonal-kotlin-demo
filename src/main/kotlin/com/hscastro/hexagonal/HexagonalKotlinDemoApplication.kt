package com.hscastro.hexagonal

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@SpringBootApplication
class HexagonalKotlinDemoApplication

fun main(args: Array<String>) {
	runApplication<HexagonalKotlinDemoApplication>(*args)
}
