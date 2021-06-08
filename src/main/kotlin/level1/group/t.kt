package level1.group


data class Fraction(val m: Int, val n: Int) {
    override fun toString(): String {
        return "$m/$n"
    }

    operator fun times(n: Int) = Fraction(m * n, n)
    operator fun times(f2: Fraction) = Fraction(m * f2.m, n * f2.n)

    fun toDouble() = m.toDouble() / n
}


fun main() {
    val f1 = Fraction(1,2)
    println(f1)

    println(f1 * 2)


//    val f2 = Fraction(2, 1)
    val f3 = Fraction(1,3) * Fraction(5, 9)
    println(f3.toDouble())
}
