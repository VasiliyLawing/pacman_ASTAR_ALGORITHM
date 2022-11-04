/*******************************************************************************
 * Copyright (c) 2019-2022.  Anysolo LLC
 ******************************************************************************/


package level2_old.unit1.examples


/*
Each variable has visibility scope.
This example shows you variables visible inside one function or inside one file.
If you remove "private" from "val b = 1000" variable will be visible inside the whole project.
You always should limit visibility of everything as much as you can.
 */


// This variable is visible from all functions inside this file
private val b = 1000


private fun myFunc1() {
    // variable "a" visible only in this function
    val a = 1 + 2

    println("MyFunc1 a=$a")
    println("MyFunc1 b=$b")
    println()
}

private fun myFunc2() {
    // variable "a" visible only in this function
    val a = 3 + 4

    println("MyFunc2 a=$a")
    println("MyFunc2 b=$b")
    println()
}


private fun main() {
    // variable "a" visible only in this function
    val a = 10

    myFunc1()
    myFunc2()

    println("main a=$a")
    println("main b=$b")
}
