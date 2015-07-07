package Chapter3IfElseSwitchStatements

/**
 * Created by sushi on 15-06-08.
 */
object BMIScala extends App {
  //  is bmi = weight / (height * height)
  // Below 18.5 Underweight
  // 18.5–24.9 Normal
  // 25.0–29.9 Overweight (bmi >= 25.0 && bmi <= 29.9)
  // Above 30.0 Obese Write a program that prompts the user to enter a weight in pounds and height in
  // inches and displays the BMI.
  // Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters. Listing 3.5 gives the program.

  val weightInPounds = 146;
  val heightInInches = 70;

  val weightInKilograms = weightInPounds * 0.45359237
  val heightInMetres = heightInInches * 0.0254

  // val bmi = weightInKilograms / (heightInMetres * heightInMetres)
  val bmi = 30.0
  println(bmi)

  if (bmi < 18.5) println("UnderWeight")
  else if (bmi < 25.0) println("Normal")
  else if (bmi < 30.0) println("OverWeight")
  else println("Obese")
}
