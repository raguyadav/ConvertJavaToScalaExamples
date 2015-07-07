package Chapter3IfElseSwitchStatements

import java.util.Scanner

import scala.util.Random

/**
 * Created by sushi on 15-06-07.
 */
object AddNumbersScala extends App {
  val randomNumber = Random
  val input: Scanner = new Scanner(System.in)
  val number1 = randomNumber.nextInt(10)
  val number2 = randomNumber.nextInt(10)

  println("Enter sum of " + number1 + " + " + number2)
  val answer = input.nextInt()

  // the parenthesis  (number1 + number2 == answer) are not required by scala
  // but then it interprests the resule incorrectly.
  // in Java parenthesis are required otherwise compiler throws an error.
  println(number1 + " + " + number2 + " is " +  (number1 + number2 == answer))


  // random numbers input
}
