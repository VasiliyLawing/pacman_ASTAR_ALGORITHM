package ch1.s1


fun main() {
    println("1:")

    // very simple form of loop. But we do not have index variable like 'n' here
    repeat(5) {
        println("loop")
    }

    println("2:")
    // You always can use a variable instead of constant
    val amountOfLoops = 3
    repeat(amountOfLoops) {
        println("loop")
    }
}
