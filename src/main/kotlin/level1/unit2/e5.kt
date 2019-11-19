package level1.unit2

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window
import kotlin.random.Random


fun main() {
    val wnd = Window(800, 600)
    val g = Graphics(wnd)
    g.color = Pal16.blue

    while (true) {
        // You can use Random.nextInt to get a random number between to given limits.
        val x = Random.nextInt(0, wnd.width)
        val y = Random.nextInt(0, wnd.height)

        // Uncomment if you want to print a and y on the console.
        //println("x = $y, y = $y")

        // Uncomment these two lines to also change color randomly.
        //val color = Random.nextInt(0, 15)
        //g.color = Pal16[color]

        // Drawing one pixel at the random coordinates
        g.drawDot(x, y)
    }
}
