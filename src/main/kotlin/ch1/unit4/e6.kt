package ch1.unit4

import com.anysolo.toyGraphics.*


// Try how it works pressing left and right arrows and space keys.

fun main() {
    val wnd = Window(800, 600, buffered = true)

    val rocketWidth = 50
    val rocketHeight = 10
    val y = wnd.height - 20
    var x = wnd.width/2
    var speed = 0
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

                KeyCodes.LEFT ->
                    speed--

                KeyCodes.RIGHT ->
                    speed ++

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

        x += speed

        if(x < 0)
            x = wnd.width - 1

        else if (x >= wnd.width)
            x = 0

        sleep(10)
    }

    println("The End")
    wnd.close()
}
