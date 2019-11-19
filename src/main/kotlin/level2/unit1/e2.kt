package level2.unit1

import com.anysolo.toyGraphics.*


// Values and variables defined on the top level will be visible for all functions
// "private" before "val" or "var" limit visibility to this file only.
// Without "private" you can see and accidentally use some of these names in other files.
// You always should limit visibility of our variables as much as you can.
private val wnd = Window(1280, 720, background = Pal16.black, buffered = true)
private val keyboard = Keyboard(wnd)

private val racketWidth = 75
private val racketHeight = 10
private var racketX = wnd.width/2 - racketWidth/2
private val racketY = wnd.height - racketHeight/2 - 10
private var racketSpeed = 0


private fun processKeyboard() {
    while (true) {
        val key = keyboard.getPressedKey() ?: break

        when(key.code) {
            KeyCodes.LEFT -> racketSpeed--
            KeyCodes.RIGHT -> racketSpeed++
        }
    }
}

private fun calculationRacketMotion() {
    racketX += racketSpeed

    if(racketX < 0) {
        racketX = 0
        racketSpeed = -racketSpeed
    } else if(racketX >= wnd.width) {
        racketX = wnd.width - 1
        racketSpeed = -racketSpeed
    }
}

private fun drawing() {
    val g = Graphics(wnd)
    g.clear()

    g.color = Pal16.blue
    g.drawRect(racketX, racketY, racketWidth, racketHeight, fill = true)

    g.close()
}

fun main() {
    while(true) {
        processKeyboard()
        calculationRacketMotion()
        drawing()

        sleep(20)
    }
}
