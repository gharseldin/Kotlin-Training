package com.gharseldin.section4

fun main(args: Array<String>){
    val mylambdaExpression: (Int, Int)->Int = {x,y -> x+y}
    addition(10,2, mylambdaExpression)

    val anotherLambda: (Int, Int)-> Unit = { a, b -> println(a+b)}

}

fun addition(a: Int, b:Int, myFunction:(Int, Int)->Int){
    println(myFunction(a,b))
}