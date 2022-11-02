/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/

package level2.unit2.examples

import kotlin.math.PI


// A function can return some value
// You need to declare it. Look for ": Double" in the next line
private fun calcCircle(radius: Double): Double {

    // You also need to return the result when program is working.
    return PI * radius * radius
}


fun main() {
    println(calcCircle(2.0))
    println(calcCircle(4.0))
    println(calcCircle(8.0))
}
