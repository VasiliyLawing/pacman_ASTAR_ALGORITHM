/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/

package level2v3.unit5.examples

import com.anysolo.toyGraphics.Pal16

fun main() {
    val origNumbers = listOf(1, 9, 7, 2, 10, 3, 4, 8, 6, 5)
    print("Original numbers: ")
    println(origNumbers)

    val sortedNumbers = origNumbers.sorted()

    print("Sorted numbers: ")
    println(sortedNumbers)

    print("Only even numbers in sorted order: ")
    println(origNumbers.filter { it % 2 == 0 } . sorted())

    print("How many odd numbers we have: ")
    println(origNumbers.filter { it % 2 != 0 } . count())

    print("The same, but shorter: ")
    println(origNumbers.count { it % 2 != 0 } )

    print("A random number from original numbers: ")
    println(origNumbers.random())
}
