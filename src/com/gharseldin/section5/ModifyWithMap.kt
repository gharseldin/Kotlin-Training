package com.gharseldin.section5

fun main(args: Array<String>){

    val myNumbers = listOf(2, 3, 4, 5, 6, 7, 10)

    val mySquareNumbers = myNumbers.map { it*it }

    for(index in 0..mySquareNumbers.size-1){
        println("number ${index+1} = ${mySquareNumbers[index]}")
    }

    val squareAndDividebyTwo = myNumbers.map { it*it }.map { it/2 }

    for(index in 0..squareAndDividebyTwo.size-1){
        println("number ${index+1} = ${squareAndDividebyTwo[index]}")
    }
}