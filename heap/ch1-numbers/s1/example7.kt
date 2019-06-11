package ch1.s1


fun main() {
    var sum = 0.0

    // This loop creates variable 'i' visible only inside the loop body {}
    println("\nSum of range 0 .. 10:")
    for (i in 0 .. 4) {
        println("i=$i")
        sum += i
    }

    // If you uncomment this line you will get an error.
    // println(i)

    println("sum: $sum")

    println("\nRange 0 until 10:")
    for (i in 0 until 10) {
        println("i=$i")
    }

    println("\nRange 10 downTo 0:")
    for (i in 10 downTo 0) {
        println("i=$i")
    }
}
