object LastButOne {

  def main(args: Array[String]): Unit = {

    val input: List[Int] = List(1, 1, 2, 3, 5, 8)

    // solution 1
    val result = input(input.length - 2)
    println("solution 1: " + result)

    // solution 2
    val resultRec = recursive(input)(0)
    println("solution 2: " + resultRec)

  }

  def recursive ( xs: List[Any] ): List[Any] = {
    xs.length match {
      case 2 => xs
      case _ => recursive(xs.drop(1))
    }
  }
}