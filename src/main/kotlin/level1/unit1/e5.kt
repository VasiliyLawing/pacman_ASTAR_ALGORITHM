package level1.unit1


fun main() {
    // Use keyword 'val' to give a name to a value. A value maybe a result of some expression.
    // You can use these names in other expressions

    val price = 10
    val amount = 5
    val discount = 0.05

    // After you defined a named value you cannot defined another value with the same name.
    // If you uncomment the next line and you how Kotlin reports an error. Try it!
    // val price = 2

    val cost = price * amount * (1 - discount)

    // You can insert value of a variable into a string using "$" followed by name of the variable
    println("cost: $cost")
}
