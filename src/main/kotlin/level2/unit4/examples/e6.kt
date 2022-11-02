/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/

package level2.unit4.examples

import com.anysolo.toyGraphics.*


private data class Ufo2(var x: Int, var y: Int)


fun main() {
    val wnd = Window(800, 600, buffered = true)
    val ufo = Ufo2(0, 0)

    // Load image before the main loop. It is a slow operation, and you do not need to repeat it.
    // Path to the file go from the top of your project
    val image = Image("graphicsFiles/ufo-small.png")

    // Use can access image width and height
    println(image.width)
    println(image.height)

    while (true) {
        ufo.x += 1

        val gc  = Graphics(wnd)
        gc.clear()
        gc.color = Pal16.red

        // Draw it almsot like a rectangular
        gc.drawImage(ufo.x, ufo.y, image)
        gc.close()

        sleep(10)
    }
}
