package level2.unit1.examples

import com.anysolo.toyGraphics.*


// Lets take a more complex and realistic program and see how we can make it simpler using functions
// First write it without functions, using comments to mart blocks of logic.

private fun main() {
    val wnd = Window(1280, 720, background = Pal16.black, buffered = true)
    val keyboard = Keyboard(wnd)

    val racketWidth = 75
    val racketHeight = 10
    var racketX = wnd.width/2 - racketWidth/2
    val racketY = wnd.height - racketHeight/2 - 10
    var racketSpeed = 0
    val maxRacketSpeed = 5

    // Game loop
    while(true) {

        // Processing keyboard
        while (true) {
            val key = keyboard.getPressedKey() ?: break

            when(key.code) {
                KeyCodes.LEFT ->
                    racketSpeed = if(racketSpeed > -maxRacketSpeed) racketSpeed-1 else -maxRacketSpeed

                KeyCodes.RIGHT ->
                    racketSpeed = if(racketSpeed < maxRacketSpeed) racketSpeed+1 else maxRacketSpeed
            }
        }

        // Calculating racket motion
        racketX += racketSpeed
        if(racketX < 0) {
            racketX = 0
            racketSpeed = -racketSpeed
        } else if(racketX >= wnd.width) {
            racketX = wnd.width - 1
            racketSpeed = -racketSpeed
        }

        // Drawing
        val g = Graphics(wnd)
        g.clear()

        g.color = Pal16.blue
        g.drawRect(racketX, racketY, racketWidth, racketHeight, fill = true)

        g.close()

        // Delay between game frames
        sleep(20)
    }
}
