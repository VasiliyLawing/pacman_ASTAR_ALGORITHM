package ch1.s1


fun main() {
    var sum = 0.0

    for (i in 0 .. 4) {
        println("i=$i")
        sum += i
    }
    println("sum: $sum")
}
