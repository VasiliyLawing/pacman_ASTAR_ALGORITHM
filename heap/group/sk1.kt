package level1.group

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window
import com.anysolo.toyGraphics.sleep
import kotlin.random.Random


fun main() {
    val wnd = Window(800, 600, buffered = true)

    val data = IntArray(8)

    val y = wnd.height/2
    var startX = 0
    val elWidth = 50
    val elHeight = 10
    val elDist = 10
    var counter = 0

    while(true) {
        if(counter % 10 == 0) {
            for (i in data.indices) {
                data[i] = Random.nextInt(0, 2)
            }
        }

        counter++

        Graphics(wnd).use { gc ->
            gc.setStrokeWidth(3)
            gc.color = Pal16.blue

            gc.clear()

            for(i in data.indices) {
                if(data[i] != 0)
                    gc.drawRect(startX + i * (elWidth + elDist), y, elWidth, elHeight, fill = true)
            }
        }

        sleep(20)
    }
}
