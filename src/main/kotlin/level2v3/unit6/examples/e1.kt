/*******************************************************************************
 * Copyright (c) 2019-2022.  Anysolo LLC
 ******************************************************************************/


package level2v3.unit6.examples


fun main() {
    // Mutable list allows you to add/remove list items when the program is running.
    val l = mutableListOf(10)
    println("We have list containing one number")
    println(l)

    for(n in 10 .. 50 step 10)
        l.add(n)

    println("\nAdded a bunch of numbers")
    println(l)
}
