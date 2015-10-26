package Chapter5Loops

/**
 * Created by admin on 2015-10-22.
 */
object GCD extends App {


  def gcd1(x: Int,y: Int): Int = {
    var smallerNumber = 0
    if (x < y) smallerNumber = x
    else smallerNumber = y


    var gcd = 1
    for (i <- 1 to smallerNumber) {
      if (x % i == 0 && y % i == 0) gcd = i
    }

    gcd
  }

  val x = 2
  val y = 3
  println("the GCD of " + x + " and " + y + " is "  + gcd1(x,y))
}

