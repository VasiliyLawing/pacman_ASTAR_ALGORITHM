package ch1.unit2

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Window
import com.anysolo.toyGraphics.sleep


fun main() {
    val wnd = Window(1920, 1080, buffered = true)

    val y = wnd.innerHeight/2

    // Now we use loop "for" which allows to write simpler and cleaner code
    // "for" creates variable "x"
    // Google "kotlin loop for", "Kotlin int range"
    for (x in 0 .. wnd.innerWidth) {
        val gc = Graphics(wnd)

        gc.setStroke(3.0)
        gc.setColor(1)

        gc.clear()
        gc.drawRect(x, y, 50, 10)

        sleep(5)

        gc.close()
    }

    // Try to uncomment the next line
    // println(x)
    // Kotlin shows the error, because variable "x" visible only inside the loop.
    // When you define a name, like value or variable, it visible only inside "{}" enclosing the block of code.
}
