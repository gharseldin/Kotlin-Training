package com.gharseldin.section1

fun main(args: Array<String>) {

    val number1: Int = 90
    val number2: Int = 110
    var greaterNumber:Int

    if (number1 > number2) {
        println("number1 is greater")
        greaterNumber = number1
    } else {
        println("number2 is greater")
        greaterNumber = number2
    }
    println("The greater number is $greaterNumber")

    // Using an If Expression

    var smallerNumber: Int = if (number1 < number2) {
                                    println("number1 is smaller")
                                    number1
                                } else {
                                    println("number2 is smaller")
                                    number2
                                }
    println("The smaller number = $smallerNumber")
}