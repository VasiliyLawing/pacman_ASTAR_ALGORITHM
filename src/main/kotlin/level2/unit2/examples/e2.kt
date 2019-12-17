package level2.unit2.examples

import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window


/*
Class Pos is defined in e1.kt but we can use it here without any additional actions.
All you define (variables, classes, functions) visible withing the whole package.
In our case class "Pos" is visible inside any file in package "level2.unit2.examples".
 */

val tankLength = 100
val tankHeight = 50


/*
Function can take one or more arguments. Function arguments are variables a special variables created each time the
 function called. Those variables takes their values from what you pass inside () when you call the function.
 For each argument you must explicitly provide its type. Kotlin cannot infer the type automatically in this case.
 Argument variables exists only during one function call.
 This function draws a tank using two arguments.
 */
fun drawTank(g: Graphics, pos: Pos) {
    g.color = Pal16.black
    g.setStrokeWidth(2)

    g.drawRect(pos.x + tankLength/4, pos.y, tankLength/2, tankHeight/2)
    g.drawRect(pos.x, pos.y + tankHeight/2, tankLength, tankHeight/2)

    g.setStrokeWidth(4)
    g.drawLine(pos.x - tankLength/8, pos.y+ tankHeight/4, pos.x + tankLength/4, pos.y+ tankHeight/4)
}


fun main() {
    val wnd = Window(1280, 720)
    val g = Graphics(wnd)

    val tankPos = Pos(wnd.width/2 - tankLength/2,wnd.height/2 - tankHeight/2)

    // We call our function and pass our arguments.
    drawTank(g, tankPos)
}
