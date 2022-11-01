/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/

package level2v3.unit6.examples


data class SomeObject(val x: Int, val y: Int)

// Removing some object from a list.

fun main() {
    val objects = mutableListOf(
        SomeObject(100, 100),
        SomeObject(100, 200),
        SomeObject(100, 400),
        SomeObject(100, 500),
        SomeObject(100, 600)
    )
    println(objects)

    val iterator = objects.listIterator()
    while (iterator.hasNext()) {
        val item = iterator.next()

        if(item.y >= 400) {
            iterator.remove()
        }
    }

    println(objects)
}
