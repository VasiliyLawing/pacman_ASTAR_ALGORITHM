package level3.unit2.examples

import level3Unit1Path
import java.io.File


fun main() {
    val outputFilename = "data/my-file.txt"
    val endKeyword = "!end!"

    println("Enter text line by line. Finish every line with <Enter>")
    println("To save file and exit enter line $endKeyword")

    val lines = mutableListOf<String>()

    while (true) {
        val line = readLine()

        if(line != null) {
            if(line == endKeyword) {
                break
            }

            lines.add(line)
        }
    }

    val file = File("$level3Unit1Path/$outputFilename")
    file.writeText(lines.joinToString("\n"))

    println("${lines.size} lines written in file $outputFilename")
}