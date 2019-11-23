package level1.unit3.tasks

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window

import com.anysolo.toyGraphics.sleep
import kotlin.math.roundToInt


fun task2() {
    val wnd = Window(1280, 720, buffered = true)

    val squareSize = 50
    var x = 0
    val xyRatio = wnd.width.toDouble() / wnd.height

    while(x < wnd.width) {
        val g = Graphics(wnd)
        g.setStrokeWidth(3)
        g.color = Pal16.blue

        g.clear()

        val y = x / xyRatio

        g.drawRect(x, y.roundToInt(), squareSize, squareSize)
        g.close()

        x ++

        sleep(20)
    }
}

fun main() {
    task2()
}
