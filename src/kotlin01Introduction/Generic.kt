/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package kotlin01Introduction

class MutableStack<E>(vararg items: E){
    private val elements = items.toMutableList()
    fun push(element: E) = elements.add(element)
    fun peek(): E = elements.last()
    fun pop(): E = elements.removeAt(elements.size - 1)
    fun isEmpty() = elements.isEmpty()
    fun size() = elements.size

    @Override
    override fun toString() = "MutableStack(${elements.joinToString()})"

}
fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)
/**
 * @author (Adam Arthur Faizal)
 *
 * */
fun main() {
    val stack = MutableStack("Adam", 17, true)
    val stack2 = mutableStackOf(1,2,3,4,true, false)
    println(stack.toString())
    stack.push(192)
    println(stack.toString())
    stack.push(168)
    println(stack.toString())
    println(stack2)
}
