 package ch1.s1


fun main() {
    val amountOfLoops = 5

    // we use 'var' because we reassigning 'n' in line 13
    var n = 0

    // 'while' takes a condition and repeats {} block while the condition is true
    while(n < amountOfLoops) {
        println("loop $n")

        // if you comment out this line the program will run forever
        n++
    }
}
