package ch1.s2


import kotlin.math.roundToInt

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Window
import com.anysolo.toyGraphics.sleep


fun main() {
    val wnd = Window(1920, 1080, buffered = true)

    val particleWidth = 10
    val initialParticleHeight = 2

    // Try to change acceleration to -0.03
    val acceleration = -0.02

    var growK = 1.0
    var speed = 10.0
    var x = 0.0
    var growKStep = 0.7

    while (x < wnd.innerWidth - particleWidth) {
        val gc = Graphics(wnd)

        gc.setStroke(3.0)
        gc.setColor(1)

        gc.clear()

        val particleHeight = (initialParticleHeight * growK).roundToInt()
        gc.drawRect(x.roundToInt(), wnd.innerHeight/2 - particleHeight/2, particleWidth, particleHeight)

        gc.close()

        sleep(33)

        x += speed
        speed += acceleration
        growK += growKStep
    }
}
