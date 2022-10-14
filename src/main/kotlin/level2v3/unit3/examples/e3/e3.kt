/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/

package level2v3.unit3.examples.e3


private data class Pos(val x: Int, val y: Int)


fun main() {
    // Create a variable of Pos type
    val playerPos = Pos(300,600)

    // Print it just for debugging porpoise.
    println("#1")
    println(playerPos)

    // You can access x and y separately
    println("#2")
    println("${playerPos.x}, ${playerPos.y}")

    // You can have as many variables of that type as you want
    val enemyPos = Pos(100, 0)
    println("#3")
    println("playerPos=$playerPos, enemyPos=$enemyPos")

    val playerPos2 = Pos(300,600)
    val playerPos3 = Pos(300,601)
    println("playerPos == playerPos2: ${playerPos == playerPos2}")
    println("playerPos2 == playerPos3: ${playerPos2 == playerPos3}")
}
