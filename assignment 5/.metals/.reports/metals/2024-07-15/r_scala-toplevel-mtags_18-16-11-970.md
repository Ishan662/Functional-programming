error id: file:///D:/scala/functional-programming/assignment%205/22000356-1.scala:[637..640) in Input.VirtualFile("file:///D:/scala/functional-programming/assignment%205/22000356-1.scala", "import scala.io.StdIn.readLine

object InevntoryManagement{
    def getProductList(): List[String] = {
       var done = false
        var list = List[String]()

        while (!done){
            println("Enter the name of the product(done for terminate : )")
            var input = readLine()

            if(input == "done"){
                done = true
            }
            else{
                list = list :+ input
            }
        } 
        list
    }

    def printList(list : List[String]): Unit={
        println("The list of items : ")
        list.foreach(println)
    }

    def

    def main(args : Array[String]): Unit = {
        

    }
}")
file:///D:/scala/functional-programming/assignment%205/22000356-1.scala
file:///D:/scala/functional-programming/assignment%205/22000356-1.scala:29: error: expected identifier; obtained def
    def main(args : Array[String]): Unit = {
    ^
#### Short summary: 

expected identifier; obtained def