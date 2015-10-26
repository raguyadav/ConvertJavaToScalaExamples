package Chapter5Loops

/**
 * Created by admin on 2015-10-24.
 */
object TutionPrediction extends App {

  // 10,000 per year and increases 7 % per year
  // how many years will it take to double tuition
  // algorithm 10,000 * 1.07
  var tuition = 10000.0;
  var numOfyears = 0;

  while (tuition < 20000) {
    tuition = tuition * 1.07
    numOfyears = numOfyears + 1
}

  println(numOfyears)
  println(tuition)
}
