package level2v2.unit1.examples

import com.anysolo.lib.student.console.enterInt
import com.anysolo.toyGraphics.sleep


fun main() {
    val maxNumber = enterInt("Enter maximum number")
    val guestedNumber = guessNumber(maxNumber)

    // You can replace two previous lines with this one:
    // val guestedNumber = guessNumber(enterInt("Enter maximum number"))


    println("I've got random number.")
    println("Now I am trying to to guess it correctly ...")

    var testNumber = 1

    while (true) {
        print("Trying number $testNumber ... ")

        if(checkNumber(testNumber, guestedNumber))
            break

        testNumber++
        sleep(100)
    }
}
