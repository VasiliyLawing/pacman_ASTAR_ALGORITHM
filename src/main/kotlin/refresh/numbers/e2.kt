fun main() {
    val number = 254
    val base = 10

    var n = number

    while (n > 0) {
        val digit = n % base
        println(digit)
        n /= base
    }
}