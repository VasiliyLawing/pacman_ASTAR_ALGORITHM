/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/

package level2.unit5.examples

fun main() {
    val data1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val data2 = 1..9

    print("List: ")
    println(data1)

    print("Int range: ")
    println(data2)

    print("Int range converted to a list: ")
    println(data2.toList())

    print("Are the list and int range converted to list the same? ")
    println(data1 == data2.toList())
}
