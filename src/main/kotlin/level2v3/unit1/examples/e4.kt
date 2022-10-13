/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/

package level2v3.unit1.examples


// A function can return a result. You have to declare the type of result in function header. You see it below.
// Function declaration does not return the result, just declares it.
fun numberInPowerOf(n: Int, power: Int): Int {
    var result = 1

    repeat(power) {
        result *= n
    }

    // Then you need to return the value. This return happens when program is working.
    return result
}


fun main() {
    println(numberInPowerOf(2, 0))
    println(numberInPowerOf(2, 3))
    println(numberInPowerOf(2, 8))
    println(numberInPowerOf(2, 16))
}
