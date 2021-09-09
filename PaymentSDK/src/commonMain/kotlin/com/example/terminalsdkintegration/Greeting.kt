package com.example.terminalsdkintegration

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}