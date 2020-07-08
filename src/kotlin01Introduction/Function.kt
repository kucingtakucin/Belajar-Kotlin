package kotlin01Introduction

import javax.print.attribute.standard.MediaSize

fun printMessage(message: String): Unit {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info"): Unit {
    println("$prefix $message")     // System.out.println(prefix + " " + message);
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

fun main() {
    printMessage("Hello, World")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix("Hello","World")
    printMessageWithPrefix("Hello", "Naruto")
    println(sum(3, 4))

    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Halo")

    val gabung = "Mbah" to "Putih"
    println(gabung)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "Mbah" to "Hitam"
    println(myPair)

    val A = Orang("Adam")
    val B = Orang("Arthur")
    A likes B

    printAll("Hello", "Adam", "Arthur", "Faizal")
    printAllWithPrefix("Mbah", "Putih", "Mulyosugito", prefix = "Greeting: ")
    log("Console", "Log", "Hello", "World")
}

fun printAll(vararg messages: String) {
    for (message in messages) println(message)
}

fun printAllWithPrefix(vararg messages: String, prefix: String) {
    for (message in messages) println("$prefix + $message")
}

fun log(vararg entries: String) {
    printAll(*entries)
}

operator fun Int.times(str: String) = str.repeat(this)
//println(2 * "Bye ")
operator fun String.get(range: IntRange) = substring(range)
val str = "Always forgive your enemies; nothing annoys them so much"
//println(str[0..14])

class Orang(val nama: String) {
    val likedPeople = mutableListOf<Orang>()
    infix fun likes(other: Orang) {
        likedPeople.add(other)
    }
}
