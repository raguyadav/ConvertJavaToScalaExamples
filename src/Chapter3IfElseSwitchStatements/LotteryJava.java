package Chapter3IfElseSwitchStatements;

/**
 * Created by sushi on 15-06-28.
 */
public class LotteryJava {
    // generate a two digit random lottery number
    // 1 Rules if the lottery number matches then award is $10,000
    // 2 if all the digits match but not exactly award is $3000. so like
    // lottery number is 97 user enters 79
    // 3 if 1 digit matches the lottery number then award is $1000
    public static void main (String[] args) {

        int lotteryNumber = 25;
        int guessNumber = 25;

        int lotteryDigit1 = (lotteryNumber / 10);
        int lotteryDigit2 = (lotteryNumber % 10);

        int guessDigit1 = (guessNumber / 10);
        int guessDigit2 = (guessNumber % 10);

        if (lotteryNumber == guessNumber) {
            System.out.println("U wont the lottery $10,000");
        } else if ((lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2) && (lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2)){
            System.out.println("all digits match but not exactly $3,000");
        }
        else if ((lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2) || (lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2)) {
            System.out.println("U got one digit right $1,000");
        }
        else  System.out.println("Sorry No Match");
    }
}