package level1.unit1.examples


import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window
import kotlin.math.roundToInt


fun main() {
    val wnd = Window(800, 600)

    val g = Graphics(wnd)
    g.setStrokeWidth(3)

    // Surprise! You won't see this line at all.
    g.color = Pal16.red
    g.drawLine(2/3 * wnd.width, 0, 2/3 * wnd.width, wnd.height-1)

    // We print the value of the calculation for on the console. Look at it.
    val problematicX = 2/3 * wnd.width
    println("problematicX = $problematicX")

    g.color = Pal16.blue
    g.drawLine((2.0/3 * wnd.width).roundToInt(), 0, (2.0/3 * wnd.width).roundToInt(), wnd.height-1)

    val correctX = 2.0/3 * wnd.width
    println("correctX = $correctX")

    println("rounded correctX = ${correctX.roundToInt()}")

    // Why the same calculation worked fined without roundToInt() in e7 example?
}
