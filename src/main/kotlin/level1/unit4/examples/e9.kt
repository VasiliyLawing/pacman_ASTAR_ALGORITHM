/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/



package level1.unit4.examples

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window
import com.anysolo.toyGraphics.sleep


fun main() {
    val wnd = Window(800, 600, buffered = true)

    var x = wnd.width/2
    val y = wnd.height/2

    val objectSize = 10

    var leftLimit = wnd.width/2-1
    var rightLimit = wnd.width - wnd.width/2+1
    var speed = 1

    while (x > 0 && x < wnd.width) {
        val gc = Graphics(wnd)
        gc.clear()

        gc.color = Pal16.blue
        gc.drawRect(x, y, objectSize,objectSize, fill = true)

        gc.color = Pal16.brown
        gc.drawLine(leftLimit, 0, leftLimit, wnd.height)
        gc.drawLine(rightLimit, 0, rightLimit, wnd.height)

        gc.close()

        x += speed

        if(x < leftLimit || x + objectSize > rightLimit) {
            speed *= -1
            leftLimit -= 5
            rightLimit += 5
        }

        sleep(10)
    }
}
