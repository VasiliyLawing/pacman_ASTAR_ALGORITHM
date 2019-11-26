package level2.unit1.examples


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


fun main() {
    // variable "a" visible only in this function
    val a = 10

    myFunc1()
    myFunc2()

    println("main a=$a")
    println("main b=$b")
}
