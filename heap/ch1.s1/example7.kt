package ch1.s1


fun main() {
  val countUntil = 10

  var sum = 0
  for (n in 1 .. countUntil) {
    println("n = $n")
    sum += n
  }

  println("Sum1 = $sum")

  sum = 0
  // notice difference with until in loop
  for (n in 1 until countUntil) {
    println("n = $n")
    sum += n
  }

  println("Sum2 = $sum")
}
