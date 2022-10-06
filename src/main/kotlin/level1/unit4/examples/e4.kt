/*******************************************************************************
 * Copyright (c) 2019-2022.  Anysolo LLC
 ******************************************************************************/


package level1.unit4.examples
import com.anysolo.toyGraphics.*


// Try how it works by pressing left and right arrow keys.

fun main() {
    val wnd = Window(800, 600, buffered = true)

    val y = wnd.height/2
    var x = wnd.width/2
    var speed = 0

    val keyboard = Keyboard(wnd)

    while(true) {
        val key = keyboard.getPressedKey()

        // Use {} block to conditionally execute many lines of code
        if(key != null) {
            if (key.code == 'Q'.toInt())
                break

            // If you start typing "KeyCodes."
            // You see various key codes you can use

            // See how you can move the object pressing left and right arrows.
            if(key.code == KeyCodes.LEFT)
                speed --
            else
                if(key.code == KeyCodes.RIGHT)
                    speed ++
        }

        val gc = Graphics(wnd)

        gc.setStrokeWidth(3)
        gc.color = Pal16.blue

        gc.clear()
        gc.drawRect(x, y, 50, 10)

        gc.close()

        x += speed

        // Loop the motion in both directions
        if(x < 0)
            x = wnd.width - 1

        else if (x >= wnd.width)
            x = 0

        sleep(5)
    }

    println("The End")
    wnd.close()
}
