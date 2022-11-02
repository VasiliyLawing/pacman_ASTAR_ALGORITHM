/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/

package level2.unit2.examples

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
    val key = keyboard.getPressedKey()

    if(key == null) {
        return xspeed
    }

    var newXspeed = xspeed

    when(key.code) {
        KeyCodes.LEFT -> newXspeed -= 0.1
        KeyCodes.RIGHT -> newXspeed += 0.1
    }

    return newXspeed
}


private fun limitSpeed(speed: Double): Double {
    var newSpeed = speed

    val speedLimit = 5.0

    if(newSpeed > speedLimit)
        newSpeed = speedLimit

    else if(newSpeed < -speedLimit)
        newSpeed = -speedLimit

    return newSpeed
}


fun main() {
    val wnd = Window(800, 600, buffered = true)
    val keyboard = Keyboard(wnd)

    var x = wnd.width / 2.0
    val y = wnd.height/2.0
    var xspeed = 0.0

    var tickCounter = 1.0

    while (true) {
        xspeed = processKeyboard(keyboard, xspeed)
        xspeed = limitSpeed(xspeed)

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
