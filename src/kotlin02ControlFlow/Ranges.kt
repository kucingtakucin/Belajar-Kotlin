/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package kotlin02ControlFlow

fun main() {
    for (i in 0..3) {
        print(i)
    }
    print(" ")
    for (i in 2..8 step 2) {
        print(i)
    }
    print(" ")
    for (i in 3 downTo -5) {
        print(i)
    }
    print(" ")
    for (j in 'a'..'z') {
        print(j)
    }
    print(" ")
    for (j in 'z' downTo 's' step 2) {
        print(j)
    }

    val x = 2
    if (x in 1..5) {
        println("Ada")
    }
    print(' ')
    if (x !in 6..10) {
        println("Tidak Ada")
    }
}
