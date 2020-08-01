/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package kotlin05Collection

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val anyNegative = numbers.any { it < 0 }
    val anyGT6 = numbers.any { it > 6  }
    println(numbers)
    println(anyNegative)
    println(anyGT6)

    val numbers2 = listOf(1, -2, 3, -4, 5, -6)
    val allEven = numbers.all { it % 2 == 0 }
    val allLess6 = numbers.all { it < 6 }
    println(numbers2)
    println(allEven)
    println(allLess6)

    val numbers3 = listOf(1, -2, 3, -4, 5, -6)
    val allEven2 = numbers.none { it % 2 == 0 }
    val allLess62 = numbers.none { it > 6 }
    println(numbers3)
    println(allEven2)
    println(allLess62)
}
