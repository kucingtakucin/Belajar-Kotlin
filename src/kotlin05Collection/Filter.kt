/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package kotlin05Collection

fun main() {
    val numbers: List<Int> = listOf(1, -2, 3, -4, 5, -6)
    val positive = numbers.filter { it > 0 }
    val negative = numbers.filter { it < 0 }
    println("Array asli: $numbers")
    println("Bilangan positif: $positive")
    println("Bilangan negatif: $negative")
}
