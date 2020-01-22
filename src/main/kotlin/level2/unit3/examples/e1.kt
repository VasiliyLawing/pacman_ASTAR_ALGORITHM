package level2.unit3.examples


fun main() {
    // variable containing not one but many values
    val list = listOf(10, 11, -10)
    println("#1")
    println(list)
    println(list.size)
    
    // accessing all the values one by one
    println("#2")
    for(n in list)
        print("$n ")
    println()
}
