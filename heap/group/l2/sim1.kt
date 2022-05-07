package level2.group

import com.anysolo.toyGraphics.*
import kotlin.math.roundToInt
import kotlin.random.Random


data class Thingy(var x: Double, var y: Double, var speedX: Double, var speedY: Double, val color: Color, var ttl: Int = 0)


fun main() {
    val speedDelta = 0.1

    val wnd = Window(800, 600, buffered = true, background = Pal16.black)
    val everything = mutableListOf<Thingy>()

    var counter = 0

    while (true) {
        val gc = Graphics(wnd)
        gc.clear()

        gc.color = Pal16.red

        if(counter++ % (1..33).random() == 0) {
            everything.add(
                Thingy(
                    x = wnd.width / 2.0,
                    y = wnd.height / 2.0,
                    speedX = Random.nextDouble(-speedDelta, speedDelta),
                    speedY = Random.nextDouble(-speedDelta, speedDelta),
                    color = Pal16[(0..15).random()]
                )
            )
        }

        if(counter++ % (1..33).random() == 0) {
            val oldObjects = everything.filter { it.ttl > 200 }

            if (oldObjects.isNotEmpty())
                everything.remove(oldObjects.random())
        }

        for (o in everything) {
            o.x += o.speedX
            o.y += o.speedY
            o.ttl++

            gc.color = o.color
            gc.drawRect(o.x.roundToInt(), o.y.roundToInt(), 10, 10, fill = true)
        }

        gc.close()
        sleep(5)
    }
}