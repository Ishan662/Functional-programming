error id: file:///D:/scala/functional-programming/assignment7/22000356_2.scala:[499..500) in Input.VirtualFile("file:///D:/scala/functional-programming/assignment7/22000356_2.scala", "import scala.io.StdIn.readLine

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

    def
}")
file:///D:/scala/functional-programming/assignment7/22000356_2.scala
file:///D:/scala/functional-programming/assignment7/22000356_2.scala:22: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace