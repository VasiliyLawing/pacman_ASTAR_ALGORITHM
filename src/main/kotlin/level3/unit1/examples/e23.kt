/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/

// Another way to assemble string from many smaller strings.
// It works, but inefficient. It reallocates memory for the string every time we combine strings using "+"

fun main() {
    var resultStr = ""

    for (counter in 1..10) {
        resultStr += counter.toString() + ","

        // Also can be done in slightly better way.
//        resultStr += "$counter,"
    }

    println(resultStr)
}
