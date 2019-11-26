package level2.unit2.examples


fun main() {
    // You explicitly specify the type of variable
    val s: String = ""
    val n1: Int = 1
    val n2: Double = 1.0

    // Usually you do not need to specify the type of variables.
    // But sometime I want or need to enforce a particular type

    // Try to change "1" to "1.0" in the next line and you will get an error.
    val n3: Int = 1

    // Now you will get an error if you change "1.0" to "1"
    val n4: Double = 1.0

    // You get an error if you remove "" around 1 below.
    val s2:String = "1"

    // If you do not specify the type you can accidentally get Int instead of String
    val s3 = 1

    // As you can the type of condition expression is Boolean
    val b1: Boolean = 2 > 1

    // And b1 contains true
    println("b1 = $b1")
}
