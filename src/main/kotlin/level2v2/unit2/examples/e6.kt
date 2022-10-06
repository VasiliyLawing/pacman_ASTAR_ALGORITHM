/*******************************************************************************
 * Copyright (c) 2019-2022.  Anysolo LLC
 ******************************************************************************/


package level2v2.unit2.examples


import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window
import com.anysolo.toyGraphics.sleep


fun main() {
    val wnd = Window(1280, 720, buffered = true, background = Pal16.black)
    var x2 = 0
    var nextY = wnd.height-1
    var x1 = 0
    var y1 = 0

    val list = mutableListOf<Int>()

    var growCounter = 0

    while(nextY > 0 && y1 < wnd.height) {
        val g = Graphics(wnd)
        g.color = Pal16.brightMagenta

        g.clear()

        for (y2 in list) {
            g.drawLine(x1, y1, x2, y2)
        }

        if(growCounter-- == 0) {
            growCounter = 10

            list.add(nextY)

            nextY -= 15
            x1 ++
            y1 += 7
        }

        x2++

        g.close()

        sleep(30)
    }
}
