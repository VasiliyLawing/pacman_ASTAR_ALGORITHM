package level2v2.unit1.examples

import kotlin.random.Random
import com.anysolo.toyGraphics.sleep


private fun guessNumber(): Int {
    return Random.nextInt(1, 11)
}

fun main() {
    val guestedNumber = guessNumber()
    println("I've got random number")

    println("Now I am trying to to guess it correctly...")

    var testNumber = 1

    while (true) {
        print("Trying number $testNumber ... ")

        if(testNumber == guestedNumber) {
            println("Correct!")
            break
        } else {
            println("Wrong number.")
        }

        testNumber++

        sleep(500)
    }
}
