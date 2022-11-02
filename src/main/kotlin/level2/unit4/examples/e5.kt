/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/

// Using random numbers to emulate random behaviour (aka a simple AI)

package level2.unit4.examples

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window
import com.anysolo.toyGraphics.sleep
import kotlin.math.roundToInt
import kotlin.random.Random


private data class Ufo(var x: Double, var y: Double, var speedX: Double, var speedY: Double)


fun main() {
    val wnd = Window(800, 600, buffered = true)
    val thingy = Ufo(wnd.width.toDouble() / 2, wnd.height.toDouble() / 2, 0.0, 0.0)
    val thingySize = 10

    while (true) {
        if(Random.nextInt(0, 100) == 0) {
            thingy.speedX = Random.nextDouble(-1.0, 1.0)
        }

        if(Random.nextInt(0, 100) == 0) {
            thingy.speedY = Random.nextDouble(-1.0, 1.0)
        }

        thingy.x += thingy.speedX
        thingy.y += thingy.speedY

        if(thingy.x < 0 || thingy.x + thingySize > wnd.width) {
            thingy.speedX *= -1
        }

        if(thingy.y < 0 || thingy.y + thingySize > wnd.height) {
            thingy.speedY *= -1
        }

        val gc  = Graphics(wnd)
        gc.clear()
        gc.color = Pal16.red
        gc.drawRect(thingy.x.roundToInt(), thingy.y.roundToInt(), thingySize, thingySize, fill = true)
        gc.close()
        sleep(5)
    }
}
