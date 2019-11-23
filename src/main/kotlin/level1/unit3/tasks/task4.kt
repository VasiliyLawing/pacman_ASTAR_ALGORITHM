package level1.unit3.tasks

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window

import com.anysolo.toyGraphics.sleep
import kotlin.math.roundToInt


fun task4() {
    val wnd = Window(1280, 720, buffered = true)

    val squareSize = 50
    var y = wnd.height.toDouble() - squareSize - 1
    var x = 0.0
    var vspeed = -2.2
    val hspeed = 2.8

    while(y < wnd.height - squareSize) {
        val g = Graphics(wnd)
        g.setStrokeWidth(3)

        g.color = Pal16.blue

        g.clear()
        g.drawRect(x.roundToInt(), y.roundToInt(), squareSize, squareSize)
        g.close()

        x += hspeed
        y += vspeed
        vspeed += 0.01

        sleep(10)
    }
}

fun main() {
    task4()
}
