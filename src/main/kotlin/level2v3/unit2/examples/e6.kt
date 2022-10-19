/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/

package level2v3.unit2.examples

import com.anysolo.toyGraphics.*
import kotlin.math.abs
import kotlin.math.roundToInt


private fun drawMyObject(gc: Graphics, x: Double, y: Double, tick: Int) {
    val baseSize = 1.0
    val tickLimit = 100
    val tickK = tick % tickLimit

    val width = baseSize * tickK
    val height = baseSize * (tickLimit - tickK)

    // Draw two ovals. Second ovals is kinda "flipped". So it uses height instead of width and width instead of height.
    gc.color = Pal16.blue
    gc.drawOval((x - width/2).roundToInt(), (y - height/2).roundToInt(),  width.roundToInt(), height.roundToInt())

    gc.color = Pal16.green
    gc.drawOval(
        (x - height/2).roundToInt(), (y - width/2).roundToInt(),
        height.roundToInt(), width.roundToInt()
    )

    val circleSize = baseSize * tickK / 10
    gc.color = Pal16.brightRed
    gc.drawOval(
        (x - circleSize/2).roundToInt(), (y - circleSize/2).roundToInt(),
        circleSize.roundToInt(), circleSize.roundToInt(), fill = true
    )
}


private fun processKeyboard(keyboard: Keyboard, xspeed: Double): Double {
    // shorter version using elvis operator
    val key = keyboard.getPressedKey() ?: return xspeed

    // using when expression instead of if
    return when(key.code) {
        KeyCodes.LEFT   -> xspeed - 0.1
        KeyCodes.RIGHT  -> xspeed + 0.1
        else            -> xspeed
    }
}


private fun limitSpeed(speed: Double): Double {
    val speedLimit = 5.0

    // using when expression instead of if
    return when {
        speed > speedLimit  -> speedLimit
        speed < -speedLimit -> -speedLimit
        else                -> speed
    }
}


fun main() {
    val wnd = Window(800, 600, buffered = true)
    val keyboard = Keyboard(wnd)

    var x = wnd.width / 2.0
    val y = wnd.height/2.0
    var xspeed = 0.0

    var tickCounter = 1.0

    while (true) {
        // give result of one function into another function
        xspeed = limitSpeed(processKeyboard(keyboard, xspeed))

        val gc = Graphics(wnd)
        gc.clear()

        drawMyObject(gc, x, y, tickCounter.roundToInt())

        gc.close()

        tickCounter += abs(xspeed) * 2

        x += xspeed

        if(x < 0 || x > wnd.width) {
            xspeed *= -1
        }

        sleep(5)
    }
}