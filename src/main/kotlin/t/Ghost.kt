package t

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Image


class ANode(var parent: ANode? = null, var position: IntPos) {
    var g = 0
    var h = 0
    var f = 0
}

class Ghost(var pos: IntPos, private var size: Int, private var image: Image) {

    private var tick = 0
    private var spawnTick = 0
    var spawning = false
    var isMoving = false

    private fun aStar(start: IntPos, end: IntPos): MutableList<IntPos> {
        val startNode = ANode(null, start)
        val endNode = ANode(null, end)

        val openList = mutableListOf<ANode>()
        val closedList = mutableListOf<ANode>()

        openList.add(startNode)

        while (openList.isNotEmpty()) {
            val currentNode = openList.minByOrNull { it.f } ?: break

            openList.remove(currentNode)
            closedList.add(currentNode)

            if (currentNode.position == endNode.position) {
                val path = mutableListOf<IntPos>()
                var current: ANode? = currentNode
                while (current != null) {
                    current.position.let { path.add(it) }
                    current = current.parent
                }
                path.reverse()
                return path
            }

            val children = mutableListOf<ANode>()
            val adjacentPositions = mutableListOf(
                IntPos(0, -1), IntPos(0, 1),
                IntPos(-1, 0), IntPos(1, 0)
            )

            for (newPosition in adjacentPositions) {
                val nodePosition = IntPos(
                    currentNode.position.x + newPosition.x,
                    currentNode.position.y + newPosition.y
                )

                if (
                    nodePosition.x >= 29 || nodePosition.x < 0 ||
                    nodePosition.y >= 19 || nodePosition.y < 0)
                    continue

                if (!Map.nodeGrid[nodePosition.y][nodePosition.x].isAvailableToMoveInto())
                    continue


                val newNode = ANode(currentNode, nodePosition)
                children.add(newNode)
            }

            for (child in children) {
                if (closedList.any { child.position == it.position })
                    continue


                child.g = currentNode.g + 1

                child.h = kotlin.math.abs(child.position.x - endNode.position.x) +
                        kotlin.math.abs(child.position.y - endNode.position.y)

                child.f = child.g + child.h

                if (openList.any { it.position == child.position && child.g > it.g })
                    continue


                openList.add(child)
            }
        }
        return mutableListOf(IntPos(0, 0))
    }

    fun spawn() {
        val spawnPointPos = IntPos(14, 9)

        pos = spawnPointPos

        if (spawnTick >= 200) {
            isMoving = true
            spawning = false

            spawnTick = 0
        } else
            spawnTick++
    }

    fun move(pacmanPos: IntPos): MutableList<IntPos> {
        val path = aStar(pos, pacmanPos)
        if (tick >= 40) {
            if (path.size > 1) {
                pos.x = path[1].x
                pos.y = path[1].y
            }
            tick = 0
        } else {
            tick++
        }

        return (aStar(pos, pacmanPos))

    }
    fun draw(gc: Graphics) = gc.drawImage(pos.x * size, pos.y * size, image)

}