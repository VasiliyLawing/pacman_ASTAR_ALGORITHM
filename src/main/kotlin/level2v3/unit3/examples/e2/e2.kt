/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/

package level2v3.unit3.examples.e2

import com.anysolo.toyGraphics.*

// We can import class from other package
import level2v3.unit3.examples.e1.Thingy


// We can pass thingy to functions.
private fun drawThingy(gc: Graphics, thingy: Thingy) {
    gc.color = thingy.color
    gc.drawRect(thingy.x, thingy.y, 10, 10, fill = true)
}


private fun moveThingy(thingy: Thingy) {
    thingy.x += thingy.speedX
    thingy.y += thingy.speedY
}


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

        drawThingy(gc, thingy1)
        drawThingy(gc, thingy2)

        gc.close()

        moveThingy(thingy1)
        moveThingy(thingy2)

        sleep(10)
    }
}
