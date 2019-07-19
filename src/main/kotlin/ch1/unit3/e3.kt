package ch1.unit3


import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Keyboard
import com.anysolo.toyGraphics.Window
import com.anysolo.toyGraphics.sleep


fun main() {
    val wnd = Window(1920, 1080, buffered = true)

    val y = wnd.innerHeight/2
    var x = 1
    var speed = 1

    // This object allows you to receive data from keyboard.
    val keyboard = Keyboard(wnd)

    while(true) {
        // We save a pressed key as an object "key".
        // Keyboard has a queue of pressed keys.
        // If the queue is empty we get nothing.
        // In Kotlin a value or variable can be nullable.
        // Nullable variable can contain "null" value, which means it does not have any value.
        val key = keyboard.getPressedKey()

        // Process a key if variable "key" is not null
        // We use {} block when we have more then one line of code inside "if".
        if(key != null) {
            // exit from the loop if key 'Q' was pressed.
            // 'Q' is a Character, key.code is an Integer. So we need to convert 'Q' to an Integer
            // before we can compare it with key.code
            if (key.code == 'Q'.toInt())
                break // "break" stop the current loop and executes the next line after the end of the loop
        }

        val gc = Graphics(wnd)

        gc.setStroke(3.0)
        gc.setColor(1)

        gc.clear()
        gc.drawRect(x, y, 50, 10)

        gc.close()

        if(x == 0 || x == wnd.innerWidth)
            speed = -speed

        x += speed

        sleep(5)
    }

    println("The End")

    // If we close the window the program will stop after we exit from main
    // Otherwise it would wait you to close the window using mouse.
    wnd.close()
}
