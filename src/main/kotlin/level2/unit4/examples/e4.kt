package level2.unit4.examples

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window
import com.anysolo.toyGraphics.sleep


fun main() {
    val wnd = Window(800, 600, buffered = true)

    val y = wnd.height/2
    var x = 0

    while(x < wnd.width-50) {
        // use "use" function to automatically call "close" function
        Graphics(wnd).use { gc ->
            gc.setStrokeWidth(3)
            gc.color = Pal16.blue

            gc.clear()
            gc.drawRect(x, y, 50, 10)

            x++
        }

        sleep(5)
    }
}
