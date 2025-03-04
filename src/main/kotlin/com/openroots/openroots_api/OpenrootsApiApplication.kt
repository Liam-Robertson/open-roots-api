//File: src/main/kotlin/com/openroots/openroots_api/OpenrootsApiApplication.kt
package com.openroots.openroots_api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OpenrootsApiApplication

fun main(args: Array<String>) {
	runApplication<OpenrootsApiApplication>(*args)
}
