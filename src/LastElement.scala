object LastElement {

  def main( args: Array[String] ): Unit = {

    // solution 1
    val input: List[Int] = List(1, 1, 2, 3, 5, 8)
    println("solution 1: " + input.last)

    // solution 2
    val result = input(input.length - 1)
    println("solution 2: " + result)

    // solution 3
    val resultRec = lastRecursive(input)
    println("solution 3: " + resultRec)

    // solution 4
    val resultRecMatch = lastRecursive(input)
    println("solution 4: " + resultRecMatch)

  }

  def lastRecursive( xs: List[Any] ): List[Any] = {
    if (xs.length == 1) xs else lastRecursive(xs.drop(1))
  }

  def lastRecursiveMatch( xs: List[Any] ): List[Any] = {
    xs.length match{
      case 1 => xs
      case _ => lastRecursive(xs.drop(1))
    }
  }
}
