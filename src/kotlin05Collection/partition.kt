/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package kotlin05Collection

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val evenOdd = numbers.partition { it % 2 == 0 }
    val (positives, negatives) = numbers.partition { it > 0 }
    println("Numbers: $numbers")
    println("Even numbers: ${evenOdd.first}")
    println("Odd numbers: ${evenOdd.second}")
    println("Positive numbers: $positives")
    println("Negative numbers: $negatives")
}
