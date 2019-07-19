package ch1.unit3

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Window
import com.anysolo.toyGraphics.sleep


fun main() {
    val wnd = Window(1920, 1080, buffered = true)

    val y = wnd.innerHeight/2
    var x = 0

    while(true) {
        val gc = Graphics(wnd)

        gc.setStroke(3.0)
        gc.setColor(1)

        gc.clear()
        gc.drawRect(x, y, 50, 10)

        gc.close()

        // Loop the motion
        // "if" here executes only one of two lines of code.
        // If the given condition is true it executes the first line otherwise the second one.
        if(x < wnd.innerWidth)
            x ++ // Kotlin executes this line of code if x is less than wnd.innerWidth
        else
            x = 0 // Otherwise Kotlin executes this line

        sleep(5)
    }
}
