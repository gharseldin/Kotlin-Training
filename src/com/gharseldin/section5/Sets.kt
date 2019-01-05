package com.gharseldin.section5

fun main(args: Array<String>){
    val myList = listOf<Int>(2, 2, 3, 4, 5, 6, 6, 6, 10)

    for(x in myList)
        println(x)

    val mySet = setOf<Int>(2, 2, 3, 4, 5, 6, 6, 6, 10)
    for(x in mySet)
        println(x)

    val mutableSet = mutableSetOf<Int>(2, 2, 3, 4, 5, 6, 6, 6, 10)
    for(x in mutableSet)
        println(x)
    mutableSet.add(100)

    mutableSet.remove(6)
    for(x in mutableSet)
        println(x)
}