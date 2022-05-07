package level3.unit2.examples



fun main() {
    // You can use Pair data class when you need a simple two value class
    val nameAndAge = Pair("John Smith", 11)
    println(nameAndAge)
    println(nameAndAge.first)
    println(nameAndAge.second)

    // Exactly the same but using "to" operator
    val nameAndAge2 = "John Smith" to 11
    println(nameAndAge2.first)
    println(nameAndAge2.second)

}
