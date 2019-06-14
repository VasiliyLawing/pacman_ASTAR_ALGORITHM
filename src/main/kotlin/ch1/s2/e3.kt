package ch1.s2


import kotlin.math.roundToInt

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Window
import com.anysolo.toyGraphics.sleep


/*
Using more variables to add more dynamic to our example
*/

fun main() {
    val wnd = Window(1920, 1080, buffered = true)

    val particleWidth = 10
    val initialParticleHeight = 5

    // we use Double type for more precise calculation
    var growK = 1.0

    for (x in 0 .. wnd.innerWidth - particleWidth - 1) {
        val gc = Graphics(wnd)

        gc.setStroke(3.0)
        gc.setColor(1)

        gc.clear()

        // Windows coordinates are integer numbers (Int type).
        // So after we calculate new particleHeight we round the Double into an Int.
        val particleHeight = (initialParticleHeight * growK).roundToInt()

        gc.drawRect(x, wnd.innerHeight/2 - particleHeight/2, particleWidth, particleHeight)

        gc.close()

        sleep(10)
        growK += 0.08
    }
}
