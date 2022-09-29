package level1.unit2.examples

import com.anysolo.toyGraphics.*
import kotlin.math.roundToInt


fun main() {
    val wnd = Window(800, 600, buffered = true)

    var x = 0

    while (true) {
        val gc = Graphics(wnd)
        gc.color = Pal16.blue
        gc.setStrokeWidth(5)

        gc.clear()
        gc.drawRect(x, 300, 100, 50, fill = true)
        gc.close()

        x ++

        sleep(10)
    }
}
