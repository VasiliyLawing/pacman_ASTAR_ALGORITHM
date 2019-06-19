package ch1.s3


import com.anysolo.toyGraphics.*


fun main() {
    val wnd = Window(1920, 1080, buffered = true)

    val y = wnd.innerHeight/2
    var x = 1
    var speed = 1

    val keyboard = Keyboard(wnd)

    while(true) {
        val key = keyboard.getPressedKey()

        if(key != null) {
            if (key.code == 'Q'.toInt())
                break

            if(key.code == Key.K_LEFT)
                speed --
            else
                if(key.code == Key.K_RIGHT)
                    speed ++
        }

        val gc = Graphics(wnd)

        // setting width and color of the line
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
