package ch1.unit3

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window

// Import sleep function
import com.anysolo.toyGraphics.sleep


fun main() {
    val wnd = Window(1920, 1080, buffered = true)

    val y = wnd.height/2
    var x = 1
    var speed =1

    while(true) {
        val gc = Graphics(wnd)
        gc.clear()

        gc.setStrokeWidth(3)
        gc.color = Pal16.blue

        gc.drawRect(x, y, 50, 10)

        gc.close()

        // Here we use "if" without "else". It either executes one given line of code or nothing.
        if(x == 0 || x == wnd.width)
            speed = -speed

        x += speed

        sleep(5)
    }
}
