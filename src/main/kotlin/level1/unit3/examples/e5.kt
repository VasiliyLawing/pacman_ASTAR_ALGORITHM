/*******************************************************************************
 * Copyright (c) 2019-2022.  Anysolo LLC
 ******************************************************************************/


package level1.unit3.examples


import kotlin.math.roundToInt

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window
import com.anysolo.toyGraphics.sleep


// Here we introduce acceleration in motion of your object.
// You can google something like "velocity & acceleration" if you do not know what acceleration is.

fun main() {
    val wnd = Window(800, 600, buffered = true)

    val particleWidth = 10
    val initialParticleHeight = 2

    // Try to change acceleration to -0.07 and see what happens.
    val acceleration = -0.06

    var growK = 1.0
    var speed = 10.0
    var x = 0.0
    val growKStep = 0.7

    while (x < wnd.width - particleWidth) {
        val gc = Graphics(wnd)

        gc.setStrokeWidth(3)
        gc.color = Pal16.blue

        gc.clear()

        val particleHeight = (initialParticleHeight * growK).roundToInt()
        gc.drawRect(x.roundToInt(), wnd.height/2 - particleHeight/2, particleWidth, particleHeight)

        gc.close()

        x += speed
        speed += acceleration
        growK += growKStep

        // Sleep for 33 milliseconds gives something about 30 frames per second.
        sleep(33)
    }
}
