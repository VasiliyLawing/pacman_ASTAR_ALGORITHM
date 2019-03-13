package prg1.ch1.s3.examples


fun main(args: Array<String>) {
  if(args.size == 0) {
    println("ERROR. Pass you name as argument for the me")
    return
  }

  when(args[0]) {
    "elyas" -> println("Hi man. Long time no see!")

    // You can use {} block if you need more then on statement
    "marie" -> {
      print("Hello, ")
      println("how is Florida?")
    }

    else -> println("Sorry, I do not know you.")
  }
}
