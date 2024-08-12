error id: file:///D:/scala/functional-programming/assignment7/22000356_2.scala:[591..592) in Input.VirtualFile("file:///D:/scala/functional-programming/assignment7/22000356_2.scala", "import scala.io.StdIn.readLine

object calculateSquare{
    def getInputs() : List[Int] = {
        var inputList : List[Int] = List()
        var continue = true

        while(continue){
            val input = readLine("enter the numbers(empty enter for terminate ) : ")
            if (input.isEmpty()){
                continue = false
            }
            else{
                inputList = inputList :+ input
            }
        }
        inputList

    }

    def calculateSquare(args : List[Int]) : List[Int] = {
        args.map(_*_)
    }

    def 
}")
file:///D:/scala/functional-programming/assignment7/22000356_2.scala
file:///D:/scala/functional-programming/assignment7/22000356_2.scala:26: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace