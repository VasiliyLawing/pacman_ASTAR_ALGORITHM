/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/

package level2v3.unit5.examples


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

    // Better and shorter way to remove some elements of the list conditionally.
    // This solution is more advance and uses lambda.
    objects.removeIf { it.y >= 400 }
    println(objects)
}
