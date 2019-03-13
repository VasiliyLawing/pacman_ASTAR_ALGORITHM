package ch1.s1


fun main() {
  // Keyword 'var' defines a mutable variable.
  // It is like a named value which you can later replace with another value of the same type.
  var n = 10

  println("1: $n")

  // assign another value to variable 'n'
  n = 20
  println("2: $n")

  n = n + 2
  println("3: $n")

  // n += 2 does the same as n = n + 2
  n += 2
  println("4: $n")

  // n++ does the same as n = n + 1
  n ++
  println("5: $n")

  // Read about keywords 'val' and 'var'. Read about arithmetic operators in Kotlin.
}
