package com.gharseldin.section2

fun main(args: Array<String>){

    val x = 10
    val y = 20

    val result = x + y
    println("The result = $result")

    add(x,y)
    add(11,22)
    println("Result ${addReturn(22,55)}")
    println("Testing expression ${
     if(false)
         "Its true"
    else
         "Its false"
    }")
}

fun add(firstNumber: Int, secondNumber:Int): Unit {
    println("The result = ${firstNumber + secondNumber}")
}

fun addReturn(number1:Int, number2:Int): Int {
    return number1 + number2
}