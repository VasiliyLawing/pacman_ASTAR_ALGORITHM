package ch1.s2


fun main() {
    for (n in 1 .. 10) {
        print("n=$n - ")

        // You can have 'if' operator without 'else' part
        if(n % 2 == 0)
            print("even")

        // Just end the line on the console
        println()
    }
}
