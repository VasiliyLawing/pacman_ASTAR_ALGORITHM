package ch1.s3

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Window

// Import sleep function
import com.anysolo.toyGraphics.sleep


fun main() {
    val wnd = Window(1920, 1080, buffered = true)

    val y = wnd.innerHeight/2
    var x = 1
    var speed =1

    while(true) {
        val gc = Graphics(wnd)

        // setting width and color of the line
        gc.setStroke(3.0)
        gc.setColor(1)

        gc.clear()
        gc.drawRect(x, y, 50, 10)

        gc.close()

        if(x == 0 || x == wnd.innerWidth)
            speed = -speed

        x += speed

        sleep(5)
    }
}
