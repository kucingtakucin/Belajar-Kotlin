/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

/**
 * Copyright (c) 2020. Adam Arthur Faizal
 * @author (Adam Arthur Faizal)
 */
   
package Main

fun main() {
    val orangJepang = arrayListOf("Naruto", "Sasuke", "Sakura")
    val orangAmerika = arrayListOf("Superman", "Batman", "Spiderman")
    val orangIndonesia = arrayListOf("Mbah Putih", "Mbah Hitam")

    println("Masukkan nama : ")
    val input = readLine()

    if (input in orangJepang || input in orangAmerika) {
        println("Bule is true")
        for (orang in orangJepang) if (input === orang) println("Dia orang jepang")
        for (orang in orangAmerika) if (input === orang) println("Dia orang amerika")
    } else {
        println("Bule is false, dia adalah orang indonesia")
    }
}

