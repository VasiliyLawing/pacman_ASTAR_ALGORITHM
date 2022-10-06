/*******************************************************************************
 * Copyright (c) 2019-2022.  Anysolo LLC
 ******************************************************************************/

/*******************************************************************************
 ******************************************************************************/

package level1.unit2.group

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window

// Import sleep function
import com.anysolo.toyGraphics.sleep


fun main() {
    val cellSize = 64

    val wnd = Window(800, 600, buffered = true)

    val board = mutableListOf<MutableList<Int?>>()
    repeat(3) {
        board.add(mutableListOf(null, null, null))
    }

    board[0][0] = 1
    board[1][1] = 1
    board[2][0] = 0

    while(true) {
        val gc = Graphics(wnd)
        gc.setFontSize(64)
        gc.color = Pal16.blue

        gc.clear()

        var colIndex = 0
        var rowIndex = 0

        for(c in board) {
            for(cell in c) {
                val y = 100 + rowIndex * cellSize
                var x = 100 + colIndex * cellSize

                when(cell) {
                    0 -> {
                        gc.drawText(x, y, "0")
                    }

                    1 -> {
                        gc.drawText(x, y, "X")
                    }
                    else -> {
                    }
                }

                rowIndex++
            }

            rowIndex = 0
            colIndex++
        }

        gc.close()

        sleep(5)
    }
}
