package level2.unit4.examples

import kotlin.math.roundToInt


fun main() {
    val sourceNumbers = listOf(10.4, 110.6, 20.8, -20.6, 150.4, 30.9, 100.1, 70.9, 9000.9, 200.4, 130.0)

    // Passing your code block as an argument for "filter" function
    val filteredNumbers = sourceNumbers.filter { it >= 100 }
    println(filteredNumbers)

    // You can combine several sequence processing function like this
    // map function apply given lambda to all items in the list and
    // return new list of results.
    val roundedAndFilteredNumbers = sourceNumbers.map { it.roundToInt() } . filter { it >= 100 } . sorted()
    println(roundedAndFilteredNumbers)

    // You can find a lot of other functions working with lists
    // by typing "." after list name and then looking on the menu
}
