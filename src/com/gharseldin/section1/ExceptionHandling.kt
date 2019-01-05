package com.gharseldin.section1

fun main(args: Array<String>){

    var result: Int

    try {
        result = 9 / 2
    } catch (e: Exception){
        result = -1
    }
    println("The result = $result")
}