package ch1.unit2

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window


fun main() {
    val wnd = Window(800, 600)
    val g = Graphics(wnd)
    g.color = Pal16.blue

    // Let's try to change x and y simultaneously.
    var x = 0
    var y = 0

    // You create more complex condition using && and ||.
    // "&&" means "and". "||" means "or".
    while (x < wnd.width && y < wnd.height) {
        // Look at the console to see how x and y are changing.
        println("x = $y, y = $y")

        // You can see a nice variation if you change width and height from 25 to 50.
        g.drawRect(x, y, 25, 25, fill = true)

        x += 50
        y += 35
    }
}
