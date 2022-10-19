/*******************************************************************************
 * Copyright (c) 2019-2022.  Anysolo LLC
 ******************************************************************************/


package level1.unit4.examples
import com.anysolo.toyGraphics.*


fun main() {
    val wnd = Window(800, 600, buffered = true)

    val y = wnd.height/2
    var x = wnd.width/2
    var speed = 0

    // Here we use a Boolean variable to terminate the loop
    // Boolean variable may be either true or false
    var needToExit = false

    val keyboard = Keyboard(wnd)

    while(!needToExit) {
        val key = keyboard.getPressedKey()

        if(key != null) {
            // You use "when" to make complex conditions clean and simple
            when(key.code) {
                'Q'.toInt() ->
                    needToExit = true

                KeyCodes.LEFT ->
                    speed--

                KeyCodes.RIGHT ->
                    speed ++
            }
        }

        val gc = Graphics(wnd)

        gc.setStrokeWidth(3)
        gc.color = Pal16.blue

        gc.clear()
        gc.drawRect(x, y, 50, 10)

        gc.close()

        x += speed

        if(x < 0) {
            x = wnd.width - 1
        }
        else if (x >= wnd.width) {
            x = 0
        }

        sleep(5)
    }

    println("The End")
    wnd.close()
}
