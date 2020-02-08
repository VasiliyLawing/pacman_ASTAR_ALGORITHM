package level2.unit3.examples


// This function creates mutable list inside but returns it as immutable list.
fun createList(amount: Int): List<Int> {
    val l = mutableListOf<Int>()

    for(n in 1 .. amount)
        l += n // "+=" for a list is a shortcut for "add"

    // We always can assign mutable list to immutable one.
    return l
}

fun main() {
    val l = createList(5)

    // Now it is immutable list. You cannot add to it. The next line won't work
    // l.add(6)

    println(l)
}
