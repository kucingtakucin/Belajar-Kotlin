/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package kotlin05Collection

fun main() {
    val numbers = listOf(1, 2, 3)
    val empty = emptyList<Int>()
    println("Numbers: $numbers, min = ${numbers.min()} max = ${numbers.max()}") // 1
    println("Empty: $empty, min = ${empty.min()}, max = ${empty.max()}")        // 2
}
