package level3.unit1.examples

import level3Unit1Path
import java.io.File


fun main() {
    val f = File("${level3Unit1Path}/data/mobydick.txt")
    val text = f.readText()
    println(text)

    println("Size: ${text.length}")

    val ch20Index = text.indexOf("20 MOBY-DICK")
    if(ch20Index != -1) {
        println("--------------------------")
        println(text.substring(ch20Index, ch20Index+100))
    }
}