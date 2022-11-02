/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/

/*
Demonstrates:
    - data classes
    - mutable list
    - random numbers
    - splitting code into simple functions
    - avoiding having any global variables
 */

package level2.unit6.examples.e7

import com.anysolo.toyGraphics.*
import kotlin.math.roundToInt
import kotlin.random.Random


private data class Thingy(
    var x: Double, var y: Double,
    var speedX: Double, var speedY: Double,
    var size: Double, val color: Color
)

private data class SimulationData(
    val accel: Double,
    val sizeIncrease: Double,
    val bottleSize: Int,
    val seeLevel: Int
)


private fun drawThingy(gc: Graphics, thingy: Thingy) {
    gc.color = thingy.color

    gc.drawOval(
        thingy.x.roundToInt(), thingy.y.roundToInt(),
        thingy.size.roundToInt(), thingy.size.roundToInt(),
        fill = true
    )
}


private fun updateThingy(thingy: Thingy, sizeIncrease: Double, accel: Double) {
    if(Random.nextInt(0, 10) == 0) {
        thingy.speedX += Random.nextDouble(-0.002, 0.002)
    }

    thingy.x += thingy.speedX
    thingy.y += thingy.speedY

    thingy.speedY += accel

    thingy.size += sizeIncrease
}


private fun createNewThingies(thingies: MutableList<Thingy>, xLimit: Int, yLimit: Int) {
    val newThingy = Thingy(
        x = xLimit.toDouble()/2,
        y = yLimit.toDouble(),
        speedX = 0.0,
        speedY = 0.0,
        size = 1.0,
        color = Pal16.all.filter { it != Pal16.brightBlue } . random()
    )

    thingies.add(newThingy)
}


private fun updateThingies(thingies: MutableList<Thingy>, simulationData: SimulationData) {
    for (thingy in thingies) {
        updateThingy(thingy, sizeIncrease = simulationData.sizeIncrease, accel = simulationData.accel)
    }

    thingies.removeIf { it.y < simulationData.seeLevel }
}


private fun drawEverything(wnd: Window, simulationData: SimulationData, thingies: List<Thingy>) {
    val gc = Graphics(wnd)
    gc.clear()

    gc.color = Pal16.brightCyan
    gc.drawRect(0, 0, wnd.width, simulationData.seeLevel, fill = true)

    gc.color = Pal16.green
    gc.drawRect(
        wnd.width/2 - simulationData.bottleSize/2, wnd.height - simulationData.bottleSize,
        simulationData.bottleSize, simulationData.bottleSize,
        fill = true
    )

    for (thingy in thingies) {
        drawThingy(gc, thingy)
    }

    gc.close()
}


fun main() {
    val wnd = Window(800, 600, buffered = true, background = Pal16.brightBlue)
    val thingies = mutableListOf<Thingy>()

    val simulationData = SimulationData(
        accel = -0.0001,
        sizeIncrease = 0.002,
        bottleSize = 5,
        seeLevel = wnd.height/7
    )

    while (true) {
        if(Random.nextInt(0, 10) == 0) {
            createNewThingies(thingies, wnd.width, wnd.height - simulationData.bottleSize)
        }

        drawEverything(wnd, simulationData, thingies)
        updateThingies(thingies, simulationData)

        sleep(5)
    }
}
