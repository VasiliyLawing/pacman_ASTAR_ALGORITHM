package ch1.s2

fun main() {
    for (n in 1 .. 10) {
        print("n=$n - ")

        // operator '%' calculates division remainder
        if(n % 2 == 0) {
            println("even")
        }
        else {
            println("odd")
        }
    }
}
