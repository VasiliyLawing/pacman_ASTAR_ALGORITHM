/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/

package level2v3.unit1.examples

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window
import com.anysolo.toyGraphics.sleep


private val tankLength = 100
private val tankHeight = 50


fun drawTank(g: Graphics, x: Int, y: Int) {
    g.color = Pal16.black
    g.setStrokeWidth(2)

    g.drawRect(x + tankLength /4, y, tankLength /2, tankHeight /2)
    g.drawRect(x, y + tankHeight /2, tankLength, tankHeight /2)

    g.setStrokeWidth(4)
    g.drawLine(x - tankLength /8, y+ tankHeight /4, x + tankLength /4, y+ tankHeight /4)
}


fun main() {
    val wnd = Window(800, 600, buffered = true)

    var tankX = wnd.width - tankLength
    val tankY = wnd.height/2

    while (true) {
        val graphics = Graphics(wnd)
        graphics.clear()

        drawTank(graphics, tankX, tankY)

        graphics.close()

        tankX --

        sleep(10)
    }
}
