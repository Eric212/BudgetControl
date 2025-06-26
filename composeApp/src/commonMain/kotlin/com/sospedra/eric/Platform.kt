package com.sospedra.eric

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform