package com.gharseldin.section4

fun main(args: Array<String>){

    var person = Person()

    with(person){
        name = "Amr"
        age = 38
    }
    
    person.apply{
        name = "Melissa"
        age = 37
    }.startRun()
}

class Person {
    var name:String = ""
    var age: Int = -1
    fun startRun(){
        println("I am ready to run")
    }
}