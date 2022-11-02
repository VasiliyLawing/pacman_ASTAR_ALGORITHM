/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/

package level2.unit2.examples

import kotlin.math.PI
import kotlin.math.roundToInt

// Here we pass result of one function into another function

private fun calcCircle(radius: Double): Double {

    // You also need to return the result when program is working.
    return PI * radius * radius
}


private fun printFancy(number: Int) {
    println("***************")
    println(number)
    println("***************")
}

fun main() {
    printFancy(calcCircle(2.0).roundToInt())
}
