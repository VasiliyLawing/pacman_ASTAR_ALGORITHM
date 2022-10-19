/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/

fun main() {
    // disassemble a string into list of strings
    val loginAndPassword = "guest:secret"
    val strItems = loginAndPassword.split(":")
    println(strItems)

    // Assemble string from a list of strings
    println(listOf("one", "two", "three").joinToString("|"))
}
