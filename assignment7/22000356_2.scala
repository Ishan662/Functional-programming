import scala.io.StdIn.readLine

object CalculateSquare {
    def getInputs(): List[Int] = {
        var inputList: List[Int] = List()
        var continue = true

        while (continue) {
            val input = readLine("Enter the numbers (empty enter to terminate): ")
            if (input.isEmpty) {
                continue = false
            } else {
                try {
                    val number = input.toInt
                    inputList = inputList :+ number
                } catch {
                    case e: NumberFormatException => 
                        println("Please enter a valid number.")
                }
            }
        }
        inputList
    }

    def calculateSquare(args: List[Int]): List[Int] = {
        args.map(x => x * x)
    }

    def main(args: Array[String]): Unit = {
        val returnList = getInputs()
        val toSquare = calculateSquare(returnList)
        println(toSquare)
    }
}
