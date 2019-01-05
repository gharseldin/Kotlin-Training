package com.gharseldin.section6

fun main(args: Array<String>){

    var name: String? = null
    val integer: Int? = null

    println("The length of name is ${name?.length}")


    name?.let { println("The length of name is ${name.length}") }


    println("The length of name is ${name!!.length}")

}