package com.bank.thebankcrud.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/hello")
class HomeController {

    @GetMapping
    fun home(): String = "Welcome home..."
}