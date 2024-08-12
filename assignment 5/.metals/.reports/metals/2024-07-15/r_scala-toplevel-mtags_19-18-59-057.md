error id: file:///D:/scala/functional-programming/assignment%205/22000356-2.scala:[847..848) in Input.VirtualFile("file:///D:/scala/functional-programming/assignment%205/22000356-2.scala", "import scala.collection.mutable
import scala.io.StdIn.readLine

case class Book{title:String, author:String, ISBN:String}

object LibraryManagement{
    var Library : mutable.Set[Book] = mutable.Set(
        Book("ABCD", "Ishan Maduranga", "123-456"),
        Book("EFGH", "soomapaala", "123-465"),
        Book("HIJK", "Amarapaala", "123-321")
    )

    def addBook(book :Book): Unit={
        library +=book
        println(s"Book added : ${book.title}")
    }

    def removeBookByISBN(ISBN : String) : Unit = {
        val removingBook = Library.find(_.ISBN == ISBN)
        removingBook match {
            case Some(Book) => 
                Library -= book
                println(s"Book removed : ${book.title}")
            case None =>
                println("Book not found.")

        }
    }

    def 
}")
file:///D:/scala/functional-programming/assignment%205/22000356-2.scala
file:///D:/scala/functional-programming/assignment%205/22000356-2.scala:31: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace