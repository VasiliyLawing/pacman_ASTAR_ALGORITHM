package level1.unit3.tasks

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window

import com.anysolo.toyGraphics.sleep


fun task1() {
    val wnd = Window(1280, 720, buffered = true)

    val squareSize = 50
    val x = wnd.width/2 - squareSize/2
    var y = 0

    while(y < wnd.height - squareSize) {
        val g = Graphics(wnd)
        g.setStrokeWidth(3)

        g.color = Pal16.blue

        g.clear()
        g.drawRect(x, y, squareSize, squareSize)
        g.close()

        y ++

        sleep(20)
    }
}

fun main() {
    task1()
}
