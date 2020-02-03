package level2.unit3.tasks.task2


data class Pos(val x: Int, val y: Int)


fun main() {
    val bombs = mutableListOf(
        Pos(0, 0),
        Pos(200, 705),
        Pos(100, 20),
        Pos(70, 700),
        Pos(1000, 20),
        Pos(800, 680)
    )

    val expectedBombsAfterProcessing = listOf(
        Pos(0, 0),
        Pos(100, 20),
        Pos(1000, 20),
        Pos(800, 680)
    )

    val expectedExplodingBombs = listOf(
        Pos(200, 705),
        Pos(70, 700)
    )

    val explodingBombs = mutableListOf<Pos>()

// Write your code between these two lines. Do not change any code outside it.
//---------------------
//---------------------

    if(bombs == expectedBombsAfterProcessing)
        println("bombs - passed.")
    else
        println("bombs - Failed.\nExpected: $expectedBombsAfterProcessing\nYou made: $bombs")

    println()

    if(explodingBombs == expectedExplodingBombs)
        println("exploding bombs - passed.")
    else
        println("exploding bombs - Failed.\nExpected: $expectedExplodingBombs\nYou made: $explodingBombs")
}
