package level2.unit1

// Here we create a function "changeRacketSpeed" with an argument to use the same logic in several places.

import com.anysolo.toyGraphics.*


private val wnd = Window(1280, 720, background = Pal16.black, buffered = true)
private val keyboard = Keyboard(wnd)

private val racketWidth = 75
private val racketHeight = 10
private var racketX = wnd.width/2 - racketWidth/2
private val racketY = wnd.height - racketHeight/2 - 10
private var racketSpeed = 0
private val maxRacketSpeed = 5


// NEW ---------------------------------------
private fun changeRacketSpeed(delta: Int) {
    racketSpeed += delta

    if(racketSpeed < -maxRacketSpeed)
        racketSpeed = -maxRacketSpeed

    if(racketSpeed > maxRacketSpeed)
        racketSpeed = maxRacketSpeed
}

private fun processKeyboard() {
    while (true) {
        val key = keyboard.getPressedKey() ?: break

        when(key.code) {
            KeyCodes.LEFT -> changeRacketSpeed(1)
            KeyCodes.RIGHT -> changeRacketSpeed(-1)
        }
    }
}
// END NEW ---------------------------------------

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
