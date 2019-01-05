package com.gharseldin.section3

object Value {
    val pi = 3.142
}

class Values {
    companion object {
        val pi = 3.14
    }
}
fun main(args: Array<String>){
    println(Value.pi)
    println(Values.pi)
}