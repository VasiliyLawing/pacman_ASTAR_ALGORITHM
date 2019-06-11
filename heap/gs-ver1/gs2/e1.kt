package ch1.gs2

import com.anysolo.toyGraphics.*


fun main() {
    val padding = 10

    // Object representing the window.
    // Y axis goes from up to down
    // X axis goes from left to right
    // This particular window will be 1280 x 720 pixels.
    val wnd = Window(1280, 720)

    // Object you use to draw on the window
    val gc = Graphics(wnd)

    // Drawing simple one pixel dots.
    // wnd.innerWidth and wnd.innerHeight contains width and height of the
    // inner window area. Inner area does dot include window title. This is space avalable
    // for your drawings.
    for(x in 0 until wnd.innerWidth - padding) {
        gc.drawDot(x, padding)

        // delay for 5ms after drawing each dot
        sleep(5)
    }

    for(y in 0 until wnd.innerHeight - padding) {
        gc.drawDot(padding, y)
        sleep(5)
    }
}
