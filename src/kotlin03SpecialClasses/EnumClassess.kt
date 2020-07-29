/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package kotlin03SpecialClasses

enum class State {
    IDLE, RUNNING, FINISHED
}

fun main() {
    val state = State.RUNNING
    val message = when (state) {
        State.IDLE -> "It's IDLE"
        State.RUNNING -> "It's RUNNING"
        State.FINISHED -> "It's FINISHED"
    }
    println(state)
    println(message)
}
