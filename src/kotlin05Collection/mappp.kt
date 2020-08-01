/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package kotlin05Collection


fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val doubled = numbers.map { x -> x * 2 }
    val tripled = numbers.map { it * 3 }

    println(numbers)
    println(doubled)
    println(tripled)
}

