package Chapter5Loops;

/**
 * Created by admin on 2015-10-24.
 */
public class PalindromeJava {

    public static void main (String[] args) {
        String inputString = "godzilla";
        Boolean isPalindrome = true;

        for (int i = 0 ; i < inputString.length()/2 ; i++) {
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("This string " + inputString + " is a palindrome");
        }
        else  {
            System.out.println("This string " + inputString + " is a palindrome");
        }
    }
}
