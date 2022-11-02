/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/


package level2.unit6.examples


// Removing elements from a list while iterating the list in a loop.

fun main() {
    val list = mutableListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(list)

    /*
    // Uncomment this is you see it does not work.
    // You cannot modify list you are going through using "for" loop.
    for (item in list) {
        if(item >= 3 && item <= 6) {
            list.remove(item)
        }
    }
     */

    // This is a better way to delete current element from the list in a loop
    val iterator = list.listIterator()
    while (iterator.hasNext()) {
        val item = iterator.next()

        if(item >= 3 && item <= 6) {
            iterator.remove()
        }
    }

    println(list)
}
