package level2v2.unit2.examples


fun main() {
    // Mutable list allows you add and remove list items
    val l = mutableListOf<Int>()
    for(n in 1 .. 5)
        l.add(n)

    println(l)

    for(n in 101 .. 105)
        l.add(n)
    println(l)
}
