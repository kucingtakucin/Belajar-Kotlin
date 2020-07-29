/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package kotlin04Functional

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun square(x: Int) = x * x

fun calculate2(): (Int) -> Int {
    return ::square
}

fun main() {
    val sumResult = calculate(4, 5, ::sum)
    val mulResult = calculate(4,5) {a, b -> a * b}
    val func = calculate2()
    println(func(2))
    println("sumResult $sumResult, mulResult $mulResult")
}
