package Chapter3IfElseSwitchStatements;

/**
 * Created by sushi on 15-06-29.
 */
public class SwitchStatementJava {

    public static void returnNumber(int number) {

        switch (number) {
            case 1  : System.out.println("the output is " + number); break;
            case 10 : System.out.println("the output is " + number); break;
            default : System.out.println("the default output is " + number); break;
        }
    }
    public static void main (String[] args) {
        int number = 40;
        returnNumber(number);

    }
}
