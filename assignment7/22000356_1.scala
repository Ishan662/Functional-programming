import scala.io.StdIn.readLine

object filterEvenNumbers{
    def getInputs() : List[Int] = {
        var inputList : List[Int] = List()
        var continue = true

        while(continue){
            val input = readLine("Enter a number(press enter to finish) :")
            if(input.isEmpty()){
                continue = false
            }

            else{
                inputList = inputList :+ input.toInt
            }
            
        }
        inputList
    }

    def filterEvenNumbers(args:List[Int] ): List[Int] = {
        args.filter(_%2 == 0)
    }

    def main(args : Array[String]) : Unit = {
        val listOfInputs = getInputs()
        var finalList = filterEvenNumbers(listOfInputs)
        println(finalList)
        
    }
}