package com.gharseldin.section3

fun main(args: Array<String>){
    var dog1 = Dog("Golden Retriever", 2, "Golden")

    dog1.bark()
    dog1.run()

    var dog2 = Dog("German Shephard", 3, "Black")

    dog2.bark()
    dog2.run()

}

class Dog (var breed: String, var size:Int, var color:String){

    init {
        println("Wooh ! Wooh ! I am of size ${this.size}")
    }
    fun bark(){
        println("Wooh ! Wooh ! I am of size ${this.size}")
    }

    fun run() {
        println("I am a ${this.breed}, my color is ${this.color} and I am running!")
    }
}