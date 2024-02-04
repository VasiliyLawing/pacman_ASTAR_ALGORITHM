package t

import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window




fun main() {
    val wnd = Window(Map().xLength * 30, Map().yLength * 30, buffered = true, background = Pal16.black)
    Game(wnd)
}