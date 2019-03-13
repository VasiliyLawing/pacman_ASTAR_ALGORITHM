package ch1.s1


fun main() {
  var sum = 0.0
  var count = 0

  for (i in 0 until args.size) {
    val n = args[i].toDouble()

    sum += n
    count ++
  }

  val average = sum / count

  println("You entered $count, average is: $average")
}
