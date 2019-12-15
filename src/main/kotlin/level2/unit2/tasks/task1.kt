package prgb1.solutions.level2.unit2

import com.anysolo.toyGraphics.*


const val amountOfRows = 10
const val amountOfColumns = 15
const val blockWidth = 75
const val blockHeight = 25
const val blockDistance = 8


// Write function drawBlock here

fun main() {
    val wnd = Window(1280, 720)
    val g = Graphics(wnd)

    var row = 0

    while (row < amountOfRows) {
        var column = 0

        while (column < amountOfColumns) {
/*
Uncomment this when you wrote drawBlock function and check how it works.
            drawBlock(
                g,
                column * (blockWidth+blockDistance) + blockDistance,
                row * (blockHeight+blockDistance) + blockDistance
            )
*/

            column++
        }

        row++
    }
}
