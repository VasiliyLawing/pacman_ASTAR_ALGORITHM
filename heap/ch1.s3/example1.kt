package prg1.ch1.s3.examples


fun main(args: Array<String>) {
  if(args.size == 2) {
    val sum = args[0].toInt() + args[1].toInt()
    println("Sum: $sum")
  } else {
    println("ERROR. You should use this program with exactly two integers as arguments!")
  }
}
