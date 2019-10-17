package ch1.unit1


import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window


fun main() {
    val wnd = Window(800, 600)

    val gc = Graphics(wnd)

    gc.setStrokeWidth(3)
    gc.color = Pal16.blue

    // Do not forget you can use arithmetic expression anywhere instead of values.
    gc.drawLine(wnd.width/3, 0, wnd.width/3, wnd.height-1)
    gc.drawLine(wnd.width*2/3, 0, wnd.width*2/3, wnd.height-1)
}
