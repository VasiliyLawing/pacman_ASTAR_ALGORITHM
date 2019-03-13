package ch1.s1


fun main() {
    println("1:")

    // very simple form of loop. But we do not have index variable like 'n' here
    repeat(5) {
        println("loop")
    }

    // '\n' inside a string prints an empty line
    println("\n2:")

    // You always can use a variable instead of constant
    val amountOfLoops = 3
    repeat(amountOfLoops) {
        println("loop")
    }

    println("\n3: ")
    // Using repeat in calculation
    var n = 1
    repeat(8) {
        println(n)
        n *= 2
    }
    println(n)
}
