package ch1.s2


fun main() {
    val amountOfLoops = 10000000

    var dummySum = 0.0
    var percentage = 0
    var previousPercentage = 0

    // Imagine we need to repeat some calculation many times
    for(n in 1 .. amountOfLoops) {
        // Pretend we make very useful and complex calculation in this loop ;)
        for (j in 1 .. 100)
            dummySum += 0.01

        percentage = n * 100 / amountOfLoops

        if(percentage != previousPercentage) {
            previousPercentage = percentage
            print("\r$percentage%")
        }
    }
}
