/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package kotlin04Functional

val upperCase1: (String) -> String = {str: String -> str.toUpperCase()}
val upperCase2: (String) -> String = {str -> str.toUpperCase()}
val upperCase3 = {str: String -> str.toUpperCase()}
//val upperCase4 = {str -> str.toUpperCase()}
val upperCase5: (String) -> String = { it.toUpperCase()}
val upperCase6: (String) -> String = String::toUpperCase

fun main() {
    println(upperCase1("Hello"))
    println(upperCase2("Hello"))
    println(upperCase3("Hello"))
    println(upperCase5("Hello"))
    println(upperCase6("Hello"))
}
