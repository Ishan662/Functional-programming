error id: file:///D:/scala/functional-programming/assignment%205/22000356-1.scala:[487..490) in Input.VirtualFile("file:///D:/scala/functional-programming/assignment%205/22000356-1.scala", "import scala.io.StdIn.readLine

object InevntoryManagement{
    def getProductList(): Unit = {
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
    }

    def 

    def main(args : Array[String]): Unit = {
        

    }
}")
file:///D:/scala/functional-programming/assignment%205/22000356-1.scala
file:///D:/scala/functional-programming/assignment%205/22000356-1.scala:23: error: expected identifier; obtained def
    def main(args : Array[String]): Unit = {
    ^
#### Short summary: 

expected identifier; obtained def