package level3.unit1.examples

fun main() {
    val s1 = "my text"
    println("s1 length: ${s1.length}")

    println("\niterate through s1.")
    for (c in s1) {
        println(c)
    }

    println("\niterate through reversed s1.")
    for (c in s1.reversed()) {
        println(c)
    }
}
