package com.example.myapplication

fun displayList(){
    val numbers = setOf(1,2,3,4)
    for(elements in numbers){
        println(elements)
    }
    val numbersBackwards = setOf(4,3,2,1)
    println("The sets are equal: ${numbers == numbersBackwards}")
}

fun main (){

    val lst =  listOf("one","two","three")
    println("Mutable list")
    for(i in lst.indices){
        println(lst[i])
    }
    println()
    val mutableLst = mutableListOf("one","two","three")
    mutableLst.add("Four")
    println("Immutable list")
    for(i in mutableLst.indices){
        println(mutableLst[i])
    }

fun set() {
    val numbers = setOf(1, 2, 3, 4)
    for (elements in numbers) {
        println(elements)
    }
    val numbersBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numbers == numbersBackwards}")
}

fun map(){
    val countriesCapitals = mapOf(
        "Nepal" to "Kathmandu",
        "China" to "Beijing",
        "India" to "New Delhi"
    )
    println("All keys : ${countriesCapitals.keys}")
    println("All values : ${countriesCapitals.values}")

    println("Capital of Nepal is : ${countriesCapitals["Nepal"]}")


}

}

