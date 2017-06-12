package com.cpfei.kotlinproject

/**
 * Created by cpfei on 2017/6/9.
 */
fun main(args: Array<String>) {

    var a = 1
    val s1 = "a is $a"
    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)

    var address = Address()
    address.name = "name"

    println("str = " + address.stringRepresentation)

    println("maxOf = " + maxOf(5, 20))
    println("minOf = " + minOf(5, 20))


}

fun maxOf(a: Int, b: Int): Int{
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun minOf(a: Int, b: Int) = if (a < b) a else b


class Person constructor(name: String) {
    constructor(name: String, i: Int) : this(name) {}
}
