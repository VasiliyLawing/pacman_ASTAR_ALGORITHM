/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/

package level2v3.unit4.examples.e3


private data class Thingy(var x: Int, var y: Int)


fun main() {
    // We can create list of any type. So we can create list of a data class.
     val thingies = listOf(
         Thingy(0, 0),
         Thingy(100, 100),
         Thingy(200, 200),
         Thingy(400, 400)
     )

    for (thingy in thingies) {
        println(thingy)
    }
}