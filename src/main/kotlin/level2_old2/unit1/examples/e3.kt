/*******************************************************************************
 * Copyright (c) 2019-2022.  Anysolo LLC
 ******************************************************************************/


package level2_old2.unit1.examples

import com.anysolo.toyGraphics.sleep


fun checkNumber(testNumber: Int, guestedNumber: Int): Boolean {
    if(testNumber == guestedNumber) {
        println("Correct!")
        return true
    }

    println("Wrong number.")
    return false
}


fun main() {
    val guestedNumber = guessNumber(100)
    println("I've got random number")

    println("Now I am trying to to guess it correctly...")

    var testNumber = 1

    while (true) {
        print("Trying number $testNumber ... ")

        if(checkNumber(testNumber, guestedNumber))
            break

        testNumber++
        sleep(100)
    }
}
