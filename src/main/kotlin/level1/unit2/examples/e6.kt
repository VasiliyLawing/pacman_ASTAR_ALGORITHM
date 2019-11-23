package level1.unit2.examples

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window
import kotlin.math.roundToInt

/*
Here we draw graphics of different mathematical functions.
 */

fun main() {
    val wnd = Window(800, 600, background = Pal16.black)
    val g = Graphics(wnd)
    g.color = Pal16.brightRed

    var x = 0.0

    while (x < wnd.width) {
        // Try to uncomment one of the following 4 lines at a time and see how it works.
        // Try to change numbers in this formulas.
        val y = x * 0.8
//        val y = x * x / 100
//        val y = 1 / x * 10000
//        val y = cos(x/50) * 200 + 300

        // Look on the console to see how x and y are changing.
        println("x=$x, y=$y")

        // We call roundToInt() to convert floating number into integer
        // We passing wnd.height - y as y to flip y coordinate.
        // Y coordinate going up is more convenient when working with mathematical functions.
        g.drawDot(x.roundToInt(), wnd.height - y.roundToInt())

        x += 0.1
    }
}
