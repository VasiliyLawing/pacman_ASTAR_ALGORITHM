package ch1.s2

fun main() {
    for (n in 1 .. 10) {
        print("n=$n - ")

        // 'if' allows you to execute a block of code conditionally.
        // 'If' takes a condition to test.
        // In this case the condition is: n % 2 == 0
        // operator '%' calculates division remainder
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
