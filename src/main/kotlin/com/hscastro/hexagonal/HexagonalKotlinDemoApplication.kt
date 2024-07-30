package com.hscastro.hexagonal

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HexagonalKotlinDemoApplication

fun main(args: Array<String>) {
	runApplication<HexagonalKotlinDemoApplication>(*args)
}
