package com.gharseldin.section4

fun main(args: Array<String>){

    val lamda: (String)->String = {str -> str.reversed()}
    reverseAndDisplay("My Name is Amr", lamda)
    reverseAndDisplay("Hellow", {it.reversed()})
    reverseAndDisplay("Hellow") {it.reversed()}
}

fun reverseAndDisplay(str: String, myFunc: (String) -> String){
    val result = myFunc(str)
    println(result)
}