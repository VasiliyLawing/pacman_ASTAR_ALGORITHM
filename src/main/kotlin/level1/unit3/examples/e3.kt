/*******************************************************************************
 * Copyright (c) 2019-2022.  Anysolo LLC
 ******************************************************************************/


package level1.unit3.examples

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window

import com.anysolo.toyGraphics.sleep


fun main() {
    val wnd = Window(800, 600, buffered = true)

    while (true) {
        var obj1X = 0
        val obj1Y = wnd.height/2

        val obj2X = wnd.width/2
        var obj2Y = 0

        val objectsSize = 25

        while (obj1X < wnd.width || obj2Y < wnd.height) {
            val gc = Graphics(wnd)

            gc.setStrokeWidth(3)
            gc.color = Pal16.blue

            gc.clear()

            gc.color = Pal16.blue
            gc.drawRect(obj1X, obj1Y, objectsSize, objectsSize, fill = true)

            gc.color = Pal16.green
            gc.drawRect(obj2X, obj2Y, objectsSize, objectsSize, fill = true)

            gc.close()

            obj1X = obj1X + 2
            obj2Y = obj2Y + 1

            sleep(10)
        }
    }
}
