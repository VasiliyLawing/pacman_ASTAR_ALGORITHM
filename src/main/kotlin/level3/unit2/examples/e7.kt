/*******************************************************************************
 * Copyright (c) 2019-2022.  Anysolo LLC
 ******************************************************************************/


package level3.unit2.examples

import java.io.File


fun main() {
    val f = File("out.txt")
    val printer = f.printWriter()

    val num = 2+2

    printer.println("Something: $num")
    printer.close()
}
