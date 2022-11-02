/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/

package level2.unit4.examples.e4


import com.anysolo.toyGraphics.*
import kotlin.math.roundToInt


// Now, you can program many flying objects.

private data class Thingy(var x: Double, var y: Double, var speedX: Double, var speedY: Double, val color: Color)


private fun drawThingy(gc: Graphics, thingy: Thingy) {
    gc.color = thingy.color
    gc.drawRect(thingy.x.roundToInt(), thingy.y.roundToInt(), 10, 10, fill = true)
}


private fun moveThingy(thingy: Thingy) {
    thingy.x += thingy.speedX
    thingy.y += thingy.speedY
}


fun main() {
    val wnd = Window(800, 600, buffered = true)

    // We can create list of any type. So we can create list of a data class.
    val thingies = listOf(
        Thingy(0.0, 0.0, 1.5, 1.4, Pal16.red),
        Thingy(100.0, 100.0, 0.9, 1.0, Pal16.brown),
        Thingy(200.0, 200.0, 0.8, 0.8, Pal16.green),
        Thingy(400.0, 400.0, 0.3, 0.2, Pal16.brightMagenta)
    )

    while (true) {
        val gc = Graphics(wnd)
        gc.clear()

        for (thingy in thingies) {
            drawThingy(gc, thingy)
            moveThingy(thingy)
        }

        gc.close()

        sleep(10)
    }
}
