import scala.io.StdIn.readLine

object primeFactor {
  def getInputs(): List[Int] = {
    var inputList: List[Int] = List()
    var continue = true

    while (continue) {
      val input = readLine("Enter a number (Empty enter for terminate): ")

      if (input.isEmpty) {
        continue = false
      } else {
        inputList = inputList :+ input.toInt
      }
    }
    inputList
  }

  def isPrime(num: Int): Boolean = {
    if (num <= 1) {
      false
    } else {
      !(2 to Math.sqrt(num).toInt).exists(x => num % x == 0)
    }
  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(isPrime)
  }

  def main(args: Array[String]): Unit = {
    val inputList = getInputs()
    val primeList = filterPrime(inputList)
    println(primeList)
  }
}
