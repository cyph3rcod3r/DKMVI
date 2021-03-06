package com.example.common

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}