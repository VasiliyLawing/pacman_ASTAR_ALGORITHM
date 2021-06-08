package level1.unit2.group.y1

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Window
import com.anysolo.toyGraphics.sleep


fun main() {
    val wnd = Window(800, 600, buffered = true)

    var bulletX = wnd.width/2
    var bulletY = wnd.height-1

    while (bulletY >= 0) {
        val gc = Graphics(wnd)
        gc.setStrokeWidth(3)
        gc.clear()

        gc.drawRect(bulletX, bulletY, 10, 10)

        bulletY--

        println("BulletX=$bulletX, bulletY=$bulletY")

        gc.close()

        sleep(10)
    }
}
