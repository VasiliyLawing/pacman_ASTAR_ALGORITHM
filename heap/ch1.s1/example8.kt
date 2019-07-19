package ch1.s1


// Any program can be started with arguments
// In our program we get them in "args" value

// Start this program with some arguments
// For example java prog1.ch1.unit2.examples.Example8Kt 111 222
fun main() {
  // we use operator + to concatenate string with number
  println("Number of arguments: " + args.size)

  // Or we can do the same like this:
  println("Number of arguments again: ${args.size}")

  // we can access n-th argument as args[n]
  for (i in 0 until args.size) {
    println("arg $i= ${args[i]}")
  }
}
