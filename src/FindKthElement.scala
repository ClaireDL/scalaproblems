object FindKthElement {

  def main( args: Array[String]): Unit = {

    val input: List[Int] = List(1, 1, 2, 3, 5, 8)

    val k = 4

    k match{
      case k if k - 1 > input.length => println("Error")
      case _ => println(input.lift(k - 1))
    }
  }
}
