/*******************************************************************************
 * Copyright (c) 2019-2022.  Anysolo LLC
 ******************************************************************************/


package level2.unit6.examples.e9.step2


import com.anysolo.toyGraphics.*
import kotlin.math.roundToInt
import kotlin.random.Random


private val flyierSize = 10

private data class Thingy(var x: Int, var y: Int)

private data class Flyier(var x: Double, var y: Double, var leftBoost: Double = 0.0)


private fun isCollision(flyier: Flyier, thingy: Thingy): Boolean =
    thingy.x > flyier.x && thingy.x < flyier.x + flyierSize &&
    thingy.y > flyier.y && thingy.y < flyier.y + flyierSize


private fun limitFlier(flyier: Flyier, ymax: Double) {
    if(flyier.y < 0)
        flyier.y = 0.0

    if(flyier.y > ymax)
        flyier.y = ymax
}

private fun updateFlyierBoost(flyier: Flyier) {
    flyier.leftBoost += 0.1
    if(flyier.leftBoost > 10)
        flyier.leftBoost = 10.0
}

fun main() {
    val wnd = Window(1280, 720, buffered = true, background = Pal16.black)
    val keyboard = Keyboard(wnd)

    val flyier = Flyier(wnd.width.toDouble() - flyierSize - 1, wnd.height.toDouble() / 2)

    val list = mutableListOf<Thingy>()

    var growCounter = 0
    var sleep = 30.0
    val finishLineX = wnd.width/10

    while(true) {
        val key = keyboard.getPressedKey()
        if(key != null) {
            when(key.code) {
                KeyCodes.UP -> flyier.y --
                KeyCodes.DOWN -> flyier.y ++
                KeyCodes.LEFT -> {
                    flyier.x -= flyier.leftBoost
                    flyier.leftBoost = 0.0
                }
            }

            limitFlier(flyier, wnd.height - flyierSize - 1.0)
        }

        val g = Graphics(wnd)
        g.color = Pal16.brightBlue

        g.clear()

        if(flyier.x <= finishLineX) {
            g.drawText(wnd.width/3, wnd.height/2, "You Won")
            g.close()
            sleep(5000)
            break
        }

        if(flyier.x >= wnd.width- flyierSize) {
            g.drawText(wnd.width/3, wnd.height/2, "You lost")
            g.close()
            sleep(5000)
            break
        }

        g.drawText(wnd.width - 100, 50, "left boost: ${flyier.leftBoost.roundToInt()}")

        flyier.x -= 0.1
        updateFlyierBoost(flyier)

        g.color = Pal16.brightGreen
        g.drawLine(finishLineX, 0,finishLineX, wnd.height-1)

        g.setStrokeWidth(3)
        for (o in list) {
            g.color = Pal16.brightBlue
            g.drawDot(o.x, o.y)
            o.x++

            if(isCollision(flyier, o)) {
                val blastSize = 50
                g.color = Pal16.brightRed
                g.drawOval(o.x-blastSize/2, o.y-blastSize/2, blastSize, blastSize, fill = true)
                flyier.x += 100
            }
        }

        if(growCounter-- == 0) {
            list.add(Thingy(0, Random.nextInt(0, wnd.height)))
            growCounter = 5

            sleep -= 0.01
            if(sleep < 1)
                sleep = 1.0
        }

        g.color = Pal16.brightGreen
        g.drawRect(flyier.x.roundToInt(), flyier.y.roundToInt(), flyierSize, flyierSize)

        g.close()

        sleep(sleep.roundToInt())
    }
}
