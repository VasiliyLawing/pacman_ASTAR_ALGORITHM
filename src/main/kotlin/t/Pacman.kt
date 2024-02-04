package t

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Image

data class IntPos(var x: Int, var y: Int)

class Pacman(val pos: IntPos) {
    var pacmanImage = Image("src/main/resources/pacmanImages/pacman.png")
    var xSpeed = 0;
    var ySpeed = 0;
    var tick = 0



    fun movement() {

        if (!Map.nodeGrid[pos.y][pos.x - 1].isAvailableToMoveInto() && xSpeed == -1) {
            xSpeed = 0
        }
        if (!Map.nodeGrid[pos.y][pos.x + 1].isAvailableToMoveInto() && xSpeed == 1) {
            xSpeed = 0
        }
        if (!Map.nodeGrid[pos.y + 1][pos.x].isAvailableToMoveInto() && ySpeed == 1) {
            ySpeed = 0
        }
        if (!Map.nodeGrid[pos.y - 1][pos.x].isAvailableToMoveInto() && ySpeed == -1) {
            ySpeed = 0
        }

        if (tick >= 9) {
            pos.x += xSpeed
            pos.y += ySpeed
            tick = 0
        } else {
            tick++
        }

    }


    fun draw(gc: Graphics, directionAngle: Double) {
        gc.drawImage(pos.x * 30, pos.y * 30, pacmanImage, angle = directionAngle, anchorx=pos.x * 30 + pacmanImage.width/2, anchory=pos.y * 30 + pacmanImage.height/2)
    }


}