/*******************************************************************************
 * Copyright (c) 2019-2022.  Anysolo LLC
 ******************************************************************************/


package level2v2.unit3.examples.e1

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window
import com.anysolo.toyGraphics.sleep
import kotlin.random.Random


private data class Thingy(var x: Int, var y: Int)


fun main() {
    val allNumbers = listOf(11, 100, 300)
    for (one in allNumbers) {
        println(one)
    }


    val wnd = Window(1280, 720, buffered = true, background = Pal16.black)

    val list = mutableListOf<Thingy>()

    var growCounter = 0

    while(true) {
        val g = Graphics(wnd)
        g.color = Pal16.brightBlue
        g.setStrokeWidth(3)

        g.clear()

        for (o in list) {
            g.drawDot(o.x, o.y)

            o.x++
        }

        if(growCounter-- == 0) {
            list.add(Thingy(0, Random.nextInt(0, wnd.height)))
            growCounter = 5
        }

        g.close()

        sleep(30)
    }
}
