/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package kotlin03SpecialClasses

data class User(val name: String, val id: Int)

fun main() {
    val user = User("Alex", 1)
    println(user)

    val secondUser = User("Alex", 2)
    val thirdUser = User("Max", 3)

    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    println(user.hashCode())
    println(thirdUser.hashCode())

    println(user.copy())
    println(user.copy("Max"))
    println(user.copy(id = 2))

    println("Name: ${user.component1()}")
    println("Id: ${user.component2()}")
}
