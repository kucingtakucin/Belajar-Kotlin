package kotlin01Introduction

class Customer

class Contact(val id: Int, var email: String)

fun main() {
    val customer = Customer()
    val contact = Contact(1, "adam.faizal.af6@student.uns.ac.id")
    println(contact.id)
    contact.email = "adam.faizal.af6@gmail.com"
}

