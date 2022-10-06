/*******************************************************************************
 * Copyright (c) 2019-2022.  Anysolo LLC
 ******************************************************************************/


package level1.unit4.examples
import com.anysolo.toyGraphics.*

// See how you can limit speed of the racket using Kotlin "if expression"
// Look at the code between "NEW" and "END NEW" comments

fun main() {
    val wnd = Window(800, 600, buffered = true)

    val rocketWidth = 50
    val rocketHeight = 10
    val y = wnd.height - 20
    var x = wnd.width/2
    var rocketSpeed = 0
    val maxRocketSpeed = 10
    var needToExit = false

    val keyboard = Keyboard(wnd)

    var bulletX = 0
    var bulletY = 0
    var bulletFlying = false
    val bulletHeight = 10
    val bulletWidth = 6
    val bulletSpeed = 5

    while(!needToExit) {
        val key = keyboard.getPressedKey()

        if(key != null) {
            when(key.code) {
                'Q'.toInt() ->
                    needToExit = true

// NEW -------------------------
                KeyCodes.LEFT ->
                    rocketSpeed = if(rocketSpeed > -maxRocketSpeed) rocketSpeed-1 else -maxRocketSpeed

                KeyCodes.RIGHT ->
                    rocketSpeed = if(rocketSpeed < maxRocketSpeed) rocketSpeed+1 else maxRocketSpeed
// END NEW ---------------------

                KeyCodes.SPACE -> {
                    bulletFlying = true
                    bulletX = x + rocketWidth/2
                    bulletY = y
                }
            }
        }

        val gc = Graphics(wnd)

        gc.setStrokeWidth(3)
        gc.color = Pal16.blue

        gc.clear()
        gc.drawRect(x, y, rocketWidth, rocketHeight)

        if(bulletFlying) {
            gc.drawRect(bulletX, bulletY, bulletWidth, bulletHeight)
            bulletY -= bulletSpeed

            if(bulletY < -bulletHeight)
                bulletFlying = false
        }

        gc.close()

        x += rocketSpeed

        if(x < 0)
            x = wnd.width - 1

        else if (x >= wnd.width)
            x = 0

        sleep(10)
    }

    println("The End")
    wnd.close()
}
