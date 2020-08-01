/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package kotlin05Collection

fun main() {
    val shuffled = listOf(5, 4, 3, 2, 1)
    val natural = shuffled.sorted()
    val inverted = shuffled.sortedBy { -it }
    println(shuffled)
    println(natural)
    println(inverted)
}
