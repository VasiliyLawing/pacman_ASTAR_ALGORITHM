package ch1.s2

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Window

// Import sleep function
import com.anysolo.toyGraphics.sleep


fun main() {
    // Window in buffered mode. Read about double buffering graphics
    // In buffered mode all you draw will be kept in a buffer until you call function "close"
    // from Graphics object.
    val wnd = Window(1920, 1080, buffered = true)

    val y = wnd.innerHeight/2

    // define a variable "x"
    // variable is is like a value except you can reassign a different value any time
    // You variable only if you need to reassign the value. If you not sure, always try to use values
    var x = 0

    // Loop in programming repeats a block of code.
    // Here we use loop "while"

    // Loop redrawing frames, waiting 5 milliseconds and repeat it again
    // Loop stops if x becomes less than inner width of the window
    while(x < wnd.innerWidth) {
        // We have to create new Graphics object before drawing each frame
        val gc = Graphics(wnd)

        // setting width and color of the line
        gc.setStroke(3.0)
        gc.setColor(1)

        gc.clear()
        gc.drawRect(x, y, 50, 10)

        // add one to value variable x and reassign it back.
        x = x + 1

        // You can rewrite the previous line as:
        // x += 1 or just x++

        // The best way would be to write here
        // x++ instead of x = x + 1

        sleep(5)

        // You have to "close" Graphic object to see what you drawn on the window
        gc.close()
    }
}
