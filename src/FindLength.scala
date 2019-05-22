object FindLength {

  def main( args: Array[String] ): Unit = {

    val input: List[Int] = List(1, 1, 2, 3, 5, 8)

    // solution 1
    println("solution 1: " + input.length)

    // solution 2
    var acc = 0
    for( element <- input ) {
      acc += 1
    }
    println("solution 2: " + acc)
  }

  def lengthRec( xs: List[Any] ): List[Any] = {

  }
}
