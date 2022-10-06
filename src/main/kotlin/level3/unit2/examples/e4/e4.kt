/*******************************************************************************
 * Copyright (c) 2019-2022.  Anysolo LLC
 ******************************************************************************/


package level3.unit2.examples.e4

import level3Unit2Path
import java.io.File


private typealias MyMenu = List<String>


private fun printMenu(menu: MyMenu) {
    println("--------- Menu ----------")

    for(menuItem in menu) {
        println(menuItem)
    }
}

private fun loadMenu(menuName: String): MyMenu {
    val menuFile = File("$level3Unit2Path/e4/$menuName.menu")
    return menuFile.readLines()
}


fun main() {
    val menu = loadMenu("main")
    printMenu(menu)
}
