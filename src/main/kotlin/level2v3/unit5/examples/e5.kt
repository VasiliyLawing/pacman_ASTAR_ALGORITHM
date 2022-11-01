/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/

package level2v3.unit5.examples

fun main() {
    var numbers = listOf(1, 9, 7, 2, 10, 3, 4, 8, 6, 5)
    println(numbers)

    print("reassigning variable with a new filtered list: ")
    numbers = numbers.filter { it >= 5 }
    println(numbers)

    println("Reassigning variable with sorted list: ")
    numbers = numbers.sorted()
    println(numbers)

    println("Reassigning variable with reversed list: ")
    numbers = numbers.reversed()
    println(numbers)
}
