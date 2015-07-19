package Chapter3IfElseSwitchStatements

/**
 * Created by sushi on 15-07-18.
 */
/*
a year is a leap year if it is divisible by 4 but not by 100
It is divisible by 400. In the second scenario the 100 rule doesnt apply
 */

object LeapYearScala extends App {

  def isYearLeapOrNot(year: Int): Unit = {
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) System.out.println("it is a leap year")
    else println("it is not a leap year")
  }

  val year = 2012
  isYearLeapOrNot(1900)
}

/*
Alternative way of doing the above leap year method.
if (year % 4 == 0 && (year % 100) != 0) println("it is a leap year")
  else if (year % 400 == 0) println("it is a leap year")
  else println("it is NOT a leap year")
 */