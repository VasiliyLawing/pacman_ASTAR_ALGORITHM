package ch1.s1


fun main() {
  // it prints two concatenated arguments
  println(args[0] + args[1])

  // And here it prints sum of two arguments
  // Because operator + works differently for strings and numbers
  println(args[0].toInt() + args[1].toInt())
}
