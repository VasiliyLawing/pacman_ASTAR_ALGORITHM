package level2.unit2


fun main() {
    // As you know we can insert any variable inside text like this:
    val a = 13
    println("Our variable will be inserted here: $a, before the rest of the text")

    // You can also use more advanced syntax ${} to insert any Kotlin expression.

    println("2+2: ${2 + 2}")

    // One more example
    val b = 1.0
    val c = 3
    val s1 = "result"
    val s2 = "Some text with $s1: ${b/c}"
    println(s2)
}
