/*******************************************************************************
 * Copyright (c) 2019-2022.  Anysolo LLC
 ******************************************************************************/


package level1.unit2.examples

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Window

/*
We draw many similar lines using the same line of code with drawLine()
To use the same code many times with different results we use "while" loop and "y" variable.
Every next line is drawn closer to the bottom because we change "y" every time.
Lines from 30 to 34 executed 11 times!.
 */

fun main() {
    val wnd = Window(800, 600)
    val gc = Graphics(wnd)

    var y = 50

    // "while" is a loop operator which repeats the block of code inside "{}" while
    // the given condition is true. Here the condition is to repeat while y is less than 600
    // You can use following operator to compare something in the condition:
    // "<" - less than
    // "<=" - less or equal
    // ">" - greater than
    // ">=" - greater or equal
    // "==" - equals
    // "!=" not equals
    // They called comparison operators.
    while (y < 600) {
        println("y = $y")
        gc.drawLine(0, y, 799, y)

        // Increase y by 50
        y += 50
    }
}
