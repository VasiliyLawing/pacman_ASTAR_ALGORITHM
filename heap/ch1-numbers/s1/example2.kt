package ch1.s1

import kotlin.math.roundToInt


fun main() {
    // print some very simple arithmetic expressions to console
    println("Simple arithmetic expressions")
    println(2 + 2)
    println(2 * (2 + 3))
    println() // just print empty line

    println("integer 1 divided by 3 gives 0")
    println(1 / 3)
    // Read about integer and floating numbers

    // constant containing '.' means it is a floating point number
    println("More sensible 1 / 3")

    // we can specify a floating point constant
    println(1.0 / 3)

    // Or we can use type conversion method: toDouble
    println(1.toDouble() / 3)

    println("Conversion 2.6 to Int drops 0.6")
    println(2.6.toInt())

    println("Rounding to Int:")
    println(2.6.roundToInt())

    // try typing "println(2.6." then wait a bit and you will see IDEA showing you what methods you can use
}
