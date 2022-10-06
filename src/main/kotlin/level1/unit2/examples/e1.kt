/*******************************************************************************
 * Copyright (c) 2019-2022.  Anysolo LLC
 ******************************************************************************/


package level1.unit2.examples

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Window


fun main() {
    val wnd = Window(800, 600)
    val gc = Graphics(wnd)

    // We give a name "y" to integer number 100
    // But we use "var" instead of "val".
    // It means we create a variable "y" and assign number 100 to it.
    // Variable allows to change its content as many times as you want.
    // It is like a box where you store something.
    var y = 100

    // Lets print y to see what happening
    println("y = $y")

    // Now draw a line at the y level
    gc.drawLine(0, y, 799, y)

    // Let's change our y from 100 to 150 and draw another line
    // We calculate y + 50 which will be 150 and then assign it back to y
    y = y + 50
    println("y = $y")

    // Draw a line using absolutely the same line of code
    gc.drawLine(0, y, 799, y)

    // Skip more space
    y += 100 // y += 100 is the same as y = y + 100
    println("y = $y")
    gc.drawLine(0, y, 799, y)
}
