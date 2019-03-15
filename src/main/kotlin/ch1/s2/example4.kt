package ch1.s2

fun main() {
    val n = 3

    // When use nested 'if' better use {}
    // because 'else' belongs to the last 'if'. And it maybe not what you expect.

    println("BUG:")
    if(n < 10)
        if(n % 2 == 0)
            println("$n - even")

    else
        println("$n >= 10")

    println("Correct version:")
    if(n < 10) {
        if (n % n == 0)
            println("$n - even")
    }
    else
        println("$n >= 10")

    /*
      Notice that if n = 4 you won't notice a bug.
      This is why much easier to write good code than to look for a bug in a bad one.
    */
}
