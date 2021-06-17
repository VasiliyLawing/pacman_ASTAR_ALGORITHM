package level1.unit3.examples

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window

// Import sleep function
import com.anysolo.toyGraphics.sleep


fun main() {
    // Now we use Window in buffered mode.
    // In buffered mode all you draw will be kept in a buffer until you call function "close" from Graphics class.
    // Read about double buffering in computer graphics.
    val wnd = Window(800, 600, buffered = true)

    val y = wnd.height/2

    // Define a variable "x"
    // Variable is is like a value except you can reassign it a different value any time.
    // You use variable ("var") only if you need to reassign the value.
    // If you are not sure, always try to use values ("val").
    var x = 0

    // Loop in programming repeats a block of code.
    // Kotlin provides many ways to make a loop. Here we use "while"

    // Loop redraws the frame, waiting 5 milliseconds and repeat it again
    // Usually a loop has some condition to decide when it stops.
    // Here the loop stops if "x" becomes less than inner width of the window
    while(true) {
        // In buffered window, we have to create new Graphics object before drawing each frame
        val gc = Graphics(wnd)

        // setting width and color of the line
        gc.setStrokeWidth(3)
        gc.color = Pal16.blue

        gc.clear()
        gc.drawRect(x, y, 50, 10)

        // add one to value variable x and reassign it back.
        x = x + 1

        // You can rewrite the previous line as:
        // x += 1 or just x++

        // The best way would be to write here
        // x++ instead of x = x + 1

        // You have to "close" Graphic object to see what you drawn on the window
        gc.close()

        // Program will sleep for 5 milliseconds.
        // We need it to give our eyes some time to see the image.
        // It also reduces CPU usage and power consumption.
        // Google "computer CPU" if you do not know what it is.
        // You should call sleep function AFTER gc.close(), otherwise it will be flickering.
        sleep(5)
    }
}
