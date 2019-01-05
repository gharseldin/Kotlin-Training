package com.gharseldin.section3

fun main(args: Array<String>){
    var dog = BigDog("Pug", 10)
    var cat = Cat("small", 8)
    dog.bark()
    cat.meow()
}
open class Animal(var age:Int){
    fun eat() {
        println("My age is $age and I need to eat!")
    }
}
class BigDog(var breed:String, age: Int): Animal(age) {

    fun bark() {
        println("I'm a $breed and I'm barking!")
    }

    fun displayAge(){
        println("My age is $breed")
    }
}

class Cat (var type:String, age: Int):Animal(age){
    fun meow(){
        println("my type is ${this.type} and I am meowing !")
    }
}