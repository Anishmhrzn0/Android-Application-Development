package com.example.myapplication

import java.util.ArrayList

fun main (args:Array<String>){
    var a: String = "Hello world"
    var i: Int = a.length
    var x: Boolean = a.equals("Hello world")
    var username: String = "   softwarica   "

    println(username.trim())
    println(a)
    println(i)
    println(a.isEmpty())
    println(a.lowercase())
    println(a.uppercase())
    println(x)
    print(a.plus(", How are you?"))


}