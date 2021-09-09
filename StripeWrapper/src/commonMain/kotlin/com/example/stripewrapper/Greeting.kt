package com.example.stripewrapper

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}