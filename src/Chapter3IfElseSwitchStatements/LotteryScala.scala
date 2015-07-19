package Chapter3IfElseSwitchStatements

import scala.util.Random

/**
 * Created by sushi on 15-07-18.
 */
// generate a two digit random lottery number
// 1 Rules if the lottery number matches then award is $10,000
// 2 if all the digits match but not exactly award is $3000. so like
// lottery number is 97 user enters 79
// 3 if 1 digit matches the lottery number then award is $1000
object LotteryScala extends App {

  def lotteryDecider (guessNumber: Int,lotteryNumber: Int) = {
    val guessNumberdigit1 = guessNumber / 10
    val guessNumberdigit2 = guessNumber % 10

    val lotteryNumberdigit1 = lotteryNumber / 10
    val lotteryNumberdigit2 = lotteryNumber % 10

    if (guessNumber == lotteryNumber) println("award is 10,000")
    else if (guessNumberdigit1 == lotteryNumberdigit2 && guessNumberdigit2 == lotteryNumberdigit1) println("award is $3000")
    else if (guessNumberdigit1 == lotteryNumberdigit1 || guessNumberdigit1 == lotteryNumberdigit2 || guessNumberdigit2 == lotteryNumberdigit1 || guessNumberdigit2 == lotteryNumberdigit2) println("award is $1000")
    else println("No Lottery for u")
  }

  val randomNumber = Random

  val guessNumber = randomNumber.nextInt(99)
  val lotteryNumber = 68


  println (guessNumber)
  lotteryDecider(guessNumber,lotteryNumber)

}