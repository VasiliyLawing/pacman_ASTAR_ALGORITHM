/*******************************************************************************
 * Copyright (c) 2022.  Anysolo LLC
 ******************************************************************************/

package level2v3.unit1.examples


// It is a function. It contains a bunch of code and it has a name.
// "private" is optional, it makes it visible only in the current file.
private fun sayHello() {
    println("Hello")
}

fun main() {
    println("Calling functions example")

    // we cal execute the code we have in the function like this. It is called a function call
    sayHello()

    println("Doing something in between")

    // Calling the same function again
    sayHello()
}