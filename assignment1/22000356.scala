import scala.compiletime.ops.double
object Main {
  def main(args: Array[String]): Unit = {
    def area(x: Int): Double = math.Pi*x*x
    println(area(5))

    def Far(x:Int) : Double = x*1.8000 + 32.00
    println(Far(35))

    def volume(x:Int) : Double = 4/3*math.Pi*x*x*x
    println(volume(5))

    val cover_price = 24.95
    val discount = 0.40 
    val shippingCostFor50 = 3.00
    val shippingCostForAdditional = 0.75
    val copies = 60
    val first50 = 50
    val remain = copies - first50

    def price(x: Int): Double = {
      val discounted_price = cover_price * (1 - discount)
      val total_price = discounted_price * x
      val total_shipping_cost = shippingCostFor50 + shippingCostForAdditional * remain
      total_price + total_shipping_cost
    }
    println(price(copies))

    def easyPhase(x:Int): Int = 8*x
    def hardPhase(x:Int): Int =  3*7

    println(easyPhase(2)+ hardPhase(3) + easyPhase(2))

  }
}