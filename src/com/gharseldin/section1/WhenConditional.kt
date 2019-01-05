package com.gharseldin.section1

fun main(args: Array<String>){

    val x: Int = 7

    when(x) {
        1 -> println("x is equal to one")
        2 -> println("x is equal to two")
        in 5..10 -> println("x is smaller than 10 and greater than 5")
        else -> println("x is $x")
    }

    println(x in 1..5)

    val y = 100

    var str:String = when(y){
        in 1..50 -> "$y is a small number"
        in 1..100 -> "$y is a big number"
        else -> "I'm not sure what $y is"
    }
    println(str)
}