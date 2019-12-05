package level1.unit3.examples

/*
 Demonstration of how you can simulate gravity.
 We also invert y axis to go up.
 */

import kotlin.math.roundToInt

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window
import com.anysolo.toyGraphics.sleep


fun main() {
    val wnd = Window(800, 600, buffered = true)

    val sqaureSize = 10

    val acceleration = -0.06
    val x = wnd.width/2
    var y = 0.0
    var speed = 8.0

    while (true) {
        val gc = Graphics(wnd)
        gc.color = Pal16.blue
        gc.clear()

        gc.drawRect(x, wnd.height - y.roundToInt(), sqaureSize, sqaureSize)

        gc.close()

        y += speed
        speed += acceleration

        // Sleep for 33 milliseconds gives something about 30 frames per second.
        sleep(33)
    }
}
