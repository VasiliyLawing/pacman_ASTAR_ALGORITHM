package ch1.s3


import com.anysolo.toyGraphics.*


fun main() {
    val wnd = Window(1920, 1080, buffered = true)

    val objectHeight = 10
    val objectWidth = 50

    var speed = 0
    var x = 0
    val y = wnd.innerHeight - objectHeight * 2

    val keyboard = Keyboard(wnd)

    while (true) {
        val gc = Graphics(wnd)

        gc.setStroke(3.0)
        gc.setColor(1)

        gc.clear()

        x += speed
        gc.drawRect(x, y, objectWidth, objectHeight)

        gc.close()

        // Sleep for 33 milliseconds gives something about 30 frames per second.
        sleep(33)

        val key = keyboard.getPressedKey()

        // The next line will be executed only if the key == null, meaning there is no any pressed key to process
        if(key == null)
        // keyword "continue" cause the program to jump to the beginning og the loop
        // Here it means after executing the next line it is going to execute
        // the first line after "while". Check it in debugger by setting a break point on "continue"
            continue

        println("${key.code}, " + 'q'.toInt().toString())

        // Stop the loop if user pressed 'q'
        if(key.code == 'Q'.toInt())
            // Next thing computer does will be printing "The End"
            break

        when(key.code) {
            Key.K_LEFT -> speed -= 1
            Key.K_RIGHT -> speed += 1
        }
    }

    println("The End")
}
