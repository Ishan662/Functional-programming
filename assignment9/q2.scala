object checkNumber{
    def main(args: Array[String]): Unit = {
    if (args.length == 0) {
      println("Please provide an integer input.")
      return
    }

    val input = args(0).toInt

    val checkNumber: Int => String = num => num match {
      case n if n <= 0            => "Negative/Zero is input"
      case n if n % 2 == 0        => "Even number is given"
      case n if n % 2 != 0        => "Odd number is given"
    }

    println(checkNumber(input))
  }
}