package level1.unit3.tasks

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window

import com.anysolo.toyGraphics.sleep
import kotlin.math.roundToInt


fun task3() {
    val wnd = Window(1280, 720, buffered = true)

    val squareSize = 50
    val x = wnd.width/2 - squareSize/2
    var y = 0.0
    var speed = 0.0

    while(y < wnd.height - squareSize) {
        val g = Graphics(wnd)
        g.setStrokeWidth(3)

        g.color = Pal16.blue

        g.clear()
        g.drawRect(x, y.roundToInt(), squareSize, squareSize)
        g.close()

        y += speed
        speed += 0.01

        sleep(10)
    }
}

fun main() {
    task3()
}
