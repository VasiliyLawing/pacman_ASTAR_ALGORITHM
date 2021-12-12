package level2v2.unit1.examples

import kotlin.random.Random
import com.anysolo.toyGraphics.sleep


fun guessNumber(max: Int): Int {
    return Random.nextInt(1, max+1)
}

fun main() {
    val guestedNumber = guessNumber(100)
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

        sleep(100)
    }
}
