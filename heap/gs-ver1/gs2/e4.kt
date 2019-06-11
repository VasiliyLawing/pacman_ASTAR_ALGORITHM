package ch1.gs2

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Window

import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.roundToInt


fun main() {
    val wnd = Window(1280, 720)
    val gc = Graphics(wnd)

    var x = 0.0
    var y = 0.0

    val scaleX = 0.25
    val scaleY = 0.5

    var color = 0
    var offsetX = 0.0

    gc.setColor(color)

    while(true) {
        x += 0.001
        y = cos(x * PI/2 + offsetX)

        val screenX = x * wnd.innerWidth * scaleX / 2
        val screenY = y * wnd.innerHeight * scaleY / 2 + wnd.innerHeight/2

        if(screenX >= wnd.innerWidth) {
            x = 0.0
            offsetX += 0.2

            color = if(color < 15) color + 1 else 0
            gc.setColor(color)

            continue
        }

        gc.drawDot(screenX.roundToInt(), screenY.roundToInt())
    }
}
