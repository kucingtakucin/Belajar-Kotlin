/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package kotlin03SpecialClasses

import java.util.Random

class LuckDispatcher {
    fun getNumber() {
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

fun rentPrize(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {
    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }
    val total = dayRates.standard + dayRates.festivity + dayRates.special
    print("Total Price: $total")
}

object doAuth {
    fun takeParams(username: String, password: String) {
        println("input Auth parameters: $username:$password")
    }
}

class BigBen {
    companion object bonger {
        fun getBelongs(nTimes: Int) {
            for (i in 1..nTimes) {
                print("BONG")
            }
        }
    }
}

fun main() {
    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()

    d1.getNumber()
    d2.getNumber()

    rentPrize(1,2,3)
    doAuth.takeParams("foo","qwerty")
    BigBen.getBelongs(12)
}


