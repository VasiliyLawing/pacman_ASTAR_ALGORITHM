package ch1.unit3

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window
import com.anysolo.toyGraphics.sleep


fun main() {
    val wnd = Window(800, 600, buffered = true)

    val y = wnd.height/2

    // Now we use loop "for" which allows to write simpler and cleaner code
    // "for" creates variable "x"
    // Google "kotlin loop for", "Kotlin int range"
    for (x in 0 .. wnd.width) {
        val gc = Graphics(wnd)

        gc.setStrokeWidth(3)
        gc.color = Pal16.blue

        gc.clear()
        gc.drawRect(x, y, 50, 10)

        gc.close()

        sleep(5)
    }

    // Try to uncomment the next line
    // println(x)
    // Kotlin shows the error, because variable "x" visible only inside the loop.
    // When you define a name, like value or variable, it visible only inside "{}" enclosing the block of code.
}
