package Recursion

/**
 * Created by sushi on 15-06-20.
 */
object NFactorialScala extends App {

  def factorial(fact: Int): Int = {
    if (fact == 1) 1
    else factorial(fact - 1) * fact
  }

  println (factorial(5))
}
