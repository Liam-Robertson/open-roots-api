//File: src/main/kotlin/com/openroots/openroots_api/HelloController.kt
package com.openroots.openroots_api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/")
    fun hello(): String = "Hello from Openroots API!"
}
