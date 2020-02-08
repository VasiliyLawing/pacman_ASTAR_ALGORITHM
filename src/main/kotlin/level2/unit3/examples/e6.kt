package level2.unit3.examples


import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window
import com.anysolo.toyGraphics.sleep
import kotlin.math.roundToInt
import kotlin.random.Random


data class Bomb(var x: Double, var y: Double, var speed: Double = 0.0)

private fun isItTimeToDropABomb() = Random.nextInt(250) < 1

private fun createBomb(wndWidth: Int) =
    Bomb(Random.nextInt(wndWidth).toDouble(), 0.0)

private fun processBombs(bombs: MutableList<Bomb>, terminalY: Int, g: Double) {
    val explodingBombs = mutableListOf<Bomb>()

    for(b in bombs) {
        b.y += b.speed
        b.speed += g

        if(b.y >= terminalY)
            explodingBombs.add(b)
    }

    // We cannot remove item from the list we are iterating
    // So created a separate list explodingBombs
    // Now we can iterate that list and remove bombs from bombs list
    for(b in explodingBombs)
        bombs.remove(b)
}

fun drawBombs(g: Graphics, bombs: List<Bomb>) {
    val bombSize = 15

    g.color = Pal16.brightRed
    for(b in bombs) {
        g.drawOval(b.x.roundToInt(), b.y.roundToInt(), bombSize, bombSize, fill = true)
    }
}


fun main() {
    val wnd = Window(1280, 720, background = Pal16.black, buffered = true)
    val bombs = mutableListOf<Bomb>()
    val gravityAccel = 0.01

    while(true) {
        val g = Graphics(wnd)
        g.clear()

        if(isItTimeToDropABomb())
            bombs.add(createBomb(wnd.width))

        drawBombs(g, bombs)
        processBombs(bombs, wnd.height, gravityAccel)

        g.close()
        sleep(10)
    }
}
