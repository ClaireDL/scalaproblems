object MinMax {

  def main( args: Array[String] ): Unit = {
    // this line is the starting function of the whole application
    // this is the obligatory wording
    // the arrray contains the arguments of the command line

    val input: List[Int] = List(34, 5, 24, 78)
    if( input.isEmpty ) {
      println("Error: empty list")
    }
    else {
      // way #1 using a method of list (.min)
      println(input.min)

      // way #2
      var minimum = input.head
      for( element <- input ) {
        if( element < minimum ) {
          minimum = element
        }
      }
      println(minimum)

      // way #3
      // DEFINE FOLDLEFT
      val result = input.foldLeft(input.head) { (currentMinimum, element) =>
        if( element < currentMinimum ) element else currentMinimum
      }
    }
  }
}
