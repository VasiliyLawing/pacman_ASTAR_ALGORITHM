package ch1.s1


fun main() {
  // Use keyword 'val' to define named values. A value maybe a result of some expression.
  // You can use these names in other expressions
  // named values like these are also called "immutable variables".
  // Numbers without "." are integer numbers.
  // Numbers with "." are floating point numbers.

  val price = 10
  val amount = 5
  val discount = 0.05

  // Value defined with keyword "val" cannot be changed later
  // if you uncomment the next line Kotlin will report an error.
  // Try it! Then comment it out again and continue
  // price = 2

  val cost = price * amount * (1 - discount)

  // You can insert value of a variable into a string using "$" followed by name of the variable
  println("cost: $cost")
}
