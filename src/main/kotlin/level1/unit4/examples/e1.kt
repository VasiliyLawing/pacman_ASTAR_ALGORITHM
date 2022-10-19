/*******************************************************************************
 * Copyright (c) 2019-2022.  Anysolo LLC
 ******************************************************************************/


package level1.unit4.examples

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window
import com.anysolo.toyGraphics.sleep


fun main() {
    val wnd = Window(800, 600, buffered = true)

    val y = wnd.height/2
    var x = 0

    while(true) {
        val gc = Graphics(wnd)

        gc.setStrokeWidth(3)
        gc.color = Pal16.blue

        gc.clear()
        gc.drawRect(x, y, 50, 10)

        gc.close()

        // Loop the motion
        // "if" here executes only one of two lines of code.
        // If the given condition is true it executes the first line otherwise the second one.
        if(x < wnd.width) {
            x++ // Kotlin executes this line of code if x is less than wnd.innerWidth
        }
        else {
            x = 0 // Otherwise Kotlin executes this line
        }

        sleep(5)
    }
}
