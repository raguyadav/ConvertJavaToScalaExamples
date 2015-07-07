package Chapter3IfElseSwitchStatements;

/**
 * Created by sushi on 15-06-23.
 */

/*
a year is a leap year if it is divisible by 4 but not by 100
It is divisible by 400. In the second scenarip the 100 rule doesnt apply
 */
public class LeapYearJava {

    public static void isYearLeapOrNot(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println("it is a leap year");
        else
            System.out.println("it is not a leap year");
    }

    public static void main (String[] args) {
        int year = 2012;
        isYearLeapOrNot(year);
    }

}

/*
Bad logic. In this case everything not divisible by 100 is discarded.
it should only discard things divisible by 100 if they are also divisibe by 4
this scenario will screw up the 400 division.
if (year % 100 == 0) {
            System.out.println("It is not a leap year");
        } else if (year % 4 == 0 || year % 400 == 0) {
            System.out.println("It is a leap year");
        }
          else
            System.out.println("It is not a leap year");
 */