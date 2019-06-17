package ch1.s2


// We have to import roundToInt before we can use it.
// But if you comment this line out you see IDEA offer you to insert this import automatically
import kotlin.math.roundToInt

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Window
import com.anysolo.toyGraphics.sleep


/*
Here we use more variables to add more dynamic to our example. Read the code carefully.
Understand what happens here. Debug it if you need it to understand how it works.
*/

fun main() {
    val wnd = Window(1920, 1080, buffered = true)

    val particleWidth = 10
    val initialParticleHeight = 5

    // we use Double type for more precise calculation
    var growK = 1.0

    for (x in 0 .. wnd.innerWidth - particleWidth - 1) {
        val gc = Graphics(wnd)

        gc.setStroke(3.0)
        gc.setColor(1)

        gc.clear()

        // The next arithmetic expression uses Double variable "growK"
        // The result of initialParticleHeight * growK is a Double value.
        // Coordinates are Int, so we call Double.rountToInt function to make the conversion.
        val particleHeight = (initialParticleHeight * growK).roundToInt()

        gc.drawRect(x, wnd.innerHeight/2 - particleHeight/2, particleWidth, particleHeight)

        gc.close()

        sleep(10)
        growK += 0.08
    }
}
