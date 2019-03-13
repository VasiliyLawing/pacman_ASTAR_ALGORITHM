package ch1.s1


fun main() {
    val amountOfLoops = 5

    // we use 'var' because we reassigning 'n' in line 13
    var n = 0
    while(n < amountOfLoops) {
        println("loop $n")

        // if you comment out this line the programm will run forever
        n++
    }
}
