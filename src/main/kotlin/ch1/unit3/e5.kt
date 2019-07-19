package ch1.unit3

import com.anysolo.toyGraphics.*


fun main() {
    val wnd = Window(1920, 1080, buffered = true)

    val y = wnd.innerHeight/2
    var x = wnd.innerWidth/2
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

        gc.setStroke(3.0)
        gc.setColor(1)

        gc.clear()
        gc.drawRect(x, y, 50, 10)

        gc.close()

        x += speed

        if(x < 0)
            x = wnd.innerWidth - 1

        else if (x >= wnd.innerWidth)
            x = 0

        sleep(5)
    }

    println("The End")
    wnd.close()
}
