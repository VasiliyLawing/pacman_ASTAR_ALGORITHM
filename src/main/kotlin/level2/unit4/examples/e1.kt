/*******************************************************************************
 * Copyright (c) 2019-2022.  Anysolo LLC
 ******************************************************************************/


package level2.unit4.examples


fun main() {
    // List may contain not one but many values
    val list = listOf(10, 11, -10)
    println("# List containing 3 Int numbers")
    println(list)
    println(list.size)

    // The best way to get all values from a list is "for" loop
    println("# accessing all the values one by one")

    // "n" here is the name of variable which going to receive one element
    // The loop repeated as many times as many elements you have in the list.
    for(n in list)
        print("$n ")
    println()
}
