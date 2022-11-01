/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/

package level2v3.unit5.examples

fun main() {
    val allNumbers = 1..9
    println("All numbers")
    println(allNumbers)

    val filteredNumbers = allNumbers.filter { it > 4 }

    print("Only numbers greater then 4: ")
    println(filteredNumbers)

    print("Only numbers greater then 4 and less then 8: ")
    println(allNumbers.filter { it > 4 && it < 8})

    print("The same in a shorter form: ")
    println(allNumbers.filter { it in 5 until 8 })

    print("And one more variation: ")
    println(allNumbers.filter { it in 5 .. 7 })
}
