package level2.unit3.tasks.task1


fun main() {
    val expectedList = listOf(110, 150, 100, 9000, 200, 130)
    val sourceNumbers = listOf(10, 110, 20, -20, 150, 30, 100, 70, 9000, 200, 130)

    val filteredNumbers = processNumbers(sourceNumbers)

    if(filteredNumbers == expectedList)
        println("passed.")
    else
        println("Failed.\nExpected: $expectedList\nYou made: $filteredNumbers")
}

/*
Please make a file studentCode.kt in the same package as this on.
Copy the code below and make it work.


fun processNumbers(sourceNumbers: List<Int>): List<Int> {
    val filteredNumbers = mutableListOf<Int>()

//---------------------
// Write your code between these two lines. Do not change any code outside it.
//---------------------

    return filteredNumbers
}

*/
