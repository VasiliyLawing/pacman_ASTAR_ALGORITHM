/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/

package level2.unit1.examples

import kotlin.math.abs
import kotlin.math.sign

fun main() {
    // You can use abs to get number without a sign, always positive
    println(abs(7.0))
    println(abs(-7.0))

    // You can get sign of your number without number itself.
    println(sign(7.0))
    println(sign(-7.0))
}
