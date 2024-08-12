error id: file:///D:/scala/functional-programming/assignment7/22000356_1.scala:[487..490) in Input.VirtualFile("file:///D:/scala/functional-programming/assignment7/22000356_1.scala", "import scala.io.StdIn.readLine

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
    }

    def 

    def main(args : Array[String]) : Unit = {
        var listOfInputs : List[Int] 
        listOfInputs = getInputs()

        val evens = numbers.filter(_%2 ==0)
        println(evens)

    }
}")
file:///D:/scala/functional-programming/assignment7/22000356_1.scala
file:///D:/scala/functional-programming/assignment7/22000356_1.scala:23: error: expected identifier; obtained def
    def main(args : Array[String]) : Unit = {
    ^
#### Short summary: 

expected identifier; obtained def