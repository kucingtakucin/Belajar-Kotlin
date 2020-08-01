/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package kotlin05Collection

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val first = numbers.first()
    val last = numbers.last()
    val firstEven = numbers.first { it % 2 == 0 }
    val lastOdd = numbers.last { it % 2 != 0 }
    println(numbers)
    println(first)
    println(last)
    println(firstEven)
    println(lastOdd)
    println("-----------------------")
    val words = listOf("foo", "bar", "baz", "faz")
    val empty = emptyList<String>()
    val first2 = empty.firstOrNull()
    val last2 = empty.lastOrNull()
    val firstF = words.firstOrNull { it.startsWith('f') }
    val firstZ = words.firstOrNull { it.startsWith('z') }
    val lastF = words.lastOrNull { it.endsWith('f') }
    val lastZ = words.lastOrNull { it.endsWith('z') }
    println(words)
    println(empty)
    println(first2)
    println(last2)
    println(firstF)
    println(firstZ)
    println(lastF)
    println(lastZ)
}
