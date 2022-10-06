/*******************************************************************************
 * Copyright (c) 2019-2022.  Anysolo LLC
 ******************************************************************************/


package level2.unit3.examples


fun main() {
    // Mutable list allows you add and remove list items
    val l = mutableListOf<Int>()
    for(n in 1 .. 5)
        l.add(n)

    println(l)

    for(n in 101 .. 105)
        l.add(n)
    println(l)
}
