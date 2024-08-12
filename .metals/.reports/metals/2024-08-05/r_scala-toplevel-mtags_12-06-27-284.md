error id: file:///D:/scala/functional-programming/assignment7/22000356_1.scala:[478..479) in Input.VirtualFile("file:///D:/scala/functional-programming/assignment7/22000356_1.scala", "import scala.io.StdIn.readLine

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

    def()
}")
file:///D:/scala/functional-programming/assignment7/22000356_1.scala
file:///D:/scala/functional-programming/assignment7/22000356_1.scala:21: error: expected identifier; obtained lparen
    def()
       ^
#### Short summary: 

expected identifier; obtained lparen