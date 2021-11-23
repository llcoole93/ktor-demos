package com.example

import com.example.controller.registerCustomerRoutes
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.serialization.*
import registerOrderRoutes

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    install(ContentNegotiation) {
        json()
    }
    registerOrderRoutes()
    registerCustomerRoutes()
}
