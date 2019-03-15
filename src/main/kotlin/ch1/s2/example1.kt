package ch1.s2

fun main() {
    for (n in 1 .. 10) {
        print("n=$n - ")

        // operator '%' calculates division remainder
        // If takes a condition to test.
        // In this case condition is: n % 2 == 0
        if(n % 2 == 0) {
            // This will be executed only if n % 2 equals 0
            println("even")
        }
        else {
            // Otherwise this block will be executed
            print("odd")

            // {} block can contain any number of lines
            println("!")
        }
    }
}
