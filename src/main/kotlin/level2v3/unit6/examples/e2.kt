/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/


package level2v3.unit6.examples


// Here is different ways to remove items from a list.

fun main() {
    val l = mutableListOf(1, 10, 200, 3000, 444, 55)
    println(l)

    println("\nRemoved 200")
    l.remove(200)
    println(l)

    println("\nRemoved the first number")
    l.removeFirst()
    println(l)

    println("\nRemoved the last number")
    l.removeLast()
    println(l)
}
