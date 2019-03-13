package ch1.s1


fun main() {
  // integer (Int):  3 / 2 = 1
  val n = 3
  println("1: ${n/2}")

  // Floating point number (Double): 3 / 2 = 1.5
  val n2 = 3.0
  println("2: ${n2 / 2}")

  // Before Kotlin inferred type of the value by context
  // Now we specify in explicitly
  // Change "3.0" to "3" and Kotlin report an error. Try it
  val n3: Double = 3.0
  println("3: ${n3/2}")

  // values of String type. operator concatenates strings
  val s1 = "str1"
  val s2: String = "str2" // we can specify String type explicitly
  val s3 = s1 + " " + s2
  println("4: $s3")

  // String is a complex type and has properties and methods
  // You access them using "."
  println("5: " + s1.length)

  println("6: " + "some text".length)

  // Make the first character capital
  println("7: " + "some text".capitalize())

  // we also can convert string to int
  val s4 = "123"
  println("8: " + s4.toInt() * 2)

  // Uncomment this line and you'll the error. operator "*" doesn't work with strings
  // println("8.2: " + s4 * 2)
}
