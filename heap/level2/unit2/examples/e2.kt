package level2.unit2.examples


private fun main() {
    // You can using Ctrl+Shift+P in Intellij IDEA to check the type of expression.
    val i = 1       // A number of Int type (Whole number)
    val f = 1.0     // A number of Double type (decimal number using floating point arithmetic)
    val s = "1"     // A string (text). In Kotlin it means a value of String type

    // "/" is a binary operator. a / b
    // Different types of values have different "/" operators or do not have such operator at all.

    // Lets see how operator "/" works for different types
    println("i/3: ${i/3}")
    println("f/3: ${f/3}")

    // Uncomment the next line and you see there is no operator "/" for String type
    //println(s/3)

    println("i+i: ${i+i}")  // Mathematical sum of two numbers

    println("s+s: ${s+s}")  // For String type "+" just joins two string together

    // Another example concatenating four string into one and then printing it.
    println("You are" + " a beginner" + " programmer" + "!")
}
