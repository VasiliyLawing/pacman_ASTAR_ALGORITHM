package ch1.s1


import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Window


fun main() {
    val wnd = Window(1920, 1080)

    val gc = Graphics(wnd)

    gc.setStroke(3.0)
    gc.setColor(1)

    // Do not forget you can use arithmetic expression anywhere instead of values.
    gc.drawLine(wnd.innerWidth/3, 0, wnd.innerWidth/3, wnd.innerHeight-1)
    gc.drawLine(wnd.innerWidth*2/3, 0, wnd.innerWidth*2/3, wnd.innerHeight-1)
}
