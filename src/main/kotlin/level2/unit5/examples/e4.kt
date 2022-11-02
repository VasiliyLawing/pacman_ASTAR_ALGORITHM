package level2.unit5.examples


import com.anysolo.toyGraphics.Color
import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window

/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/

private fun drawColors(gc: Graphics, colors: List<Color>, startY: Int, windowWidth: Int): Int {
    val barHeight = 10
    var y = startY

    for (color in colors) {
        gc.color = color
        gc.drawRect(0, y, windowWidth, barHeight, fill = true)
        y += barHeight
    }

    return y
}

fun main() {
    val wnd = Window(800, 600)
    val gc = Graphics(wnd)

    var y = 0
    y = drawColors(gc, Pal16.all.toList(), y, wnd.width)

    y += 50
    y = drawColors(gc, Pal16.all.toList().filter { it != Pal16.white && it != Pal16.brightGreen && it != Pal16.green}, y, wnd.width)

    // the same but using !in / in operator to filter out colors
    y += 50
    drawColors(gc, Pal16.all.toList().filter { it !in listOf(Pal16.white, Pal16.brightGreen, Pal16.green) }, y, wnd.width)
}
