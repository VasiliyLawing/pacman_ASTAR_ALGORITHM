package ch1.gs2

import com.anysolo.toyGraphics.*


fun main() {
    // with buffered = true all your drawing will be kept in buffered
    // until you call gc.close(). It increases speed of the drawing and
    // prevents flickering of the screen.
    val wnd = Window(1280, 720, buffered = true)

    val speed = 5
    val squareSize = 50
    val x = wnd.innerWidth/2

    var y = 0

    while(y < wnd.innerHeight - squareSize) {
        y += speed

        val gc = Graphics(wnd)
        gc.drawRect(x, y, squareSize, squareSize)
        gc.close()

        sleep(100)
    }
}
