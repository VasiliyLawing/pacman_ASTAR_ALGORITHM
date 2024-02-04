package t

import com.anysolo.toyGraphics.*



class Game (private var wnd: Window){
    private var map = Map()
    private var keyboard = Keyboard(wnd)
    private var pacman = Pacman(IntPos(1, 1))
    private var points = 0
    private var spawnGhostIndex = 0

    private val downAngle = 1.5
    private val upAngle = -1.5
    private val rightAngle = 0.0
    private val leftAngle = 3.0

    private var pacmanAngle = rightAngle

    private var ghosts = mutableListOf(
        Ghost(IntPos(14, 9), 30, Image("src/main/resources/pacmanImages/blueGhost.png")),
        Ghost(IntPos(14, 9), 30, Image("src/main/resources/pacmanImages/redGhost.png")),
        Ghost(IntPos(14, 9), 30, Image("src/main/resources/pacmanImages/greenGhost.png")),
        Ghost(IntPos(14, 9), 30, Image("src/main/resources/pacmanImages/yellowGhost.png"))
    )

    init {
        map.generateArray()
        loop()
    }

    private fun drawEntities(gc: Graphics) {
        map.draw(gc)
        pacman.draw(gc, directionAngle = pacmanAngle)

        for (ghost in ghosts) {
            ghost.draw(gc)
        }
    }


    private fun spawnGhosts () {
        val currentGhost = ghosts[spawnGhostIndex]

        if (spawnGhostIndex == ghosts.size - 1 && currentGhost.isMoving)
            return

        if (!currentGhost.isMoving) {
            currentGhost.spawn()
            currentGhost.spawning = true
        }

        if (currentGhost.isMoving && spawnGhostIndex != ghosts.size - 1)
            spawnGhostIndex+=1
    }


    private fun processKeyEvents() {
        val key = keyboard.getPressedKey()
        val row: Int = pacman.pos.x
        val column: Int = pacman.pos.y

        val movingSpeed = 1

        when (key?.code) {
            KeyCodes.LEFT ->
                if (Map.nodeGrid[column][row - 1].isAvailableToMoveInto()) {
                    pacman.xSpeed = -movingSpeed
                    pacman.ySpeed = 0
                    pacmanAngle = leftAngle
                }

            KeyCodes.RIGHT ->
                if (Map.nodeGrid[column][row + 1].isAvailableToMoveInto()) {
                    pacman.xSpeed = movingSpeed
                    pacman.ySpeed = 0
                    pacmanAngle = rightAngle
                }

            KeyCodes.DOWN ->
                if (Map.nodeGrid[column + 1][row].isAvailableToMoveInto()) {
                    pacman.ySpeed = movingSpeed
                    pacman.xSpeed = 0
                    pacmanAngle = downAngle
                }

            KeyCodes.UP ->
                if (Map.nodeGrid[column - 1][row].isAvailableToMoveInto()) {
                    pacman.ySpeed = -movingSpeed
                    pacman.xSpeed = 0
                    pacmanAngle = upAngle
                }
        }

    }
    private fun managePoints(gc: Graphics) {

        if (Map.nodeGrid[pacman.pos.y][pacman.pos.x].walkedOn())
            points += 1

        if (points < 241) {
            gc.setFontSize(20)
            gc.color = Pal16.green
            gc.drawText(15 * 30, 7 * 30, "Points: $points") // 242 points
        } else {
            gc.setFontSize(20)
            gc.color = Pal16.green
            gc.drawText(15 * 30, 7 * 30, "Game over")
        }
    }

    private fun didGhostHitPlayer(): Boolean {

        for (ghost in ghosts) {
            if (ghost.isMoving)
                ghost.move(pacman.pos)

            if(ghost.pos == pacman.pos)
                return false
        }
        return true
    }

    private fun loop() {

        while(didGhostHitPlayer()) {
            val gc = Graphics(wnd)
            gc.clear()

            spawnGhosts()

            drawEntities(gc)
            managePoints(gc)

            pacman.movement()
            processKeyEvents()

            gc.close()
            sleep(6)
        }
    }


}