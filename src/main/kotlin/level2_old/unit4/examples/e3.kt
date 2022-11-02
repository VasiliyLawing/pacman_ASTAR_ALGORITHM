/*******************************************************************************
 * Copyright (c) 2019-2022.  Anysolo LLC
 ******************************************************************************/


package level2_old.unit4.examples


// You can a function taking a lambda as an argument
// This is pretty much the same what "map" standard function does.
fun processList(list: List<Int>, lambda: (Int) -> Int): List<Int> {
    val tmpList = mutableListOf<Int>()

    for(n in list)
        tmpList += lambda(n)

    return tmpList
}


fun main() {
    val sourceNumbers = listOf(1, 10, -5, 100, -20, 30, 50)

    // If a lambda has only one argument and skipped its,
    // Kotlin automatically create the argument "it" for you.
    val processedNumbers1 = processList(sourceNumbers, {it * 10})
    println(processedNumbers1)

    // You may, and usually should, make your lambda argument the last argument.
    // Then you pass your code block {} after closing ")", like this:
    val processedNumbers2 = processList(sourceNumbers) {
        it * 10
    }

    println(processedNumbers2)
}
