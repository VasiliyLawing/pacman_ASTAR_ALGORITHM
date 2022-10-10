/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/

package level2v3.unit2.examples

// Type inference and explicit type specification

fun someMathFunc(): Double {
    return 3.14
}


fun main() {
    // full form of creating a variable
    // ": Int" - is explicit specification of th
    val n: Int = 1

    // The next line will be an error. We assign a Double to an Int variable
    // val n2: Int = 1.0

    // This variable is a Double, Kotlin infers it automatically
    val n3 = someMathFunc()

    // This variable is a Double, Kotlin infers it automatically
    val n4: Double = someMathFunc()

    // This would be an error
    // val n5: Int = someMathFunc()
}
