package t
import com.anysolo.toyGraphics.Color
import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16



abstract class Node {
    abstract fun isAvailableToMoveInto(): Boolean
    abstract fun walkable()
    abstract fun walkedOn(): Boolean
    abstract fun draw(gc: Graphics, x: Int, y: Int, size: Int)
    abstract fun setColor(color: Color)
}

class Wall: Node() {
    var mColor = Pal16.blue
    override fun walkedOn(): Boolean {
        return false;
    }
    override fun draw(gc: Graphics, x: Int, y: Int, size: Int) {
        gc.color = mColor
        gc.drawRect(x, y, size, size, fill = true)
    }

    override fun setColor(color: Color) {
        mColor = color
    }

    override fun isAvailableToMoveInto(): Boolean {
        return false
    }

    override fun walkable() {

    }

}
class Path(): Node() {
    var pacDot = true
    private var mColor = Pal16.black

    override fun draw(gc: Graphics, x: Int, y: Int, size: Int) {
        gc.color = mColor
        gc.drawRect(x, y, size, size, fill = true)

        if (pacDot) {
            gc.color = Pal16.white
            gc.drawOval(x + 7, y + 7, size / 2, size / 2, fill = true)
        }
        mColor = Pal16.black
    }

    override fun setColor(color: Color) {
        mColor = color
    }



    override fun walkedOn(): Boolean {
        if (pacDot) {
            pacDot = false
            return true
        }
        return false
    }
    override fun isAvailableToMoveInto(): Boolean {
        return true;
    }

    override fun walkable() {

    }

}


class Map(){
    companion object {
        val textGrid = arrayListOf(
            arrayListOf("W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W"),
            arrayListOf("W", "P", "P", "P", "P", "P", "P", "P", "P", "W", "W", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "W"),
            arrayListOf("W", "P", "W", "W", "P", "W", "W", "W", "P", "P", "P", "P", "W", "W", "W", "W", "P", "W", "P", "W", "P", "W", "P", "W", "W", "W", "W", "P", "W"),
            arrayListOf("W", "P", "W", "W", "P", "W", "W", "W", "P", "W", "W", "P", "P", "P", "P", "W", "P", "W", "P", "W", "P", "W", "P", "W", "W", "W", "W", "P", "W"),
            arrayListOf("W", "P", "W", "W", "P", "W", "W", "W", "P", "W", "W", "W", "W", "W", "P", "W", "P", "W", "P", "W", "P", "W", "P", "W", "W", "W", "W", "P", "W"),
            arrayListOf("W", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "W"),
            arrayListOf("W", "P", "W", "W", "W", "W", "W", "W", "P", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "P", "W", "W", "W", "W", "P", "W"),
            arrayListOf("W", "P", "W", "W", "W", "W", "W", "W", "P", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "P", "W", "W", "W", "W", "P", "W"),
            arrayListOf("W", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "W"),
            arrayListOf("W", "W", "W", "W", "P", "W", "W", "W", "P", "W", "W", "W", "P", "P", "W", "W", "P", "W", "P", "W", "P", "W", "W", "W", "W", "W", "W", "W", "W"),
            arrayListOf("W", "P", "P", "P", "P", "P", "P", "P", "P", "W", "W", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "W"),
            arrayListOf("W", "P", "W", "W", "P", "W", "W", "W", "P", "P", "P", "P", "W", "W", "W", "W", "P", "W", "P", "W", "P", "W", "P", "W", "W", "W", "W", "P", "W"),
            arrayListOf("W", "P", "W", "W", "P", "W", "W", "W", "P", "W", "W", "P", "P", "P", "P", "W", "P", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "P", "W"),
            arrayListOf("W", "P", "W", "W", "P", "W", "W", "W", "P", "W", "W", "W", "W", "W", "P", "W", "P", "W", "P", "W", "P", "W", "P", "W", "W", "W", "W", "P", "W"),
            arrayListOf("W", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "W", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "W"),
            arrayListOf("W", "P", "W", "W", "W", "W", "W", "W", "P", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "P", "W", "W", "P", "W", "P", "W"),
            arrayListOf("W", "P", "W", "W", "W", "W", "W", "W", "P", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "P", "W", "W", "P", "W", "P", "W"),
            arrayListOf("W", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "W"),
            arrayListOf("W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W")
        )
        val nodeGrid: ArrayList<ArrayList<Node>> = arrayListOf(arrayListOf())

    }
    var yLength = textGrid.size
    var xLength = textGrid[0].size


    fun generateArray() {
        for (row in textGrid.indices) {
            nodeGrid.add(arrayListOf())
            for (column in textGrid[row].indices) {
                val node = textGrid[row][column]

                if (node == "W") {
                    nodeGrid[row].add(column , Wall())
                } else if (node == "P") {
                    nodeGrid[row].add(column , Path())
                }
            }
        }

        println()

    }

    var size = 30;

    fun draw(gc: Graphics) {
        for (row in nodeGrid.indices) {
            for (column in nodeGrid[row].indices) {
                val node = nodeGrid[row][column]

                val x = column * size
                val y = row * size

                node.draw(gc, x, y, 30)
            }
        }
    }
}