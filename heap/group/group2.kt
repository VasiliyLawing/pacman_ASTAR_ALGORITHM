package level1.group


import kotlin.random.Random


val names = listOf("Kirill", "ElgOhhnathonun", "Johnathon")


fun giveMeName(): String {
    val n = Random.nextInt(0, 3)
    return names[n]
}

fun main() {
    var elgunCounter = 0

    repeat(30) {
        val name = giveMeName()

        if(name == "Elgun")
            elgunCounter++

        println(name)
    }

    println(elgunCounter)
}