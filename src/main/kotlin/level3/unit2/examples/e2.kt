package level3.unit2.examples

import level3Unit2Path
import java.io.File


fun main() {
    val f = File("${level3Unit2Path}/data/mobydick.txt")
    val text = f.readText()
    val words = text.split(" ")

    println("Book statistics: ")
    println("Characters: ${text.length}")
    println("Words: ${words.size}")
}