package ch1.gs2

import com.anysolo.toyGraphics.*


fun main() {
    val wnd = Window(1280, 720, buffered = true)

    var speed = 5
    val squareSize = 50

    val x = wnd.innerWidth/2
    var y = 0

    while(y < wnd.innerHeight - squareSize) {
        // Slow the square before the touchdown ;)
        if(wnd.innerHeight - y == 100)
            speed = 1

        y += speed

        val gc = Graphics(wnd)
        gc.drawRect(x, y, squareSize, squareSize)
        gc.close()

        sleep(100)
    }
}
