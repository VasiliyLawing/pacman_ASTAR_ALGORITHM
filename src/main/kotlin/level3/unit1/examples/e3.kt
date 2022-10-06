/*******************************************************************************
 * Copyright (c) 2019-2022.  Anysolo LLC
 ******************************************************************************/


package level3.unit1.examples


fun findSomething(str: String): String? {
    val bracket1Index = str.indexOf('<')
    if(bracket1Index == -1)
        return null

    val bracket2Index = str.indexOf('>')
    if(bracket2Index == -1)
        return null

    return str.substring(bracket1Index+1, bracket2Index)
}

fun main() {
    val s1 = "Qbararara, blablabla <Something> and more useless text"

    val something1 = findSomething(s1)
    if(something1 != null)
        println("Found: $something1")

    val s2 = "Qbararara <SomethingBetter> and more ..."

    val something2 = findSomething(s2)
    if(something2 != null)
        println("Found: $something2")
}
