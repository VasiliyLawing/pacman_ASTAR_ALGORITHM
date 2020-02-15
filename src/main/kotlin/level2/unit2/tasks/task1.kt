package level2.unit2.tasks

import com.anysolo.toyGraphics.*


private const val amountOfRows = 21
private const val amountOfColumns = 15
private const val blockWidth = 75
private const val blockHeight = 25
private const val blockDistance = 8


fun drawBlock(g: Graphics, x: Int, y: Int) {
    g.color = Pal16.brightCyan
    g.drawRect(x, y, prgb1.solutions.level2.unit2.task1.blockWidth, prgb1.solutions.level2.unit2.task1.blockHeight, fill = true)

    g.setStrokeWidth(5)
    g.color = Pal16.black
    g.drawRect(x, y, prgb1.solutions.level2.unit2.task1.blockWidth, prgb1.solutions.level2.unit2.task1.blockHeight)
}

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
