/*******************************************************************************
 * Copyright (c) 2019-2022.  Anysolo LLC
 ******************************************************************************/


package level2v3.unit2.examples

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window
import com.anysolo.toyGraphics.sleep
import kotlin.math.pow
import kotlin.math.sqrt


private fun calcDistance(x1: Int, y1: Int, x2: Int, y2: Int): Double {
    val xDelta = (x1 - x2).toDouble()
    val yDelta = (y1 - y2).toDouble()

    return sqrt(xDelta.pow(2) + yDelta.pow(2))
}


fun main() {
    val wnd = Window(1280, 720, buffered = true, background = Pal16.black)

    val dot1X = wnd.width/2
    val dot1Y = wnd.height/2

    var dot2X = 0
    var dot2Y = 0

    val blowRadius = 50
    val triggerDistance = 75

    while(true) {
        val g = Graphics(wnd)
        g.setStrokeWidth(4)
        g.clear()

        g.color = Pal16.blue
        g.drawDot(dot1X, dot1Y)

        g.color = Pal16.red
        g.drawDot(dot2X, dot2Y)

        dot2X += 2
        dot2Y += 1

        val distance = calcDistance(dot1X, dot1Y, dot2X, dot2Y)

        if(distance < triggerDistance) {
            g.color = Pal16.brightRed
            g.drawOval(dot1X - blowRadius, dot1Y - blowRadius, blowRadius*2, blowRadius*2)
        }

        g.color = Pal16.white
        g.drawText(50, wnd.height-100, "Distance: $distance")

        g.close()
        sleep(15)
    }
}
