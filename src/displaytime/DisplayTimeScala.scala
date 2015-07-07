package displaytime

import java.util.Scanner

/**
 * Created by sushi on 15-06-06.
 */
object DisplayTimeScala extends App {

  val input = new Scanner(System.in)

  println("Pls enter time in seconds")
  val inputSeconds = input.nextInt()

  val minutes = inputSeconds / 60
  val remainingSeconds = inputSeconds % 60

  println("The converted seconds are " + minutes + " minutes " + remainingSeconds + " seconds ")
  // Casting in scala as opposed in java (int) 1.7
  // 1.7 is an object in scala and hence we call a method on it.
  println("cast 1.7 to an INT " + 1.7.toInt)
}
