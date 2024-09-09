object CheckNumber {
  def main(args: Array[String]): Unit = {
    println("Please enter an integer:")
    
    val input = scala.io.StdIn.readInt()

    val checkNumber: Int => String = num => num match {
      case n if n <= 0            => "Negative/Zero is input"
      case n if n % 2 == 0        => "Even number is given"
      case n if n % 2 != 0        => "Odd number is given"
    }

    println(checkNumber(input))
  }
}
