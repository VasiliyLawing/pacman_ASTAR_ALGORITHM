/*******************************************************************************
 * Copyright (c) 2019-2022.  Anysolo LLC
 ******************************************************************************/


package level2.unit2.examples

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Window


/*
We can use function drawTank defined in e2 because it is in the same package.
We use it as a graphic primitive and draw as much tanks as we want.
 */

fun main() {
    val wnd = Window(1280, 720)
    val g = Graphics(wnd)

    var tankPos = Pos(100, 50)

    repeat(8) {
        drawTank(g, tankPos)
        tankPos = Pos(tankPos.x + 100, tankPos.y + 75)

    }
}
