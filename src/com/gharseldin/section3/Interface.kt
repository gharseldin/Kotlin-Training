package com.gharseldin.section3

fun main(args: Array<String>){

    var remote: Remote = Television()
    remote.powerOn()
    remote.powerOff()
}

interface Remote {
    fun powerOn()

    fun powerOff()
}

class Television : Remote {

    override fun powerOn(){
        println("TV is now switched on")
    }

    override fun powerOff(){
        println("TV is now switched off")
    }

}