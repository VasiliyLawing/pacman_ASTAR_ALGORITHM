package level1.unit2.group.l3


fun main() {
    val b1 = true
    val n1 = 1
    val n2 = 3
    val n3 = -1

    val b2 = !(n1 > n2 && n3 < n2) && b1
    println(b2)
}
