/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/

package level2.unit3.examples.e1

import com.anysolo.toyGraphics.*


// Data class combines several variables together.
// Data class is not a variable, it is like a blueprint you use to create variables.
// For every variable you have to specify its type after ":"
// BTW a data class is a "type".
data class Thingy(var x: Int, var y: Int, var speedX: Int, var speedY: Int, val color: Color)


fun main() {
    val wnd = Window(800, 600, buffered = true)

    // Here we create two variables using the same data class.
    // Those variables will have exactly the same set of variables.
    // We create a variable using name of data class like a function.
    val thingy1 = Thingy(
        wnd.width/2, wnd.height/2,
        1, 1,
        Pal16.blue
    )

    val thingy2 = Thingy(
        wnd.width/2, wnd.height/2,
        -1, -1,
        Pal16.green
    )

    while (true) {
        val gc = Graphics(wnd)
        gc.clear()

        // You can access any variables inside our variables using "."
        gc.color = thingy1.color
        gc.drawRect(thingy1.x, thingy1.y, 10, 10, fill = true)

        gc.color = thingy2.color
        gc.drawRect(thingy2.x, thingy2.y, 10, 10, fill = true)

        gc.close()

        thingy1.x += thingy1.speedX
        thingy1.y += thingy1.speedY

        thingy2.x += thingy2.speedX
        thingy2.y += thingy2.speedY

        sleep(10)
    }
}
