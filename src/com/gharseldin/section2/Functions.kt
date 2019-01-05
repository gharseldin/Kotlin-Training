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

    val n1: Int = 10
    val n2: Int = 20
    val n3: Int = 30

    println("Multiplying $n1 & $n2 & $n3 gives ${multiply(n1, n2, n3)} ")
    println("Multiplying $n1 & $n2 & 10 gives ${multiply(n1, n2)} ")


}

fun add(firstNumber: Int, secondNumber:Int): Unit {
    println("The result = ${firstNumber + secondNumber}")
}

fun addReturn(number1:Int, number2:Int): Int {
    return number1 + number2
}

fun multiply(num1: Int , num2:Int, num3:Int = 8):Int{
    return num1 * num2 * num3
}