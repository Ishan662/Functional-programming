import scala.io.StdIn.readLine

object Fibonacci {
  def fibonacci(number: Int): Int = {
    if (number <= 1) {
      number
    } else {
      fibonacci(number - 1) + fibonacci(number - 2)
    }
  }

  def main(args: Array[String]): Unit = {
    println("Enter a number: ")
    val choice = readLine().toInt
    val result = fibonacci(choice)
    println(s"Fibonacci number for $choice is: $result")
  }
}

