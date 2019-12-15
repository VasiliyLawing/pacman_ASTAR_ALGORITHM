package level2.unit1.examples

/*
import com.anysolo.toyGraphics.*

data class Point(val x: Int, val y: Int)
data class Enemy(var pos: Point, var speed: Double)
data class Fighter(var pos, speed: Double)


private val wnd = Window(1280, 720, background = Pal16.black, buffered = true)
private val keyboard = Keyboard(wnd)

private val racketWidth = 75
private val racketHeight = 10
private var racketX = wnd.width/2 - racketWidth /2
private val racketY = wnd.height - racketHeight /2 - 10
private var racketSpeed = 0
private val maxRacketSpeed = 15


private fun processKeyboard() {
    while (true) {
        val key = keyboard.getPressedKey() ?: break

        when(key.code) {
            KeyCodes.LEFT ->
                racketSpeed = if(racketSpeed > -maxRacketSpeed) racketSpeed -1 else -maxRacketSpeed

            KeyCodes.RIGHT ->
                racketSpeed = if(racketSpeed < maxRacketSpeed) racketSpeed +1 else maxRacketSpeed
        }
    }
}

private fun calculationRacketMotion() {
    racketX += racketSpeed

    if(racketX < 0) {
        racketX = 0
        racketSpeed = -racketSpeed
    } else if(racketX > wnd.width - racketWidth) {
        racketX = wnd.width - racketWidth - 1
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

private fun main() {
    while(true) {
        processKeyboard()
        calculationRacketMotion()
        drawing()

        sleep(20)
    }
}
*/
