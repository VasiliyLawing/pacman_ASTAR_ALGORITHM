package level3.unit1.examples

fun main() {
    val s1 = "Another text"

    // Another way to iterate through a string
    // Also you can use Int ranges like this for other purpose.

    println("step1")
    for (index in 0..s1.lastIndex) {
        print("s1[$index]=")
        println(s1[index])
    }

    println("\nstep2")
    for (index in 0..s1.lastIndex step 2) {
        print("s1[$index]=")
        println(s1[index])
    }

    println("\ndownto")
    for (index in s1.lastIndex downTo 0) {
        print("s1[$index]=")
        println(s1[index])
    }
}
