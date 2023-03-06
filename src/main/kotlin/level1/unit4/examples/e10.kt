/*******************************************************************************
 * Copyright (c) 2023.  Anysolo LLC
 ******************************************************************************/

package level1.unit4.examples

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window
import com.anysolo.toyGraphics.sleep
import kotlin.math.roundToInt
import kotlin.random.Random

fun main() {
    val wnd = Window ( 800, 600, buffered = true )

    var squareX = wnd.width/2
    var squareY = wnd.height/2
    var squareSize = 1.0

    var speedX = 1
    var speedY = 1

    var amountOfLines = 10.0

    while (true) {
        val gr = Graphics(wnd)
        gr.clear()

        repeat(amountOfLines.roundToInt()) {
            val x = Random.nextInt(squareX, squareX + squareSize.roundToInt())
            val y = Random.nextInt(squareY, squareY + squareSize.roundToInt())
            val x2 = Random.nextInt(squareX, squareX + squareSize.roundToInt())
            val y2 = Random.nextInt(squareY, squareY + squareSize.roundToInt())

            val color = Random.nextInt(0, 15)
            gr.color = Pal16[color]

            gr.drawLine(x, y2, x2, y)
        }

        squareX += speedX
        squareY += speedY

        if(Random.nextInt(0, 100) == 0) {
            if(Random.nextInt(0, 2) == 0)
                speedX = -1
            else
                speedX = 1

            if(Random.nextInt(0, 2) == 0)
                speedY = -1
            else
                speedY = 1
        }

        if(squareX < 0) {
            squareX = 0
            speedX *= -1
        }
        else if(squareX > wnd.width - squareSize) {
            squareX = wnd.width - squareSize.roundToInt()
            speedX *= -1
        }

        if(squareY < 0) {
            squareY = 0
            speedY *= -1
        }
        else if(squareY > wnd.height - squareSize) {
            squareY = wnd.height - squareSize.roundToInt()
            speedY *= -1
        }

        gr.close()

        squareSize += 0.1
        amountOfLines += 0.1

        sleep(20)
    }
}