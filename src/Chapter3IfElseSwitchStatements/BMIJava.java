package Chapter3IfElseSwitchStatements;

/**
 * Created by sushi on 15-06-07.
 */
public class BMIJava {
    public static void main(String[] args) {
        //  is bmi = weight / (height * height)
        // Below 18.5 Underweight
        // 18.5–24.9 Normal
        // 25.0–29.9 Overweight (bmi >= 25.0 && bmi <= 29.9)
        // Above 30.0 Obese Write a program that prompts the user to enter a weight in pounds and height in
        // inches and displays the BMI.
        // Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters. Listing 3.5 gives the program.

        double weightInPounds = 146;
        double heightInInches = 70;

        final double heightPerInch = 0.0254;
        final double kilogramsPerInch = 0.45359237;

        double weightInKilograms = weightInPounds * kilogramsPerInch;
        double heigntInMetres = heightInInches * heightPerInch;

        double bmi = 0;
        bmi = (weightInKilograms) / (heigntInMetres * heigntInMetres);
        System.out.println(" BMI " + bmi);

        if (bmi >= 30) System.out.println(" Obese ");
        else if (bmi >= 25.0 && bmi <= 29.9) System.out.println(" OverWeight ");
        else if (bmi >= 18.5 && bmi <= 24.9) System.out.println(" Normal ");
        else if (bmi < 18.5) System.out.println("UnderWeight");
    }
}
