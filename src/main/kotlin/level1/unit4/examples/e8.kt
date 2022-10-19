/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/


// Using if statements to check if a number is inside or outside a particular number range.

package level1.unit4.examples

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window
import com.anysolo.toyGraphics.sleep


fun main() {
    val wnd = Window(800, 600, buffered = true)

    var x = 0
    val y = wnd.height/2

    val leftLimit = wnd.width/3
    val rightLimit = wnd.width - wnd.width/3

    while (x < wnd.width) {
        val gc = Graphics(wnd)
        gc.clear()

        if(x > leftLimit && x < rightLimit)
            gc.color = Pal16.red
        else
            gc.color = Pal16.blue

        gc.drawRect(x, y, 10,10, fill = true)
        x ++

        gc.close()

        sleep(10)
    }

    while (x > 0) {
        val gc = Graphics(wnd)
        gc.clear()

        if(x < leftLimit || x > rightLimit)
            gc.color = Pal16.red
        else
            gc.color = Pal16.blue

        gc.drawRect(x, y, 10,10, fill = true)
        x --

        gc.close()

        sleep(10)
    }
}
