package level3.unit1.examples.e5

import level3Unit1Path
import java.io.File


private data class MenuItem(val text: String, val key: String)


private typealias Menu = List<MenuItem>


private fun printMenu(menu: Menu) {
    println("--------- Menu ----------")
    
    for(menuItem in menu) {
        println("${menuItem.key}: ${menuItem.text}")
    }
}

private fun loadMenu(menuName: String): Menu {
    val menuFile = File("$level3Unit1Path/e5/$menuName.menu")

    val menu = mutableListOf<MenuItem>()

    for(line in menuFile.readLines()) {
        val columns = line.split(" ")
        val menuItem = MenuItem(columns[1], columns[0])

        menu.add(menuItem)
    }

    return menu
}


fun main() {
    val menu = loadMenu("main")
    printMenu(menu)
}
