/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/

/**
 *
 * String contains from characters (Kotlin data type: Char).
 * Each character can be uniquely identified by its code (Kotlin data type Int).
 * This example prints a table showing first 255 characters with its codes. This kind of table usually called "ASCII table"
 * Some characters cannot be represented on screen, so we print "." instead.
 *
  */

package level3.unit1.examples


fun main() {
    for(code in 1..255) {
        val ch = code.toChar()
        val isPrintable = ch.isLetterOrDigit() ||  ch in " `~@#$%^&*()_+-=|\\:;\"'<,>.?/"

        print("$code ")
        println(if (isPrintable) ch else '.')
    }
}
