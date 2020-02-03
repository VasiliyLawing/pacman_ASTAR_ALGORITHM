package level2.unit3.examples


fun main() {
    val l = mutableListOf(1, 2, 3, 4, 5)
    println(l)

    // Remove an list item by its index. Index starts with 0
    // This works fast
    l.removeAt(1)
    println(l)

    // Search a value in the list and then remove it. This will be slow for a long list.
    l.remove(4)
    println(l)
}
