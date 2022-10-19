/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/

// Better way to assemble string from many smaller strings.
// It optimized to avoid unnecessary memory allocation.

fun main() {
    val strBuilder = StringBuilder()

    for (counter in 1..10) {
        strBuilder.append(counter.toString())
        strBuilder.append(", ")
    }

    // When we build the whole string we get the complete string using toString()
    println(strBuilder.toString())
}
