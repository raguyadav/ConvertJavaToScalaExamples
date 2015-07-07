package Chapter3IfElseSwitchStatements;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by sushi on 15-06-07.
 */
public class AddNumbersJava {

    public static void main(String[] args) {

        Random randomNumber = new Random();
        Scanner input = new Scanner(System.in);

        int number1 = randomNumber.nextInt(10);
        int number2 = randomNumber.nextInt(10);

        System.out.println("Enter Sum of " + number1 + " + " + number2);
        int answer = input.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
    }
}
