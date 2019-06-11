package ch1.s2


fun main() {
    val amountOfLoops = 10000000

    var dummySum = 0.0

    // Imagine we need to repeat some calculation many times
    for(n in 1 .. amountOfLoops) {
        // Pretend we make very useful and complex calculation in this loop ;)
        for (j in 1 .. 100)
            dummySum += 0.01

        // Try to comment out the next line if you will see the program become slower
        // and maybe some strange artifacts on console.
        if( n % (amountOfLoops/100) == 0)

        // Try to replace the previous line with the next line and you see program behave differently
        // It is because now operator % executes before operator /
//        if( n % amountOfLoops/100 == 0)
            print("\r$n")
    }
}
