package me.wverdese.example.kotlin.inject

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}