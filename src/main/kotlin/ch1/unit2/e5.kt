package ch1.unit2

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window


fun main() {
    val wnd = Window(800, 600)

    var color = 0
    var y = 0

    val gc = Graphics(wnd)
    repeat(16) {
        gc.color = Pal16[color]
        gc.drawLine(0, y, wnd.width-1, y)

        y += 20
        color++
    }
}
