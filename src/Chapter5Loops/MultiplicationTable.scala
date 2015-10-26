package Chapter5Loops

/**
 * Created by admin on 2015-10-22.
 */
object MultiplicationTable extends App {

  println ("              Multiplication Table")
  print("  ")

  for (i <- 1 to 9) {
    print("     " + i)
  }

  println()
  println("-------------------------------------------------")
  for (i <- 1 to 9) {
    print(i + "  |")
    for (j <- 1 to 9) {
      print("    " + i * j)
    }
    println
  }

}
