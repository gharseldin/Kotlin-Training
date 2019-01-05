package com.gharseldin.section5

fun main(args: Array<String>){

    val myNumbers: List<Int> = listOf(2, 3, 4, 6, 23, 33, 44, 55)

    val myNumbersUnder10 = myNumbers.filter(){it < 10}

    for(x in myNumbersUnder10){
        println(x)
    }

    var mutableNames = mutableListOf<String>("Name1", "Name2", "Name3")
    mutableNames.add("Name4")

    val myNames = mutableNames.filter{ it.endsWith("3")}
    for(x in myNames){
        println(x)
    }
}