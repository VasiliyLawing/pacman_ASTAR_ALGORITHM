package level2.unit2.examples

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window
import com.anysolo.toyGraphics.sleep
import kotlin.math.pow
import kotlin.math.sqrt


/*
We can create a function returning some result.
Here we calculate distance between two two points.
We use "return" to return the result.
We also must declare the type of the result of our function ": Double" after function anme and arguments.
 */

fun calcDistance(p1: Pos, p2: Pos): Double {
    val xDelta = (p1.x - p2.x).toDouble()
    val yDelta = (p1.y - p2.y).toDouble()

    return sqrt(xDelta.pow(2) + yDelta.pow(2))
}


fun main() {
    val wnd = Window(1280, 720, buffered = true, background = Pal16.black)

    val dot1Pos = Pos(wnd.width/2, wnd.height/2)
    val blowRadius = 50
    val triggerDistance = 75

    var dot2Pos = Pos(0, 0)

    while(true) {
        val g = Graphics(wnd)
        g.setStrokeWidth(4)
        g.clear()

        g.color = Pal16.blue
        g.drawDot(dot1Pos.x, dot1Pos.y)

        g.color = Pal16.red
        g.drawDot(dot2Pos.x, dot2Pos.y)

        dot2Pos = Pos(dot2Pos.x + 2, dot2Pos.y + 1)

        val distance = calcDistance(dot1Pos, dot2Pos)

        if(distance < triggerDistance) {
            g.color = Pal16.brightRed
            g.drawOval(dot1Pos.x-blowRadius, dot1Pos.y-blowRadius, blowRadius*2, blowRadius*2)
        }

        g.color = Pal16.white
        g.drawText(50, wnd.height-100, "Distance: $distance")

        g.close()
        sleep(15)
    }
}
