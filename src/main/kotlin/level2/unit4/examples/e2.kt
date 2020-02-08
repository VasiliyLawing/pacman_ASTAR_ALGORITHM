package level2.unit4.examples


fun main() {
    // Declare a variable containing a lambda function with one argument.
    val lambda = { a: Int -> a * 10}

    println(lambda(3))
    println(lambda(5))
}
