package ch1.s2

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
}
