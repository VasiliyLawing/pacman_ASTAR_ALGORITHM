package level2.unit3.examples


fun main() {
    val l = mutableListOf(1, 2, 3, 4, 5)
    println(l)

    // Remove item from list.
    l.remove(4)
    println(l)

    // Remove a list item by its index. Index starts with 0
    l.removeAt(1)
    println(l)
}
