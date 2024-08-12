object NumberCategorizer {

  def categorizeNumber(number: Int): String = {
    val categorize = (n: Int) => n match {
      case n if n % 3 == 0 && n % 5 == 0 => "Multiple of Both Three and Five"
      case n if n % 3 == 0               => "Multiple of Three"
      case n if n % 5 == 0               => "Multiple of Five"
      case _                             => "Not a Multiple of Three or Five"
    }
    categorize(number)
  }

  def main(args: Array[String]): Unit = {
    println("Please enter an integer:")
    val input = scala.io.StdIn.readLine().toInt

    val result = categorizeNumber(input)
    println(result)
  }
}
