package com.gharseldin.section3

fun main(args: Array<String>){
    var dog1 = Dog()
    dog1.breed = "Golden Retriever"
    dog1.size = 2
    dog1.color = "Golden"

    dog1.bark()
    dog1.run()

    var dog2 = Dog()
    dog2.breed = "German Shephard";
    dog2.size = 3
    dog2.color = "Black"

    dog2.bark()
    dog2.run()

}

class Dog {
    var breed: String = ""
    var size: Int = 1
    var color: String = ""

    fun bark(){
        println("Wooh ! Wooh ! I am of size $size")
    }

    fun run() {
        println("I am a $breed, my color is $color and I am running!")
    }
}