package com.gharseldin.section5

fun main(args: Array<String>){

    var namesList = listOf<String>("Name1", "Name2", "Name3")

    for(name in namesList)
        println(name)

    for( index in 1..namesList.size-1){
        println("name $index is ${namesList[index]}")
    }

    var mutableNames = mutableListOf<String>("Name1", "Name2", "Name3")
    mutableNames.add("Name4")

    for(name in mutableNames)
        println(name)
}