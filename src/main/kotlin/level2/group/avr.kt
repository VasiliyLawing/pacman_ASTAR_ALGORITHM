package level2.group


import kotlin.math.abs
import kotlin.random.Random

/*
1, 2, 3, 4, 5
1 + 2 + 3 + 4 + 5/5 = 15/5 = 3

2, 1, 3, 0, 1, 2, 3, 4, 5
 */

fun getAverage(temperatures: List<Double>): Double {
    var sum = 0.0

    for (t in temperatures)
        sum += t

    return sum / temperatures.size
}

fun main() {
    val mesearments = listOf<Double>(1.0, 5.0, 3.0)
    val average = getAverage(mesearments)
    val expectedAverage = 3.0

    if (expectedAverage == average) {
        println("success")
    } else
        println("failed. Expected - $expectedAverage, got - $average")
}
/*
    val tempList = mutableListOf<Double>()a
    val amountOfTempData = 10

    while (true) {
        val temp = Random.nextDouble(0.0, 200.0)
        tempList.add(temp)
        if (tempList.size <= amountOfTempData) {
        }
    }
 }
*/
