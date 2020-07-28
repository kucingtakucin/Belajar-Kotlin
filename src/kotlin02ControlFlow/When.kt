/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package kotlin02ControlFlow

fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
    println(whenAssign("Hello"))
    println(whenAssign(3.14))
    println(whenAssign(1))
    println(whenAssign(true))
    println(whenAssign(MyClass()))
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}

fun whenAssign(obj: Any): Any {
    val result = when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> false
        else -> 10000
    }

    return result
}

class MyClass
