/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package kotlin05Collection

data class AssociateGrop(val name: String, val city: String, val phone: String)

fun main() {
    val people = listOf(
            AssociateGrop("John", "Boston", "+1-888-123456"),
            AssociateGrop("Sarah", "Munich", "+49-777-789123"),
            AssociateGrop("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
            AssociateGrop("Vasilisa", "Saint-Petersburg", "+7-999-123456")
    )
    val phoneBook = people.associateBy { it.phone }
    val cityBook = people.associateBy(AssociateGrop::phone, AssociateGrop::city)
    val peopleCities = people.groupBy(AssociateGrop::city, AssociateGrop::name)

    println(phoneBook)
    println(cityBook)
    println(peopleCities)
}

