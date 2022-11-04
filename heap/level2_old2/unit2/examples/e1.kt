/*******************************************************************************
 * Copyright (c) 2019-2022.  Anysolo LLC
 ******************************************************************************/


package level2_old2.unit2.examples


fun main() {
    // List variable may contain ot one but many values
    val list = listOf(10, 11, -10)
    println("# List containing 3 Int numbers")
    println(list)
    println(list.size)
    
    println("# accessing all the values one by one")
    for(n in list)
        print("$n ")
    println()
}
