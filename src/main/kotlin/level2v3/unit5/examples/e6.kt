/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/

package level2v3.unit5.examples

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window
import com.anysolo.toyGraphics.sleep


private data class Thingy(var x: Int, var y: Int)


fun main() {
    val wnd = Window(800, 600, buffered = true)

    val thingies = mutableListOf<Thingy>()
    val createNewEveryNFrames = 100
    var createNewCounter = createNewEveryNFrames
    val removeAtY = 400
    val thingySize = 10

    while (true) {
        val gc = Graphics(wnd)
        gc.clear()

        gc.color = Pal16.red
        gc.drawLine(0, removeAtY, wnd.width, removeAtY)

        for (oneThingy in thingies) {
            gc.color = Pal16.blue
            gc.drawRect(oneThingy.x, oneThingy.y, thingySize, thingySize, fill = true)
            oneThingy.y ++
        }

        gc.close()

        thingies.removeIf { it.y + thingySize > removeAtY }

        if(createNewCounter == 0) {
            createNewCounter = createNewEveryNFrames
            thingies.add(Thingy(wnd.width/2, 0))
        } else
            createNewCounter --

        sleep(10)
    }
}