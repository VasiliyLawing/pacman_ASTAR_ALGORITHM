package level1.unit4.examples

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window

// Import sleep function
import com.anysolo.toyGraphics.sleep


fun main() {
    val wnd = Window(800, 600, buffered = true)

    val y = wnd.height/2
    var x = 1
    var speed =10

    val racketHeight = 10
    val racketWidth = 50

    while(true) {
        val gc = Graphics(wnd)
        gc.clear()

        gc.setStrokeWidth(3)
        gc.color = Pal16.blue

        gc.drawRect(x, y, racketWidth, racketHeight)

        gc.close()

        // Here we use "if" without "else". It either executes one given line of code or nothing.
        if(x == 0 || x == wnd.width - racketWidth)
            speed = -speed // unary operator "-" convert positive speed into negative and negative into positive

        x += speed

        sleep(5)
    }
}
