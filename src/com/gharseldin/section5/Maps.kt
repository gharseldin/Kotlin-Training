package com.gharseldin.section5
fun main(args: Array<String>) {
    var myMap = mapOf<Int, String>(2 to "USA", 3 to "Egypt", 1 to "China")
    for (key in myMap.keys) {
        println(myMap.get(key))
    }

    var myMutableMap = mutableMapOf<Int, String>(2 to "USA", 3 to "Egypt", 1 to "China")
    myMutableMap.put(5, "Canada")
    for (key in myMutableMap.keys) {
        println(myMutableMap.get(key))
    }
}