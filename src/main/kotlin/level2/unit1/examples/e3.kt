package level2.unit1.examples


private val a = 1000


private fun myFunc1() {
    // There is no local variable "a" but more global is visible
    println("MyFunc1 a=$a")
    println()
}

private fun myFunc2() {
    // More local variable "a" shadows more global "a"
    val a = 3 + 4

    println("MyFunc2 a=$a")
    println()
}


private fun main() {
    // More local variable "a" shadows more global "a"
    val a = 10

    myFunc1()
    myFunc2()

    println("level1.unit2.examples.main a=$a")
}
