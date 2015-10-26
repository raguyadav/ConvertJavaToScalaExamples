package Chapter5Loops

/**
 * Created by admin on 2015-10-24.
 */
object PrimeNumbersScala extends App{

  //Problem
  // Display first 50 prime numbers
  // in 5 lines .
  // each line consisting of 10 numbers

  // Solution
  // have a loop go from 1 to 50
  // display 10 numbers in 5 lines
  // Check whether number is prime

  for (i <- 2 to 50) {

    print(" " + i)
    println
  }

}
