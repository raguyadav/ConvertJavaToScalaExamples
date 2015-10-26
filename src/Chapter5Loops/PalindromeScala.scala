package Chapter5Loops

/**
 * Created by admin on 2015-10-24.
 */

import util.control.Breaks.break
object PalindromeScala extends App{

  // A program that checks whether a string is a
  // eg mom, dad, noon.

  var inputString = "godzilla"
  var isPalindrome = true


  for (i <- 0 to (inputString.length)/2) {
    if (inputString.charAt(i) != inputString.charAt((inputString.length - 1) - i))
      {
        isPalindrome = false
        break
      }

  }

  if (isPalindrome) println("This string " + inputString + " is a palindrome")
  else println("This string " + inputString + " is not a palindrome")

}
