package level1.unit1.examples


import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window


fun main() {
    val wnd = Window(800, 600)

    val g = Graphics(wnd)
    g.setStrokeWidth(3)
    g.color = Pal16.blue

    // Do not forget you can use arithmetic expression anywhere instead of values.
    g.drawLine(wnd.width/3, 0, wnd.width/3, wnd.height-1)
    g.drawLine(wnd.width*2/3, 0, wnd.width*2/3, wnd.height-1)
}
