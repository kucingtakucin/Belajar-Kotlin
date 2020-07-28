/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package kotlin01Introduction

open class Person {
    open fun sayHello() {
        println("Hello, World")
    }
}

open class Tiger(val origin: String) {
    fun sayHello() {
        println("Seekor harimau dari $origin berkata: grrrhhh!!!")
    }
}

class HarimauSumatera : Tiger("Sumatera")

class Mahasiswa : Person() {
    override fun sayHello() {
        super.sayHello()
        println("Horeee")
    }
}

open class Lion(val nama: String, val origin: String) {
    fun sayHello() {
        println("$nama, seekor singa yang berasal dari $origin berkata: graoh!!!")
    }
}

class Asiatic(nama: String) : Lion(nama = nama, origin = "India")

fun main() {
    val orang: Person = Mahasiswa()
    orang.sayHello()
    val macan: Tiger = HarimauSumatera()
    val angka: IntArray = intArrayOf(1,2,3,4,5)
    macan.sayHello()

    val lion: Lion = Asiatic("Rufo")
    lion.sayHello()
}
