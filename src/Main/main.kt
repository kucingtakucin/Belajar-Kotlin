/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

/**
 * Copyright (c) 2020. Adam Arthur Faizal
 * @author (Adam Arthur Faizal)
 */
   
package Main

fun main() {
    val person = Student("Adam", "Arthur", 17, "Adam Arthur Faizal")
    person.greeting()
    println("Halo, namaku ${person.nama}, biasa dipanggil ${person.panggil}, umurku ${person.umur} tahun")
    println(person.identitas)
    println(person.kuadrat(19))
    assert(true)
    assert(true) { "Hello, World" }
}
