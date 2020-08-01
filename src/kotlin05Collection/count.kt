/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package kotlin05Collection

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val totalCount = numbers.count()
    val evenCount = numbers.count { it % 2 == 0 }
    println(numbers)
    println(totalCount)
    println(evenCount)
}
