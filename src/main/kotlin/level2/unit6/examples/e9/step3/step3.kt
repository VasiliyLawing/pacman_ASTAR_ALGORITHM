/*******************************************************************************
 * Copyright (c) 2019-2022.  Anysolo LLC
 ******************************************************************************/

package level2.unit6.examples.e9.step3


import com.anysolo.toyGraphics.*
import kotlin.math.roundToInt
import kotlin.random.Random


private val flyierSize = 10

private data class Star(var x: Int, var y: Int)
private data class Flyier(var x: Double, var y: Double, var leftBoost: Double = 0.0)


private fun isCollision(flyier: Flyier, thingy: Star): Boolean =
    thingy.x > flyier.x && thingy.x < flyier.x + flyierSize &&
            thingy.y > flyier.y && thingy.y < flyier.y + flyierSize


private fun limitFlierY(flyier: Flyier, ymax: Double) {
    if(flyier.y < 0)
        flyier.y = 0.0

    if(flyier.y > ymax)
        flyier.y = ymax
}


private fun updateFlyier(flyier: Flyier) {
    flyier.x -= 0.1

    flyier.leftBoost += 0.1
    if(flyier.leftBoost > 10)
        flyier.leftBoost = 10.0
}

private fun boostFlyier(game: Game) {
    val flyier = game.flyier

    game.score += flyier.leftBoost

    flyier.x -= flyier.leftBoost
    flyier.leftBoost = 0.0
}


private fun processKeyboard(keyboard: Keyboard, game: Game, wndHeight: Int) {
    val key = keyboard.getPressedKey()

    if(key != null) {
        val flyier = game.flyier

        when(key.code) {
            KeyCodes.UP -> flyier.y --
            KeyCodes.DOWN -> flyier.y ++
            KeyCodes.LEFT -> boostFlyier(game)
        }

        limitFlierY(flyier, wndHeight - flyierSize - 1.0)
    }
}


// ================== Drawing ========================
private fun drawFlyier(g: Graphics, flyier: Flyier) {
    g.color = Pal16.brightGreen
    g.drawRect(flyier.x.roundToInt(), flyier.y.roundToInt(), flyierSize, flyierSize)
}


private fun drawBlast(g: Graphics, blastX: Int, blastY: Int) {
    val blastSize = 50
    g.color = Pal16.brightRed
    g.drawOval(blastX - blastSize/2, blastY - blastSize/2, blastSize, blastSize, fill = true)
}


private fun drawStars(g: Graphics, list: List<Star>) {
    g.setStrokeWidth(3)

    for (o in list) {
        g.color = Pal16.brightBlue
        g.drawDot(o.x, o.y)
    }
}

private fun drawGameState(g: Graphics, game: Game, wndWidth: Int) {
    val x = wndWidth - 100

    var y = 25
    g.drawText(x, y, "Boost: ${game.flyier.leftBoost.roundToInt()}")

    y += 25
    g.drawText(x, y, "Score: ${game.score.roundToInt()}")
}


private fun drawFinishLine(gc: Graphics, finishLineX: Int, wndHeight: Int) {
    gc.color = Pal16.brightGreen
    gc.drawLine(finishLineX, 0, finishLineX, wndHeight - 1)
}


private fun drawFrame(wnd: Window, game: Game) {
    val gc = Graphics(wnd)
    gc.clear()

    drawFinishLine(gc, game.finishLineX, wnd.height)
    drawGameState(gc, game, wnd.width)

    drawStars(gc, game.stars)
    drawFlyier(gc, game.flyier)

    game.collidedStar?. let {  drawBlast(gc, it.x, it.y) }

    gc.close()
}


private class Game(
    val flyier: Flyier,
    val stars: MutableList<Star>,
    var growCounter: Int,
    var sleep: Double,
    val finishLineX: Int,
    var score: Double,
    var collidedStar: Star?
)


private fun createGame(wnd: Window): Game {
    return Game(
        flyier = Flyier(wnd.width.toDouble() - flyierSize - 1, wnd.height.toDouble() / 2),
        stars = mutableListOf(),
        growCounter = 0,
        sleep = 30.0,
        finishLineX = wnd.width / 10,
        score = 0.0,
        collidedStar = null
    )
}


private fun updateStars(game: Game, wndWidth: Int, wndHeight: Int) {
    if(game.growCounter-- == 0) {
        game.stars.add(Star(0, Random.nextInt(0, wndHeight)))
        game.growCounter = 5
    }

    val starsToRemove = mutableListOf<Star>()
    for (star in game.stars) {
        star.x++

        if(star.x > wndWidth) {
            starsToRemove.add(star)
        }
    }

    for (star in starsToRemove) {
        game.stars.remove(star)
    }
}


private fun updateGame(game: Game) {
    game.sleep -= 0.003

    if(game.sleep < 1)
        game.sleep = 1.0

    game.score += 0.01

    if(game.score < 0)
        game.score = 0.0
}


private fun findStarCollision(stars: List<Star>, flyier: Flyier): Star? {
    for (star in stars) {
        if(isCollision(flyier, star)) {
            return star
        }
    }

    return null
}


private fun checkForEndOfGame(game: Game, wndWidth: Int): String? {
    if(game.flyier.x <= game.finishLineX)
        return "You Won"

    if(game.flyier.x >= wndWidth - flyierSize)
        return "You lost"

    return null
}


private fun strikeFlyierByStar(game: Game) {
    game.flyier.x += 100
    game.score -= 100
}


private fun updateAndCalculate(game: Game, wndWidth: Int, wndHeight: Int): String? {
    updateStars(game, wndWidth, wndHeight)
    updateFlyier(game.flyier)

    game.collidedStar = findStarCollision(game.stars, game.flyier)
    if(game.collidedStar != null)
        strikeFlyierByStar(game)

    updateGame(game)

    return checkForEndOfGame(game, wndWidth)
}


// ====================== Top level game ==========================
private fun playGame(wnd: Window, keyboard: Keyboard, game: Game): String {
    while(true) {
        processKeyboard(keyboard, game, wnd.height)
        updateAndCalculate(game, wnd.width, wnd.height)?.let { return it }
        drawFrame(wnd, game)

        sleep(game.sleep.roundToInt())
    }
}


private fun showEndOfGameMessage(message: String, wnd: Window, score: Double) {
    val g = Graphics(wnd)
    g.clear()
    g.color = Pal16.green
    g.setFontSize(24)
    g.drawText(wnd.width/3, wnd.height/2, "$message Score: ${score.roundToInt()}")
    g.close()
    sleep(5000)
}


fun main() {
    val wnd = Window(1280, 720, buffered = true, background = Pal16.black)
    val keyboard = Keyboard(wnd)

    while (true) {
        val game = createGame(wnd)
        val endOfGameMessage = playGame(wnd, keyboard, game)
        showEndOfGameMessage(endOfGameMessage, wnd, game.score)
    }
}
