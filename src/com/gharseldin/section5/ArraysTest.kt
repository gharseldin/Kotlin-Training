package com.gharseldin.section5

fun main(args: Array<String>){
    var numbers = Array<Int>(5){0}

    numbers[2] = 45
    numbers[3] = 31

    for(x in 0..numbers.size-1)
    {
        println("This is the index $x of the Array -> ${numbers[x]}")
    }

    for(x in numbers){
        println("number is -> $x")
    }
}