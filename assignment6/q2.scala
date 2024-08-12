import scala.io.StdIn.readLine

object StudentRecords {
  

  def getStudentInfo(name: String, marks: Int, totalMarks: Int): (String, Int, Int, Double, Char) = {
    val percentage = (marks.toDouble / totalMarks) * 100
    val grade = percentage match {
      case p if p >= 90 => 'A'
      case p if p >= 75 => 'B'
      case p if p >= 50 => 'C'
      case _ => 'D'
    }
    (name, marks, totalMarks, percentage, grade)
  }

  def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = record
    println(s"Student Name: $name")
    println(s"Marks: $marks / $totalMarks")
    println(f"Percentage: $percentage%.2f%%")
    println(s"Grade: $grade")
  }

  def validateInput(name: String, marks: String, totalMarks: String): (Boolean, Option[String]) = {
    if (name.isEmpty) {
      (false, Some("Name cannot be empty."))
    } else if (!marks.forall(_.isDigit) || !totalMarks.forall(_.isDigit)) {
      (false, Some("Marks and total possible marks must be numeric."))
    } else if (marks.toInt < 0 || marks.toInt > totalMarks.toInt) {
      (false, Some("Marks must be positive and not exceed total possible marks."))
    } else {
      (true, None)
    }
  }

  def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = {
    var valid = false
    var result: (String, Int, Int, Double, Char) = ("", 0, 0, 0.0, 'D')

    while (!valid) {
      val name = readLine("Enter student's name: ")
      val marks = readLine("Enter student's marks: ")
      val totalMarks = readLine("Enter total possible marks: ")

      val (isValid, errorMessage) = validateInput(name, marks, totalMarks)
      if (isValid) {
        result = getStudentInfo(name, marks.toInt, totalMarks.toInt)
        valid = true
      } else {
        println(errorMessage.get)
      }
    }
    result
  }

  def main(args: Array[String]): Unit = {
    val studentRecord = getStudentInfoWithRetry()
    printStudentRecord(studentRecord)
    var returnValue = validateInput("John Doe", "80", "100")
    println(returnValue)

  }
}
