object interestCalculator{
    val interest : Double => Double = amount => amount match{
    case amount if amount <= 20000      => amount * 0.02
    case amount if amount <= 200000     => amount * 0.04
    case amount if amount <= 2000000    => amount * 0.035
    case amount if amount > 2000000     => amount * 0.065
    }

    def main(args:Array[String]): Unit = {
    val deposit1 = 15000.0
    val deposit2 = 50000.0
    val deposit3 = 500000.0
    val deposit4 = 3000000.0

    println(s"Interest for Rs. $deposit1: Rs. ${interest(deposit1)}")
    println(s"Interest for Rs. $deposit2: Rs. ${interest(deposit2)}")
    println(s"Interest for Rs. $deposit3: Rs. ${interest(deposit3)}")
    println(s"Interest for Rs. $deposit4: Rs. ${interest(deposit4)}")
    }
}