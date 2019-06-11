package ch1.s2


fun main() {
    for (n in 1 .. 10) {
        print("n=$n - ")

        // if you have only one line in 'if' or 'else' {}
        // You can drop {}

        if(n % 2 == 0)
            println("even")
        else
            println("odd")
    }

    // The same with 'for'
    for (n in 1 .. 3)
        println(n)

    // Notice you have two absolutely separate variables with the same name 'n'.
    // Each of them exists only inside its 'for' loop {} block. It called - scope of the variable.
}
