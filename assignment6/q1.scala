object InventoryManagement {
  

  def mergeInventories(inv1: Map[Int, (String, Int, Double)], inv2: Map[Int, (String, Int, Double)]): Map[Int, (String, Int, Double)] = {
    inv2.foldLeft(inv1) { case (acc, (id, (name, quantity, price))) =>
      acc.get(id) match {
        case Some((_, existingQuantity, existingPrice)) =>
          acc.updated(id, (name, existingQuantity + quantity, math.max(existingPrice, price)))
        case None =>
          acc + (id -> (name, quantity, price))
      }
    }
  }

  def printProductDetails(inventory: Map[Int, (String, Int, Double)], productId: Int): Unit = {
    inventory.get(productId) match {
      case Some((name, quantity, price)) =>
        println(s"Product ID $productId exists: Name: $name, Quantity: $quantity, Price: $$${price}")
      case None =>
        println(s"Product ID $productId does not exist in inventory.")
    }
  }

  def main(args: Array[String]): Unit = {
    val inventory1: Map[Int, (String, Int, Double)] = Map(
      101 -> ("ProductA", 50, 10.0),
      102 -> ("ProductB", 20, 15.0),
      103 -> ("ProductC", 30, 5.0)
    )

    val inventory2: Map[Int, (String, Int, Double)] = Map(
      102 -> ("ProductB", 25, 12.0),
      104 -> ("ProductD", 40, 20.0)
    )

    val productNames = inventory1.values.map(_._1).toList
    println(s"Product names in inventory1: $productNames")

    val totalValue = inventory1.values.map { case (_, quantity, price) => quantity * price }.sum
    println(s"Total value of products in inventory1: $$${totalValue}")

    val isEmpty = inventory1.isEmpty
    println(s"Is inventory1 empty? $isEmpty")

    val mergedInventory = mergeInventories(inventory1, inventory2)
    println(s"Merged inventory: $mergedInventory")

    printProductDetails(inventory1, 102)
  }
}
