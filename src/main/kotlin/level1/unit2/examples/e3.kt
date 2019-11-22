package level1.unit2.examples

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Window


fun main() {
    val wnd = Window(800, 600)
    val gc = Graphics(wnd)

    // Let's create a variable to count how many lines we draw
    // You can use and change many variables in one loop.
    var counter = 0

    var y = 50
    while (y < 600) {
        println("y = $y")
        gc.drawLine(0, y, 799, y)

        y += 50
        counter++ // ++ does the same as counter += 1
    }

    println("We drawn: $counter lines!")
}
