/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package kotlin02ControlFlow

fun eatACake() = println("Eat a cake!")
fun bakeACake() = println("Bake a cake!")

fun main() {
    val cakes = listOf("Carrot", "Cheese", "Chocolate")
    for (cake in cakes) {
        println("Yummy, it's a $cake cake")
    }

    var cakesEaten = 0
    var cakesBaked = 0
    while (cakesEaten < 5) {
        eatACake()
        cakesEaten++
    }
    do {
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)

    val zoo = Zoo(listOf(Animal("Zebra"), Animal("Lion")))

    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }
}

class Animal(val name: String)

class Zoo(val animal: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {
        return animal.iterator()
    }
}
