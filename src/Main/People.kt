/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Main

abstract class People(var nama: String, var panggil: String, var umur: Int, private var namaLengkap: String) {
    var identitas: String
        get() = this.namaLengkap
        set(value) {
            this.namaLengkap = value
        }

    open fun greeting() {
        println("Halo, namaku ${this.nama}, biasa dipanggil ${this.panggil}, umurku ${this.umur} tahun")
        println("My identity : ${this.identitas}")
    }

    abstract fun hello()

    override fun toString(): String {
        return "People(nama='${this.nama}', panggil='$panggil', umur=${this.umur})"
    }
}

class Student(nama: String, panggil: String, umur: Int, namaLengkap: String) : People(nama, panggil, umur, namaLengkap) {
    override fun greeting() {
        super.greeting()
        println("Mantab")
    }

    override fun hello() {
//        TODO("Not yet implemented")
        println("Awokwokwokwo")
    }

    val kuadrat: (Int) -> Int = {it * it}
}
