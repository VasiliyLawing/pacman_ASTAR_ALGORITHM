package level2.unit2

import kotlin.math.roundToInt


fun main() {
    val i = 1
    val f = 1.7
    val s = "Hello"

    // Values and variables have internal structure. Some are simple like an Int. Some are complex like Window.

    // Type "." after any value and wait. IDEA is going to show you can use inside that value.
    // Some of the names you see inside a value end with "()" those are functions.
    // You use them with "()" like "f.roundToInt()" bellow.
    // Another name are variables you use them without "()" like "s.length" bellow.

    println("1: " + i.toDouble() / 3)
    println("2: " + f.toInt())
    println("3: " + f.roundToInt())
    println("f: " + s.length)
}
