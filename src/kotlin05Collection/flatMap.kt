/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package kotlin05Collection

fun main() {
    val numbers = listOf(1, 2, 3)
    val tripled = numbers.flatMap { listOf(it, it, it) }
    println("Numbers: $numbers")
    println("Transformed: $tripled")
}
