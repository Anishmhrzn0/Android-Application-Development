package com.example.myapplication

fun main(args: Array<String>) {
    var age = arrayOf(1, 2, 3)
    println(age)
    println("The first element of age is " + age[0])
    println("The second element of age is " + age[1])
    println("The third element of age is " + age[2])

    println("*******************************")

    var name = arrayOf("ram","shyam","Hari")
    name[1] = "sandis"
    println("The first element of name is " + name[0])
    println("The second element of name is " + name[1])
    println("The third element of name is " + name[2])

    println(name.size)

    var age1 = ArrayList<Int>()
    age1.add(1)
    age1.add(1,28)
    age1.add(5)

    var age2 = arrayListOf<Int>(1,20,5)

    var names = arrayListOf<String>("sandis","ram","shyam")
    names.add("hari")
    names.add(4,"Sita")

    names.remove("shyam")
    names.removeAt(0)

    println(names)

    var mixArrayList = arrayListOf<Any>("hello",5,2.0)
    println(mixArrayList[0]);
    println(mixArrayList[1]);
    println(mixArrayList[2]);

}
