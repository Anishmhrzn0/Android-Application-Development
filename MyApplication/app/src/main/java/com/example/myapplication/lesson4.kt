package com.example.myapplication

fun main (){
var num1: Double = 10.6
var num2: Double = 5.0
var result: Double = 0.0

result = num1 + num2
println("num1 + num2 is $result")

result = num1 - num2
println("num1 - num2 is $result")

result = num1 * num2
println("num1 * num2 is $result")

result = num1 / num2
println("num1 / num2 is $result")

result = num1 % num2
println("num1 % num2 is $result")

    var x:Int = 20
    var y:Int = 10
    var z:Int = 0

    z = x + y
    println("z = x + y = $z")
    z += x
    println("z += x = $z")
    z -= x
    println("z -= x = $z")
    z *= x
    println("z *= x = $z")
    z /= x
    println("z /= x = $z")
    z %= x
    println("z %= x = $z")

    var number: Double = 7.6
    var isCheck: Boolean = true
    println("+number = ${+number}" )
    println("-number = ${-number}" )
    println("++number = ${++number}" )
    println("--number = ${--number}" )
    println("!isCheck = ${!isCheck}" )
    println("----------------------------")
    var results: Double = 4.7
    println("results : $results")
    println("results++  :" + results++)

    var a: Int = 5
    var b: Int = 5

    println("a == b : " + (a == b))
    println("a != b : " + (a != b))
    println("a < b : " + (a < b))
    println("a > b : " + (a > b))
    println("a >= b : " + (a >= b))
    println("a <= b : " + (a <= b))

    var number1: Int = 5
    var number2: Int = 8
    var number3: Int = 12

    var resultss: Boolean = false

// Conditional operator (&&)
    resultss = (number1 > number2) && (number3 > number2)
    println(resultss)

// Conditional operator (||)
    resultss = (number1 > number2) || (number3 > number2)
    println(resultss)

    var Result: Int = 5 + 2 * 4
    println("Result = " + Result)
    Result = (5 + 2) * 4
    println("Result = " + Result)

    var e: Int = 8
    var f: Int = 4
    var g: Int = 2

    var sum: Int = 0
    sum = e + --f + --g
    println("e + --f + --g ::: $sum")


    var myCharRange = 'a'.rangeTo('j')
    var testCharRange = 'a'..'j'

    var check = 'Z' in testCharRange
    println("myCharRange has Z : $check")
    println(myCharRange)
    println(testCharRange)

}