package level1.unit1.examples

/*
    An arithmetic expression executes mathematical calculation. The result of
    arithmetic expression is a value. So you can use such an expression anywhere you would use a value.
 */

fun main() {
    println("#1 Simple arithmetic expressions")
    println(2 + 2)
    println(2 * (2 + 3))
    println() // just print empty line

    println("#2 Integer 1 divided by 3 gives 0")
    println(1 / 3)
    println()
    // Read about integer and floating numbers to see why.

    println("#3 More sensible 1 / 3")
    println(1.0 / 3)
    println()

    println("#4 Order of operations and Integer type")
    println(300 * 2/3) // work reasonably
    println(2/3 * 300) // surprise! Why does it behaves so differently?
}
