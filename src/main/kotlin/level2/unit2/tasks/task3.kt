package level2.unit2.tasks


import com.anysolo.toyGraphics.*


/*
Write function isInsideTheTrap and uncomment the following code. Function should return Boolean type

val flyingBlockSize = BlockSize(75, 25)
val trapBlockSize = BlockSize(200, 50)
val trapBlockPos = Pos(400, 400)



fun drawFlyingBlock(g: Graphics, pos: Pos) {
    g.color = Pal16.brightCyan
    g.drawRect(pos.x, pos.y, flyingBlockSize.width, flyingBlockSize.height, fill = true)

    g.setStrokeWidth(5)
    g.color = Pal16.black
    g.drawRect(pos.x, pos.y, flyingBlockSize.width, flyingBlockSize.height)
}

fun drawTrapBlock(g: Graphics, pos: Pos, isActive: Boolean) {
    g.color = if(isActive) Pal16.red else Pal16.blue
    g.drawRect(pos.x, pos.y, trapBlockSize.width, trapBlockSize.height, fill = isActive)
}

fun main() {
    val wnd = Window(1280, 720, buffered = true)

    var pos = Pos(0, 0)

    while (true) {
        val g = Graphics(wnd)
        g.clear()

        drawFlyingBlock(g, pos)
        drawTrapBlock(g, trapBlockPos, isInsideTheTrap(pos))

        g.close()

        pos = Pos(pos.x+1, pos.y+1)

        sleep(10)
    }
}
*/
