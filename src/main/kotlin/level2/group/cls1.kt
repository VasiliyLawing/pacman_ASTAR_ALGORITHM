package level2.group


class Cls1(val name: String, val add: Int = 1) {
    var counter: Int = 0

    fun update() {
        counter += add
    }

    fun print() {
        println("$name frame#: $counter")
    }
}


fun main() {
    val o1 = Cls1("vasya")
    val o2 = Cls1("petya", 2)

    repeat(7) {
        o1.update()
    }

    repeat(5) {
        o2.update()
    }

    o1.print()
    o2.print()
}
